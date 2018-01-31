package com.mvc.practice.domain;

public class AdvertisementSegment {

    private long id;
    private Advertisement advertisement;
    private Segment segment;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

}
