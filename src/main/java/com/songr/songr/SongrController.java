package com.songr.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class SongrController {
    @Autowired
    AlbumRepository albumRepository;
    @GetMapping("/hello")
//    @ResponseBody
    public String home() {
        return "HelloWorld";
    }
    @GetMapping("/capitalize/{word}")
    public String anyWord(Model m, @PathVariable("word")String word){
        m.addAttribute("word",word.toUpperCase());

        return "CAPITALIZED.html";
    }

    @GetMapping("/albums")
    public String getAlbum(Model m){
m.addAttribute("albums",albumRepository.findAll());
        return "albums.html";
    }
    @GetMapping("/addAlbum")
    public String getAddAlbumView(){
        return "addAlbum.html";

    }
    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam(value="title")String title,
                                 @RequestParam(value="artist")String artist,
                                 @RequestParam(value="songCount")int songCount,
                                 @RequestParam(value="length")int length,
                                 @RequestParam(value="imageUrl")String imageUrl){
        Album album = new Album(title,artist,songCount,length,imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");

    }


}
//        Album album1 = new Album("SKY","Yiruma",8,500,"https://img.discogs.com/DgLWcqi0mMWsayw856ptriTN9qc=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-6875064-1428500220-1592.jpeg.jpg");
//        Album album2 = new Album("Piano Serenade","Yiruma",10,320,"https://m.media-amazon.com/images/I/81fkNX0f3tL._SS500_.jpg");
//        Album album3 = new Album("ATMOSFERA","Yiruma",1,120,"https://a10.gaanacdn.com/images/albums/7/225107/crop_175x175_225107.jpg");
//        List<Album> albums = new ArrayList<>();
//        albums.add(album1);
//        albums.add(album2);
//        albums.add(album3);

//        m.addAttribute("albums",albums);
//    @GetMapping("/hello")
////    @ResponseBody
//    public String home() {
//        return "HelloWorld";
//    }
//    @GetMapping("/capitalize/{word}")
//    public String anyWord(Model m, @PathVariable("word")String word){
//        m.addAttribute("word",word.toUpperCase());
//
//        return "CAPITALIZED.html";
//    }

