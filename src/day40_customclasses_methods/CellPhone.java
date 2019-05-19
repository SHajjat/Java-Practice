package day40_customclasses_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import day38_arraylist03.RemoveAll;

public class CellPhone {
	String brand ,Color;// null
	double screenSize, price; // 0.0
	
	public void call() {//no static here the attach them selves to objects (instince method)
	System.out.println("Calling........");
	
	}
	public void message() {
		System.out.println("Sending txt message........");
	}
	public void takeAPhoto () {
		System.out.println("Taking a photo .....");
	}
	class Atts {
		  String name,color;
		  int amount;
		  public void asString(){
		    System.out.println("name: "+name+" color: "+color+" amount: "+amount);
		  }
		}
	
//	  public static void main(String[] args) {
//		   
//		   Atts a = new Atts();
//		   a.name = "ball";
//		   a.color = "red";
//		   a.amount = 1;
//		   
//		   
//		   // System.out.println(a.asString());
//		  }
	  public static void removeALL(ArrayList <String> wordList , String targetWord){
		  ArrayList <String> targetArray = new ArrayList <>();
		  targetArray.add(targetWord);
		 
		  wordList.removeAll(targetArray);
		}
	  public static void main(java.lang.String...args) {
		  List <String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
		 //List <String> str1 = new  <String>(Arrays1.asList("hi","hey","hi","yo")) ;
//		 removeALL(wordList,"hi");
//		 System.out.println(wordList);
//		 byte x = 5;
//		 byte y = 10; 
//          double z = x + y;
			 for(int i=0; i<wordList.size(); i++){
				   if (wordList.get(i).equals("hi")){
				     wordList.remove("hi");
				     i--;
				   }
				   //wordList.add("hey");
				   
				 } 
			 wordList.add("hey");
			 System.out.println(wordList);
          
          //System.out.println(args[0]);
	}
	}


