import javax.management.relation.Role;
import java.lang.reflect.Member;
import javax.management.relation.Role;
import java.lang.reflect.Member;
import java.util.*;

public class MemberRepository {

  Scanner sc = new Scanner(System.in);
  List<Lion> lionList = new ArrayList<>();
  List<Staff> staffList = new ArrayList<>();
  Map<String, Lion> nameLion = new HashMap<>();
  Map<String, Staff> nameStaff = new HashMap<>();

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

  //아기사자 이름 중복 확인
  boolean isLion(String name) {
    for (Lion lion : lionList) {
      if (lion.equals(name)) {
        return true;
      }
    }
    return false;
  }

  //운영진 이름 중복 확인
  boolean isStaff(String name) {
    for (Staff staff : staffList) {
      if (staff.equals(name)) {
        return true;
      }
    }
    return false;
  }

  //운영진 전체 이름 반환
  List<String> findAllStaffNames() {
    List<String> names = new ArrayList<>();
    for (Staff s : staffList) {
      names.add(s.getName());
    }
    return names;
  }

  //아기사자 전체 이름 반환
  List<String> findAllLionNames() {
    List<String> names = new ArrayList<>();
    for (Lion l : lionList) {
      names.add(l.getName());
    }
    return names;
  }

  //운영진 이름 검색
  Staff findStaffByname(String name) {
    for (Staff s : staffList) {
      if (s.getName().equals(name)) {
        return s;
      }
    }
    return null;
  }

  //아기사자 이름 검색
  Lion findLionByName(String name) {
    for (Lion l : lionList) {
      if (l.getName().equals(name)) {
        return l;
      }
    }
    return null;
  }


}




