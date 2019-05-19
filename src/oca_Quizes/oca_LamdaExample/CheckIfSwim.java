package oca_Quizes.oca_LamdaExample;

public class CheckIfSwim implements CheckTrait {
	public boolean testSwim(Animal a){
		return a.canSwim();
	}
	public boolean test(Animal a){
		return a.canHop();
	}

}
