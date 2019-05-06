package homeWorks;

import java.util.Arrays;

public class Pannindrom {
	public static void main(String[] args) {
		
		
		System.out.println((1340%1000)/100);
		System.out.println();
		isPalindrome(1001);
		
	}

	 public static void isPalindrome(int num){
		    //WRITE YOUR CODE HERE
		   int i=0, x=10,y=1;
		   int [] arrNum = new int [0];
		   while (num>0) {
			   arrNum=Arrays.copyOf(arrNum, arrNum.length+1);
			   arrNum[i++]=(num%x)/y;
			   num-=arrNum[i-1]*y;
			   x*=10;y*=10;
			   
			   
		   }
		     
		   for (int j = 0; j<arrNum.length/2;j++) {
			   if (arrNum[j]!=arrNum[arrNum.length-1-j]) {
				   System.out.println("not a panindrom");
				   return;
			   }
		   }
		     System.out.println("panindrom"); 
		      
		    }
		    
		    
		  }

