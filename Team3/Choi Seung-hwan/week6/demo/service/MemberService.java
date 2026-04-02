package com.example.demo.service;


import com.example.demo.repository.MemberRepository;
import com.example.demo.role.Role;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

  //@Autowired
  MemberRepository memberRepository;

  public MemberService() {

  }

  public void svinsert(Role role) {
  memberRepository.Rinsert(role);
  }
  public void svselect(String seName){
   memberRepository.select(seName);
  }
  public void svAll(){
    memberRepository.ALlSelect();
  }
  public boolean test(String name){
    return memberRepository.test(name);
  }

}
