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
    public String formGetAll(Model model) {
        List<SongListEntity> songListEntities = repository.findAll();
        model.addAttribute("songlists", songListEntities);
        return "formgetall";
    }

    @GetMapping("/form")
    public String formForPost() {
        return "form";
    }

    @PostMapping("/form")
    public String formPost(SongListEntity songListEntity, Model model) {
        model.addAttribute("songlist", songListEntity);
        repository.save(songListEntity);
        return "form";
    }

    @GetMapping("/formupdate")
    public String formForUpdate() {
        return "formupdate";
    }

    @PostMapping("/formupdate")
    public String formUpdate(SongListEntity songListEntity, Model model) {
        model.addAttribute("songlist", songListEntity);
        repository.findById(songListEntity.getId()).map(song -> {
            song.setSongname(songListEntity.getSongname());
            song.setMusician(songListEntity.getMusician());
            song.setYear(songListEntity.getYear());
            song.setAlbum(songListEntity.getAlbum());
            song.setGenre(songListEntity.getGenre());
            return repository.save(song);
        });
        return "formupdate";
    }

    @GetMapping("/formdelete")
    public String formDelete() {
        return "formdelete";
    }

    @PostMapping("/formdelete")
    public String formDelete(SongListEntity songListEntity,Model model) {
        model.addAttribute("songlist", songListEntity);
        repository.deleteById(songListEntity.getId());
        return "formdelete";
    }

}
