package book_CH8;

public class Student extends Person{
	private int studentNumber;
	public Student(){
		super();
		studentNumber = 0;
	}
	public Student(String name , int studentNumber){
		this(name);
		this.studentNumber = studentNumber;
	}
	public Student(String name){
		setName(name);
		studentNumber=0;
	}
	public void reset(String name , int studentNumber){
		setName(name);
		this.studentNumber = studentNumber;
	}
	public int getStudentNumber(){
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber){
		this.studentNumber = studentNumber;
	}
	
	public void writeOutput(){
		//System.out.println("Name: "+getName()); instead we can say
		super.writeOutput();// this will call the writeOutPut method is parent class
		System.out.println("Student number: "+studentNumber);
	}
	public void writeOutput(String a){
		this.writeOutput();//this work the same way as Constructor this, it goes to the writeOutput in the same Class
		
	}
	
	public boolean equals(Student otherStudent){
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	}
	public String getName(String title){
		return title+" "+getName();
	}
	
	//first try at an improved equals method
//	public boolean equals(Object otherObject){
//		Student otherStudent = (Student) otherObject;
//		return this.hasSameName(otherStudent) && (this.studentNumber = otherStudent.studentNumber)  && otherStudent instanceof Student;
//	}
	
	//second try with instanceof
	public boolean equals(Object otherObject) {
		boolean isEqual = false;
		
		if ( (otherObject != null) && otherObject instanceof Student ) {
			Student otherStudent = (Student) otherObject;
			isEqual = super.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
		}
		return isEqual;
	}
	
	public String toString (){
		return "Name: "+getName()+"\nStudent number: "+studentNumber;
	}
	
}
