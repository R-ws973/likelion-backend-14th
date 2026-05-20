package com.example.api.week8.controller;

import com.example.api.week8.domain.Member;
import com.example.api.week8.dto.*;
import com.example.api.week8.service.MemberService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Member 관리", description = "아기사자와 운영진 멤버 관리 API")
@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @Operation(summary = "아기사자 생성", description = "새로운 아기사자 멤버를 추가합니다.")
    @PostMapping("/lions")
    public ResponseEntity<MemberResponse> createLion(@RequestBody LionCreateRequest request) {
        Member lion = memberService.createLion(request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(MemberResponse.from((Member) lion));
    }

    @Operation(summary = "운영진 생성", description = "새로운 운영진 멤버를 추가합니다.")
    @PostMapping("/staffs")
    public ResponseEntity<MemberResponse> createStaff(@RequestBody StaffCreateRequest request) {
        Member lion = memberService.createStaff(request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(MemberResponse.from((Member) lion));
    }

    @Operation(summary = "멤버 조회", description = "id로 멤버 정보를 조회합니다.")
    @GetMapping("/{id}")
    public ResponseEntity<?> getMember(@PathVariable("id") long id) {
        Member member = memberService.searchById(id);
        if(member == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(member);
    }

    @Operation(summary = "아기사자 정보 수정", description = "이름을 기준으로 아기사자의 정보를 수정합니다.")
    @PutMapping("/lions/{id}")
    public ResponseEntity<MemberResponse> updateLion(@PathVariable("id") long id, @RequestBody LionUpdateRequest request) {
        Member updated = memberService.updateLion(id, request);
        if(updated == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(MemberResponse.from(updated));
    }

    @Operation(summary = "운영진 정보 수정", description = "Id를 기준으로 운영진의 정보를 수정합니다.")
    @PutMapping("/staffs/{id}")
    public ResponseEntity<MemberResponse> updateStaff(@PathVariable("id") long id, @RequestBody StaffUpdateRequest request) {
        Member updated = memberService.updateStaff(id, request);
        if(updated == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(MemberResponse.from(updated));
    }

    @Operation(summary = "멤버 삭제", description = "Id를 기준으로 멤버를 삭제합니다.")
    @DeleteMapping("/{id}")
    public ResponseEntity<MemberResponse> deleteLion(@PathVariable("id") long id) {
        if(memberService.deleteMember(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
