package oca_Quizes;

import java.lang.reflect.Array;
import java.util.ArrayList; // need to import for ArrayList
import java.util.List;// need to import for List
//a “class” named E. Don’t worry—it isn’t really a class. E is used by convention in generics
//to mean “any class that this array can hold.”
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		list1.add("String");
		list1.add(1);// take it as a string
		//list.add('c');doesnt work
		System.out.println(list1);
		List<String> list4 = new ArrayList<>();//compiles
		// ArrayList <String> list5 = new List<>(); (doesnt compile), you can store List in ArrayList but not the other way arround
		
		//***add()***
		/*
		
            boolean add(E element)
            void add(int index, E element)
            Don’t worry about the boolean return value. It always returns true.
           It is there because other classes in the collections family need a return value in the signature when adding an element.
		 */
		
		ArrayList list = new ArrayList();
		list.add("hawk");
		System.out.println(list);//[hawk]
		
		list.add(Boolean.TRUE); // interesting , since its an object it can also take true and false
		System.out.println(list);
		System.out.println(Boolean.valueOf(1!=1));//keep this in mind , you need to go through methods for Wrappers
		//It then does the same thing for the boolean. This is okay because we didn’t specify a type for ArrayList;
		// therefore, the type is Object, which includes everything except primitives
		ArrayList <String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE); doesnt compile since we told the ArrayList to only take String object
		System.out.println(safer);
		
		List <String> birds = new ArrayList <>();
		birds.add("hawk");// [hawk]


 
		birds.add(1,"robin");// [hawk, robin]
		birds.add(0,"blue jay");// [blue jay, hawk, robin] ****insert not replace***
		birds.add(1, "cardinal");// [blue jay, cardinal, hawk, robin]
		System.out.println(birds);// [blue jay, cardinal, hawk, robin]
		birds.add(4,"7amam"); //[blue jay, cardinal, hawk, robin, 7amam]
		System.out.println(birds);
		//birds.add(6, "will it work?") it didnt work since its more than length ,
		// the last element you can add to is length since it will add there anywa
		System.out.println(birds.add("la8la8")); // this returns true :) always
		
		
		//***remove();***
		//The remove() methods remove the first matching value in the ArrayList or remove the element at a specified index.
		birds.remove(1);//cardinal is removed
		birds.remove("7amam");// 7amama is removed
		birds.remove("samir"); // nothing is remove since samir is not a bird lol
		System.out.println(birds.remove("samir"));//false
		System.out.println(birds.remove("hawk"));//true
		System.out.println(birds);
		System.out.println(birds.remove(0));// if you put index it prints what it removed from the list
//		Removes the element at the specified position in this list (optional
//		operation).  Shifts any subsequent elements to the left (subtracts one
//		from their indices).  Returns the element that was removed from the list.
		
		
		//***set()***
		//The set() method changes one of the elements of the ArrayList without changing the size.
		
		List <String> asfoor = new ArrayList<>();
		asfoor.add("hawk");
		System.out.println(asfoor.size());//1
		System.out.println(asfoor.set(0,"hamama"));// return what was replaced
		asfoor.add("hawk");
		asfoor.set(0,"");
		asfoor.set(1,"");
		
		//asfoor.set(2,"hamama"); will not compile since there is not index 2
		
		//*** isEmpty() and size()***
		//The isEmpty() and size() methods look at how many of the slots are in use.
		
		System.out.println(birds.isEmpty());//false
		System.out.println(asfoor.isEmpty());//false
		System.out.println(asfoor);//[, ]
		System.out.println(asfoor.size()); //2
		asfoor.remove(1);// need remove to clear just setting it to "" is not enough
		asfoor.remove(0);
		System.out.println(asfoor.isEmpty());//true now :)
		System.out.println(asfoor.size());//0
		
		
		//***clear();***
		//it is a void method
		//ArrayList<Integer> inter = new ArrayList<>(Array.asList(1,2,3)); doesnt work
		List <String> strss = new ArrayList<>();
		strss.add("1");strss.add("sasa");strss.add("232");
		System.out.println(strss);
		strss.clear();
		System.out.println(strss);
		System.out.println(strss.isEmpty());//true
		System.out.println(strss.size());// size 0
		//System.out.println(strss.clear()); since its void this will fail :)
		
		
		//***contains()***
		//The contains() method checks whether a certain value is in the ArrayList. The method signature is as follows:
		//boolean contains(Object object)
		
		ArrayList <String> cont = new ArrayList<String>(19);
		cont.add("1");cont.add("ss");cont.add("sss");cont.add("fff");
		System.out.println(cont.contains("f"));//false
		System.out.println(cont.contains("fff"));//this is true it has to have all elements in the same index
		//This method calls equals() on each element of the ArrayList to see whether there are any matches.
		// Since String implements equals(), this works out well.
		
		//***equals()***
		//ArrayList has a custom implementation of equals()
		// so you can compare two lists to see if they contain the same elements in the same order.
		List <String> one = new ArrayList<>();
		List <String> two = new ArrayList <>();
		System.out.println(one.equals(two));
		one.add("a");
		System.out.println(one.equals(two));
		System.out.println(one.equals((two.add("a")))); //false since the return is true and it doesnt equal two
		
		List <Boolean> boo1 = new ArrayList<>();
		List <Boolean> boo2 = new ArrayList<>();
		boo1.add(Boolean.TRUE);
		System.out.println(boo1.equals(boo2.add(Boolean.TRUE)));//still false, intresting
		System.out.println(boo2.add(Boolean.TRUE));//this is true
		
		
		//**Other methods***
		/*
		one.addAll(two) add all Array element in two to the end of one
		one.replaceAll(two); replace all elements in in one with elements in two
		 */
		two.add("b");
		two.add("a");
		System.out.println(one);
		System.out.println(two);
		//one.replaceAll(two); cant be done to List
		System.out.println(one);
		System.out.println(two);
		ArrayList<String> test1 = new ArrayList<>();
		ArrayList<String> test2 = new ArrayList<>();
		test1.add("!");
		test1.add("2");
		test2.add("s");
		test1.add("s");
		test2.add("!");
		test1.removeAll(test2);
		System.out.println(test1);//remove all test2 elements in test1
		System.out.println(test2);
		
		
	
	}
}
