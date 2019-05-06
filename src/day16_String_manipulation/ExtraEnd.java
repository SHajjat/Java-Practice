package day16_String_manipulation;

public class ExtraEnd {
public static void main(String[] args) {
	String str = "ja";
	String result= "";
	//if (str.length()==2) {
		//result = str.concat(str).concat(str);
	
	//}else {
		result = str.substring(str.length()-2);
//	}
	System.out.println(result.concat(result).concat(result));
}
}
