package com.example.demo.service;

import com.example.demo.model.Song;

import java.util.List;
import java.util.Optional;

public interface ISongService {
    List<Song> findAll();

    void save(Song song);

    Optional<Song> findById(int id);

    void update(Song song);

    void deleteSongById(int id);
}
