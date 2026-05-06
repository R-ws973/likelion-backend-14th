package com.example.api.week7.service;


import com.example.api.week7.domain.role.Lion;
import com.example.api.week7.domain.role.Role;
import com.example.api.week7.domain.role.Staff;
import com.example.api.week7.dto.LionCreateRequest;
import com.example.api.week7.dto.LionUpdateRequest;
import com.example.api.week7.dto.StaffCreateRequest;
import com.example.api.week7.dto.StaffUpdateRequest;
import com.example.api.week7.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 멤버 관련 비즈니스 로직을 처리하는 역할 (서비스)
 *
 * [개선됨] 의존성 주입(DI) 적용
 * - Repository를 직접 생성하지 않고, 생성자를 통해 외부에서 주입받는다
 * - Repository 인터페이스에만 의존하므로 구현체가 바뀌어도 이 코드는 수정 불필요
 * - final 키워드로 불변성 보장
 */
@Service
public class MemberService {
    // 인터페이스에 의존 (구현체에 의존하지 않음)
    private final MemberRepository repository;

    // 생성자를 통해 의존성 주입
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Role createLion(LionCreateRequest lionCreateRequest) {
        Lion lion  = new Lion(lionCreateRequest.getName(),lionCreateRequest.getMajor(),lionCreateRequest.getGeneration(),lionCreateRequest.getPart(),lionCreateRequest.getStudentId());
        if(repository.existsByName(lion.getName())) {
            return null;
        }
        repository.save(lion);
        return lion;
    }

    public Role createStaff(StaffCreateRequest staffCreateRequest ) {
        Staff staff  = new Staff(staffCreateRequest.getName(),staffCreateRequest.getMajor(),staffCreateRequest.getGeneration(),staffCreateRequest.getPart(),staffCreateRequest.getPosition());
        if(repository.existsByName(staff.getName())){
            return null;
        }
        repository.save(staff);
        return staff;
    }

    public Role updateLion(String name, LionUpdateRequest lionUpdateRequest) {

        if(repository.existsByName(name)) {
            Lion updated  = new Lion(name,lionUpdateRequest.getMajor(),lionUpdateRequest.getGeneration(),lionUpdateRequest.getPart(),lionUpdateRequest.getStudentId());
            repository.updateByName(name, updated);
            return updated;
        }
        return null;
    }
    public Role updateStaff(String name, StaffUpdateRequest staffUpdateRequest) {

        if(repository.existsByName(name)) {
            Lion updated  = new Lion(name,staffUpdateRequest.getMajor(),staffUpdateRequest.getGeneration(),staffUpdateRequest.getPart(),staffUpdateRequest.getPosition());
            repository.updateByName(name, updated);
            return updated;
        }
        return null;
    }
    public boolean deleteMember(String name) {
        return repository.deleteByName(name);
    }


    public boolean register(Role member) {
        if (repository.existsByName(member.getName())) {
            return false;
        }
        repository.save(member);
        return true;
    }

    public Role searchByName(String name) {
        return repository.findByName(name);
    }

    public List<Role> getAllMembers() {
        return repository.findAll();
    }

    public boolean isEmpty() {
        return repository.findAll().isEmpty();
    }
}
