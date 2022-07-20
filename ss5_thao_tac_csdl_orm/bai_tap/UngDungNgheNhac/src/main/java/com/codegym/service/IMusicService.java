package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> selectAllMusic();

    Music selectMusic(int id);

    void insertMusic(Music music);

    void update(int id, Music music);

    void remove(int id);
}
