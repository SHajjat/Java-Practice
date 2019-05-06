package day39_ArrayList04;
import java.util.*;
public class Cities {
	public static void main(String[] args) {
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zu");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
       String str="";
        for (String city : cities) {
        	str +=(city+"|");
        }
       System.out.println(str.substring(0,str.length()-1));
       str="";
       
       for (int i = 0 ; i<cities.size() ; i++) {
    	  cities.set(i, cities.get(i).toUpperCase());   
       }
       System.out.println(cities);
       
       for (String Temp : cities) {
    	   cities.set(cities.indexOf(Temp), cities.get(cities.indexOf(Temp)).toLowerCase()); 
       }  
    System.out.println(cities);
    	   
    	   
    	   
       
       //find the shortest and the longest;
    
      int longest = 0, shortest = Integer.MAX_VALUE;
      String lonCity ="",shotCity=cities.get(0);
       for (String city : cities) {
    	   lonCity = lonCity.length()>city.length()?lonCity:city;
    	   shotCity = shotCity.length()<city.length()?shotCity:city;
    	   
       }
       System.out.println(lonCity);
       System.out.println(shotCity);
       
       
       
       ArrayList <String> citiesMoreThan6= new ArrayList<>();
       for (String city : cities) {
    	   citiesMoreThan6.add(city.length()>6?city:"");
    	   citiesMoreThan6.remove("");
       }
    	 System.out.println(citiesMoreThan6);  
       }
       
       
	}

	
	

