package oca_Quizes.oca_LamdaExample;

public class CheckIfHopper implements CheckTrait{
	public boolean test(Animal a){
		return a.canHop();
	}
	public boolean testSwim(Animal a){
		return a.canSwim();
	}
}
