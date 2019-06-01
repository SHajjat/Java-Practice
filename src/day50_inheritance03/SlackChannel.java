package day50_inheritance03;

public class SlackChannel {
	public static void main(String[] args) {
		SlackUser su = new SlackUser("Nadir");
		AdminUser ad = new AdminUser("khara");
		su.sendAMessage("Hello can you please do the homework");
		ad.sendAMessage("Thank you");
		
	}
	
}
