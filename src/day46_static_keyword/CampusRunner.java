package day46_static_keyword;

public class CampusRunner {
	public static void main(String[] args) {
//		Campus campus1 = new Campus("new york");
//		Campus campus2 = new Campus("Mclean");
//		Campus campus3 = new Campus("hawai");
		Campus.CampusInfo();// even if i only have this method running static initialator will always run time
		
		float y = 4.555555f;
		System.out.printf("the value equals $%2.4f", y);
		System.out.printf(" \n  samir \t abdullah ");
		
	}
}
