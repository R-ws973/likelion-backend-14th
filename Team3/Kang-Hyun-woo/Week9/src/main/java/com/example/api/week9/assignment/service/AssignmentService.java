// 데이터 수정 시에는 Transactional 어노테이션을 통해 데이터가 깨지는 것을 방지한다(생성, 수정, 삭제)

package com.example.api.week9.assignment.service;

import com.example.api.week9.assignment.domain.Assignment;
import com.example.api.week9.assignment.dto.AssignmentCreateRequest;
import com.example.api.week9.assignment.dto.AssignmentUpdateRequest;
import com.example.api.week9.assignment.repository.AssignmentRepository;
import com.example.api.week9.member.domain.Member;
import com.example.api.week9.member.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AssignmentService {

    private AssignmentRepository assignmentRepository;
    private MemberRepository memberRepository;

    public AssignmentService(AssignmentRepository assignmentRepository, MemberRepository memberRepository) {
        this.assignmentRepository = assignmentRepository;
        this.memberRepository = memberRepository;
    }

    @Transactional
    public Assignment create(Long memberId,  AssignmentCreateRequest request) {
        Member member = memberRepository.findById(memberId).orElse(null);

        if (member == null)
            return null;
        Assignment assignment = new Assignment(request.getTitle(), request.getDescription(), member);
    return assignmentRepository.save(assignment);
    }

    public List<Assignment> findByMemberId(Long memberId) {
        return assignmentRepository.findByMemberId(memberId);
    }

    public Assignment findById(Long id) {
        return assignmentRepository.findById(id).orElse(null);
    }

    @Transactional
    public Assignment update(Long id, AssignmentUpdateRequest request) {
        Assignment assignment = assignmentRepository.findById(id).orElse(null);
        if (assignment == null)
            return null;
        assignment.update(request.getTitle(), request.getDescription());
        return assignmentRepository.save(assignment);
    }

    @Transactional
    public boolean delete(Long id) {
        if(!assignmentRepository.existsById(id)) {
            return false;
        }
        assignmentRepository.deleteById(id);
        return true;
    }
}