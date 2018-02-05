package com.mvc.practice.service;

import com.mvc.practice.domain.Segment;
import com.mvc.practice.repository.SegmentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SegmentService {

    @Resource
    private SegmentRepository segmentRepository;

    public List<Segment> findAll() {
        return segmentRepository.findAll();
    }

    public Segment findOne(int id) {
        return segmentRepository.findOne(id);
    }

    public int insert(Segment segment) {
        return segmentRepository.insert(segment);
    }

    public int update(Segment segment) {
        return segmentRepository.update(segment);
    }

    public int delete(int id) {
        return segmentRepository.delete(id);
    }

}
