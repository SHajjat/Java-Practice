package test;

public class IncrementTest {
	public int i = 0;
	public int j = 0;

	public int method1() {
		i++;
	int num= 8;
		return num;
	}

	public int method2() {
		j++;
		int num= 9;
		return num;
	}

	public void printCounters() {
		System.out.println("i = " + i + " j = " + j);
	}

}
