package Java;

import java.util.List;

public class Room {
	private int id;
	private String url;
	private String title;
	private List<Link> links;

	public Room(int id, String url, String title, List<Link> links) {
		this.id = id;
		this.url = url;
		this.title = title;
		this.links = links;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
