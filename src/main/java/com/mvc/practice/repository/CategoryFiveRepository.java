package com.mvc.practice.repository;

import com.google.common.collect.Maps;
import com.mvc.practice.domain.CategoryFive;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class CategoryFiveRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<CategoryFive> findAll() {
        return sqlSession.selectList("categoryFiveMapper.findAll");
    }

    public CategoryFive findOne(int id) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return sqlSession.selectOne("categoryFiveMapper.findOne", params);
    }

    public int insert(CategoryFive categoryFive){
        return sqlSession.insert("categoryFiveMapper.insert", categoryFive);
    }

    public int update(CategoryFive categoryFive){
        return sqlSession.update("categoryFiveMapper.update", categoryFive);
    }

    public int delete(int id){
        return sqlSession.delete("categoryFiveMapper.delete", id);
    }

}
