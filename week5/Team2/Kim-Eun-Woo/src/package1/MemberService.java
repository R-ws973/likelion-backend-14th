package package1;

import role.Role;
import java.util.List;

public class MemberService {
  private final MemberRepository memberRepository = new MemberRepository();

  public boolean join(Role member) {
    if (memberRepository.existsByName(member.getName())) {
      return false;
    }
    memberRepository.save(member);
    return true;
  }

  public Role searchMember(String name){
    return memberRepository.findByName(name);
  }

  public List<Role> getAllMembers() {
    return memberRepository.findAll();
  }
}
