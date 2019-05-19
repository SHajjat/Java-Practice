package day45_encapsulation_practice;

import java.util.Random;

public class EtsyAccount {
	
	private String email;
	private String firstName;
	private String passWord;
	
	
	//constructor 1. no-args sets all as emtpty string
	public EtsyAccount() {
		email = "";
		firstName = "";
		passWord = "";
	}
	
	// constructor 2 take three arfs and set them to instant variables
	public EtsyAccount(String email, String firstName, String passWord) {
		setEmail(email);
		setfirstName(firstName);
		setpassWord(passWord);
	}
	
	/*contstructor 3
	email , first name ==>call setter methods
	password is auto generated and assgined
	
	 */
	public EtsyAccount(String email , String firstName){
		setEmail(email);
		setfirstName(firstName);
		this.passWord= getRandomPass();// random password with 6 charac
	}
	
	private String getRandomPass(){
		Random rand = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*_+";
		String RDPassword ="";
		for (int i = 0 ; i <6; i++){
			RDPassword+= letters.charAt(rand.nextInt(letters.length()));
		}
		return RDPassword;
	}
	
	public void setEmail(String email) {
		//@ has to be somewhere in the middle
		if ( email.indexOf("@") != -1 && email.indexOf("@") != email.length() - 1 && email.indexOf("@") != 0 ) {
			this.email = email;
		} else {
			System.out.println("Please enter a valid email");
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	private boolean isValidFirstName(String firstName) {
		//check first if ut starts with or ends with space
		// return false if true
		
		if ( firstName.startsWith(" ") || firstName.endsWith(" ") ) {
			return false;
		}
		if ( firstName.isEmpty() ) {
			System.out.println("can not be blank");
			return false;
		}
		for ( int i = 0; i < firstName.length(); i++ ) {
			char ch = firstName.charAt(0);
			if ( !Character.isAlphabetic(ch) && ch != ' ' ) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "EtsyAccount{" +
				"email='" + email + '\'' +
				", firstName='" + firstName + '\'' +
				", passWord='" + passWord + '\'' +
				'}';
	}
	
	public void setfirstName(String firstName) {
		if ( isValidFirstName(firstName) ) {
			this.firstName = firstName;
		} else {
			System.out.println("the first name contain invalid characters");
		}
		
	}
	
	public String gefirstName() {
		return firstName;
	}
	
	public void setpassWord(String passWord) {
		if ( passWord.length() < 6 ) {
			System.out.println("password cant be less than 6");
		} else {
			this.passWord = passWord;
		}
	}
	
	public String getpassWord() {
		return passWord;
	}
}
