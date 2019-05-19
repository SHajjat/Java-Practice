package oca_Quizes;

import javax.swing.text.html.ObjectView;

public class OverLoading {
	int x ;
	long y;
	short z;
	public OverLoading (int x ){
		this.x = x;
	}
	public OverLoading ( long y){
		this.y = y;
	}
	public OverLoading(short z){
		System.out.println("this is a short");
	}
	public void fly (long y){
		System.out.println("this is a long ");
	}
	public void fly(int x ){
		System.out.println("this is an int");
	}
	
	public void fly(){
	
	}
	
	public static void main(String[] args) {
		long x =2000L;
		OverLoading fly1 = new OverLoading(x);
		fly1.fly(x);
		OverLoading fly2 = new OverLoading((short) 3);
		
		
	}
}
