package com.example.spring1.ServiceImpl;

import com.example.spring1.Models.Test;
import com.example.spring1.Repositories.TestRepository;
import com.example.spring1.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
        public String saveNameOfTest(String name) {
        Test nameOfTest = new Test(name);
        testRepository.save(nameOfTest);
        return "index";

    }
}
