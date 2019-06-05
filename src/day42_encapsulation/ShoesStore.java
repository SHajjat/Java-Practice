package day42_encapsulation;
import java.util.*;
public class ShoesStore {
	public static void main(String[] args) {
		Shoes shoe1 = new Shoes();
		
		shoe1.setShoesData("ALDO", 6.5);
		System.out.println(shoe1.getShoesData());
		
		
		
		Shoes [] shoesA = new Shoes[3];
		
		Shoes shoe2 = new Shoes();
		shoe2.setShoesData("Allen Edmonds", 7.5);
		
		Shoes shoe3 = new Shoes();
		shoe3.setShoesData("BOSS HUGO BOSS", 9);
		//setting the location in the array to 
		shoesA[0] = shoe1;
		shoesA[1] = shoe2;
		shoesA[2]= shoe3;
		
		
		System.out.println(shoesA[0].getShoesData());
		System.out.println(shoesA[1].getShoesData());
		System.out.println(shoesA[2].getShoesData());
		System.out.println(shoesA[0].brand);//ALDO
		
		
		//ArrayList of Shoes
		
		ArrayList<Shoes> myShoes = new ArrayList <>();
		myShoes.add(shoe1);
		//myShoes.add((new Shoes ()).setShoesData("Samir", 13));
		myShoes.add(shoe2);
		myShoes.add(shoe3);
		System.out.println(myShoes.get(0).getShoesData());
		System.out.println(myShoes.get(1).getShoesData());
		System.out.println(myShoes.get(0).size);
		
		//if you want to save one of them to another variable it has to be the same type
		
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData());
		
		//lets use for each loop to print data for each shoes
		System.out.println("***********************");
		for (Shoes shoe : myShoes) {
			System.out.println(shoe.getShoesData());
		}
		// print the name of all shoes with size more than 7
		System.out.println("***********************");
		for (Shoes shoe : myShoes) {
			if (shoe.size>7.0) {
				System.out.println(shoe.brand);
			}
		}
		
		
		}

}
