package com.mvc.practice.service;

import com.mvc.practice.domain.CategoryThree;
import com.mvc.practice.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {

    @Resource
    private CategoryRepository categoryRepository;

    public List<CategoryThree> findThreeAll() {
        return categoryRepository.findThreeAll();
    }

    public int insertThree(CategoryThree categoryThree) {
        return 0;
    }

    public int updateThree(CategoryThree categoryThree) {
        return 0;
    }

    public int deleteThree(CategoryThree categoryThree) {
        return 0;
    }

}
