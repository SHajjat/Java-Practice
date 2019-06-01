package day50_inheritance03;

public class SearchEngine {
	public int search (String item){
		System.out.println("searching for :"+item);
		return item.length();
	}
	protected void search (String item ,String item2){
		System.out.println("searching for 2 items :"+item+ ","+item2);
		System.out.println("total Count : "+item.length());
		
	}
	
	String clickResult(){
		System.out.println("Clicking result");
		return "Search result page";
	}
}

