import java.util.List;
import java.util.Scanner;

public class week5_step_2_Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("저장소를 선택하세요:");
    System.out.println("1. MemoryMemberRepository (실제 저장)");
    System.out.println("2. MockMemberRepository (더미 데이터)");
    System.out.print("선택: ");

    int repoNum = sc.nextInt();
    sc.nextLine();

    // DI 핵심
    week5_step_2_MemberRepository repository;

    if (repoNum == 1) {
      repository = new week5_MemoryMemberRepository();
    } else {
      repository = new week5_MockMemberRepository();
    }

    week5_step_2_MemberService service = new week5_step_2_MemberService(repository);

    while (true) {
      System.out.println();
      System.out.println("===== 멋사 멤버 관리 시스템 (Step 2) =====");
      System.out.println("1. 멤버 등록");
      System.out.println("2. 전체 멤버 조회");
      System.out.println("3. 이름으로 검색");
      System.out.println("4. 종료");
      System.out.print("선택: ");

      int menu = sc.nextInt();
      sc.nextLine();

      if (menu == 1) {

        System.out.print("역할 선택 (1: 아기사자, 2: 운영진): ");
        int roleNum = sc.nextInt();
        sc.nextLine();

        String role = (roleNum == 1) ? "아기사자" : "운영진";

        System.out.println("정보 입력");

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("전공: ");
        String major = sc.nextLine();

        System.out.print("기수: ");
        int generation = sc.nextInt();
        sc.nextLine();

        System.out.print("파트: ");
        String part = sc.nextLine();

        System.out.print("학번: ");
        String studentId = sc.nextLine();

        week5_Member member = new week5_Member(role, name, major, generation, part, studentId);

        if (service.register(member)) {
          System.out.println("등록 완료: " + name);
        } else {
          System.out.println("이미 존재하는 이름입니다.");
        }

      } else if (menu == 2) {

        List<week5_Member> members = service.getAllMembers();

        if (members.isEmpty()) {
          System.out.println("등록된 멤버가 없습니다.");
        } else {
          for (week5_Member member : members) {
            member.printInfo();
            System.out.println();
          }
        }

      } else if (menu == 3) {

        System.out.print("검색할 이름: ");
        String name = sc.nextLine();

        week5_Member member = service.searchByName(name);

        if (member == null) {
          System.out.println("검색 결과가 없습니다.");
        } else {
          member.printInfo();
        }

      } else if (menu == 4) {
        System.out.println("프로그램 종료");
        break;
      }
    }

    sc.close();
  }
}