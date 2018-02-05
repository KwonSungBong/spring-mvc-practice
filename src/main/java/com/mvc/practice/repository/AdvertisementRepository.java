package com.mvc.practice.repository;

import com.mvc.practice.domain.Advertisement;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class AdvertisementRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<Advertisement> findAll() {
        return sqlSession.selectList("advertisementMapper.findAll");
    }

    public Advertisement findOne(int id) {
        return sqlSession.selectOne("advertisementMapper.findOne", id);
    }

    public int insert(Advertisement advertisement){
        return sqlSession.insert("advertisementMapper.insert", advertisement);
    }

    public int update(Advertisement advertisement){
        return sqlSession.update("advertisementMapper.update", advertisement);
    }

    public int delete(int id){
        return sqlSession.delete("advertisementMapper.delete", id);
    }

}
