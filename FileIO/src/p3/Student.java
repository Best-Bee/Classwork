package p3;

import java.io.Serializable;

public class Student implements Serializable{
	private double gpa;
	private String name;
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(double gpa, String name) {
		super();
		this.gpa = gpa;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [gpa=" + gpa + ", name=" + name + "]";
	}
}
