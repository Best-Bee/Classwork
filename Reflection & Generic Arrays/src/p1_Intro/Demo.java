package p1_Intro;

import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName(args[0]);
			Method[] m = clazz.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
