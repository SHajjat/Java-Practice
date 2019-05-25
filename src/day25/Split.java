package day25;

public class Split {

	public static void main(String[] args) {
		
    String diceResult = "About 1,740,000,000 results (0.65 seconds) ";
    String sliced []=diceResult.split(" ");
    System.out.println(sliced[1]);

    
    String happy = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
    String happyArray []= happy.split("happy");
    String IArray []= happy.split("I");
    String allWords []= happy.split(" ");
    for (String happyPrint : allWords) {
    	System.out.println(happyPrint);
    	
    }
    String word = "java";
    char [] charsArray = word.toCharArray();
    for (char ch : charsArray) {
    	System.out.println(ch);
    }
    
    
    
    
    String test = " integer";
    System.out.println(test.contains("i"));
    
	}

}
