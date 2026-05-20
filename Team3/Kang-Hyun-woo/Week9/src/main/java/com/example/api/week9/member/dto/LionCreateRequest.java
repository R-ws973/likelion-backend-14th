package com.example.api.week9.member.dto;

public class LionCreateRequest {
    private String name, major,part, studentId;
    private int generation;

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
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
