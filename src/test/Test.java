package test;
import oca_Quizes.Acc;
public class Test extends Acc {
	public static void main(String[] args) {
		Acc obj = new Acc();
		//obj.s;
		System.out.println(obj.s);
		Test ex = new Test();
		int cardNo =12344;
		ex.checkCard(cardNo);
		//ex.readCard(cardNo);
	}
	void readCard (int cardBo) throws Exception{
		System.out.println("reading Card");
	}
	void checkCard(int cardNo)throws  RuntimeException{
	
	}
	
}
