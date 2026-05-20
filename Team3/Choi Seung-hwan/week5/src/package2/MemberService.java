package package2;

import role.Role;

public class MemberService {

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
