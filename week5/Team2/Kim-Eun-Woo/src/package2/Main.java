package package2;

import policy.LionSubmissionPolicy;
import policy.StaffSubmissionPolicy;
import policy.SubmissionPolicy;
import role.Lion;
import role.Role;
import role.Staff;

import java.util.List;
import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    // 아래 두 줄 중 하나만 사용하면 됩니다.

    // 1. 실제로 데이터를 저장하는 메모리 저장소
//    MemberRepository memberRepository = new MemoryMemberRepository();

    // 2. 미리 정해진 더미 데이터를 반환하는 Mock 저장소
    MemberRepository memberRepository = new MockMemberRepository();

    MemberService memberService = new MemberService(memberRepository);

    while (true) {
      printMenu();

      int menu = scanner.nextInt();
      scanner.nextLine();

      if (menu == 1) {
        registerMember(memberService);
      } else if (menu == 2) {
        printAllMembers(memberService);
      } else if (menu == 3) {
        searchMember(memberService);
      } else if (menu == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("잘못된 메뉴입니다.");
      }
    }
  }

  private static void printMenu() {
    System.out.println();
    System.out.println("===== 멤버 관리 시스템 Step 2 =====");
    System.out.println("1. 멤버 등록");
    System.out.println("2. 전체 멤버 조회");
    System.out.println("3. 이름으로 멤버 검색");
    System.out.println("0. 종료");
    System.out.print("메뉴 선택: ");
  }

  private static void registerMember(MemberService memberService) {
    System.out.println();
    System.out.println("역할을 선택하세요.");
    System.out.println("1. 아기사자");
    System.out.println("2. 운영진");
    System.out.print("역할 선택: ");

    int roleSelect = scanner.nextInt();
    scanner.nextLine();

    System.out.print("이름 입력: ");
    String name = scanner.nextLine();

    Role member;
    SubmissionPolicy policy;

    if (roleSelect == 1) {
      System.out.print("트랙 입력: ");
      String track = scanner.nextLine();

      member = new Lion(name, track);
      policy = new LionSubmissionPolicy();
    } else if (roleSelect == 2) {
      System.out.print("직책 입력: ");
      String position = scanner.nextLine();

      member = new Staff(name, position);
      policy = new StaffSubmissionPolicy();
    } else {
      System.out.println("잘못된 역할 선택입니다.");
      return;
    }

    boolean result = memberService.join(member);

    if (result) {
      System.out.println("등록 완료!");
      System.out.println(policy.getPolicy(member));
    } else {
      System.out.println("등록 실패! 이미 존재하는 이름입니다.");
    }
  }

  private static void printAllMembers(MemberService memberService) {
    System.out.println();
    System.out.println("===== 전체 멤버 조회 =====");

    List<Role> members = memberService.getAllMembers();

    if (members.isEmpty()) {
      System.out.println("등록된 멤버가 없습니다.");
      return;
    }

    for (Role member : members) {
      System.out.println(member.getInfo());
    }
  }

  private static void searchMember(MemberService memberService) {
    System.out.println();
    System.out.print("검색할 이름 입력: ");
    String name = scanner.nextLine();

    Role member = memberService.searchMember(name);

    if (member == null) {
      System.out.println("해당 이름의 멤버를 찾을 수 없습니다.");
    } else {
      System.out.println("검색 결과: " + member.getInfo());
    }
  }
}