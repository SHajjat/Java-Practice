package day07_scanner_something;

public class PreandPost2 {

	public static void main(String[] args) {
		int messages =10;
		messages++;//11
		++messages;//12
		System.out.println("Messages: " +messages);
        int readMessages= --messages;
        System.out.println("read mess" + readMessages);
        System.out.println("messa "+messages);
        
        int unreadmess = readMessages--;
        System.out.println("unreadmess : "+unreadmess);
        System.out.println("readMessages"+ readMessages);
        int total = unreadmess++ - readMessages--;
        System.out.println("unreadmess : "+unreadmess);
        System.out.println("readMessages : "+ readMessages);
        System.out.println("total : "+ total);
        
        
        int count = 20;
        int count2 = 10 ; 
        int totalCount = ++count + --count2;
        System.out.println("count : " + count);
        System.out.println("count2 : " + count2);
        System.out.println("total count : " + totalCount);
        
        int myCount = count++ + ++count;
       
        System.out.println(myCount);
        System.out.println(count);
        
	}

}
