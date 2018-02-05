package com.mvc.practice;

import com.mvc.practice.domain.Campaign;
import com.mvc.practice.domain.CampaignStatus;
import com.mvc.practice.domain.CampaignType;
import com.mvc.practice.service.CampaignService;
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
public class CampaignServiceTests {

    @Autowired
    private CampaignService campaignService;

    @Test
    public void insert(){
        Campaign campaign = new Campaign();

        campaign.setMaxCpv(1.1F);
        campaign.setBrandName("test");
        campaign.setTitle("test");
        campaign.setDescription("test");
        campaign.setIsExclusiveInternalAd(false);
        campaign.setTotalAmount(1);
        campaign.setReaderPassword("test");
        campaign.setSpecialContract("test");
        campaign.setReceivedAccountNumber("test");
        campaign.setPaymentCondition("test");
        campaign.setPromotedAmount(1.1);
        campaign.setAdvertiserUser(1);
        campaign.setAdminUser(1);
        campaign.setType(CampaignType.FREE);
        campaign.setStatus(CampaignStatus.INSPECTING);

        campaignService.insert(campaign);

        System.out.println();
    }

    @Test
    public void update(){
        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setTitle("update test");

        campaignService.update(campaign);

        System.out.println();
    }

    @Test
    public void delete(){
        int id = 1;
        campaignService.delete(id);

        System.out.println();
    }

    @Test
    public void findAll(){
        List<Campaign> campaignList = campaignService.findAll();

        System.out.println();
    }

    @Test
    public void findOne(){
        int id = 1;
        Campaign campaign = campaignService.findOne(id);

        System.out.println();
    }

}