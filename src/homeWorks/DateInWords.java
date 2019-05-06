package homeWorks;

import java.util.Arrays;

public class DateInWords {

	public static void main(String[] args) {
		 String[] monthWords = { "","January", "February", "March", "April", "May", "June", "July", "August", "September",
	                "October", "November", "December" };
	        String[] numbersLessThanTen = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
	                "Ten" };
	        String[] numbersBetweenTenAndTwenty = { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
	                "Seventeen", "Eighteen", "Nineteen", "" };
	        String[] multiplesOfTen = { "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "","" };
	        String[] yearWords = { ""+ "Thousand", "Hundred", "Thousand" };

		
	        
	    int day =29 , month = 4 , year = 1919;
		String outputDate="";
	      int [ ] dates = {month , day , year};
	    
	      
	      //April Twenty Nine One Thousand Nine Hundred Nineteen
	      
	      for (int i =0 ; i<2;i++) {
	    	  
	    	  if (i==0) {
	    		  outputDate+= monthWords[month]+" ";
	    		  continue;
	    	  }
	    	  int m=2;
	    	  System.out.println(dates[i]);
	    	  for (int j = 1000; j>=100;j/=10) {
	    	  outputDate+= yearWords[m*(dates[i]/j)]+" ";
	    	  System.out.println(outputDate);
	    	  dates[i]%=j;
	          System.out.println(j);
	          System.out.println(dates[i]);
	          m--;
	    	  }
	    	  
	    	  
	    	  //System.out.println("********");
	      }
	    	  
	      
		
		
		
//		
//		String monthNow = "", dayNow = "",yearNow="";
//        int currYear = 0;
//        
//        monthNow = monthWords[month]+" ";
//        if (day >0 && day <11) {
//           dayNow =numbersLessThanTen[day] ;
//           
//        }else if (day>=11 && day <20) {
//            dayNow = numbersBetweenTenAndTwenty[day-10];//eleven index 1
//        }else if (day >=20 && day <=29) {
//            dayNow = multiplesOfTen[1]+" "+numbersLessThanTen[day-20];
//            
//        }else if ( day ==30 && day == 31) {
//            dayNow = multiplesOfTen[2]+" "+numbersLessThanTen[day-30];
//        }
//        
//        if (year >=1900 && year <=1999) {
//            yearNow =" "+numbersLessThanTen[1]+" "+yearWords[1]+" "+numbersLessThanTen[9]+" "+yearWords[0];
//            currYear=year-1900;//19 20 55 60
//        }else if ( year >1999 && year < 2100) {
//            yearNow =" "+numbersLessThanTen[2]+" "+yearWords[1];
//            currYear=year-2000; //19 75 23 19
//        }
//        
//        if  ( currYear >0 && currYear <10) {
//            yearNow +=" "+ numbersLessThanTen[currYear];
//        }else if (currYear >=10 && currYear <=19) {
//            yearNow+=" "+numbersBetweenTenAndTwenty[currYear-10];
//        }else if (currYear >19 ) {
//            yearNow+=" "+multiplesOfTen[(currYear/10)-1]+" "+numbersLessThanTen[currYear%10];
//        } 
//        System.out.println();
//        //April Twenty Nine One Thousand Nine Hundred Nineteen
	}

}
