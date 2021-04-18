package com.songr.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
		import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SongrApplicationTests {

@Test
	void AlbumTest(){
	Album testAlbum = new Album("SKY","Yiruma",8,500,"https://img.discogs.com/DgLWcqi0mMWsayw856ptriTN9qc=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-6875064-1428500220-1592.jpeg.jpg");
	assertThat(testAlbum.getTitle()).isEqualTo("SKY");
	assertThat(testAlbum.getArtist()).isEqualTo("Yiruma");
	assertThat(testAlbum.getSongCount()).isEqualTo(8);
	assertThat(testAlbum.getLength()).isEqualTo(500);
	assertThat(testAlbum.getImageUrl()).isEqualTo("https://img.discogs.com/DgLWcqi0mMWsayw856ptriTN9qc=/fit-in/600x600/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/R-6875064-1428500220-1592.jpeg.jpg");

}
@Test
	void setterAndGettersAlbumsTest(){
 Album album = new Album("aa","bb",5,100,"https://img.discogs.com");

	album.setArtist("person");
	album.setSongCount(10);
	album.setImageUrl("https://img.discogs.com");
	album.setTitle("any");
	album.setLength(200);
	assertThat(album.getArtist()).isEqualTo("person");
	assertThat(album.getTitle()).isEqualTo("any");
	assertThat(album.getLength()).isEqualTo(200);
	assertThat(album.getImageUrl()).isEqualTo("https://img.discogs.com");
	assertThat(album.getSongCount()).isEqualTo(10);


}

}
