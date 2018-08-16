package co.thebeat.booklibrary.frontdesk.web.entities;

public class Book {
	
	private String id;
	
	private String ISBN;
	
	private String title;
	
	private String writer;
	 
	private Integer timesRent;
	
	private Boolean available;
	
	private String renterName;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setISBN(String isbn) {
		this.ISBN = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void setTimesRent(Integer timesRent) {
		this.timesRent = timesRent;
	}
	
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getId() {
		return id;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public Integer getTimesRent() {
		return timesRent;
	}

	public Boolean getAvailable() {
		return available;
	}

	public String getRenterName() {
		return renterName;
	}
}
