package day49_inheratent;

public class Book {
	private String title;
	private String type;
	private String author;
	protected double price;
	{System.out.println("hello I am running form inside inti initializer in Book");}
	
	public String getType() {
		return type;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	
	
	
}
