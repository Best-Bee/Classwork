package p3_cloneable;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("A", 3.5);
		Student s2 = null;
		
		try {
			s2 = s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
