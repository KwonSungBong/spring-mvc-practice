package com.mvc.practice.service;

import com.mvc.practice.domain.CategoryOne;
import com.mvc.practice.repository.CategoryOneRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryOneService {

    @Resource
    private CategoryOneRepository categoryOneRepository;

    public List<CategoryOne> findAll() {
        return categoryOneRepository.findAll();
    }

    public CategoryOne findOne(int id) {
        return categoryOneRepository.findOne(id);
    }

    public int insert(CategoryOne categoryOne) {
        return categoryOneRepository.insert(categoryOne);
    }

    public int update(CategoryOne categoryOne) {
        return categoryOneRepository.update(categoryOne);
    }

    public int delete(int id) {
        return categoryOneRepository.delete(id);
    }

}
