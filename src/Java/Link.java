package Java;

public class Link {
	private String coords;
	private String href;
	private String text;
	
	public Link(String coords, String href, String text) {
		this.coords = coords;
		this.href = href;
		this.text = text;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}