package p3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoReadObjectIO {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("dataFolder/dataObject.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s1 = (Student)ois.readObject();
			Student s2 = (Student)ois.readObject();
			System.out.println(s1.toString());
			System.out.println(s2.toString());
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
