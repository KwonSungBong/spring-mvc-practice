package com.mvc.practice;

import com.mvc.practice.domain.Advertisement;
import com.mvc.practice.domain.Campaign;
import com.mvc.practice.service.AdvertisementService;
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
public class AdvertisementServiceTests {

    @Autowired
    private AdvertisementService advertisementService;

    @Test
    public void insert(){
        Campaign campaign = new Campaign();
        campaign.setId(1);

        Advertisement advertisement = new Advertisement();
        advertisement.setCampaign(campaign);
        advertisement.setTitle("test");
        advertisement.setDescription("test");
        advertisement.setTargetImpressionCnt(1);
        advertisement.setRequiredDeviceCount(1);
        advertisement.setAssignRatio(1.1F);
        advertisement.setPriority(1);
        advertisement.setViewSequence(1);
        advertisement.setMediaMix(1);
        advertisement.setMinFreq(1);
        advertisement.setMaxFreq(1);
        advertisement.setDeviceExpiredDays(1);
        advertisement.setFixedSlot(1);
        advertisement.setIsDeleted(false);

        advertisementService.insert(advertisement);

        System.out.println();
    }

    @Test
    public void update(){
        Advertisement advertisement = new Advertisement();
        advertisement.setId(1);
        advertisement.setTitle("update test");

        advertisementService.update(advertisement);

        System.out.println();
    }

    @Test
    public void delete(){
        int id = 1;
        advertisementService.delete(id);

        System.out.println();
    }

    @Test
    public void findAll(){
        List<Advertisement> advertisementtList = advertisementService.findAll();

        System.out.println();
    }

    @Test
    public void findOne(){
        int id = 1;
        Advertisement advertisement = advertisementService.findOne(id);

        System.out.println();
    }

}