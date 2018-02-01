package com.mvc.practice.service;

import com.mvc.practice.domain.CategoryFour;
import com.mvc.practice.repository.CategoryFourRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryFourService {

    @Resource
    private CategoryFourRepository categoryFourRepository;

    public List<CategoryFour> findAll() {
        return categoryFourRepository.findAll();
    }

    public CategoryFour findOne(int id) {
        return categoryFourRepository.findOne(id);
    }

    public int insert(CategoryFour categoryFour) {
        return categoryFourRepository.insert(categoryFour);
    }

    public int update(CategoryFour categoryFour) {
        return categoryFourRepository.update(categoryFour);
    }

    public int delete(int id) {
        return categoryFourRepository.delete(id);
    }

}
