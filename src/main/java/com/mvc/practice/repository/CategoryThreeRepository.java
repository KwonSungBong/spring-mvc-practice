package com.mvc.practice.repository;

import com.google.common.collect.Maps;
import com.mvc.practice.domain.CategoryThree;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class CategoryThreeRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<CategoryThree> findAll() {
        return sqlSession.selectList("categoryThreeMapper.findAll");
    }

    public CategoryThree findOne(int id) {
        Map<String, Object> params = Maps.newHashMap();
        params.put("id", id);
        return sqlSession.selectOne("categoryThreeMapper.findOne", params);
    }

    public int insert(CategoryThree categoryThree){
        return sqlSession.insert("categoryThreeMapper.insert", categoryThree);
    }

    public int update(CategoryThree categoryThree){
        return sqlSession.update("categoryThreeMapper.update", categoryThree);
    }

    public int delete(int id){
        return sqlSession.delete("categoryThreeMapper.delete", id);
    }

}
