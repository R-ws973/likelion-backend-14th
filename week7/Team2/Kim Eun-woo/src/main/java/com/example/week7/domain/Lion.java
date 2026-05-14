package com.example.week7.domain;

public class Lion implements Role{

  private String name;
  private String major;
  private int generation;
  private String part;
  private String studentId;

  public Lion(String name, String major, int generation, String part, String studentId) {
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.studentId = studentId;
  }

  @Override
  public String getName(){
    return name;
  }

  @Override
  public String getMajor(){
    return major;
  }

  @Override
  public int getGeneration(){
    return generation;
  }

  @Override
  public String getPart() {
    return part;
  }

  @Override
  public String getRoleName(){
    return "아기사자";
  }

  public String getStudentId(){
    return studentId;
  }

}
