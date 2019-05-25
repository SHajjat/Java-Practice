package homeWorks;

public class CoverMe {

	public static void main(String[] args) {
		
		System.out.println(coverString("[hi]", "[hi]") ) ;
	}
	 public static String coverString(String main, String coverME) {
		return main.replace(coverME, "["+coverME+"]");
		  
		   
	 	    
	 }
}


