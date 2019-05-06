package homeWorks;
import java.util.*;
public class Plus_Minus {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	   // int size = inp.nextInt();
	    int[] arr = {-2, -1, 0, 1, 2};
	    
//	    for(int i=0 ;i<=size-1;i++)
//	    {
//
//	        arr[i]=inp.nextInt();
//	    }
	    
	    plus_minus(arr);
	  }//end main
	  
	  public static void plus_minus(int []arr){ 
		  int [] negArr= new int [0] ; int zeroArr []= new int [0];
		  int [] posArr=new int [0];
		  int j =0 , k=0;
		  Arrays.sort(arr);
		  for (int i=0; i<arr.length; i++) {
			  if(arr [i]<0) {
			 negArr=Arrays.copyOf(negArr, negArr.length+1);
			 negArr[i]=arr[i];
			 
			
			  }else if (arr[i] == 0) {
				  zeroArr=Arrays.copyOf(zeroArr, zeroArr.length+1);
					 zeroArr[k++]=arr[i]; 
				  
			  }else {
				  posArr = Arrays.copyOf(posArr, posArr.length+1);
				  posArr[j++]=arr[i];
			  }
		  }
		  System.out.println(Arrays.toString(negArr));
	    System.out.print("positives:"+posArr.length+", negatives:"+negArr.length+", zeros:"+zeroArr.length);
	    
	  }

}
