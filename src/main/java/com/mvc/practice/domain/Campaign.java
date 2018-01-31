package com.mvc.practice.domain;

import com.google.common.collect.Sets;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.util.Date;
import java.util.Set;

public class Campaign {

    private long id;
    private float maxCpv;
    private String brandName;
    private String title;
    private String description;
    private Boolean isExclusiveInternalAd;
    private long totalAmount;
    private String readerPassword;
    private String specialContract;
    private String receivedAccountNumber;
    private String paymentCondition;
    private double promotedAmount;
    private long advertiserUser;
    private long adminUser;

    private CampaignType type;
    private CampaignStatus status;

    @DateTimeFormat(iso = ISO.DATE)
    private Date startedAt;
    @DateTimeFormat(iso = ISO.DATE)
    private Date endedAt;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private Date createdAt;
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private Date modifiedAt;
    @DateTimeFormat(iso = ISO.DATE)
    private Date receiptedAt;

    private Set<Campaign> exclusiveExternalCampaigns = Sets.newHashSet();
    private Set<Advertisement> advertisements = Sets.newHashSet();


    public long getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(long adminUser) {
        this.adminUser = adminUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getMaxCpv() {
        return maxCpv;
    }

    public void setMaxCpv(float maxCpv) {
        this.maxCpv = maxCpv;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public Boolean getExclusiveInternalAd() {
        return isExclusiveInternalAd;
    }

    public void setExclusiveInternalAd(Boolean exclusiveInternalAd) {
        isExclusiveInternalAd = exclusiveInternalAd;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getReaderPassword() {
        return readerPassword;
    }

    public void setReaderPassword(String readerPassword) {
        this.readerPassword = readerPassword;
    }

    public String getSpecialContract() {
        return specialContract;
    }

    public void setSpecialContract(String specialContract) {
        this.specialContract = specialContract;
    }

    public String getReceivedAccountNumber() {
        return receivedAccountNumber;
    }

    public void setReceivedAccountNumber(String receivedAccountNumber) {
        this.receivedAccountNumber = receivedAccountNumber;
    }

    public String getPaymentCondition() {
        return paymentCondition;
    }

    public void setPaymentCondition(String paymentCondition) {
        this.paymentCondition = paymentCondition;
    }

    public double getPromotedAmount() {
        return promotedAmount;
    }

    public void setPromotedAmount(double promotedAmount) {
        this.promotedAmount = promotedAmount;
    }

    public long getAdvertiserUser() {
        return advertiserUser;
    }

    public void setAdvertiserUser(long advertiserUser) {
        this.advertiserUser = advertiserUser;
    }

    public CampaignType getType() {
        return type;
    }

    public void setType(CampaignType type) {
        this.type = type;
    }

    public CampaignStatus getStatus() {
        return status;
    }

    public void setStatus(CampaignStatus status) {
        this.status = status;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
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

    public Date getReceiptedAt() {
        return receiptedAt;
    }

    public void setReceiptedAt(Date receiptedAt) {
        this.receiptedAt = receiptedAt;
    }

    public Set<Campaign> getExclusiveExternalCampaigns() {
        return exclusiveExternalCampaigns;
    }

    public void setExclusiveExternalCampaigns(Set<Campaign> exclusiveExternalCampaigns) {
        this.exclusiveExternalCampaigns = exclusiveExternalCampaigns;
    }

    public Set<Advertisement> getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(Set<Advertisement> advertisements) {
        this.advertisements = advertisements;
    }

}
