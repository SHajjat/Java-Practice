package oca_Quizes;

public class Kangaroo extends Marsupial{
	public  boolean isBiped(){
		return true;
	}
	public void getKangarooDescription(){
		System.out.println("kangaroo hops on two legs :"+ isBiped());
	}
}
