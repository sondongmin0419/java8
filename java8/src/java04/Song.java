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
		System.out.println(year+"�� "+country+"�� "+artist+"�� �θ� "+title);
		
	}
}
