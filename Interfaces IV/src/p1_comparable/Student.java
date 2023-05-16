package p1_comparable;

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;
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
	@Override
	public int compareTo(Student o) {
		//if this.name is smaller than o.name (natural order - ascending)
		//put a - in front of this.name to make it inverse order (descending)
		return this.name.compareTo(o.name);
		
		//does the sort for gpa instead (- in front of Double to inverse)
		//return Double.compare(this.gpa, o.gpa);
	}
}
