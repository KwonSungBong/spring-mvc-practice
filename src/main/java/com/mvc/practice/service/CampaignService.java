package com.mvc.practice.service;

import com.mvc.practice.domain.Campaign;
import com.mvc.practice.repository.CampaignRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CampaignService {

    @Resource
    private CampaignRepository campaignRepository;

    public List<Campaign> findAll() {
        return campaignRepository.findAll();
    }

    public Campaign findOne(int id) {
        return campaignRepository.findOne(id);
    }

    public int insert(Campaign segment) {
        return campaignRepository.insert(segment);
    }

    public int update(Campaign segment) {
        return campaignRepository.update(segment);
    }

    public int delete(int id) {
        return campaignRepository.delete(id);
    }

}
