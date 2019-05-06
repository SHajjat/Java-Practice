package day15_StringManupalation;
import java.util.*;
public class WordStart {
  public static void main(String[] args) {
  // String word1 =  new Scanner(System.in).next();
	  String word1 = "eclipse".toLowerCase();
 boolean java = word1.startsWith("e");//true
  System.out.println(java);
  java= word1.startsWith("ec");//true
  System.out.println(java);
  System.out.println(word1.toUpperCase().startsWith("EC"));//true
  System.out.println(word1.endsWith("pse"));//true
  //it is case sensitive 
  System.out.println(word1.startsWith("e c"));
  //*******************************************************
  //Mr. Mrs. Ms. Dr.
  String word2= "Dr. Hajjat";
  if (word2.startsWith("Mr.")) {
	  System.out.println("Male");
  }else if (word2.startsWith("Mrs.")) {
	  System.out.println("Married woman");
	  
  }else if (word2.startsWith("Ms.")) {
	  System.out.println("single and ready to mingle");
  }else if (word2.startsWith("Dr.")) {
	  System.out.println("its a doctor");
  }else
	  System.out.println("unKnown Status");
 
}
}