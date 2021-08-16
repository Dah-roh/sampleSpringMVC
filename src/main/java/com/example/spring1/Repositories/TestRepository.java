package com.example.spring1.Repositories;

import com.example.spring1.Models.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
   Optional<Test> findById(Long id);
}
