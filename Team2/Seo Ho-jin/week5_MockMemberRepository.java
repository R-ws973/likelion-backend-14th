import java.util.ArrayList;
import java.util.List;

public class week5_MockMemberRepository implements week5_step_2_MemberRepository {

  private List<week5_Member> dummyMembers = new ArrayList<>();

  public week5_MockMemberRepository() {
    dummyMembers.add(new week5_Member("아기사자", "김사자", "컴퓨터공학과", 14, "백엔드", "202020202"));
    dummyMembers.add(new week5_Member("운영진", "이운영", "소프트웨어학과", 13, "프론트엔드", "202111111"));
  }

  @Override
  public void save(week5_Member member) {
    System.out.println("Mock 저장소는 실제 저장을 하지 않습니다.");
  }

  @Override
  public week5_Member findByName(String name) {
    for (week5_Member member : dummyMembers) {
      if (member.getName().equals(name)) {
        return member;
      }
    }
    return null;
  }

  @Override
  public List<week5_Member> findAll() {
    return dummyMembers;
  }

  @Override
  public boolean existsByName(String name) {
    return findByName(name) != null;
  }
}