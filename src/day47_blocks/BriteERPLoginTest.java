package day47_blocks;
import static day47_blocks.BriteERP.*;//static import
import static day47_blocks.BriteERP.hello;

import day46_static_keyword.Campus;

public class BriteERPLoginTest {
	public static void main(String[] args) {
		BriteERP.enterEmail();
		BriteERP.enterPassWord();
		BriteERP.verifyLogin();
		enterEmail();
		enterPassWord();
		verifyLogin();
		System.out.println(hello);
		
	}
}
