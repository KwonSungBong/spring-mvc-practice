package com.mvc.practice.service;

import com.mvc.practice.domain.CategoryThree;
import com.mvc.practice.repository.CategoryThreeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryThreeService {

    @Resource
    private CategoryThreeRepository categoryThreeRepository;

    public List<CategoryThree> findAll() {
        return categoryThreeRepository.findAll();
    }

    public CategoryThree findOne(int id) {
        return categoryThreeRepository.findOne(id);
    }

    public int insert(CategoryThree categoryThree) {
        return categoryThreeRepository.insert(categoryThree);
    }

    public int update(CategoryThree categoryThree) {
        return categoryThreeRepository.update(categoryThree);
    }

    public int delete(int id) {
        return categoryThreeRepository.delete(id);
    }

}
