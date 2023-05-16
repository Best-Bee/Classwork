import java.util.Scanner;

public class ClassWorkWorking {

	public static void main(String[] args) {
		int iWhich ;
		double fahrenheit,celsius;
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Temperature conversion choose one:\n" + 
				"        1) fahrenheit to celsius.\n" + 
				"        2) celsius to fahrenheit.");
		System.out.print(">");
		iWhich = input.nextInt();
		if (iWhich == 1) {
			//F to C
		    System.out.print("Enter a degree in Fahrenheit: ");
		    fahrenheit = input.nextDouble(); 

		    // Convert Fahrenheit to Celsius
		    celsius = (5.0 / 9) * (fahrenheit - 32);
		    System.out.println("Fahrenheit " + fahrenheit + " is " + 
		      celsius + " in Celsius");
		}
		else if (iWhich == 2) {
		    System.out.print("Enter a degree in Celsius: ");
		     celsius = input.nextDouble(); 

		    // Convert Celsius to Fahrenheit 
		    
		    fahrenheit = 9.0/5*celsius + 32;
		    
		    System.out.println("Celsius " + celsius  + " is " + 
		    	fahrenheit + " in Fahrenheit");

		}
		else System.out.println("Invalid selection please choose 1 or 2");
		
	}

}