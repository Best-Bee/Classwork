package p3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoWriteObjectIO {

	public static void main(String[] args) {
		Student s1 = new Student(3.0, "A");
		Student s2 = new Student(2.5, "B");
		try {
			FileOutputStream fos = new FileOutputStream("dataFolder/dataObject.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done Writing");
	}
}
