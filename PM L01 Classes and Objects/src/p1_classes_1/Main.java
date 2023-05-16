package p1_classes_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Student student1 = new Student(); // default constructor
//		student1.setName("John");
//		student1.setGpa(4.0);
//		student1.setAge(22);
//		System.out.println(student1.getName());
//		System.out.println(student1.getGpa());
//		System.out.println(student1.getAge());
//		
//		System.out.println();
//		
//		Student student2 = new Student();
//		student2.setName("Jane");
//		student2.setGpa(3.0);
//		student2.setAge(20);
//		System.out.println(student2.getName());
//		System.out.println(student2.getGpa());
//		System.out.println(student2.getAge());
//		
//		System.out.println();
//		
//		
//		System.out.println("Before:");
//		System.out.println(student1.getMajor());
//		student1.setMajor("IT");
//		System.out.println("After:");
//		System.out.println(student1.getMajor());
//		
//		System.out.println(student2.getMajor());
//		student2.setMajor("ENGLISH");
//		System.out.println(student1.getMajor());
		
		Student s3 = new Student("Jose", 3.5, 23);
		Student s5 = new Student("Joan", 22, 4.0);
		System.out.println(s3.toString());
		System.out.println(s5);
		
//		System.out.printf("%-10S%10S%10S%10S%n", "NAME", "gpa", "AGE", "Major");
//		System.out.printf("%-10s%10.2f%10d%10S%n", s3.getName(), s3.getGpa(), s3.getAge(), s3.getMajor());
		
//		Student s4 = new Student("Jose");
//		System.out.printf("%-10s%10.2f%10d%10S%n", s4.getName(), s4.getGpa(), s4.getAge(), s4.getMajor());
//		Scanner scanner = new Scanner(System.in);
	}

}
