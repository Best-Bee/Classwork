package p4_Generic_Methods;

import java.util.Arrays;
import java.util.Comparator;

public class DemoGenericMethods {

	public static void main(String[] args) {
		Integer[] a1 = {1,3,4,5,6};
		Character[] a2 = {'a','e','c','d'};
		Student[] a3 = {new Student("B", 1.6), new Student("A", 4.0), new Student("C", 2.0)};
		
//		showIntegerArray(a1);
//		showIntegerArray(a2);		*can't do, wrong type
//		showCharacterArray(a2);
		
//		showArray(a1);				//Erasure (placeholder gets replaced during compilation)		
//		showArray(a2);
//		showArray(a3);
		
		showArray(a3);				//Show array, sort it and show it again
		//Arrays.sort(a3);	
		
//		Arrays.sort(a3, new Comparator<Student>() {					//implement the whole compare method and sort by gpa
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o1.getGpa(), o2.getGpa());
//			}
//		});
		
		Arrays.sort(a3, (Student o1, Student o2) -> {				//same thing as the previous one but way shorter and simpler
			return Double.compare(o1.getGpa(), o2.getGpa());		//lambda expression
		});
		
		showArray(a3);
		
	}
	public static void showIntegerArray(Integer[] a) {
		for (Integer i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void showCharacterArray(Character[] a3) {
		for (Character c: a3) {
			System.out.print(c+ " ");
		}
		System.out.println();
	}

//	public static <E> void showArray(E[] a) {			//Generics, E is a placeholder for a data type (must be a class not a primitive)
//		for (E e: a) {									//E stands for element so it would read as Element Array, otherwise use T for Type 
//			System.out.print(e + " ");					//can use anything you want though
//		}
//		System.out.println();
//	}
	
//	public static <E1,E2> void showArrays(E1[] a1, E2[] a2) {		//Can use multiple arguments to print or mix multiple arrays
//		for(E1 e: a1) {												//*Me noticing that E can have a number after it* boutta use 621
//			System.out.println();
//		}
//	}
	
//	public static <E extends Number> void showArray(E[] a) {		//Example of upper bound constraint, only a1 would work in this case
//		for (E e: a) {												//Works for Floats, Longs, Shorts, Integers, Doubles, etc.
//			System.out.print(e + " ");								//Called upper bound because the upper bound is Number, all classes
//		}															//under Number are allowed
//		System.out.println();
//	}
	
	public static <E extends Comparable> void showArray(E[] a) {	//a2 and a1 would be fine here because all arrays implement it
		for (E e: a) {												//However, if you do implement it in it will be allowed as well
			System.out.print(e + " ");								//Extends represents  normally, in generics it's very different
		}															//it doesn't look at the thing it extends, just makes sure the 
		System.out.println();										//thing being used is a subclass of it
	}
	
	
}
