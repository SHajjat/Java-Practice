package day64_Collections01;

import java.util.Stack;

/*
Stack -> LIFO -> Last In - First Out
Extends Vector.
it is also Syncronized
 */
public class StackBrah {
	public static void main(String[] args) {
		Stack <Integer> numsStack = new Stack<>();
		numsStack.add(50);
		numsStack.push(60);
		numsStack.push(70);
		System.out.println(numsStack);
		System.out.println(numsStack.peek());//find the one on top (last)
		System.out.println(numsStack.pop());//read value on top of stack then remove it from there
		System.out.println(numsStack);
		System.out.println(numsStack.search(60));
		System.out.println(numsStack.search(70));
		System.out.println(numsStack.get(0));
		System.out.println(numsStack.clone());
	
	}
}
