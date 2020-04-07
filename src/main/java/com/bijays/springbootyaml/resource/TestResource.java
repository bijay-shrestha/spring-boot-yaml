package com.bijays.springbootyaml.resource;

import com.bijays.springbootyaml.modal.Test;
import com.bijays.springbootyaml.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/test")
@Slf4j
public class TestResource {

    private final TestService testService;

    public TestResource(TestService testService) {
        this.testService = testService;
    }

    @PostMapping
    public void saveTest(){
        Test test =new Test(1L, "kulindaar", 'Y', new Date() );
        testService.save(test);
        log.info ("SUCCESS :: {}","Test data "+ test.getName ()+ " inserted successfully!");
    }

    @GetMapping("/running")
    public String running(){
        return "The server is running!";
    }
}
