package com.bijays.springbootyaml.repository;

import com.bijays.springbootyaml.modal.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
