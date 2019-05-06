package homeWorks;

public class WhileNoBrackets {
public static void main(String[] args) {
	int sum = 0;
	while(sum==0)
		System.out.println(sum++);
	
	do
		System.out.println(1);
	while(sum==0);
}
}
