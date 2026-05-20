package package2;

import role.Lion;
import role.Role;
import role.Staff;

import java.util.ArrayList;
import java.util.List;

public class MockMemberRepository implements MemberRepository {

  private final List<Role> mockMembers = new ArrayList<>();

  public MockMemberRepository() {
    mockMembers.add(new Lion("홍길동", "백엔드"));
    mockMembers.add(new Lion("김코딩", "프론트엔드"));
    mockMembers.add(new Staff("이운영", "운영팀장"));
  }

  @Override
  public void save(Role member) {
    System.out.println("[Mock 저장소] 실제 저장은 하지 않습니다.");
  }

  @Override
  public Role findByName(String name) {
    for (Role member : mockMembers) {
      if (member.getName().equals(name)) {
        return member;
      }
    }

    return null;
  }

  @Override
  public List<Role> findAll() {
    return mockMembers;
  }

  @Override
  public boolean existsByName(String name) {
    for (Role member : mockMembers) {
      if (member.getName().equals(name)) {
        return true;
      }
    }

    return false;
  }
}