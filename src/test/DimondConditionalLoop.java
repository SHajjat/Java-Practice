package test;

public class DimondConditionalLoop {
		
		public static void main(String[] args) {
			String dimond = "", star = "*", space = " ", nextLine = "\n";
			for(int i=-1; i<=41; i++) {
				if (i < 2||(i>3&&i<6)||i == 10||i==25||(i>31&&i<=33)||(i>37&&i<41))
					dimond += space;
				else if (i==3||i == 9||i == 16||i==31||i==37||i == 24)
					dimond += nextLine;
				else if (i==2||i < 9||i < 16||i < 24||(i>25&&i<31)||(i>33&&i<37)||i==41)
					dimond += star;
			} 
			System.out.print(dimond);
		}

}
