package day53_inheritance06;
//1)extends object is added since city does not inherit from any other class
//2)default constructor with no args and it will add super() with no arg
//3) it will add default values to id and name
//4) it will import java.lang.*; is added by compiler , system , String Integer etc classes come from that package
//thats why we never have to import the manually
//aytomatically imported by compiler
public class City {
	private int id;
	private String name;
	public int count=100;
	
	public City(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	
	public String toString(){
		
		return "id: "+id+" name: "+name;
	}
	
	@Override
	public boolean equals( Object obj ) {
		City anotherCity = (City) obj;
		return anotherCity.id == this.id && (anotherCity.name).equals(this.name);
		//another method from object class is hashCode() it always return an int. unique int for each
		//how ever two objects might have the same code like fooo8
		
		//this value is normally used by HashSet, HashMap , HashTable , data structures
		
		//to effieciently look up an element and manipulate them.
		
		//Hashing ==> is like giving a unique id for a group of objects . it is always an int by default.
		// we will discuss it more in structures class.
		
		//hashCode + equals methods are friends with benefits
	}
		@Override
		public int hashCode(){ return id + name.length();}
	
}
