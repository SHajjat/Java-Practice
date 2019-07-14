package day63_exceptionHandling02;

public class OrCatchBlock {
	public static void main(String[] args) throws Throwable{
		String str = null;
		try {
			Object str2 = (String) ("" + str.indexOf(10) / 0);
			throw  new RuntimeException();
		} catch (IndexOutOfBoundsException | NullPointerException a) {
			System.out.println(a.getClass().getSimpleName());
			a.printStackTrace();
			
		}
	}
}
	

