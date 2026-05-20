package com.example.api.week9.assignment.domain;

import com.example.api.week9.member.domain.Member;
import jakarta.persistence.*;

@Entity
public class Assignment {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    protected Assignment() {}
    public Assignment(String title, String description, Member member) {
        this.title = title;
        this.description = description;
        this.member = member;
    }

    public void update(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) {this.description = description; }
    public void setMember(Member member) { this.member = member; }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Long getMemberId() { return member.getId(); }
    public String getMemberName() { return member.getName(); }
}
