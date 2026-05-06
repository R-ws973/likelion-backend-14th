package com.example.api.week7.dto;

import com.example.api.week7.domain.role.Lion;
import com.example.api.week7.domain.role.Staff;

public class StaffResponse {
    private String name, major,part,position, roleName;
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

    public String getPosition() {
        return position;
    }

    public static StaffResponse from(Staff staff) {
        StaffResponse response = new StaffResponse();
        response.name = staff.getName();
        response.major = staff.getMajor();
        response.generation = staff.getGeneration();
        response.part = staff.getPart();
        response.roleName = staff.roleName();
        response.position = staff.getPosition();
        return response;
    }
}
