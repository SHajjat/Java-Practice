package day49_inheratent;
   //              IS_A
public class Ebook extends Book{
	private double size;
	private int pages;
	   //{price = 100;} //since price is protected we can get it
	
	
	public void readEBook(int page){ // methods are already inheratent so we dont have to initate the method
		//so instead of using new you just go getTitle();
		System.out.println("readying "+ getTitle() + " by "+getAuthor() + " at page "+ page);//it know that Title is there so it save not visiable
		//but the problem we have its private
	}
	
	   public double getSize() {
		   return size;
	   }
	
	   public int getPages() {
		   return pages;
	   }
	
	   public void setSize(double size) {
		   this.size = size;
	   }
	
	   public void setPages(int pages) {
		   this.pages = pages;
	   }
   }
