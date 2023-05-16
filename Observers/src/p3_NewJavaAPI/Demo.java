package p3_NewJavaAPI;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student();
		
		StudentListener listener1 = new StudentListener();
		StudentListener listener2 = new StudentListener();
		
		student.addPropertyChangeListener(listener1);
		student.addPropertyChangeListener(listener2);
		
		student.setRecord(new Record("Joe", 2.0));
		
		System.out.println(listener1.getRecord());
		System.out.println(listener2.getRecord());
		
		student.setRecord(new Record("Joe", 3.0));
		
		System.out.println(listener1.getRecord());
		System.out.println(listener2.getRecord());
	}
}
