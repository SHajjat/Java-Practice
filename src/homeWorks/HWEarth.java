package homeWorks;
import java.util.*;
public class HWEarth {
	public static void main(String[] args) {
		   Scanner scan = new Scanner (System.in);
		   int num = scan.nextInt();
		   String print = num==1?printSunset():num==2?printEarth():num==3?printDesert():"";
		   System.out.println(print);
		   
		   
		   
		  }
		  
		  public static String printSunset()
		  {
		       String sunset=("_\\/_                 |                _\\/_\r\n" + 
			     		"/o\\\\             \\       /            //o\\\r\n" + 
			     		" |                 .---.                |\r\n" + 
			     		"_|_______     --  /     \\  --     ______|__\r\n" + 
			     		"1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
		  return sunset;}//end print_sunset
		  
		   public static String printEarth()
		  {
		    
			   String sunset=("22        _____\r\n" + 
			     		"    ,-:` \\;',`'-, \r\n" + 
			     		"  .'-;_,;  ':-;_,'.\r\n" + 
			     		" /;   '/    ,  _`.-\\\r\n" + 
			     		"| '`. (`     /` ` \\`|\r\n" + 
			     		"|:.  `\\`-.   \\_   / |\r\n" + 
			     		"|     (   `,  .`\\ ;'|\r\n" + 
			     		" \\     | .'     `-'/\r\n" + 
			     		"  `.   ;/        .'\r\n" + 
			     		"    `'-._____.");
			return sunset;
		    
		  }//print_earth
		  
		   public static String printDesert()
		  {
		   
			   String sunset=(" 33   .    _    +     .  ______   .          .\r\n" + 
			     		" (      /|\\      .    |      \\      .   +\r\n" + 
			     		"     . |||||     _    | |   | | ||         .\r\n" + 
			     		".      |||||    | |  _| | | | |_||    .\r\n" + 
			     		"   /\\  ||||| .  | | |   | |      |       .\r\n" + 
			     		"__||||_|||||____| |_|_____________\\__________\r\n" + 
			     		". |||| |||||  /\\   _____      _____  .   .\r\n" + 
			     		"  |||| ||||| ||||   .   .  .         ________\r\n" + 
			     		" . \\|`-'|||| ||||    __________       .    .\r\n" + 
			     		"    \\__ |||| ||||      .          .     .\r\n" + 
			     		" __    ||||`-'|||  .       .    __________\r\n" + 
			     		".    . |||| ___/  ___________             .\r\n" + 
			     		"   . _ ||||| . _               .   _________\r\n" + 
			     		"_   ___|||||__  _ \\\\--//    .          _\r\n" + 
			     		"     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" + 
			     		"_  ^      .  -    . \\.|");
			return sunset;
		    
		  }//end
		  
		  

}
