package p3_LinkedList_And_Iterators;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
//		list1.add(5);
		
//		Iterator<Integer> iter1 = list1.iterator();
//		iter1.forEachRemaining(n -> System.out.println(n));		//consumer, takes data, consumes it and does what you tell it to do
																//when you iterate from first to last, the "cursor" keeps track of where
																//it is so the second one cant do anything
		
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
//		System.out.println(iter1.next());
		
//		while (iter1.hasNext()) {
//			System.out.println(iter1.next());
//		}
		
//		ListIterator<Integer> iter2 = list1.listIterator();										
//		iter2.next();
//		iter2.set(10);											//changes the value at the cursor
//		iter2.previous();
//		
//		while (iter2.hasNext()) {
//			System.out.println(iter2.next());
//		}
	
		list1.add(1);
		list1.add(2);
		list1.add(3);											//if you add data afterwards, the iterator breaks
		list1.add(4);
		list1.add(5);
		
		ListIterator<Integer> iter2 = list1.listIterator();
		
		System.out.println(list1.contains(3));
		
//		while (iter2.hasNext()) {
//			System.out.println(iter2.next());
//		}		
		
//		for (Integer n: list1) {
//			System.out.println(n);
//		}

		System.out.println(list1);
		
	}

}
