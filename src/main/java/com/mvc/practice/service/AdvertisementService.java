package com.mvc.practice.service;

import com.mvc.practice.domain.Advertisement;
import com.mvc.practice.repository.AdvertisementRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdvertisementService {

    @Resource
    private AdvertisementRepository advertisementRepository;

    public List<Advertisement> findAll() {
        return advertisementRepository.findAll();
    }

    public Advertisement findOne(int id) {
        return advertisementRepository.findOne(id);
    }

    public int insert(Advertisement advertisement) {
        return advertisementRepository.insert(advertisement);
    }

    public int update(Advertisement advertisement) {
        return advertisementRepository.update(advertisement);
    }

    public int delete(int id) {
        return advertisementRepository.delete(id);
    }

}
