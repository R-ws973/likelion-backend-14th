package com.likelion.week6.repository;

import com.likelion.week6.role.Role;

import java.util.List;

public interface MemberRepository {
    void save(Role member);

    Role findByName(String name);

    List<Role> findAll();

    boolean existsByName(String name);
}
