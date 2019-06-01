package day50_inheritance03;

public class Google extends SearchEngine {
	
	@Override // it will fail if you are not really overriding
	public int search(String item) {
		System.out.println("searching for :" + item);
		return item.length();
	}
	
	@Override
	public void search(String item, String item2) {
		System.out.println("searching for 2 items :" + item + "," + item2);
		System.out.println("total Count : " + item.length());
	}
	@Override
	 protected String clickResult(){
		System.out.println("Clicking result");
		return "Search result page";
	}
}
