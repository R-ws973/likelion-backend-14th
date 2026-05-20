package com.example.api.week7.controller;

import com.example.api.week7.domain.role.Lion;
import com.example.api.week7.domain.role.Role;
import com.example.api.week7.domain.role.Staff;
import com.example.api.week7.dto.*;
import com.example.api.week7.service.MemberService;
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
    public ResponseEntity<LionResponse> createLion(@RequestBody LionCreateRequest request) {
        Role lion = memberService.createLion(request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(LionResponse.from((Lion) lion));
    }

    @Operation(summary = "운영진 생성", description = "새로운 운영진 멤버를 추가합니다.")
    @PostMapping("/staffs")
    public ResponseEntity<LionResponse> createStaff(@RequestBody StaffCreateRequest request) {
        Role lion = memberService.createStaff(request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(LionResponse.from((Lion) lion));
    }

    @Operation(summary = "멤버 조회", description = "이름으로 멤버 정보를 조회합니다.")
    @GetMapping("/{name}")
    public ResponseEntity<?> getRole(@PathVariable("name") String name) {
        Role member = memberService.searchByName(name);
        if(member == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(toResponse(member));
    }

    @Operation(summary = "아기사자 정보 수정", description = "이름을 기준으로 아기사자의 정보를 수정합니다.")
    @PutMapping("/lions/{name}")
    public ResponseEntity<LionResponse> updateLion(@PathVariable("name") String name, @RequestBody LionUpdateRequest request) {
        Role lion = memberService.updateLion(name, request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(LionResponse.from((Lion) lion));
    }

    @Operation(summary = "운영진 정보 수정", description = "이름을 기준으로 운영진의 정보를 수정합니다.")
    @PutMapping("/staffs/{name}")
    public ResponseEntity<StaffResponse> updateStaff(@PathVariable("name") String name, @RequestBody StaffUpdateRequest request) {
        Role lion = memberService.updateStaff(name, request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(StaffResponse.from((Staff) lion));
    }

    @Operation(summary = "멤버 삭제", description = "이름을 기준으로 멤버를 삭제합니다.")
    @DeleteMapping("/{name}")
    public ResponseEntity<LionResponse> deleteLion(@PathVariable("name") String name) {
        if(memberService.deleteMember(name)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
    private Object toResponse(Role role) {
        if (role instanceof Lion lion) {
            return LionResponse.from(lion);
        } else if (role instanceof Staff staff) {
            return StaffResponse.from(staff);
        }
        return role;
    }

}
