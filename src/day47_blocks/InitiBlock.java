package day47_blocks;

public class InitiBlock {
	{ System.out.println("init block");}
	public InitiBlock (){
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args) {
		InitiBlock in = new InitiBlock();
		InitiBlock int2 = new InitiBlock();
		
	}
}
