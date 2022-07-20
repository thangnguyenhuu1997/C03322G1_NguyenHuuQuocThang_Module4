package com.codegym.service;

import com.codegym.model.Music;
import com.codegym.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    IMusicRepository iMusicRepository;
    @Override
    public List<Music> selectAllMusic() {
        return iMusicRepository.selectAllMusic();
    }

    @Override
    public Music selectMusic(int id) {
        return iMusicRepository.selectMusic(id);
    }

    @Override
    public void insertMusic(Music music) {
        iMusicRepository.insertMusic(music);
    }

    @Override
    public void update(int id, Music music) {
        iMusicRepository.update(id,music);
    }

    @Override
    public void remove(int id) {
        iMusicRepository.remove(id);
    }
}
