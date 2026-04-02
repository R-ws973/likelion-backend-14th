package role;

import policy.StaffPolicy;

import java.util.Scanner;

public class Staff extends Role {
  String job;
  String position;

  public Staff(int job,String name, String Major, int number, String part) {
    super(job,name, Major,number, part);
    Scanner sc = new Scanner(System.in);
    System.out.print("직책 : ");
    position = sc.nextLine();
  }
  public StaffPolicy getStaffPolicy() {
    return new StaffPolicy();
  }

  @Override
  public void Print() {
    System.out.println("\n===== 결과 출력 =====");
    System.out.println("역할 : " + getJob() );
    System.out.println("이름 : " + getName() +" | 전공 : "+getMajor()+" | 기수 : " +getNumber()+ " | 파트 : "+getPart());
    System.out.println("직책 : "+ position);
    System.out.println("과제 제출 가능 여부 : " + (getStaffPolicy().Policy() ? "가능" : "불가능"));
  }



}

