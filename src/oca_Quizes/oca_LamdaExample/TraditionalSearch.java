package oca_Quizes.oca_LamdaExample;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false,true));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		print(animals , new CheckIfHopper());
		//print(animals , new CheckIfHopper())
		
		}
		
		private static void print(List<Animal> animals , CheckTrait checker){
		for (Animal animal : animals) {
//			if ( checker.test(animal) )
//				System.out.println(animal + " ");
//		else if (checker.testSwim(animal))
//				System.out.println(animal + " can swim");
//
			
		}
		}
	}

