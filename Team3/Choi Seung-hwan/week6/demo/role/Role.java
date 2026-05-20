package com.example.demo.role;


public abstract class Role {
  private String job;
  private String name;
  private String Major;
  private int Number;
  private String part;
  public Role(int job, String name, String Major, int Number, String part) {
      if(job==1){
        this.job = "아기사자";
      }else{
        this.job = "운영진";
      }
      this.name = name;
      this.Major = Major;
      this.Number = Number;
      this.part = part;
  }
  public abstract void Print();

  public String getName() {
    return name;
  }
  public String getJob() { return job;}
  public String getMajor() {
    return Major;
  }
  public int getNumber() {
    return Number;
  }
  public String getPart() {
    return part;
  }

}
