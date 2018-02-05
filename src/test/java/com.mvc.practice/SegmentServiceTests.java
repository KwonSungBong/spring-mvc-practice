package com.mvc.practice;

import com.mvc.practice.domain.Segment;
import com.mvc.practice.domain.TestDomain;
import com.mvc.practice.service.SegmentService;
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
public class SegmentServiceTests {

    @Autowired
    private SegmentService segmentService;

    @Test
    public void insert(){
        Segment segment = new Segment();
        segment.setName("test");
        segment.setConfiguration("test");
        segment.setLastResultUri("test");
        segment.setDescription("test");
        segment.setIsDeployed(false);
        segment.setIntermediateResultUri("test");

        segmentService.insert(segment);

        System.out.println();
    }

    @Test
    public void update(){
        Segment segment = new Segment();
        segment.setId(1);
        segment.setName("update test");

        segmentService.update(segment);

        System.out.println();
    }

    @Test
    public void delete(){
        int id = 1;
        segmentService.delete(id);

        System.out.println();
    }

    @Test
    public void findAll(){
        List<Segment> segmentList = segmentService.findAll();

        System.out.println();
    }

    @Test
    public void findOne(){
        int id = 1;
        Segment segment = segmentService.findOne(id);

        System.out.println();
    }

}