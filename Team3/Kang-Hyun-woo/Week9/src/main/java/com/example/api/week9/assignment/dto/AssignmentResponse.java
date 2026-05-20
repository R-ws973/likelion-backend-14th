package com.example.api.week9.assignment.dto;

import com.example.api.week9.assignment.domain.Assignment;

public class AssignmentResponse {
    private Long id;
    private String title;
    private String description;
    private Long memberId;
    private String memberName;

    public static AssignmentResponse from(Assignment assignment) {
        AssignmentResponse response = new AssignmentResponse();
        response.id = assignment.getId();
        response.title = assignment.getTitle();
        response.description = assignment.getDescription();
        response.memberId =assignment.getId();

//        멤버리스트 받아오기
        response.memberId = assignment.getMemberId();
        response.memberName = assignment.getMemberName();

        return response;
    }

    public Long  getId() {
        return id;
    }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Long getMemberId() { return memberId; }
    public String getMemberName() { return memberName; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setMemberId(Long memberId) { this.memberId = memberId; }
    public void setMemberName(String memberName) { this.memberName = memberName; }
    public void setId(Long id) {
        this.id = id;
    }
}