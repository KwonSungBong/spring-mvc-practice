package com.mvc.practice.repository;

import com.google.common.collect.Maps;
import com.mvc.practice.domain.CategoryOne;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class CategoryOneRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<CategoryOne> findAll() {
        return sqlSession.selectList("categoryOneMapper.findAll");
    }

    public CategoryOne findOne(int id) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return sqlSession.selectOne("categoryOneMapper.findOne", params);
    }

    public int insert(CategoryOne categoryOne){
        return sqlSession.insert("categoryOneMapper.insert", categoryOne);
    }

    public int update(CategoryOne categoryOne){
        return sqlSession.update("categoryOneMapper.update", categoryOne);
    }

    public int delete(int id){
        return sqlSession.delete("categoryOneMapper.delete", id);
    }

}
