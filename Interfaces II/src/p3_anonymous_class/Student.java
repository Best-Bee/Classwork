package p3_anonymous_class;

public class Student {
	//instance vars - reflect STATE of an object (usually nouns)
	private String name;
	private double gpa;
	
	//instance var - reflect BEHAVIOR of an object (usually verbs)
	private Playable playable; // its time for FUNCTIONS and not methods!
	
	//interface allows unimplemented functions (placeholders) to be passed to a class
	//these placeholders can be filled with actual implemented functions
	public Student(String name, double gpa, Playable playable) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.playable = playable;
	}
	
	public Student() {}
	
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

	public void playSports() {
		playable.play();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}
}
