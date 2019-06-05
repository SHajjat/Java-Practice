package day44_Constructor;

public class WhatsApp {
	private String toNumber ;
	private String message;
	private String delivered ;
	private Long number;
	
	public WhatsApp (String...strings) {
		System.out.println("No-Args constructor");
		
		
		
	}
	public WhatsApp ( String toNumner , String message) {
		this(message, toNumner , toNumner);// changing constructors using this() KeyWord
		System.out.println("2 Args constructions");
	}
	
	
	public WhatsApp (Long number) {
		System.out.println("No-Args constructor");
		this.number=number;
		System.out.println(number);
		
		
		
	}
	public WhatsApp ( String toNumner) {
		this(Long.parseLong(toNumner));// changing constructors using this() KeyWord
		System.out.println("2 Args constructions");
	}
	
	
	public String getDelivered() {
		return delivered;
	}
	public void setDelivered(String delivered) {
		this.delivered = delivered;
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	//if in your class you have multiple 
	
	//THIS() keyword must be the first statment in the constructor
	
	/*
	 * for Example
	 * public class Book{
	 * private String title;
	 * public book(String title){
	 * this.title = title;
	 * }
	 * 
	 * public book()
	 */
	
	
	

}
