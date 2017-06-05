package t1;

public class Album {

	private String name;
	private Artist artist;
	private double price;
	
	private String content;
	
	public Album(String name, double price, Artist artist, String content) {
		this.name = name;
		this.artist = artist;
		this.price = price;
		
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public Artist getArtist() {
		return artist;
	}

	public double getPrice() {
		return price;
	}

	public String getContent() {
		return content;
	}
	
	
	
}
