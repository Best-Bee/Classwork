import java.util.Scanner;
public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Temperature conversion, chose one:");
		System.out.println("		1) fahrenheit to celcius");
		System.out.print  ("		2) celcius to fahrenheit\n>");
		
		double num1 = input.nextInt();
		
		if (num1 == 1) {
			System.out.print("Enter a degree in Fahrenheit:");
			double temp = input.nextInt();
			System.out.print("Fahrenheit " + temp + " is " + (int)(((5.0 / 9) * (temp - 32)) * 100.0) / 100.0 + " in Celcius");
		} else if (num1 == 2) {
			System.out.print("Enter a degree in Celcius:");
			double temp = input.nextInt();
			System.out.print("Celcius " + temp + " is " + (int)(((9.0 / 5) * temp + 32) * 100.0) / 100.0 + " in Fahrenheit");
		} else {
			System.out.print("Invalid selection please choose 1 or 2");
		}
	}

}
