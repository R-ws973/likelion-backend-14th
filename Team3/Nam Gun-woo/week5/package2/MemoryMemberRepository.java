import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MemoryMemberRepository implements MemberRepository{
  private List<Lion> lionList = new ArrayList<>();
  private List<Staff> staffList = new ArrayList<>();
  Map<String, Lion> nameLion = new HashMap<>();
  Map<String, Staff> nameStaff = new HashMap<>();

  @Override
  //운영진 객체 생성
  public void createStaff(String name, String major, int generation, String part, String position) {
    if (!isStaff(name)) {
      Staff staff = new Staff(name, major, generation, part, position);
      staffList.add(staff);
      nameStaff.put(name, staff);
    } else {
      return;
    }
  }
  @Override
  //아기사자 객체 생성
  public void createLion(String name, String major, int generation, String part, int number) {

    if (!isLion(name)) {
      Lion lion = new Lion(name, major, generation, part, number);
      lionList.add(lion);
      nameLion.put(name, lion);
    } else {
      return;
    }
  }
  @Override
  //아기사자 이름 중복 확인
  public boolean isLion(String name) {
    for (Lion lion : lionList) {
      if (lion.equals(name)) {
        return true;
      }
    }
    return false;
  }
  @Override
  //운영진 이름 중복 확인
  public boolean isStaff(String name) {
    for (Staff staff : staffList) {
      if (staff.equals(name)) {
        return true;
      }
    }
    return false;
  }
  @Override
  //운영진 전체 이름 반환
  public List<String> findAllStaffNames() {
    List<String> names = new ArrayList<>();
    for (Staff s : staffList) {
      names.add(s.getName());
    }
    return names;
  }
  @Override
  //아기사자 전체 이름 반환
  public List<String> findAllLionNames() {
    List<String> names = new ArrayList<>();
    for (Lion l : lionList) {
      names.add(l.getName());
    }
    return names;
  }
  @Override
  //운영진 이름 검색
  public Staff findStaffByname(String name) {
    for (Staff s : staffList) {
      if (s.getName().equals(name)) {
        return s;
      }
    }
    return null;
  }
  @Override
  //아기사자 이름 검색
  public Lion findLionByName(String name) {
    for (Lion l : lionList) {
      if (l.getName().equals(name)) {
        return l;
      }
    }
    return null;
  }
}




