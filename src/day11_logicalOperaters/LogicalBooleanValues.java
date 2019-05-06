package day11_logicalOperaters;

import javax.sound.midi.Soundbank;

public class LogicalBooleanValues {

	public static void main(String[] args) {
		boolean b1 = 50>10 && 10>100;//false
		System.out.println("B1 : "+b1);
		
		boolean b2 = 'a' == 'a' && 123>120;//true
		System.out.println("B2 ; "+b2);
		
		boolean b3 = true && 10 >= 10 && 1000<= 900;//false
		System.out.println("B3 : "+b3);
		
		boolean b4 = false && false && 10==10;//false
		System.out.println("B4 : "+ b4);

		boolean b6 = false && true || 10==10;//true
		System.out.println("b6 : "+ b6);
		boolean b7 = false && ( true || 10!=10);//false
		System.out.println("B7 : "+ b7);
	    boolean b8 = 10*3 > 3 && false || false;
	    System.out.println("b8 : "+ b8);
	    
	    boolean topicDone = true;
	    boolean isMoreThan3Pm = true;
	    boolean everthingIsClear = true || false ;
	    boolean letsGoForABreak = topicDone && isMoreThan3Pm && everthingIsClear;
	    System.out.println("go for a break :"+ letsGoForABreak);
	    
	    boolean b10 = !true || false ;
	    System.out.println("B10 : "+ b10);
	    boolean b11 = true | false ; // the diff is when you have one | it will check all 
//	    sides when using two it will check one side if its true it
//	    will not check the other side since it will always be true no matter what 
//	    same thing with && and & if one it will check both sides if two it will check one side
//	    if the left side is false it will not check the right side since it will always be false
	    
	    
	   
		
	    
	}

}
