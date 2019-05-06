package homeWorks;

public class CoverMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coverString("[hi]", "[hi]") ) ;
	}
	 public static String coverString(String main, String coverME) {
		return main.replace(coverME, "["+coverME+"]");
		  
		   
	 	    
	 }
}


