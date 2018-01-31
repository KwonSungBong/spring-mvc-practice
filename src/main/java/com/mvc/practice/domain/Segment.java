package com.mvc.practice.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Segment {

    private long id;
    private String name;
    private String configuration;
    private String lastResultUri;
    private String description;
    private boolean isDeployed;
    private String intermediateResultUri;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public String getLastResultUri() {
        return lastResultUri;
    }

    public void setLastResultUri(String lastResultUri) {
        this.lastResultUri = lastResultUri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDeployed() {
        return isDeployed;
    }

    public void setDeployed(boolean deployed) {
        isDeployed = deployed;
    }

    public String getIntermediateResultUri() {
        return intermediateResultUri;
    }

    public void setIntermediateResultUri(String intermediateResultUri) {
        this.intermediateResultUri = intermediateResultUri;
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
