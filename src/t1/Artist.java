package t1;

import java.util.ArrayList;
import java.util.List;

public class Artist {

	private String name;
	private List<Album> albums;
	
	public Artist(String name) {
		this.name = name;
		albums = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Album> getAlbums() {
		return albums;
	}
	
	
	
}
