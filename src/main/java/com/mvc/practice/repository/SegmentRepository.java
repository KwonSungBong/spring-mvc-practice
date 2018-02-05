package com.mvc.practice.repository;

import com.mvc.practice.domain.Segment;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class SegmentRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<Segment> findAll() {
        return sqlSession.selectList("segmentMapper.findAll");
    }

    public Segment findOne(int id) {
        return sqlSession.selectOne("segmentMapper.findOne", id);
    }

    public int insert(Segment segment){
        return sqlSession.insert("segmentMapper.insert", segment);
    }


    public int update(Segment segment){
        return sqlSession.update("segmentMapper.update", segment);
    }

    public int delete(int id){
        return sqlSession.delete("segmentMapper.delete", id);
    }

}
