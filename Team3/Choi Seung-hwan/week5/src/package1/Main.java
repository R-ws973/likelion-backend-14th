package package1;

import role.Lion;
import role.Role;
import role.Staff;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MemberService memberService = new MemberService();
    while(true) {
      System.out.println("1. 멤버 등록");
      System.out.println("2. 전체 멤버 조회");
      System.out.println("3. 이름으로 검색");
      System.out.println("4. 종료");
      System.out.print("선택 : ");
      int tap = sc.nextInt();

      switch (tap) {
        case 1:
          Role role = null;
          System.out.println("===== 멤버 등록 =====");
          System.out.print("역할 선택(1 : 아기사자, 2 : 운영진) : ");
          int job = sc.nextInt();
          sc.nextLine();
          System.out.print("이름 : ");
          String name = sc.nextLine();
          if(!memberService.test(name)){
            System.out.println("이미 동일한 이름이 있습니다.");
            exit(1);
          }
          System.out.print("전공 : ");
          String Major = sc.nextLine();
          System.out.print("기수 : ");
          int NUmber = Integer.parseInt(sc.nextLine());
          System.out.print("파트 : ");
          String part = sc.nextLine();
          if(job == 1){
             role = new Lion(job,name,Major,NUmber,part);
          }else if (job == 2){
             role = new Staff(job,name,Major,NUmber,part);
          }
          memberService.svinsert(role);
          break;
        case 2:
          memberService.svAll();
          break;
        case 3:
          sc.nextLine();
          System.out.print("검색할 이름 : ");
          String seName = sc.nextLine();
          System.out.print("\n\t[검색 결과]\n");
          memberService.svselect(seName);

          break;
        case 4:
          exit(1);
          break;
      }
    }
    }
}
