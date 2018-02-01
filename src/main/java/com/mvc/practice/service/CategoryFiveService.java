package com.mvc.practice.service;

import com.mvc.practice.domain.CategoryFive;
import com.mvc.practice.repository.CategoryFiveRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryFiveService {

    @Resource
    private CategoryFiveRepository categoryFiveRepository;

    public List<CategoryFive> findAll() {
        return categoryFiveRepository.findAll();
    }

    public CategoryFive findOne(int id) {
        return categoryFiveRepository.findOne(id);
    }

    public int insert(CategoryFive categoryFive) {
        return categoryFiveRepository.insert(categoryFive);
    }

    public int update(CategoryFive categoryFive) {
        return categoryFiveRepository.update(categoryFive);
    }

    public int delete(int id) {
        return categoryFiveRepository.delete(id);
    }

}
