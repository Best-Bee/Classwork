package p1_Simple_Recursion;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int[] z = {1,2,3,4};
		show(x);
		showz(z);
		System.out.println("x = " + x + "\ty = " + y);
		System.out.println("Out of method, " + Arrays.toString(z));
	}
	private static void showz(int[] z) {
		z[0] = 5;
		System.out.println("In method, " + Arrays.toString(z));
	}
	public static void show(int x) {
		x *= 2;
		System.out.println("In the show method, x = " + x);
	}
}
