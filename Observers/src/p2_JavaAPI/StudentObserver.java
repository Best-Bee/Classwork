package p2_JavaAPI;

import java.util.Observable;
import java.util.Observer;

public class StudentObserver implements Observer{
	private String name;
	private Student student;
	
	public StudentObserver (String name, Student student) {
		student.addObserver(this);
		this.student = student;
		System.out.println("Added a new observer: " + name + ".");
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("The student observed is: " + ((Student)o).getName() + ", " + ((Student)o).getGpa() + ".");
		System.out.println(arg);
	}
}
