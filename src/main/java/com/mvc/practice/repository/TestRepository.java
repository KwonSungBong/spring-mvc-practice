package com.mvc.practice.repository;

import com.google.common.collect.Maps;
import com.mvc.practice.domain.TestDomain;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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

    public TestDomain selectOne(int id) {
        return sqlSession.selectOne("");
    }

    public int insert(TestDomain testDomain){
        Map<String, String> params = Maps.newHashMap();
        return sqlSession.insert("", params);
    }

}
