package com.mvc.practice.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
public class CategoryTwo {

    private int id;
    private String name;

    private CategoryStatus status;
    private CategoryOne categoryOne;
    private List<CategoryThree> categoryThreeList;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryStatus getStatus() {
        return status;
    }

    public void setStatus(CategoryStatus status) {
        this.status = status;
    }

    public CategoryOne getCategoryOne() {
        return categoryOne;
    }

    public void setCategoryOne(CategoryOne categoryOne) {
        this.categoryOne = categoryOne;
    }

    public List<CategoryThree> getCategoryThreeList() {
        return categoryThreeList;
    }

    public void setCategoryThreeList(List<CategoryThree> categoryThreeList) {
        this.categoryThreeList = categoryThreeList;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
