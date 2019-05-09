package day40_customclasses_methods;
/*class Contact
 * instanc variables 
 * name
 * phoneNumber
 * email
 * 
 * 
 * instance methods | behavior
 * call
 * sendMessage
 * sendEmail
 * 
 */



public class Contacts {
	String name,email ;
	long phoneNumber;
	
	public void call () {
		System.out.println("CALLING >>>> " +name );
	}
	public void sendMessage() {
		System.out.println("SENDING MESSAGE TO >>>> "+ name+ " PHONE NUMBER >>>>> "+phoneNumber);
	}
	public void sendEmail() {
		System.out.println("SENDING EMAIL TO >>>>"+name + " EMAIL ADDRESS >>>>> "+email);
	}

}
