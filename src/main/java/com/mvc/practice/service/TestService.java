package com.mvc.practice.service;

import com.mvc.practice.domain.TestDomain;
import com.mvc.practice.repository.TestRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestRepository testRepository;

    public String test() {
        return "TEST";
    }

    public List<TestDomain> findAll() {
        return testRepository.findAll();
    }

}
