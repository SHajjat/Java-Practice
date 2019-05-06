package day05_math_operators;

public class arthmaticOperaters {
public static void main(String[] args) 
{
	System.out.println(55+5);
	int chairs = 140;
	System.out.println(chairs + 2);
	int moreChairs = chairs + 5;
    System.out.println(moreChairs);
    int table =130;
    int total = table + chairs;
    System.out.println(total);
    System.out.println();
    double balance = 1200.4;
    double tranasaction = 56.44;
    System.out.println(balance-tranasaction);
    balance = balance-1;
    System.out.println(balance);
    
    int linesOfCode = 50;
    System.out.println("firstlines of code " + linesOfCode);
    linesOfCode =  linesOfCode- 2;
    System.out.println("line of code "+ linesOfCode);
    //-=2;
    System.out.println(linesOfCode);
    
    //Multip *
    System.out.println(linesOfCode*2);
    //linesOfCode*=2;
    //declare variable classes and assgin 5
    int classes =5;
    System.out.println(linesOfCode*classes);
    int totalLinesOfCode = linesOfCode*classes;
    System.out.println("totalLinesOfCode= "+ totalLinesOfCode);
    
    //Division /
    System.out.println(10/3);// the answer is 3 if you dont put .00 its going to be 3 , the def is int so it make it to int
    System.out.println(55/5);//the answer is 11
    System.out.println(10.0/3);// the answer is 3.33333333333 since there is 10.0 instead of 
    //10 it will do as many double value can handle (two whole numbers will get whole number
    System.out.println(15/7);//the answer is 2
    System.out.println(15.0/7);//the answer is 2.13287...
    System.out.println(5.0/2);//the answer is 2.5
    
    System.out.println(5%2);
    System.out.println(10.0/0);//infinity
    
    
    
    
    		
}
}
