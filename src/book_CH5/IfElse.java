package book_CH5;

public class IfElse {
	public static void main(String[] args) {
		boolean flag =true;
		if (flag)   //1
			if (flag)   //2
				if (flag)   //3
					System.out.println("False True");
				else        //4
					System.out.println("True False");
			else        //5
				System.out.println("True True");
		else        //6
			System.out.println("False False");
		
		Boolean [] bool = new Boolean[2];
		bool [0] = new Boolean((Boolean.parseBoolean("true")));
		bool [1] = new Boolean(null);
		System.out.println(bool[0] + " "+bool[1]);
		System.out.println(Boolean.valueOf(null));
	}
}
