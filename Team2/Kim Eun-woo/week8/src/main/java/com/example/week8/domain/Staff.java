package com.example.week8.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff implements Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String name;

  private String major;
  private int generation;
  private String part;
  private String position;

  protected Staff() {
  }

  public Staff(String name, String major, int generation, String part, String position) {
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.position = position;
  }

  public void update(String major, int generation, String part, String position) {
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.position = position;
  }

  public Long getId() {
    return id;
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
