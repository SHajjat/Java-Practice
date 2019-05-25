package day49_inheratent;

public class PaperBack extends Book{
	private int pages;
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public String toString(){
		return "["+getAuthor()+" | "+getAuthor()+" | "+getPrice()+" | "+getType()+" | "+getPages()+"]";
	}
}
