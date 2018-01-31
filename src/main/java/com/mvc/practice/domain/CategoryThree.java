package com.mvc.practice.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by whilemouse on 18. 1. 31.
 */
public class CategoryThree {

    private int id;
    private String name;

    private CategoryStatus categoryStatus;
    private CategoryTwo categoryTwo;
    private List<CategoryFour> categoryFourList;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

}
