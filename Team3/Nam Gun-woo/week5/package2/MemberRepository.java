import java.util.List;

public interface MemberRepository {
  void createLion(String name, String major, int generation, String part, int number);
  void createStaff(String name, String major, int generation, String part, String position);
  List<String> findAllLionNames();
  List<String> findAllStaffNames();
  boolean isLion(String name);
  boolean isStaff(String name);
  Staff findStaffByname(String name);
  Lion findLionByName(String name);

}
