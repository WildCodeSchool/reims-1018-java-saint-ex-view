package Java;

public class Link {
	private String coords;
	private String href;
	
	public Link(String coords, String href) {
		this.coords = coords;
		this.href = href;
	}

	public String getCoords() {
		return coords;
	}

	public void setCoords(String coords) {
		this.coords = coords;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
	
}