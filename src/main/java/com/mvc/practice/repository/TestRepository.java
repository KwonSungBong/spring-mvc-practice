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

    public TestDomain findOne(int id) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return sqlSession.selectOne("testDomainMapper.findOne", params);
    }

    public int insert(TestDomain testDomain){
        return sqlSession.insert("testDomainMapper.insert", testDomain);
    }

    public int update(TestDomain testDomain){
        return sqlSession.update("testDomainMapper.update", testDomain);
    }

    public int delete(int id){
        return sqlSession.delete("testDomainMapper.delete", id);
    }

}
