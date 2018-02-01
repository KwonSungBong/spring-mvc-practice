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
    public void findAll(){
        List<TestDomain> testDomainList = testService.findAll();

        System.out.println(testDomainList);
    }

    @Test
    public void findOne(){
        int id = 1;
        TestDomain testDomain = testService.findOne(id);

        System.out.println(testDomain);
    }

    @Test
    public void insert(){
        TestDomain testDomain = new TestDomain();
        testDomain.setName("nameInsert");
        testDomain.setTest("testInsert");

        int result = testService.insert(testDomain);

        System.out.println(result);
    }

    @Test
    public void update(){
        TestDomain lastTestDomain = lastTestDomain();
        lastTestDomain.setName("nameUpdate");
        lastTestDomain.setTest("testUpdate");

        int result = testService.update(lastTestDomain);

        System.out.println(result);
    }

    @Test
    public void delete(){
        TestDomain lastTestDomain = lastTestDomain();

        int result = testService.delete(lastTestDomain.getId());

        System.out.println(result);
    }

    private TestDomain lastTestDomain() {
        List<TestDomain> testDomainList = testService.findAll();
        TestDomain lastTestDomain = testDomainList.get(testDomainList.size()-1);
        return lastTestDomain;
    }

}