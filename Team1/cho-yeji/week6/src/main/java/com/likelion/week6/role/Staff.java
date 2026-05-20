package com.likelion.week6.role;

import com.likelion.week6.policy.StaffSubmissionPolicy;
import com.likelion.week6.policy.SubmissionPolicy;

public class Staff extends Role {
    private final String position;

    public Staff(String name, String major, int generation, String part, String position) {
        super(name, major, generation, part);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    protected SubmissionPolicy getSubmissionPolicy() {
        return new StaffSubmissionPolicy();
    }

    @Override
    public String getRoleName() {
        return "STAFF";
    }

    @Override
    public String getDetailInfo() {
        return "position: " + position;
    }
}
