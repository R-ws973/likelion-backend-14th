package com.example.demo.dto;

import com.example.demo.domain.role.Lion;
import com.example.demo.domain.role.Role;

public class LionResponse {
  String name;
  String major;
  int generation;
  String part;
  String roleName;
  int studentId;
  public static LionResponse from(Role role) {
    LionResponse lionResponse = new LionResponse();
    lionResponse.name = role.getName();
    lionResponse.major = role.getMajor();
    lionResponse.generation = role.getNumber();
    lionResponse.part = role.getPart();
    lionResponse.roleName = role.getJob();
    lionResponse.studentId = role.getStudentId();
    return lionResponse;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
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
  public String getRoleName() {
    return roleName;
  }
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }
  public int getStudentId() {
    return studentId;
  }
  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }
}

