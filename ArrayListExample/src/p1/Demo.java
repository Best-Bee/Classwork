package p1;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// Used to store objects ONLY
		// Do Integer instead of int, Double instead of double, etc.
		// Meant to store data of the same type (can't have Integer and String)
		// ArrayList list1 = new ArrayList<>(); can store any data
		// ArrayList is 10 by default then it expands and shrinks as necessary
		// One disadvantage is that it's slower
		// You can specify the initial size in the second <> if you know
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("list1 = " + list1);
		System.out.println();
		
		list1.add(2,20);
		System.out.println("list1 = " + list1);
		System.out.println("list1[2] = " + list1.get(2));
		System.out.println();
		
		list1.add(10);
		list1.set(1, 15);
		System.out.println("list1 = " + list1);
		System.out.println("Size = " + list1.size());
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(60);
		list2.add(70);
		list2.add(80);
		System.out.println("list2 = " + list2);
		System.out.println();
		
		list1.addAll(list2);
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));
		System.out.println();
		
		
		list1.removeAll(list2);
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2));
		System.out.println();
		
		System.out.println("list1.size() = " + list1.size());
		list1.ensureCapacity(1000);
		System.out.println("list1.size() = " + list1.size());
		System.out.println();
		
		
		list1.forEach(t -> System.out.println(t*t));
		System.out.println();
		
		list1.removeIf(t -> t.equals(new Integer(15)));
		System.out.println("list1 = " + list1);
		System.out.println();
		
		list1.removeIf(t -> t % 5 == 0);
		System.out.println("list1 = " + list1);
		System.out.println();
		
		list1.add(9);
		list1.add(4);
		list1.add(8);
		list1.add(2);
		System.out.println("list1 = " + list1);
		System.out.println();
		
		Collections.sort(list1);
		//list1.sort(); also works
		System.out.println("list1 = " + list1);
		System.out.println();
		
		/*
		 * This is how to sort an ArrayList of Student objects by Gpa
		 * put a - in front of Double.compare(...) to inverse the sort
		 * 
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return Double.compare(o1.getGpa(), o2.getGpa());
			}
		});
		
		Collections.sort(list, (o1, o2) -> Double.compare(o1.getGpa(), o2.getGpa()));
		*/
	}

}
