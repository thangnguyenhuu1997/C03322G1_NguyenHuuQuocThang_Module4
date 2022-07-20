package com.codegym.repository;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> selectAllMusic();

    Music selectMusic(int id);

    void insertMusic(Music music);

    void update(int id, Music music);

    void remove(int id);

}
