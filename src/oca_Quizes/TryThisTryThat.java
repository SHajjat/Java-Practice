package oca_Quizes;

public class TryThisTryThat {
	
	int amout;
	TryThisTryThat(int amout){
		this.amout = amout;
	}
	
	String myStr = "7007";
	public void doStuff(String str){
		int myNum =0;
		try{
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		}catch (NumberFormatException e){
			System.out.println("Error");
		}
		System.out.println("myStr: "+myStr + ", myNum : ");
	}
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		//String str2 = str1; relocating the memory location to str2
		//String str2 =new String(str1); telling it to create new String using str1
		//String str2 = sb1.toString(); make a copy
		String str2 ="Duke";
		System.out.println(str1 == str2);
		String a = "  hello worlds";
		a =a.trim();
		a =a.replace("s","");
		System.out.println(a);
		
	}
}
