package day40_customclasses_methods;

public class MyContacts {

	public static void main(String[] args) {
		//create Contact object
		
		Contacts contact1 = new Contacts();
		contact1.name = "Samir";
		contact1.email = "samir.hajjat@gmail.com";
		contact1.phoneNumber = 3193598072L;
		contact1.call();
		contact1.sendEmail();
		
		
		

	}

}
