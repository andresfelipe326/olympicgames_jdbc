package co.edu.udem.olympicgames.jdbc.entities;

public class News {
	
	private int id;
	private String title;
	private String description;
	private String image;
	private String newsurl;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getNewsurl() {
		return newsurl;
	}
	public void setNewsurl(String newsurl) {
		this.newsurl = newsurl;
	}
	

}
