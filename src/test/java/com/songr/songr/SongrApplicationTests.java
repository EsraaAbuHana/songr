package com.songr.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
		import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}
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
	void setterAlbumsTest(){
		final Album album = new Album();
	final Album album1 = new Album();
	album.setArtist("person");
	final Album field = album.getClass().getDeclaredField("value");
        field.setAccessible(true);
	assertEquals("Fields didn't match", field.get(album), "person");

}

//	final PlainOldJavaObject pojo = new PlainOldJavaObject();
//
//	//when
//        pojo.setValue("foo");
//
//	//then
//	final Field field = pojo.getClass().getDeclaredField("value");
//        field.setAccessible(true);
//	assertEquals("Fields didn't match", field.get(pojo), "foo");
}
