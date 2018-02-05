package com.mvc.practice.repository;

import com.mvc.practice.domain.Campaign;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class CampaignRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<Campaign> findAll() {
        return sqlSession.selectList("campaignMapper.findAll");
    }

    public Campaign findOne(int id) {
        return sqlSession.selectOne("campaignMapper.findOne", id);
    }

    public int insert(Campaign campaign){
        return sqlSession.insert("campaignMapper.insert", campaign);
    }

    public int update(Campaign campaign){
        return sqlSession.update("campaignMapper.update", campaign);
    }

    public int delete(int id){
        return sqlSession.delete("campaignMapper.delete", id);
    }

}
