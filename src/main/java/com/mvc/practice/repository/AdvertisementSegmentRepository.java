package com.mvc.practice.repository;

import com.mvc.practice.domain.AdvertisementSegment;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class AdvertisementSegmentRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<AdvertisementSegment> findAll() {
        return sqlSession.selectList("advertisementSegmentMapper.findAll");
    }

    public AdvertisementSegment findOne(int id) {
        return sqlSession.selectOne("advertisementSegmentMapper.findOne", id);
    }

    public int insert(AdvertisementSegment advertisementSegment){
        return sqlSession.insert("advertisementSegmentMapper.insert", advertisementSegment);
    }

    public int update(AdvertisementSegment advertisementSegment){
        return sqlSession.update("advertisementSegmentMapper.update", advertisementSegment);
    }

    public int delete(int id){
        return sqlSession.delete("advertisementSegmentMapper.delete", id);
    }

}
