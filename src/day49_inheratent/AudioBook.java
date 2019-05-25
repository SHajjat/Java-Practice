package day49_inheratent;

public class AudioBook extends Book {
	private   double length;
	private String narrator;
	
	//Listening to java book by Sawitch and narrated by Marufjon
	public void listen(){
		System.out.println("I am listening to " + getTitle()+ " book by "+getAuthor()+ " narrated by "+ narrator);
	}
	
	public double getLength() {
		return length;
	}
	
	public String getNarrator() {
		return narrator;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setNarrator(String narrator) {
		this.narrator = narrator;
	}
}
