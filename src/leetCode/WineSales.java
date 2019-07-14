import java.util.*;

class WineSales {
	public String wineSeller(ArrayList<String[]> r) {
		String recipt = "";int totalPrice=0;
		for (String [] a : r){
			recipt+="*";
			recipt +=a[0];
			if(Integer.parseInt(a[2])>Integer.parseInt(a[3])){
				recipt+= a[2]+"quantity too big";
			}else{
				recipt+=" "+a[2]+" price:"+Integer.parseInt(a[1])*Integer.parseInt(a[2])+"\n";
			}
			totalPrice+=Integer.parseInt(a[1]);
			
		}
		
		return recipt+"\ntotal price:"+totalPrice;
		
	}//end wineSeller
	
	public static void main(String[] args)
	{
		WineSales m = new WineSales();
		ArrayList<String[]>  arr = new ArrayList<String[]>();
		arr.add(new String[]{"Rautour Viejo","20","100","200"});
		arr.add(new String[]{"Culung Garrafeira","30","10","9900"});
		arr.add(new String[]{"Lirnolon Sec","200","2","1"});
		
		String recipt = m.wineSeller(arr);
		System.out.print(recipt);
		//  should output:
		// *Rautour Viejo 100 price:2000
		// *Culung Garrafeira 10 price:30
		// *Lirnolon Sec 2 quantity too big
		
		// total price:2030
		
		
	}//end main
}