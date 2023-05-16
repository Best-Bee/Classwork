package p1;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student("John", 2.0);
		StudentObserver observer1 = new StudentObserver("Registrar's Office", student);
		
		student.setGpa(2.5);
		student.setGpa(3.5);
	}

}
