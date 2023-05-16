package p2_JavaAPI;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student("John", 2.0);
		StudentObserver observer1 = new StudentObserver("Registrar's Office", student);
		
		student.setGpa(3.0);
		student.setGpa(0.1);
	}

}
