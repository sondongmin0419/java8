package java04;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	Song(String title,String artist,int year,String country){
		this.title=title;
		this.artist=artist;
		this.country=country;
		this.year=year;
	}
	
	void show() {
		System.out.println(year+"년 "+country+"의 "+artist+"가 부른 "+title);
		
	}
}
