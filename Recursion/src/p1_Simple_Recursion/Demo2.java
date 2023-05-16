package p1_Simple_Recursion;

public class Demo2 {

	public static void main(String[] args) {
//		int x = 0;
//		int i = 0;
//		while(true) {
//			x = 2 * i++;					//never uses more memory than previous loops, uses the same memory
//			System.out.println(x);			//location and uses that same memory (infinite but doesn't crash)
//		}
		int x = 1;
		show(x);
	}
	private static void show(int x) {
		if(x > 1000) {						//This is added to prevent a stack overflow
			return;							//called base case
		}
		x = 2 * x;
		System.out.println(x);
		show(x);							//creates a stack overflow, creating more and more show threads
	}										//without ever closing them so it will use more and more memory
}											//until you crash














