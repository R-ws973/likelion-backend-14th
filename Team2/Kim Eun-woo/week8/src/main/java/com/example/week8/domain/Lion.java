package com.example.week8.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lion")
public class Lion implements Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String name;

  private String major;
  private int generation;
  private String part;
  private String studentId;

  // JPA가 엔티티를 생성할 때 사용하는 기본 생성자 (외부에서 직접 호출하지 않도록 protected)
  protected Lion() {
  }

  public Lion(String name, String major, int generation, String part, String studentId) {
    this.name = name;
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.studentId = studentId;
  }

  // 수정용: 영속 상태 엔티티의 필드를 변경하면 트랜잭션 커밋 시 자동 반영(더티 체킹)
  public void update(String major, int generation, String part, String studentId) {
    this.major = major;
    this.generation = generation;
    this.part = part;
    this.studentId = studentId;
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
    return "아기사자";
  }

  public String getStudentId() {
    return studentId;
  }
}
