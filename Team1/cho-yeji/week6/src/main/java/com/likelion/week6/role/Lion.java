package com.likelion.week6.role;

import com.likelion.week6.policy.LionSubmissionPolicy;
import com.likelion.week6.policy.SubmissionPolicy;

public class Lion extends Role {
    private final String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    protected SubmissionPolicy getSubmissionPolicy() {
        return new LionSubmissionPolicy();
    }

    @Override
    public String getRoleName() {
        return "LION";
    }

    @Override
    public String getDetailInfo() {
        return "studentId: " + studentId;
    }
}
