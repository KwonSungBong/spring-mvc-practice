package com.mvc.practice.service;

import com.mvc.practice.domain.AdvertisementSegment;
import com.mvc.practice.repository.AdvertisementSegmentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdvertisementSegmentService {

    @Resource
    private AdvertisementSegmentRepository advertisementSegmentRepository;

    public List<AdvertisementSegment> findAll() {
        return advertisementSegmentRepository.findAll();
    }

    public AdvertisementSegment findOne(int id) {
        return advertisementSegmentRepository.findOne(id);
    }

    public int insert(AdvertisementSegment advertisementSegment) {
        return advertisementSegmentRepository.insert(advertisementSegment);
    }

    public int update(AdvertisementSegment advertisementSegment) {
        return advertisementSegmentRepository.update(advertisementSegment);
    }

    public int delete(int id) {
        return advertisementSegmentRepository.delete(id);
    }

}
