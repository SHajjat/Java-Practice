package homeWorks;

public class FrabaHW {
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144

	public static void main(String[] args) {
		
		int first = 0, second =1 , num=9;
	    for (int i = 0 ; i <num ; i ++){
	      
	      second+=first;
	      first= second -first;
	      System.out.println(i + " values are " +first + " and "+ second);
	      
	      
	      
	      
	    }
	    System.out.print(first);

	}

}
