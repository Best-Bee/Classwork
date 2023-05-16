package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoIllegalArgumentException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		System.out.println("Please enter your age as an integer");
		while (true) {
			try {
				age = scanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Invalid Input...");
				System.out.println("Please enter a valid WHOLE NUMBER AGE");
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("Invalid Input...\nException Catch Clause Used...");
				System.out.println("Please enter a valid WHOLE NUMBER AGE");
			} finally {
				System.out.println("Finally Excuted...");
			}
		}
		System.out.println("Your age is: " + age);
		
	}

}
