package com.mvc.practice.repository;

import com.mvc.practice.domain.TestDomain;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class TestRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<TestDomain> findAll() {
        return sqlSession.selectList("testDomainMapper.findAll");
    }

//    public TestDomain selectOne(String queryId) {
//        return sqlSession.selectOne(queryId);
//    }
//
//    public int insert(String queryId, Map<String, String> params){
//        return sqlSession.insert(queryId, params);
//    }

}
