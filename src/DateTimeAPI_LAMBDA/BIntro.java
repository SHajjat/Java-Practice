package DateTimeAPI_LAMBDA;

 public  interface BIntro {
	int i =0;
	String s = "hello";
	
	String run();
	 static void hello(){ System.out.println("hello from BIntro");}
	default void getName(){
		System.out.println("BInto is asking for your name");
		System.out.println(this);
	}
	default void getAddress(){
		System.out.println(this);
		///this.statocally(); cant use this to access static method in interface
		BIntro.statically();
	}
	 static void statically(){
		 System.out.println("Satatic ");
	 }
}
