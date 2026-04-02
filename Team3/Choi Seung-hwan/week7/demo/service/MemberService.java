package com.example.demo.service;


import com.example.demo.domain.role.Lion;
import com.example.demo.domain.role.Staff;
import com.example.demo.dto.LionCreateReqest;
import com.example.demo.dto.LionUpdateRequest;
import com.example.demo.dto.StaffCreateRequest;
import com.example.demo.dto.StaffUpdateRequest;
import com.example.demo.repository.MemberRepository;
import com.example.demo.domain.role.Role;
import com.example.demo.repository.MemoryMemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  //@Autowired
  MemberRepository memberRepository;

  public MemberService(MemberRepository memberRepository) {
      this.memberRepository = memberRepository;
  }

  public void svinsert(Role role) {
  memberRepository.Rinsert(role);
  }
  public Role svselect(String seName){
   return memberRepository.select(seName);
  }
  public void svAll(){
    memberRepository.ALlSelect();
  }
  public boolean test(String name){
    return memberRepository.test(name);
  }
  public Role createLion(LionCreateReqest lionCreateReqest){
    Role role = new Lion(1, lionCreateReqest.getName(),lionCreateReqest.getMajor(),
        lionCreateReqest.getGeneration(),lionCreateReqest.getPart(),
        lionCreateReqest.getStudentId());
    if(memberRepository.existsByName(role.getName())) {
      return null;
    }else{
      memberRepository.Rinsert(role);
      return role;
    }

  };
  public Role createStaff(StaffCreateRequest staffCreateRequest){
    Role role = new Staff(2,staffCreateRequest.getName(),
        staffCreateRequest.getMajor(), staffCreateRequest.getGeneration(),staffCreateRequest.getPart(),staffCreateRequest.getPosition());
    if(memberRepository.existsByName(role.getName())) {
      return null;
    }else{
      memberRepository.Rinsert(role);
      return role;
    }
  }
  public boolean updateLion(String name, LionUpdateRequest lionUpdateRequest) {
    if (!memberRepository.existsByName(name)) {
      return false;
    }
    Role role = new Lion(1, name, lionUpdateRequest.getMajor(),
        lionUpdateRequest.getGeneration(), lionUpdateRequest.getPart(),
        lionUpdateRequest.getStudentId());
    memberRepository.updateByName(name, role);
    return true;
  }
  public boolean updateStaff(String name, StaffUpdateRequest staffUpdateRequest){
    if(!memberRepository.existsByName(name)){
      return false;
    }
    Role role = new Staff(2,name,
        staffUpdateRequest.getMajor(), staffUpdateRequest.getGeneration(),staffUpdateRequest.getPart(),staffUpdateRequest.getPosition());
    memberRepository.updateByName(name, role);
    return true;
  }
  public boolean deleteMember(String name){return memberRepository.deleteByName(name);}





}
