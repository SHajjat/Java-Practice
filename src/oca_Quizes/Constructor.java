package oca_Quizes;

public class Constructor {
	private String color;
	private int weight;
	private char sex;
	
	public Constructor(int weight){
		new Constructor(weight, color);
		
		
	}
	public Constructor(int weight, String color){
		//hello hello it works if its a comment only
		this(weight,color, 'f');
		this.weight = weight;
		this.color = color;
	}
	public Constructor(int weight, String color, char sex){
		
		this.weight= weight;
		this.color = color;
		this.sex = sex;
	}
	
	public static void main(String[] args) {
		Constructor cont = new Constructor(34);
		System.out.println(cont.weight);//zero
		System.out.println(cont.color);//null
		//so if you call a constructor with new word it will give you defualt.
		
		Constructor cont2 = new Constructor(3, "White");
		System.out.println(cont2.weight);//3     becuse we used this(int , String , char) we got what we wanted which is
		System.out.println(cont2.color);//white  // a defualt value for sex
		System.out.println(cont2.sex);//f
		
	}
}
