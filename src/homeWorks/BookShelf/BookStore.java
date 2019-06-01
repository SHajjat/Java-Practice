package homeWorks.BookShelf;

import static homeWorks.Shelf.addBook;
import static homeWorks.Shelf.isShelfEmpty;

public class BookStore {
	public static void main(String[] args) {
		Book b = new Book();
		b.setAuthor("hghj");
		System.out.println(b.getAuthor());
		b.setTitle("The Chronicles OF TruTp");
		System.out.println(b.getTitle());
		System.out.println(addBook(-11,"Ahmad mohammad","java",300));
		System.out.println(addBook(3,"Ahmad mohammad","java",300));
		Book book = new Book(2,"Ahmad mohammad","java",300);
		System.out.println(addBook(2,"Ahmad mohammad","java",300));
		
//		System.out.println(isShelfEmpty());
//		Shelf.removeBook(1);
		System.out.println(Shelf.getTheBooks());
		
		
	}
}
