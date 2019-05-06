package day08_casting_conditional;

public class ExplicitCasting {
public static void main(String[] args) {
System.out.println(10/2.0);	//result is double it always take bigger container , if its with double double win
System.out.println(10.0/2);
int result = (int)(10/2.0); //oooor = 10/ (int)2.0;
int rent1 = 987;
int rent2 = 1100;
int rent3 =894;
int rent4 = 1234;
double avg = ((rent1+rent2+rent3+rent4)/4.0);//if you dont convert one of to double the result will be 1053
System.out.println(avg);
double d = 50.2;
int bee = (byte)d;//you have implicit an explicit converting first the double is changed to byte then byte is changed int
System.out.println(bee);
//explicit : from double ===> byte
//implicit : from byte ===> int

}
}
