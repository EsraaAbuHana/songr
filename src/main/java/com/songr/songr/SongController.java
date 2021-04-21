package com.songr.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;
    @GetMapping("/songs")
    public String getAllSongs(Model m){
        m.addAttribute("songs",songRepository.findAll());
        return "songs";

    }
@GetMapping("addsong")
public String openAddSong(){
        return "addSongs";
}
    @GetMapping("/album/{id}")
    public String getSongById(@PathVariable(value="id") Integer id,Model m){
        Album album=albumRepository.findById(id).get();
        m.addAttribute("album",album);
//        Song song = songRepository.findById(id).get();
        return "album";

    }

    @PostMapping("/songs")
    public RedirectView addSong(@RequestParam(value="title")String title,
                                @RequestParam(value="trackNumber")int trackNumber,
                                @RequestParam(value="length")int length,
                                @RequestParam(value="albumId")Integer albumId){
        Album album = albumRepository.findById(albumId).get();

        Song song = new Song(title,length,trackNumber,album);
        songRepository.save(song);
    return new RedirectView("songs");
    }


}
