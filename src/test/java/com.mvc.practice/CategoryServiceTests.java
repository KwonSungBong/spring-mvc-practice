package com.mvc.practice;

import com.mvc.practice.domain.CategoryThree;
import com.mvc.practice.service.CategoryService;
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
public class CategoryServiceTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findThreeAll(){
        List<CategoryThree> categoryThreeList = categoryService.findThreeAll();

        System.out.println(categoryThreeList);
    }

}