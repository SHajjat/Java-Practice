package DateTimeAPI_LAMBDA;

import java.util.ArrayList;

class C implements AIntro,BIntro {
	
	int i;
	public String run(){
	
	return null;
	}
	 public void hello(){
		 System.out.println("hello from C");
	}
	@Override
	public void run(int i){
		System.out.println(this);
		//super.wait(22,3);
	}
	 @Override
	public  void getName(){
		 System.out.println("C is asking for your name");
		 //System.out.printf("", super.clone());
	 }
	 @Override
	public void finalize(){
		 System.out.println("garb is running");
	}
	 public static void main(String[] args) {
		new C();
		 new C();
		 new C();
		 new C();
		 new C();
		 new C();
		 new C();
		 new C();
		 new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();new C();
		 
		 
			
		C c = new C();
		c.hello();
		BIntro.hello();
		AIntro.list.add(1);
		AIntro.list.add(3);
		c.finalize();
		c.finalize();
		//AIntro.list = new ArrayList<>(); all variables are final in interface
		 System.gc();
		 Runtime.getRuntime().gc();
		 AIntro CA = new C();
		 System.out.println(CA instanceof C);
		 System.out.println(((C)CA).i = 2);
		 System.out.println(((C)CA).i);
		 System.out.println(CA.i);
		 CA.getName();
		 System.out.println(CA instanceof C);
		 System.out.println(CA instanceof  d);
		 CA.getAddress();
		 CA.run(1);
		 
		 
		 
		 
	 }
	
	
		
	 }
	 

