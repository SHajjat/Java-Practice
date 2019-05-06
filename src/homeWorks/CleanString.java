package homeWorks;

public class CleanString {
	  public static String clean (String text ,String badWord) {
		    String [] arr = text.split(" ");
		    String word="";
		    for(int i = 0 ;i<arr.length;i++){
		      if (!(arr[i].equals(badWord))){
		        word+=arr[i] +" ";
		      }
		      
		      
		      }
		   return word.trim();
		      
		  }
	  public static void main(String[] args) {
		System.out.println(clean("bla he said bla bla bla","bla"));
	}

}
