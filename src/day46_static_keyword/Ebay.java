package day46_static_keyword;

public class Ebay {
	public static void main(String[] args) {
		Customer cus1 = new Customer("Samir hajjat", " samir@gmail.com");
		Customer cus2 = new Customer("ahmad ahmad", "ahmadAhmad@ahmad.com");
		Customer cus3 = new Customer("mousa esaaa", "musaEsa@gmai.com");
		System.out.println(cus3.count);//this is one since its instance variable, it restart everytime ins variable run
		System.out.println(Customer.count2);// you can create without instant object and you just tell it which class to go to and
		//get count2
		
		Customer cus4 = new Customer("who care" , "whoCare@yahoo.com");
		System.out.println(Customer.count2);// static is central variable
		
		//statice you can access without an instatn variable
		//and it has one central copy which mean eveyone has acceess to the copy
		//hwen a variable is static , it is a shared variable by all objects , these is only one central copy
		
		
		
		
		
		
		
	}
}
