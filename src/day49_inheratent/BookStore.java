package day49_inheratent;

public class BookStore {
	
	protected String b;
	//if a parent class has encapsulated private variables . they are not directlu onherited to child classes , but child/sub classes
	//have to use getters setters or constructors
	public static void main(String[] args) {
		Ebook ebook = new Ebook();
		ebook.setTitle("Introduction to java programing");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(490);
		ebook.setType("fiction");
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getPrice());
		ebook.readEBook(200);
		
		AudioBook abook = new AudioBook();
		abook.setTitle("OCA Preparation");
		abook.setAuthor("Jeanne");
		abook.setNarrator("Marufjon");
		abook.listen();
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(304);
		System.out.println(pb.toString());
	}
}
