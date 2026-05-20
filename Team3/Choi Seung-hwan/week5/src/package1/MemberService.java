package package1;

import role.Role;

import java.util.Scanner;

public class MemberService {
  MemberRepository memberRepository = new MemberRepository();
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
