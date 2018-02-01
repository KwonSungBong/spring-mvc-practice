package com.mvc.practice.repository;

import com.google.common.collect.Maps;
import com.mvc.practice.domain.CategoryFour;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class CategoryFourRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<CategoryFour> findAll() {
        return sqlSession.selectList("categoryFourMapper.findAll");
    }

    public CategoryFour findOne(int id) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return sqlSession.selectOne("categoryFourMapper.findOne", params);
    }

    public int insert(CategoryFour categoryFour){
        return sqlSession.insert("categoryFourMapper.insert", categoryFour);
    }

    public int update(CategoryFour categoryFour){
        return sqlSession.update("categoryFourMapper.update", categoryFour);
    }

    public int delete(int id){
        return sqlSession.delete("categoryFourMapper.delete", id);
    }

}
