package com.bijays.springbootyaml.service.impl;

import com.bijays.springbootyaml.modal.Test;
import com.bijays.springbootyaml.repository.TestRepository;
import com.bijays.springbootyaml.service.TestService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void save(Test test){
        testRepository.save (test);
    }
}
