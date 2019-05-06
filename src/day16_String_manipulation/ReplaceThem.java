package day16_String_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentance = "Coding is fun";
		sentance =sentance.replace("fun", "suck").replace("is", "does").replace(" ", " ");
		System.out.println(sentance);
		System.out.println(sentance.replaceAll("c", "char"));
		
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&", "").replace("^","")
				.replace("@","").replace("#","").replace("-","").replace("$", "")
				.replace("|","");
		System.out.println(mixed);
		
		
		String result = "About 6,910,000 results (0.68 seconds) ";
		result = result.replace("About ","");
		result = result.substring(0,result.indexOf(" "));
		//result = result.replace("results","");
		result = result.replace(",", "").replace(" ", "");
		System.out.println(result);
		int results = Integer.parseInt(result);
		System.out.println(results);
		results+=1;
		System.out.println(results);
		
		
	
		
	}

}
