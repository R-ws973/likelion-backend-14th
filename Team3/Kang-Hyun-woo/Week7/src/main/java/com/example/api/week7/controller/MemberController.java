package com.example.api.week7.controller;

import com.example.api.week7.domain.role.Lion;
import com.example.api.week7.domain.role.Role;
import com.example.api.week7.domain.role.Staff;
import com.example.api.week7.dto.*;
import com.example.api.week7.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/lions")
    public ResponseEntity<LionResponse> createLion(@RequestBody LionCreateRequest request) {
        Role lion = memberService.createLion(request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(LionResponse.from((Lion) lion));
    }

    @PostMapping("/staffs")
    public ResponseEntity<LionResponse> createStaff(@RequestBody StaffCreateRequest request) {
        Role lion = memberService.createStaff(request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(LionResponse.from((Lion) lion));
    }
    @GetMapping("/{name}")
    public ResponseEntity<?> getRole(@PathVariable("name") String name) {
        Role member = memberService.searchByName(name);
        if(member == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(toResponse(member));
    }

    @PutMapping("/lions/{name}")
    public ResponseEntity<LionResponse> updateLion(@PathVariable("name") String name, @RequestBody LionUpdateRequest request) {
        Role lion = memberService.updateLion(name, request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(LionResponse.from((Lion) lion));
    }

    @PutMapping("/staffs/{name}")
    public ResponseEntity<StaffResponse> updateStaff(@PathVariable("name") String name, @RequestBody StaffUpdateRequest request) {
        Role lion = memberService.updateStaff(name, request);
        if(lion == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(StaffResponse.from((Staff) lion));
    }
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
