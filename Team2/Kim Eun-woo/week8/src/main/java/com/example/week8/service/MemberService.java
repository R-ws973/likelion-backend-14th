package com.example.week8.service;

import com.example.week8.domain.Lion;
import com.example.week8.domain.Role;
import com.example.week8.domain.Staff;
import com.example.week8.dto.LionCreateRequest;
import com.example.week8.dto.LionUpdateRequest;
import com.example.week8.dto.StaffCreateRequest;
import com.example.week8.dto.StaffUpdateRequest;
import com.example.week8.repository.LionRepository;
import com.example.week8.repository.StaffRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

  private final LionRepository lionRepository;
  private final StaffRepository staffRepository;

  public MemberService(LionRepository lionRepository, StaffRepository staffRepository) {
    this.lionRepository = lionRepository;
    this.staffRepository = staffRepository;
  }

  @Transactional
  public Lion createLion(LionCreateRequest request) {
    if (existsByName(request.getName())) {
      return null;
    }

    Lion lion = new Lion(
        request.getName(),
        request.getMajor(),
        request.getGeneration(),
        request.getPart(),
        request.getStudentId()
    );

    return lionRepository.save(lion);
  }

  @Transactional
  public Staff createStaff(StaffCreateRequest request) {
    if (existsByName(request.getName())) {
      return null;
    }

    Staff staff = new Staff(
        request.getName(),
        request.getMajor(),
        request.getGeneration(),
        request.getPart(),
        request.getPosition()
    );

    return staffRepository.save(staff);
  }

  @Transactional(readOnly = true)
  public Role findMember(String name) {
    return lionRepository.findByName(name)
        .map(lion -> (Role) lion)
        .orElseGet(() -> staffRepository.findByName(name).orElse(null));
  }

  @Transactional
  public Lion updateLion(String name, LionUpdateRequest request) {
    Lion lion = lionRepository.findByName(name).orElse(null);

    if (lion == null) {
      return null;
    }

    // 영속 상태 엔티티를 변경하면 트랜잭션 커밋 시점에 UPDATE가 자동 실행된다(더티 체킹).
    lion.update(
        request.getMajor(),
        request.getGeneration(),
        request.getPart(),
        request.getStudentId()
    );

    return lion;
  }

  @Transactional
  public Staff updateStaff(String name, StaffUpdateRequest request) {
    Staff staff = staffRepository.findByName(name).orElse(null);

    if (staff == null) {
      return null;
    }

    staff.update(
        request.getMajor(),
        request.getGeneration(),
        request.getPart(),
        request.getPosition()
    );

    return staff;
  }

  @Transactional
  public boolean deleteMember(String name) {
    Lion lion = lionRepository.findByName(name).orElse(null);
    if (lion != null) {
      lionRepository.delete(lion);
      return true;
    }

    Staff staff = staffRepository.findByName(name).orElse(null);
    if (staff != null) {
      staffRepository.delete(staff);
      return true;
    }

    return false;
  }

  private boolean existsByName(String name) {
    return lionRepository.existsByName(name) || staffRepository.existsByName(name);
  }
}
