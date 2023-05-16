
public class testing {
	public static void main() {
	int number = 0;
	System.out.print("" + (number += 1));
	System.out.print("" + (number = number + 1));
	System.out.print("" + number++);
	System.out.print("" + ++number);
	}
}
