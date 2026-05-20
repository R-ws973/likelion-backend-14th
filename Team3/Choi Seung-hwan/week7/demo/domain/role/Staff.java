package com.example.demo.domain.role;




import com.example.demo.domain.policy.StaffPolicy;

import java.util.Scanner;

public class Staff extends Role {
  String job;
  String position;

  public Staff(int job,String name, String Major, int number, String part,String position) {
    super(job,name, Major,number, part);
    this.position=position;
  }


  public StaffPolicy getStaffPolicy() {
    return new StaffPolicy();
  }

  public String getPosition() {return position;}



  @Override
  public void Print() {
    System.out.println("\n===== 결과 출력 =====");
    System.out.println("역할 : " + getJob() );
    System.out.println("이름 : " + getName() +" | 전공 : "+getMajor()+" | 기수 : " +getNumber()+ " | 파트 : "+getPart());
    System.out.println("직책 : "+  getPosition());
  }



}

