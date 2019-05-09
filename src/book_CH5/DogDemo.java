package book_CH5;

public class DogDemo {

//	//public static void main(String[] args) {
////		Dog sasha = new Dog();
////		sasha.name = "Sasha";
////		sasha.age = 5;
////		sasha.breed = "Husky";
////		sasha.writeOutPut();
////		sasha.getAgeInHumanYears();
////		
////		Dog scooby = new Dog() ;
////		scooby.name = "Scooby";
////		scooby.breed="Great Dane";
////		scooby.age=42;
////        scooby.writeOutPut();
////        scooby.getAgeInHumanYears();
//		int [] nums = {1, 9, 9, 3, 9};
//		System.out.println(arrayCount9(nums));
//		
//		
//		
//	}
	public String startOz(String str) {
		  boolean whatIsLove= str.length()>=2?true:false;
		  String str2="";
		   str2+= ((""+str.charAt(0)).equals("o"))?"o":"";
		  if(whatIsLove){
		    str2+= ((""+str.charAt(1)).equals("z"))?"z":"";
		  }
		  return str2;
		}
	public static int arrayCount9(int[] nums) {
		  int count = 0;
		  for (int temp : nums){
		    count = temp==9?++count:count;
		  }
		  return count;
		}
	public String stringX(String str) {
		  String str2="";
		for (int i = 1 ; i<str.length()-1;i++){
		     if( str.charAt(i)=='z'){
		      str2+= (""+str.charAt(i)).replace("z","");
		     }else {
		    	 str2+=""+str.charAt(i);
		     }
		   }
		   return str2;
		}
	
	
	private static int $;
	public static void main(String[] main) {
//	String a_b; System.out.print($); System.out.print(a_b);
		
		short x = 14;
		float y = 13; double z = 30;
		System.out.println(x * y / z);
		
		short b = 10;
		short a = 20;
		short c = (short) (a *b);
		
		
	} 
	private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia"; final String suffix = "JR";
		int id = 0;
		switch(firstName) {
		case "Test": return 52;
		case middleName: // DOES NOT COMPILE id = 5;
			break; case suffix:
			id = 0;
			break;
			case lastName: // DOES NOT COMPILE
			id = 8;
			break;
			case 5: // DOES NOT COMPILE
			id = 7;
			break;
			case 'J': // DOES NOT COMPILE
			id = 10;
			break;
			case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
			id=15;
			break; }
			return id; }
		
	

}
	


