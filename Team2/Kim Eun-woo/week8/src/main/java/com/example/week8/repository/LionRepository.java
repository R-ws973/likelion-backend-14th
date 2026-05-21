package com.example.week8.repository;

import com.example.week8.domain.Lion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository를 상속하면 save / findById / delete 등 기본 CRUD가 자동 제공된다.
// 메서드 이름 규칙(쿼리 메서드)으로 SELECT 쿼리도 자동 생성된다.
public interface LionRepository extends JpaRepository<Lion, Long> {

  Optional<Lion> findByName(String name);

  boolean existsByName(String name);
}
