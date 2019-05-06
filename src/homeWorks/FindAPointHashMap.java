package homeWorks;
import java.util.*;
public class FindAPointHashMap {

	
		public static void main (String[] a) {
	        Scanner scan = new Scanner (System.in);
	        String start, end, result = "";
	        start = scan.next().toUpperCase();
	        end = scan.next().toUpperCase();
	        
	        HashMap <String, String[]> direction = new HashMap<String, String[]>();
	        direction.put("right", new String[] {"A","B"});
	        direction.put("down", new String[] {"B","C"});
	        direction.put("left", new String[] {"C","D"});
	        direction.put("up", new String[] {"D","A"});
	        direction.put("-right", new String[] {"A","B"});
	        direction.put("-down", new String[] {"B","C"});
	        direction.put("-left", new String[] {"C","D"});
	        direction.put("-up", new String[] {"D","A"});
	        if (start.equals(end)) {
	            System.out.println(start + " found");
	        }else {
	            for (String key : direction.keySet()) {
	                if (result.contains(">")) {
	                    result += key + " > ";
	                }
	                
	                if (direction.get(key)[0].equals(start)) {
	                    //System.out.print(key);
	                    result += key + " > ";
	                    //}while (direction.get(key)[1]!=end);
	                }
	                
	                if (result.contains(">")&&direction.get(key)[1].contentEquals(end)) {
	                    result = result.substring(0,result.length()-3);
	                    result = result.replace("-","");
	                    break;
	                }
	                
	                
	            }
	            System.out.println(result + ": " + end + " found"); 
	        }

	}

}
