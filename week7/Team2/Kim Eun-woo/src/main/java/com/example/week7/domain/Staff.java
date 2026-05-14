package com.example.week7.domain;

public class Staff implements Role {

  private String name;
  private String major;
  private int generation;
  private String part;
  private String position;

  public Staff(String name, String major, int generation, String part, String position) {
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.position = position;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getMajor() {
    return major;
  }

  @Override
  public int getGeneration() {
    return generation;
  }

  @Override
  public String getPart() {
    return part;
  }

  @Override
  public String getRoleName() {
    return "운영진";
  }

  public String getPosition() {
    return position;
  }
}