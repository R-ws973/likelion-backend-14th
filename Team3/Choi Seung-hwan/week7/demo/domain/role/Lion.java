package com.example.demo.domain.role;


import com.example.demo.domain.policy.LionPolicy;

public  class  Lion extends Role {

  int StudentId;
  public Lion(int job,String name, String Major, int number, String part,int StudentId) {
    super(job, name, Major,number, part);
    this.StudentId = StudentId;
  }


  public LionPolicy getLionPolicy() {
    return new LionPolicy();
  }

  public int getStudentId() {return StudentId;}


  @Override
  public void Print() {
    System.out.println("===== 결과 출력 =====");
    System.out.println("역할 : " + getJob());
    System.out.println("이름 : "+getName()+ " | 전공 : "+getMajor()+" | 기수 : "+getNumber()+ " | 파트 : "+getPart());
    System.out.println("학번 : "+getStudentId());
    System.out.println("과제 제출 가능 여부 : " + (getLionPolicy().Policy() ? "가능" : "불가능"));

  }


}
