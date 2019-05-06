package day13;

import javax.sound.midi.Soundbank;

public class Ternary {

	public static void main(String[] args) {
	  String result;
	  int score = 60;
	  if (score >60)
		  result = "pass";
	  else 
		  result = "fail";
	  System.out.println("result :"+result);
//	  ************************************
//	  ********Other way to do it *********
	  score = 100;
	  String result2 = score>60 ? "Pass":"fail";
	  System.out.println("result2 "+ result2);
	  String  quality = "bad";
	  int rating = (quality.equalsIgnoreCase("good")) ? 100 : 80 ;
	  System.out.println("rating :"+rating);
	  int RushHour = 1;
	  boolean isRushHour = (RushHour >= 4 && RushHour<=7) ? true : false ;
	  System.out.println("is it rushHour :"+ isRushHour);
	  String answer = isRushHour ? "yes":"No";
	  System.out.println(answer);
	  int amHour = 8;// 6 to 9 is rush hour
	  String AmRush = amHour >= 6 && amHour <= 9 ? "yes" : "no";
	  System.out.println("is it rush hour " +AmRush);
	  

	}

}
