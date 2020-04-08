package com.bijays.springbootyaml.service.impl;

import com.bijays.springbootyaml.modal.Test;
import com.bijays.springbootyaml.repository.TestRepository;
import com.bijays.springbootyaml.service.TestService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Test> getTest(Long testId) {
        return Optional.ofNullable(testRepository.findById(testId)).orElseThrow (
                IllegalArgumentException::new
        );
    }

    @Override
    public List<Test> findAll() {
        return testRepository.findAll();
    }
}
