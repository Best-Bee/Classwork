package p1_classes_1;

/* A class is a template used to create objects
 * 
 */
public class Student {

	// state of a student object, involves data (nouns)
	// Instance variables, fields, attributes, properties, instance fields
	private String name = null;// visible (accessible) inside the class
	private double gpa; // visible (accessible) inside the same package. Package (default) access
	private int age; // visible (accessible) to every program in the world

	// static variables: belongs to the class not to any objects
	private static String major = "CS"; // class-level variable

	// methods, behavior, involves action (verbs)

	// constructors. Overloaded constructors
	public Student(String name, double gpa, int age) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}

//	
	public Student(String name, int age, double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	
	public Student() {
		
	}
	
//	public double feed(double chickenAmount) {
//		return weight + chickenAmount/10;
//	}
//	
//	public double feed(int fishAmount) {
//		return weight + fishAmount/5;
//	}
//	
//	public double feedChicken(double amount) {
//		return weight + amount/10;
//	}
//	
//	public double feedFish(int amount) {
//		return weight + amount/5;
//	}
	

	public Student(String name) {
		this.name = name;
	}

	public void setName(String name) { // brown name has a local scope
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}
	
	//override
	public String toString() { // to return the values stored in the object in a string format
		return name + ": " + major + ", " + gpa + ", " + age;
	}
}
