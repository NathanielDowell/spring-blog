package com.codeup.springblog.model;


import javax.persistence.*;

@Entity
public class AdImage {

    //Attributes:

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn (name = "ad_id")
    private Ad ad;


    //Getters and setters:
    public long getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    public Ad getAd() {
        return ad;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
