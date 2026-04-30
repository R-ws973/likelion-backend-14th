import java.util.ArrayList;
import java.util.List;

public class week5_step1_MemberRepository {
  private List<week5_Member> members = new ArrayList<>();

  public void save(week5_Member member) {
    members.add(member);
  }

  public week5_Member findByName(String name) {
    for (week5_Member member : members) {
      if (member.getName().equals(name)) {
        return member;
      }
    }
    return null;
  }

  public List<week5_Member> findAll() {
    return members;
  }

  public boolean existsByName(String name) {
    return findByName(name) != null;
  }
}