package com.example.week7.controller;

import com.example.week7.domain.Lion;
import com.example.week7.domain.Role;
import com.example.week7.domain.Staff;
import com.example.week7.dto.LionCreateRequest;
import com.example.week7.dto.LionResponse;
import com.example.week7.dto.LionUpdateRequest;
import com.example.week7.dto.StaffCreateRequest;
import com.example.week7.dto.StaffResponse;
import com.example.week7.dto.StaffUpdateRequest;
import com.example.week7.service.MemberService;
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
    Lion createdLion = memberService.createLion(request);

    if (createdLion == null) {
      return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(LionResponse.from(createdLion));
  }

  @PostMapping("/staffs")
  public ResponseEntity<StaffResponse> createStaff(@RequestBody StaffCreateRequest request) {
    Staff createdStaff = memberService.createStaff(request);

    if (createdStaff == null) {
      return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(StaffResponse.from(createdStaff));
  }

  @GetMapping("/{name}")
  public ResponseEntity<?> findMember(@PathVariable String name) {
    Role foundMember = memberService.findMember(name);

    if (foundMember == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    if (foundMember instanceof Lion lion) {
      return ResponseEntity.ok(LionResponse.from(lion));
    }

    if (foundMember instanceof Staff staff) {
      return ResponseEntity.ok(StaffResponse.from(staff));
    }

    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
  }

  @PutMapping("/lions/{name}")
  public ResponseEntity<LionResponse> updateLion(
      @PathVariable String name,
      @RequestBody LionUpdateRequest request
  ) {
    Lion updatedLion = memberService.updateLion(name, request);

    if (updatedLion == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    return ResponseEntity.ok(LionResponse.from(updatedLion));
  }

  @PutMapping("/staffs/{name}")
  public ResponseEntity<StaffResponse> updateStaff(
      @PathVariable String name,
      @RequestBody StaffUpdateRequest request
  ) {
    Staff updatedStaff = memberService.updateStaff(name, request);

    if (updatedStaff == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    return ResponseEntity.ok(StaffResponse.from(updatedStaff));
  }

  @DeleteMapping("/{name}")
  public ResponseEntity<Void> deleteMember(@PathVariable String name) {
    boolean deleted = memberService.deleteMember(name);

    if (!deleted) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    return ResponseEntity.noContent().build();
  }
}