package com.example.api.week9.member.domain;

import com.example.api.week9.assignment.domain.Assignment;
import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name, major, part;
    private int generation;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    private String studentId;
    private String position;

    @OneToMany(mappedBy = "member")
    private List<Assignment> assignments;

//    @NoArgsConstructor
    public Member() {}

    public Member(String name, String major, int generation, String part,
                  RoleType roleType, String studentId, String position) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
        this.roleType = roleType;
        this.studentId = studentId;
        this.position = position;
        this.assignments = new ArrayList<>();
    }

    public void updateInfo(String major, int generation, String part) {
        this.major = major;
        this.generation = generation;
        this.part = part;
    }
    public void updateStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void updatePosition(String position) {
        this.position = position;
    }

//    getter method
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getGeneration() { return generation; }
    public String getPart() { return part; }
    public RoleType getRoleType() { return roleType; }
    public String getStudentId() { return studentId; }
    public String getPosition() { return position; }

}
