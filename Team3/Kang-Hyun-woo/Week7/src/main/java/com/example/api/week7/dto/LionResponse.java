package com.example.api.week7.dto;

import com.example.api.week7.domain.role.Lion;

public class LionResponse {
    private String name, major,part,roleName,studentId;
    private int generation;

    public String getName() {
        return name;
    }


    public String getMajor() {
        return major;
    }


    public String getPart() {
        return part;
    }

    public int getGeneration() {
        return generation;
    }

    public String getStudentId() {
        return studentId;
    }



    public static LionResponse from(Lion lion) {
        LionResponse response = new LionResponse();
        response.name = lion.getName();
        response.major = lion.getMajor();
        response.generation = lion.getGeneration();
        response.part = lion.getPart();
        response.roleName = lion.roleName();
        response.studentId = lion.getStudentId();
        return response;
    }
}
