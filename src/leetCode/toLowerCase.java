package leetCode;

public class toLowerCase {
	public String toLowerCase(String str) {
		// return str.toLowerCase();
		String str2="";
		for (int i = 0 ; i < str.length() ; i++){
			if (str.charAt(i) >=65 && str.charAt(i) <= 90 ){
				str2 += (char)(str.charAt(i)+32);
			}else{
				str2+=str.charAt(i);
			}
		}
		return str2;
		
	}
	}

