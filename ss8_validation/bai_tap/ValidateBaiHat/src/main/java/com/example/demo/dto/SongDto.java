package com.example.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto {
    private Integer id;

    @NotBlank
    @Size(max = 800)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid")
    private String name;

    @NotBlank
    @Size(max = 300)
    @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$", message = "Not valid")
    private String singer;

    @NotBlank
    @Size(max = 1000)
    @Pattern(regexp = "^[a-zA-Z,\\s\\d\\p{L}]+$", message = "Not valid")
    private String kindOfMusic;

    public SongDto() {
    }

    public SongDto(Integer id, @NotBlank @Size(max = 800) @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$") String name, @NotBlank @Size(max = 300) @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$") String singer, @NotBlank @Size(max = 1000) @Pattern(regexp = "^[a-zA-Z\\s\\d\\p{L}]+$") String kindOfMusic) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}