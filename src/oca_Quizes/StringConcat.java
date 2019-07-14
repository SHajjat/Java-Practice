package oca_Quizes;

public class StringConcat {
	public static void main(String[] args) {
		String [] strs = new String[2];
		int indx =0;
		for (String s :strs){
			strs[indx]+=(" element "+indx);
			indx++;
		}
		for (indx = 0 ; indx <strs.length;indx++){
		System.out.println(strs[indx]);
	}}
}
