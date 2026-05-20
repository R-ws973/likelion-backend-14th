package com.example.api.week9.member.repository;


import com.example.api.week9.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    boolean existsByName(String name);
}
