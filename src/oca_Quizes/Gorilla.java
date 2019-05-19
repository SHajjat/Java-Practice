package oca_Quizes;

public class Gorilla {
	public static int count=0;
	public static void addGorilla(){count++;}
	public void babyGorilla (){count++;} // instatnt variable (non static)
    public void announceBabies(){
		addGorilla();
		babyGorilla();
	}
	public static void announceBabiesToEveryOne(){
		addGorilla();
		//babyGorilla() cant call a nonstatic to static
	}
	public  int total=0;// if total was static average down there will work
	//public static int average = total/count; // static method (average is trying to call non static total
}
