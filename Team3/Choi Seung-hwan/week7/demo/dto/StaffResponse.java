package com.example.demo.dto;

import com.example.demo.domain.role.Role;

public class StaffResponse {
  String name;
  String major;
  int generation;
  String part;
  String roleName;
  String position;
  public static StaffResponse from(Role role) {
    StaffResponse staffResponse = new StaffResponse();
    staffResponse.setName(role.getName());
    staffResponse.setMajor(role.getMajor());
    staffResponse.setGeneration(role.getNumber());
    staffResponse.setPart(role.getPart());
    staffResponse.setRoleName(role.getJob());
    staffResponse.setPosition(role.getPosition());
    return staffResponse;
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
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
  }
}
