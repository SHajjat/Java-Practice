package day49_inheratent_2;
import day49_inheratent.*;

//           IPad IS_A    Device
public class IPad extends Device {
	public void readEbook(String title){
		System.out.println("reading a book "+title+"using "+brand+" tablet");
		System.out.println(model);
		
		
	}
}
