import java.util.ArrayList;
import java.util.List;

public class week5_MemoryMemberRepository implements week5_step_2_MemberRepository {

  private List<week5_Member> members = new ArrayList<>();

  @Override
  public void save(week5_Member member) {
    members.add(member);
  }

  @Override
  public week5_Member findByName(String name) {
    for (week5_Member member : members) {
      if (member.getName().equals(name)) {
        return member;
      }
    }
    return null;
  }

  @Override
  public List<week5_Member> findAll() {
    return members;
  }

  @Override
  public boolean existsByName(String name) {
    return findByName(name) != null;
  }
}