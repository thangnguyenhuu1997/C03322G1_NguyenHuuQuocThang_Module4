package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Music {
    @Id
    private int id;

    private String name;
    private String Singer;
    private String kindOfMusic;
    private String link;

    public Music() {
    }

    public Music(int id, String name, String singer, String kindOfMusic, String link) {
        this.id = id;
        this.name = name;
        Singer = singer;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
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

    public String getSinger() {
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
