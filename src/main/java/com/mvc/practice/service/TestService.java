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

    public TestDomain findOne(int id) {
        return testRepository.findOne(id);
    }

    public int insert(TestDomain testDomain) {
        return testRepository.insert(testDomain);
    }

    public int update(TestDomain testDomain) {
        return testRepository.update(testDomain);
    }

    public int delete(int id) {
        return testRepository.delete(id);
    }

}
