package com.bijays.springbootyaml.repository;

import com.bijays.springbootyaml.modal.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {


    @Query("SELECT t FROM Test t WHERE t.id = :testId")
    Optional<Test> findTestById(@Param("testId") Long testId);
}
