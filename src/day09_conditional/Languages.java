
package day09_conditional;

public class Languages {
	public static void main(String[] args) {
		int option = 3;
		// if it 1 its english
		// if its 2 its spanish
		//if its 3 its french
		//if its 4 its Turkish
		if (option == 1)
			System.out.println("Hello");
		else if (option == 2)
			System.out.println("hola");
		else if (option ==3)
		System.out.println("bonjour");
		else if (option == 4)
			System.out.println("Mar7aba");
		else
			System.out.println("yzm msh fahem 3leek yzm");
		
		switch ( option) {
		case 1 : option =1;
		System.out.println("Hello");
		break;
		case 2 : option = 2;System.out.println("hola");
		break;
		case 3 : option = 3;System.out.println("bonjour");
		break;
		case 4 : option = 4; System.out.println("mar7aba");
		break;
		
			
		}
			
	}

}
