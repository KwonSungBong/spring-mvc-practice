package com.mvc.practice.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by whilemouse on 18. 1. 31.
 */
@Repository
public class SegmentRepository {

    @Autowired
    private SqlSessionTemplate sqlSession;

}
