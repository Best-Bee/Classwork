package p3;

public class Demo {

	public static void main(String[] args) {
		Name name1 = new Name("Alan", "Smith"); // name1 is a reference variable, holding memory address
		Name name2 = new Name("Jose", "Smith"); // name2, name3, name4
		Name name3 = new Name("Bill", "Smith");
		Name name4 = name1;
		Name name5 = new Name(name1.getFirstName(),name1.getLastName());
		
		// primitive variables, not holding memory address instead they hold data
		int number = 10; // 4 bytes
		double gpa = 4.0; // 8 bytes
		boolean isHot = true;
		// long, short, float, byte, char
		
		int number2 = number;
		
		// dicotomy
		
		
		System.out.println(name1 == name4);
		System.out.println(name1);
		System.out.println(name4);
		name1.setFirstName("Zack");
		System.out.println(name4.getFirstName());
		System.out.println(name1);
		System.out.println(name4);
		System.out.println(name5);
		
		
		
		
		
//		Course c1 = new Course("CSE110", "CS College Seminar", 1);
//		Course c2 = new Course("CSE118", "Intro to Programming", 3);
//		Course c3 = new Course("CSE148", "OOP", 4);
//		Course[] arr1 = {c1};
//		Course[] arr2 = {c1, c3};
//		Course[] arr3 = {c1, c2, c3};
//		
//		Student s1 = new Student(name1, arr1);
//		Student s3 = new Student(name3, arr3);
//		Student s2 = new Student(name2, arr2);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		
	}

}