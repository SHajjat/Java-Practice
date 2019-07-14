package OCA.Testing;

import oca_Quizes.Static;

public class StringBuilderS {
	String s = this.toString();
	 String s1 =  String.valueOf('s');
	  static String s3 = String.valueOf(Boolean.TRUE);
	  
	
	public static void main(String[] args) {
		int [][] sam = {{1,2}, null};
		for (int i = 0 ; i<2 ; i++){
			for (int j = 0 ; j <2 ; j++){
				//System.out.println(sam[i][j]);
			}
		}
		StringBuilder sb = new StringBuilder("12345678");
		sb.setLength(5);
		sb.setLength(10);
		System.out.println(sb.length());
		String sb1 = "Sasasa";
		Object sb2 = "Sasasa";
		System.out.println(sb1.equals(sb2));
		System.out.println(StringBuilderS.s3);
		System.out.println(s3.replace('r','e'));
		boolean [] b1 = new boolean[2];
		System.out.println(b1[0] +""+ b1[1]);
		try{
		
		}finally {
		
		}
		
		
	}
}
