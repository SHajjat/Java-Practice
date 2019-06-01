package book_CH8;

public class Undergradute extends Student {
	private int level ;
	public Undergradute(){
		super();
		this.level = 1;
	}
	public Undergradute(String name , int studentNumber , int level){
		super (name , studentNumber);
		setLevel(level);
	}
	
	public void reset(String name , int studentNumber , int level){
		reset(name , studentNumber); // use student's reset because there is no method in reset that takes only two para (Overloading)
		setLevel(level);
	}
	
	public int getLevel(){
		return level;
	}
	public void setLevel(int level) {
		if ( level > 0 && level < 5 ) {
			this.level = level;
			System.out.println("Level set, thank you");
		}else{
			System.out.println("Illegal level! please set a correct level");
			setLevel(new java.util.Scanner (System.in).nextInt());
		}
	}
	public void writeOutput(){
		//super.writeOutput();
		System.out.println("Student name"+getName());
		System.out.println("Student number "+getStudentNumber());
		System.out.println("Student level: "+level);
	}
	public boolean equals(Undergradute otherUndergraduate){
		return equals( (Student) otherUndergraduate )&& (this.level == otherUndergraduate.level);
		// casting otherUndergraduate to Student class
	}
}
