package p2;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 4, 8, 1};
		int[] b = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(b));
	}

}