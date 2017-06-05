package t1;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Service {

	@WebMethod
	public double getPrice(String artistName, String albumName) {
		for(Artist a : DataBase.artists) {
			if(a.getName().equals(artistName)) {
				for(Album am : a.getAlbums()) {
					if(am.getName().equals(albumName))
						return am.getPrice();
				}
			}
		}
		return -1;
	}
	@WebMethod
	public List<String> getAlbums(String artistName) {
		for(Artist a : DataBase.artists) {
			if(a.getName().equals(artistName)) {
				List<String> albums = new ArrayList<>();
				for(Album am : a.getAlbums()) {
					albums.add(am.getName());
				}
				return albums;
			}
		}
		return new ArrayList<>();
	}
	@WebMethod
	public String buyAlbum(String artistName, String albumName) {
		for(Artist a : DataBase.artists) {
			if(a.getName().equals(artistName)) {
				for(Album am : a.getAlbums()) {
					if(am.getName().equals(albumName))
						return am.getContent();
				}
			}
		}
		return "";
	}
	
}
