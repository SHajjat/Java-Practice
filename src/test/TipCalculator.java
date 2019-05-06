package test;
import java.util.*;
public class TipCalculator {

	

  public static void main(String[] args) {
	  //WRITE YOUR CODE HERE
	  Scanner scan = new Scanner(System.in);
	    int people;
	       double checkAmount= 0 , totalTip = 0  , totalPerPerson = 0, tipPerPerson=0, totalToPay=0;
	       String service;
	      
	       System.out.println("Split:");
	       String split = scan.next();
	       System.out.println("Number of people:");
	       people = scan.nextInt();
	       System.out.println("Check Amount: ");
	       checkAmount = scan.nextDouble();
	       System.out.println("Service Quality:");
	        service=scan.next().toLowerCase();//to make all inputs lower case
	    
	         switch(service){
	               case  "poor"://change to lower case so you don't have to worry about caps
	                          totalTip  = checkAmount*0.05;
	                          
	                          break;
	               case "fair":
	                           totalTip =checkAmount*0.1;
	                        
	                           break;
	               case "good":
	                          totalTip=checkAmount*0.15;
	                          
	                          break;
	               case "great":
	                          totalTip = checkAmount*0.20;
	                          
	                          break;
	               case "excellent"://it was exellent (typo)
	                          totalTip = checkAmount*0.25;
	                          
	                          break;
	                          }
	                            
	                totalToPay = checkAmount+totalTip;
	    
	                System.out.println("Total to pay: " + totalToPay);
	                
	               if (split.equalsIgnoreCase("yes")) {
	                                      
	                               if ( people>0 && people<=10){
	                                    totalPerPerson = totalToPay / people;
	                                    tipPerPerson=totalTip/people;
	                               }else if (people > 10){
	                                    totalPerPerson=totalToPay/10;
	                                    tipPerPerson=totalTip/10;
	                               }else {totalPerPerson=totalToPay;
	                                      tipPerPerson=totalTip;
	                               }
	              } else  { 
	                   totalPerPerson=totalToPay;
	                   tipPerPerson=totalTip;
	               }
	              //you need this below
	           //  Number of people entered: &&&&
	        // you dont need this        System.out.println("Number of people entered: " + people); not a requirment
	           //you need this below
	            //  Total to pay: 595.0
	           //  Total tip: 119.0
	               String str = "&";
	       
	               str = str.repeat(people);
	               System.out.println("Number of people entered: "+str);
	              System.out.println("Total to pay: "+totalToPay);
	              System.out.println("Total tip: "+totalTip);
	              System.out.println("Total per person: " + totalPerPerson);
	               System.out.println("Tip per person: "+ tipPerPerson);
	       }
//  Number of people entered: &&&&
//  Total to pay: 595.0
//  Total tip: 119.0
//  Total per person: 148.75
//  Tip per person: 29.75   
	}

