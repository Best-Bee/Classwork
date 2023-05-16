package p7_Generic_Class_2;

import java.io.Serializable;

public class DemoPoint {
	public static void main(String[] args) {
		Point <Integer> p1 = new Point<>(1,2);
		Point <String> p2 = new Point<>("one","two");
		Point <Object> p3 = new Point<>(1,1.5);
		Point <Serializable> p4 = new Point<>(2,3.6);
		
//		display1(p1);
//		display1(p2);		//no longer allowed, constrained in method
//		display1(p3);
//		display1(p4);
//		
//		display2(p1);		//no longer works as well
//		display2(p2);	
//		display2(p3);		//allowed because it's a superclass of Number
//		display2(p4);		//also allowed
	}
	
	public static void display1(Point<? extends Number> p) {	// ? is a wild card
		System.out.println(p);
	}
	
	public static void display2(Point<? super Number> p) {	// lower bound constraint, everything has to be number type or a superclass
		System.out.println(p);								// of number type
	}
}
