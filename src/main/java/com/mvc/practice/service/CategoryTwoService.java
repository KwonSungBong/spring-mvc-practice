package com.mvc.practice.service;

import com.mvc.practice.domain.CategoryTwo;
import com.mvc.practice.repository.CategoryTwoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryTwoService {

    @Resource
    private CategoryTwoRepository categoryTwoRepository;

    public List<CategoryTwo> findAll() {
        return categoryTwoRepository.findAll();
    }

    public CategoryTwo findOne(int id) {
        return categoryTwoRepository.findOne(id);
    }

    public int insert(CategoryTwo categoryTwo) {
        return categoryTwoRepository.insert(categoryTwo);
    }

    public int update(CategoryTwo categoryTwo) {
        return categoryTwoRepository.update(categoryTwo);
    }

    public int delete(int id) {
        return categoryTwoRepository.delete(id);
    }

}
