package com.mvc.practice.domain;

import com.google.common.collect.Sets;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.util.Date;
import java.util.Set;

public class Advertisement {

	private long id;
	private String title;
	private String description;
	private long targetImpressionCnt;
	private long requiredDeviceCount;
	private float assignRatio;
	private int priority;
	private int viewSequence;

	private long minFreq;
	private long maxFreq;
	private int deviceExpiredDays;
	private int fixedSlot;
	private Boolean isDeleted;
	private Long deviceCount;

	@DateTimeFormat(iso = ISO.DATE)
	private Date startAt;
	@DateTimeFormat(iso = ISO.DATE)
	private Date endAt;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date createdAt;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date modifiedAt;

	private Campaign campaign;
	private Set<AdvertisementSegment> adSegments = Sets.newHashSet();


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getViewSequence() {
		return viewSequence;
	}

	public void setViewSequence(int viewSequence) {
		this.viewSequence = viewSequence;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getTargetImpressionCnt() {
		return targetImpressionCnt;
	}

	public void setTargetImpressionCnt(long targetImpressionCnt) {
		this.targetImpressionCnt = targetImpressionCnt;
	}

	public long getRequiredDeviceCount() {
		return requiredDeviceCount;
	}

	public void setRequiredDeviceCount(long requiredDeviceCount) {
		this.requiredDeviceCount = requiredDeviceCount;
	}

	public float getAssignRatio() {
		return assignRatio;
	}

	public void setAssignRatio(float assignRatio) {
		this.assignRatio = assignRatio;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public long getMinFreq() {
		return minFreq;
	}

	public void setMinFreq(long minFreq) {
		this.minFreq = minFreq;
	}

	public long getMaxFreq() {
		return maxFreq;
	}

	public void setMaxFreq(long maxFreq) {
		this.maxFreq = maxFreq;
	}

	public int getDeviceExpiredDays() {
		return deviceExpiredDays;
	}

	public void setDeviceExpiredDays(int deviceExpiredDays) {
		this.deviceExpiredDays = deviceExpiredDays;
	}

	public int getFixedSlot() {
		return fixedSlot;
	}

	public void setFixedSlot(int fixedSlot) {
		this.fixedSlot = fixedSlot;
	}

	public Boolean getDeleted() {
		return isDeleted;
	}

	public void setDeleted(Boolean deleted) {
		isDeleted = deleted;
	}

	public Long getDeviceCount() {
		return deviceCount;
	}

	public void setDeviceCount(Long deviceCount) {
		this.deviceCount = deviceCount;
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
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

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public Set<AdvertisementSegment> getAdSegments() {
		return adSegments;
	}

	public void setAdSegments(Set<AdvertisementSegment> adSegments) {
		this.adSegments = adSegments;
	}

}
