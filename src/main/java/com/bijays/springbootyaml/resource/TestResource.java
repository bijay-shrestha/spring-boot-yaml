package com.bijays.springbootyaml.resource;

import com.bijays.springbootyaml.modal.Test;
import com.bijays.springbootyaml.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
        Test test =new Test(1L, "test", 'Y', new Date() );
        testService.save(test);
        log.info ("SUCCESS :: {}","Test data "+ test.getName ()+ " inserted successfully!");
    }

    @GetMapping("/{testId}")
    public String getTest(@PathVariable("testId") Long testId){
        return "This is " + testService.getTest(testId).get().getName();
    }

    @GetMapping("/all")
    public List<Test> getAllTests(){
         return testService.findAll();
    }

    @GetMapping("/running")
    public String running(){
        return "The server is running!";
    }
}
