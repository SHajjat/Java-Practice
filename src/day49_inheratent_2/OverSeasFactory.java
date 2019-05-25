package day49_inheratent_2;

import day49_inheratent.*;

//import  day49_inheratent.*;// importing a differant package
public class OverSeasFactory extends Device {
	
	
	public static void main(String[] args) {
		day49_inheratent.Device dv = new day49_inheratent.Device();
		dv.brand="Samsung";
		//System.out.println(model); whyyy????????
		OverSeasFactory over = new OverSeasFactory();
		//System.out.println(sover.model);
		Device dev = new Device();
		//dev.model is not here because protected cant be access by the Super class it come from only by subclass
		
		
		
		
	}
	{System.out.println(model);}
	
}
