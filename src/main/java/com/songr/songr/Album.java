package com.songr.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    String title;
    String artist;
    int songCount;
    int length;
    String imageUrl;//that is a link to that album’s art.
//    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
//    private List<Album> albums;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "album")
    List<Song> songs;
public Album(){

}
    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
