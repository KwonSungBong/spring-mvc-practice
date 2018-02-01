package com.mvc.practice.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
public class CategoryFour {

    private int id;
    private String name;

    private CategoryStatus status;
    private CategoryThree categoryThree;
    private List<CategoryFive> categoryFiveList;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

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

    public CategoryThree getCategoryThree() {
        return categoryThree;
    }

    public void setCategoryThree(CategoryThree categoryThree) {
        this.categoryThree = categoryThree;
    }

    public List<CategoryFive> getCategoryFiveList() {
        return categoryFiveList;
    }

    public void setCategoryFiveList(List<CategoryFive> categoryFiveList) {
        this.categoryFiveList = categoryFiveList;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
