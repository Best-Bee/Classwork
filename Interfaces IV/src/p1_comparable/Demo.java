package p1_comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 4.0);
		Student s2 = new Student("Z", 2.5);
		Student s3 = new Student("M", 1.5);
		Student[] arr = {s1, s2, s3};
		
		//Arrays.sort(arr);
		
		//s1.compareTo(s2);
		//System.out.println(s2.compareTo(s2));
		//System.out.println(s1.compareTo(s2));
		//System.out.println(s2.compareTo(s1));
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println();
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		//sorts a list not an array (arrayList)
		Collections.sort(list);
		
		System.out.println(list);
		
		String str1 = "A";
		String str2 = "Z";
		String str3 = "M";
		
		String[] arr2 = {str1, str2, str3};
		Arrays.sort(arr2);
		
		System.out.println("\n" + Arrays.toString(arr2));
	}

}
