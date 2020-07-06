package com.oogie.discographyspring;

import com.oogie.discographyspring.model.SongListEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongListController {
    private final SongListRepository repository;

    public SongListController(SongListRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formGet() {
        return "form";
    }

    @PostMapping("/form")
    public String formPost(SongList songlist, Model model) {
        model.addAttribute("songlist", songlist);
        SongListEntity songListEntity = new SongListEntity(songlist);
        repository.save(songListEntity);
        return "form";
    }
}
