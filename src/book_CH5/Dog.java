package book_CH5;

public class Dog {
	
public String name;
public String breed;
public int age;

public void writeOutPut() {
System.out.println("Name: "+name);
System.out.println("Breed: "+breed);
System.out.println("Age in calender years: "+age);
System.out.println("Age in human years: "+getAgeInHumanYears());
System.out.println();
}
public int getAgeInHumanYears() {
	
	int humanAge = 0;
	if (age <=2) {
		humanAge=age*11;
		
	}else {
		humanAge=22+((age-2)*5);
	}
return humanAge;	
}
	
}

