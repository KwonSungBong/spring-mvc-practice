package com.mvc.practice.repository;

import com.google.common.collect.Maps;
import com.mvc.practice.domain.CategoryTwo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class CategoryTwoRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<CategoryTwo> findAll() {
        return sqlSession.selectList("categoryTwoMapper.findAll");
    }

    public CategoryTwo findOne(int id) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return sqlSession.selectOne("categoryTwoMapper.findOne", params);
    }

    public int insert(CategoryTwo categoryTwo){
        return sqlSession.insert("categoryTwoMapper.insert", categoryTwo);
    }

    public int update(CategoryTwo categoryTwo){
        return sqlSession.update("categoryTwoMapper.update", categoryTwo);
    }

    public int delete(int id){
        return sqlSession.delete("categoryTwoMapper.delete", id);
    }

}
