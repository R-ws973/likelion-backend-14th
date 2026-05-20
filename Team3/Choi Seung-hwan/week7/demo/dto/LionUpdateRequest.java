package com.example.demo.dto;

public class LionUpdateRequest {

  String major;
  int generation;
  String part;
  int studentId;


  public String getMajor() {
    return major;
  }
  public void setMajor(String major) {
    this.major = major;
  }
  public int getGeneration() {
    return generation;
  }
  public void setGeneration(int generation) {
    this.generation = generation;
  }
  public String getPart() {
    return part;
  }
  public void setPart(String part) {
    this.part = part;
  }
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }
  public int getStudentId() {
    return studentId;
  }

}
