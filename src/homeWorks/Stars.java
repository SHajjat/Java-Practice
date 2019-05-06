package homeWorks;

public class Stars {
	 public static void printHollowRect()
	  {
	    for (int i = 0 ; i<5 ; i++){
	    if (i == 0 || i == 4 ){
	      for (int j = 0 ; j<5;j++){
	        System.out.print("*");
	        
	      }
	      System.out.println();
	      
	    }else {
	      System.out.println("*   *");
	    }
	    }
	   
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }

}
