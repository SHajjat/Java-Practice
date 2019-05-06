package day15_StringManupalation;

public class Contains {
	public static void main (String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, tomatoes , eggs , milk , bread , meat";
		//check if apples in the shopping list
		//if its true apples are ther
		//if false , lets add apples
		if(list.contains("apples")) {
			System.out.println("we have apples in the list");
		}else {
			list +=", apples";
			System.out.println(list);
		}
		
		list.contains("eggs");
		
		
		email = "name@yahoo.com";
		if (email.contains("yahoo"))
			System.out.println("it is yahoo email");
		else if (email.contains("gmail"))
			System.out.println("its Gmail mail male");
		//***********************************
		String name1 = "samir";
		
		String containtsAorE = name1.contains("a") || name1.contains("e") ? "it is there" : "no man";
		System.out.println(containtsAorE);
		
		
		
		
	}

}
