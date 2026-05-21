package com.example.week8.repository;

import com.example.week8.domain.Staff;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {

  Optional<Staff> findByName(String name);

  boolean existsByName(String name);
}
