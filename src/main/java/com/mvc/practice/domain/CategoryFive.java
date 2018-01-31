package com.mvc.practice.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by whilemouse on 18. 1. 31.
 */
public class CategoryFive {

    private int id;
    private String name;

    private CategoryStatus categoryStatus;
    private CategoryFour categoryFour;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

}
