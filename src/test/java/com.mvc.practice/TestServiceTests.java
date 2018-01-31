package com.mvc.practice;

import com.mvc.practice.domain.TestDomain;
import com.mvc.practice.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/applicationContext.xml",
        "file:src/main/webapp/WEB-INF/dispatcher-servlet.xml",
        "file:src/main/webapp/WEB-INF/context-mybatis.xml"})
public class TestServiceTests {

    @Autowired
    private TestService testService;

    @Test
    public void test(){
        System.out.println(testService.test());
    }

    @Test
    public void test2(){
        List<TestDomain> testDomainList = testService.findAll();

        System.out.println();
    }

}