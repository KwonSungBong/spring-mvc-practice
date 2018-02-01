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
public class CategoryRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

    public List<CategoryThree> findThreeAll() {
        return sqlSession.selectList("categoryMapper.findThreeList");
    }

}
