package com.example.spring1.Controller;

import com.example.spring1.Models.Test;
import com.example.spring1.Repositories.TestRepository;
import com.example.spring1.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    private TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String index(){
        return testService.saveNameOfTest("Second Test");
    }
}
