package com.likelion.week6.service;

import com.likelion.week6.repository.MemberRepository;
import com.likelion.week6.role.Lion;
import com.likelion.week6.role.Role;
import com.likelion.week6.role.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public boolean registerLion(String name, String major, int generation, String part, String studentId) {
        if (repository.existsByName(name)) {
            return false;
        }
        repository.save(new Lion(name, major, generation, part, studentId));
        return true;
    }

    public boolean registerStaff(String name, String major, int generation, String part, String position) {
        if (repository.existsByName(name)) {
            return false;
        }
        repository.save(new Staff(name, major, generation, part, position));
        return true;
    }

    public List<Role> getAllMembers() {
        return repository.findAll();
    }

    public Role findByName(String name) {
        return repository.findByName(name);
    }
}
