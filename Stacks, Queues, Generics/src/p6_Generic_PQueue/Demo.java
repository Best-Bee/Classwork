package p6_Generic_PQueue;

public class Demo {
	public static void main(String[] args) {
		Student s1 = new Student("M", 4.0);
		Student s2 = new Student("Z", 1.0);
		Student s3 = new Student("A", 2.5);
		PQueue<Student> pq1 = new PQueue<>(5);
		pq1.insert(s1);
		pq1.insert(s2);
		pq1.insert(s3);
		while(!pq1.isEmpty()) {
			System.out.println(pq1.remove());
		}
	}
}
