package com.mvc.practice;

import com.mvc.practice.domain.Advertisement;
import com.mvc.practice.domain.AdvertisementSegment;
import com.mvc.practice.domain.Segment;
import com.mvc.practice.service.AdvertisementSegmentService;
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
public class AdvertisementSegmentServiceTests {

    @Autowired
    private AdvertisementSegmentService advertisementSegmentService;

    @Test
    public void insert(){
        Advertisement advertisement = new Advertisement();
        advertisement.setId(1);

        Segment segment = new Segment();
        segment.setId(1);

        AdvertisementSegment advertisementSegment = new AdvertisementSegment();
        advertisementSegment.setAdvertisement(advertisement);
        advertisementSegment.setSegment(segment);

        advertisementSegmentService.insert(advertisementSegment);

        System.out.println();
    }

    @Test
    public void update(){
        Advertisement advertisement = new Advertisement();
        advertisement.setId(1);

        Segment segment = new Segment();
        segment.setId(1);

        AdvertisementSegment advertisementSegment = new AdvertisementSegment();
        advertisementSegment.setId(1);
        advertisementSegment.setAdvertisement(advertisement);
        advertisementSegment.setSegment(segment);

        advertisementSegmentService.update(advertisementSegment);

        System.out.println();
    }

    @Test
    public void delete(){
        int id = 1;
        advertisementSegmentService.delete(id);

        System.out.println();
    }

    @Test
    public void findAll(){
        List<AdvertisementSegment> advertisementSegmentList = advertisementSegmentService.findAll();

        System.out.println();
    }

    @Test
    public void findOne(){
        int id = 1;
        AdvertisementSegment advertisementSegment = advertisementSegmentService.findOne(id);

        System.out.println();
    }

}