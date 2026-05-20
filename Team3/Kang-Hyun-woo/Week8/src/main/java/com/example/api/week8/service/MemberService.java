package com.example.api.week8.service;

import com.example.api.week8.domain.RoleType;
import com.example.api.week8.dto.LionCreateRequest;
import com.example.api.week8.dto.LionUpdateRequest;
import com.example.api.week8.dto.StaffCreateRequest;
import com.example.api.week8.dto.StaffUpdateRequest;
import com.example.api.week8.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.api.week8.domain.Member;


@Service
public class MemberService {
    // 인터페이스에 의존 (구현체에 의존하지 않음)
    private final MemberRepository repository;

    // 생성자를 통해 의존성 주입
    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Member createLion(LionCreateRequest lionCreateRequest) {
        if(repository.existsByName(lionCreateRequest.getName())) {
            return null;
        }
        Member member = new Member(lionCreateRequest.getName(), lionCreateRequest.getMajor(), lionCreateRequest.getGeneration(), lionCreateRequest.getPart(), RoleType.LION, lionCreateRequest.getStudentId(), null);
        return repository.save(member);
    }

    public Member createStaff(StaffCreateRequest staffCreateRequest ) {
        Member member  = new Member(staffCreateRequest.getName(),staffCreateRequest.getMajor(),staffCreateRequest.getGeneration(),staffCreateRequest.getPart(),RoleType.STAFF,null,staffCreateRequest.getPosition());
        if(repository.existsByName(staffCreateRequest.getName())){
            return null;
        }
        return repository.save(member);

    }

    public Member updateLion(Long id, LionUpdateRequest lionUpdateRequest) {
            Member member  = repository.findById(id).orElse(null);
            if(member == null) {
                return null;
            }
            member.updateInfo(lionUpdateRequest.getMajor(),lionUpdateRequest.getGeneration(),lionUpdateRequest.getPart());
            member.updateStudentId(lionUpdateRequest.getStudentId());
            return repository.save(member);

    }
    public Member updateStaff(Long id, StaffUpdateRequest staffUpdateRequest) {
        Member member  = repository.findById(id).orElse(null);
        if(member == null) {
            return null;
        }
        member.updateInfo(staffUpdateRequest.getMajor(),staffUpdateRequest.getGeneration(),staffUpdateRequest.getPart());
        member.updatePosition(staffUpdateRequest.getPosition());
        return repository.save(member);

    }
    public boolean deleteMember(Long id) {
        if(!repository.existsById(id)) {
            return false;
        }
        else {
            repository.deleteById(id);
            return true;
        }

    }

    public Member searchByName(String name) {
        return repository.findByName(name).orElse(null);
    }
    public Member searchById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    public boolean isEmpty() {
        return repository.findAll().isEmpty();
    }
}
