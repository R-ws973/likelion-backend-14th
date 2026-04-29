import java.util.List;

public class MockMemberRepository implements MemberRepository{
  @Override
  public void createLion(String name, String major, int generation, String part, int number) {
    System.out.println("[Mock] 아기사자 생성: " + name);
  }

  @Override
  public void createStaff(String name, String major, int generation, String part, String position) {
    System.out.println("[Mock] 운영진 생성: " + name);
  }

  @Override
  public List<String> findAllLionNames() {
    return List.of("MockLion");
  }

  @Override
  public List<String> findAllStaffNames() {
    return List.of("MockStaff");
  }

  @Override
  public boolean isLion(String name) {
    return false;
  }

  @Override
  public boolean isStaff(String name) {
    return false;
  }

  @Override
  public Staff findStaffByname(String name) {
    return null;
  }

  @Override
  public Lion findLionByName(String name) {
    return null;
  }


}
