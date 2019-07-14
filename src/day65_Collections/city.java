package day65_Collections;

import java.util.Objects;

public class city {// you can use class like this to see how many unique inputs
	//override hashCode and equals (for objects) and then add to Set -> if you dont you dont override Set will not know
	//if they are equal or not
	//these methods are used to find out if 2 objects are really equal based on instance variable values
	private String name;
	
	public city(String name ){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "city{" + "name=" + name + '}';
	}
	
	@Override
	public boolean equals(Object o) {
		if ( this == o ) return true;
		if ( o == null || getClass() != o.getClass() ) return false;
		city city = (city) o;
		return Objects.equals(name, city.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
