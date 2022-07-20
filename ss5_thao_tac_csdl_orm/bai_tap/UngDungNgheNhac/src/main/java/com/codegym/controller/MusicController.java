package com.codegym.controller;

import com.codegym.model.Music;
import com.codegym.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MusicController {
    @Autowired
    IMusicService iMusicService;

    @GetMapping
    public String showSongList(Model model) {
        List<Music> musicList = iMusicService.selectAllMusic();
        model.addAttribute("musicList", musicList);
        return "index";
    }
    @GetMapping("create")
    public String showFormCreate(Model model) {
        model.addAttribute("music", new Music());
        return "create";
    }
    @PostMapping("create")
    public String create(@ModelAttribute("music") Music music) {
        iMusicService.insertMusic(music);
        return "redirect:/index";
    }

    @GetMapping("edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("music", iMusicService.selectMusic(id));
        return "edit";
    }
    @PostMapping("update")
    public String edit(@ModelAttribute("music") Music music) {
        iMusicService.update(music.getId(), music);
        return "redirect:/index";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable int id) {
        iMusicService.remove(id);
        return "redirect:/index";
    }
}
