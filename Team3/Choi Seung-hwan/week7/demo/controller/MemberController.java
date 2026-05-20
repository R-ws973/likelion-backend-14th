package com.example.demo.controller;

import com.example.demo.domain.role.Role;
import com.example.demo.dto.*;
import com.example.demo.repository.MemoryMemberRepository;
import com.example.demo.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {
  private final MemoryMemberRepository memoryMemberRepository;
  private final MemberService memberService;

  public MemberController(MemoryMemberRepository memoryMemberRepository) {
    this.memoryMemberRepository = memoryMemberRepository;
    this.memberService = new MemberService(memoryMemberRepository);
  }


  @PostMapping("/lions")
  public ResponseEntity<LionResponse> lions(@RequestBody LionCreateReqest lionCreateReqest)
  {
    Role role = memberService.createLion(lionCreateReqest);
    if(role == null) {
      return ResponseEntity.status(409).build();
    }else{
      return ResponseEntity.ok().body(LionResponse.from(role));
    }
  }
  @PostMapping("/staffs")
  public ResponseEntity<StaffResponse> staffs(@RequestBody StaffCreateRequest staffCreateRequest)
  {
    Role role = memberService.createStaff(staffCreateRequest);
    if(role == null) {
      return ResponseEntity.status(409).build();
    }else{
      return ResponseEntity.ok().body(StaffResponse.from(role));
    }
  }
  @GetMapping("/{name}")
  public ResponseEntity<Object> findByName(@PathVariable("name") String name) {

    if (!memoryMemberRepository.existsByName(name)) {
      return ResponseEntity.status(404).build();
    }

    Role role = memberService.svselect(name);
    if (role == null) {
      return ResponseEntity.status(500).build();
    }
    return ResponseEntity.ok().body(converResponse(role));
  }
  @PutMapping("/lions/{name}")
  public ResponseEntity<LionResponse> lionsApi(@PathVariable("name") String name, @RequestBody LionUpdateRequest lionUpdateRequest) {
    if (memberService.updateLion(name, lionUpdateRequest)) {
      return ResponseEntity.ok().body(LionResponse.from(memberService.svselect(name)));
    } else {
      return ResponseEntity.status(404).build();
    }
  }
  @PutMapping("/staffs/{name}")
  public ResponseEntity<StaffResponse> staffsApi(@PathVariable("name") String name, @RequestBody StaffUpdateRequest staffUpdateRequest) {
    if (memberService.updateStaff(name, staffUpdateRequest)) {
      return ResponseEntity.ok().body(StaffResponse.from(memberService.svselect(name)));
    } else {
      return ResponseEntity.status(404).build();
    }
  }
  @DeleteMapping("/{name}")
  public ResponseEntity<Void> deleteMember(@PathVariable String name) {
    if (!memberService.deleteMember(name)) {
      return ResponseEntity.status(404).build();
    }

    memberService.deleteMember(name);
    return ResponseEntity.noContent().build();
  }


  public Object converResponse(Role role){
    if(role.getJob().equals("아기사자")){
      return LionResponse.from(role);
    }else{
      return StaffResponse.from(role);
    }
  }

}
