package p4;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		if (gpa > 4.0) {
			try {
				throw new IncorrectGPAException("The GPA is too high");
			} catch (IncorrectGPAException e) {
				System.out.println(e.getMessage());
				gpa = 4.0;
			}
		}
		if (gpa < 0.0) {
			try {
				throw new IncorrectGPAException("The GPA is too low");
			} catch (IncorrectGPAException e) {
				System.out.println(e.getMessage());
				gpa = 0.0;
			}
		}
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
