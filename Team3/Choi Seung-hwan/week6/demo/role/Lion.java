package com.example.demo.role;



import com.example.demo.policy.LionPolicy;

import java.util.Scanner;

public  class  Lion extends Role {
  String job;
  int StudentNumber;

  public Lion(int job,String name, String Major, int number, String part) {
    super(job, name, Major,number, part);

    Scanner sc = new Scanner(System.in);
    System.out.print("학번 : ");
    StudentNumber = sc.nextInt();
  }
  public LionPolicy getLionPolicy() {

    return new LionPolicy();
  }

  @Override
  public void Print() {
    System.out.println("===== 결과 출력 =====");
    System.out.println("역할 : " + getJob());
    System.out.println("이름 : "+getName()+ " | 전공 : "+getMajor()+" | 기수 : "+getNumber()+ " | 파트 : "+getPart());
    System.out.println("학번 : "+ StudentNumber);
    System.out.println("과제 제출 가능 여부 : " + (getLionPolicy().Policy() ? "가능" : "불가능"));
  }


}
