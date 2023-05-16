package p0;

public class Student {
	//instance vars - reflect STATE of an object (usually nouns)
	private String name;
	private double gpa;
	
	//instance var - reflect BEHAVIOR of an object (usually verbs)
	//private Playable playable; its time for FUNCTIONS and not methods!
	
	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
	
}
