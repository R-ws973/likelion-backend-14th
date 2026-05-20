import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //가짜 부품 제작
//    MockMemberRepository repository = new MockMemberRepository();
    //사용할 부품 제작
    MemberRepository repository = new MemoryMemberRepository();
    //부품을 service에 끼워 service 객체 생성
    MemberService service = new MemberService(repository);
    //여기서부턴 위에서 만든 repository를 사용


    while (true) {
      String name, major, part, position;
      int generation, number;
      int choice;

      Scanner sc = new Scanner(System.in);
      System.out.println("=====멋사 멤버 관리 시스템=====");
      System.out.println("1. 멤버 등록");
      System.out.println("2. 전체 멤버 조회");
      System.out.println("3. 이름으로 검색");
      System.out.println("4. 종료");
      System.out.print("선택: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          System.out.print("역할 선택(1: 아기사자, 2: 운영진): ");
          int what = sc.nextInt();
          sc.nextLine();

          if (what == 1) {
            System.out.print("이름: ");
            name = sc.nextLine();
            System.out.print("전공: ");
            major = sc.nextLine();
            System.out.print("기수: ");
            generation = sc.nextInt();
            sc.nextLine();
            System.out.print("파트: ");
            part = sc.nextLine();
            System.out.print("학번: ");
            number = sc.nextInt();
            sc.nextLine();
            service.joinLion(name, major, generation, part, number);
          } else if (what == 2) {
            System.out.print("이름: ");
            name = sc.nextLine();
            System.out.print("전공: ");
            major = sc.nextLine();
            System.out.print("기수: ");
            generation = sc.nextInt();
            sc.nextLine();
            System.out.print("파트: ");
            part = sc.nextLine();
            System.out.print("직책: ");
            position = sc.nextLine();
            service.joinStaff(name, major, generation, part, position);
          }
          break;

        case 2:
          service.searchAllStaff();
          service.searchAllLion();
          break;

        case 3:
          System.out.print("검색할 이름: ");
          name = sc.nextLine();
          service.searchMember(name);
          break;
        case 4:
          System.exit(0);
      }
    }
  }
}
