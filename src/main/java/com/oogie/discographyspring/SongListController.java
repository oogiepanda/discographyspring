package com.oogie.discographyspring;

import com.oogie.discographyspring.model.SongListEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping("/formgetall")
    public String formGet(Model model) {
        List<SongListEntity> songListEntities = repository.findAll();
        model.addAttribute("songlists", songListEntities);
        return "formgetall";
    }

    @PostMapping("/form")
    public String formPost(SongListEntity songListEntity, Model model) {
        model.addAttribute("songlist", songListEntity);
        repository.save(songListEntity);
        return "form";
    }
}
