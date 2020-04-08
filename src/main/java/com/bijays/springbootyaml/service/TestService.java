package com.bijays.springbootyaml.service;

import com.bijays.springbootyaml.modal.Test;

import java.util.List;
import java.util.Optional;

public interface TestService {
    void save(Test test);

    Optional<Test> getTest(Long testId);

    List<Test> findAll();
}
