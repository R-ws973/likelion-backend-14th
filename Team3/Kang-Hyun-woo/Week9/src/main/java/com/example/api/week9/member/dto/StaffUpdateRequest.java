package com.example.api.week9.member.dto;

public class StaffUpdateRequest {
    private String major,part,position;
    private int generation;


    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getPart() {
        return part;
    }
    public void setPart(String part) {
        this.part = part;
    }
    public int getGeneration() {
        return generation;
    }
    public void setGeneration(int generation) {
        this.generation = generation;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String studentId) {
        this.position = studentId;
    }
}
