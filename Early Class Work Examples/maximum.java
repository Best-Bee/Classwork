
public class maximum {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		int greater;
		int lesser;
		
		greater = max(num1, num2);
		lesser = min(num1, num2);
		
		System.out.println("The greater number of " + num1 + " and " + num2 + " is " + greater);
		System.out.println("The lower number of " + num1 + " and " + num2 + " is " + lesser);

	}
	
	public static int max(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
		
	}
	
	public static int min(int num1, int num2) {
		if (num1 <= num2) {
			return num1;
		} else {
			return num2;
		}
		
	}

}
