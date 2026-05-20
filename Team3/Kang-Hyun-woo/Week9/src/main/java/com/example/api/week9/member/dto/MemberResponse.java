package com.example.api.week9.member.dto;

import com.example.api.week9.member.domain.Member;

public class MemberResponse {
    private long id;

    private String name, major,part,studentId,position, roleName;
    private int generation;

    public static MemberResponse from(Member member) {
        MemberResponse response = new MemberResponse();
        response.id = member.getId();
        response.name = member.getName();
        response.major = member.getMajor();
        response.generation = member.getGeneration();
        response.part = member.getPart();
        response.roleName = member.getRoleType().getDisplayName();
        response.studentId = member.getStudentId();
        response.position = member.getPosition();
        return response;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getGeneration() { return generation; }
    public String getPart() { return part; }
    public String getRoleName() { return roleName; }
    public String getStudentId() { return studentId; }
    public String getPosition() { return position; }
}