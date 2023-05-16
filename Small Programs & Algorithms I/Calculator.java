import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String equation = "nul";
		double prevNum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Try the 'help' command");
		
		do {
			System.out.print("Enter an equation: ");
			equation = input.nextLine(); 
			System.out.println();
			if (equation.equalsIgnoreCase("help")) {
				help();
			} else if (equation.equalsIgnoreCase("clear")) {
				prevNum = 0;
			} else if (equation.equalsIgnoreCase("subtract")) {
				prevNum -= subtract();
				printNum(prevNum);
			} else if (equation.equalsIgnoreCase("add")) {
				prevNum += add();
				printNum(prevNum);
			}  else if (equation.equalsIgnoreCase("multiply")) {
				prevNum *= multiply();
				printNum(prevNum);
			}  else if (equation.equalsIgnoreCase("divide")) {
				prevNum /= divide();
				printNum(prevNum);
			}  else if (equation.equalsIgnoreCase("base")) {
				prevNum = base();
				printNum(prevNum);
			}   else if (equation.equalsIgnoreCase("showDecimals")) {
				System.out.println(prevNum);
			}   else if (equation.equalsIgnoreCase("toPower")) {
				prevNum = Math.pow(prevNum, toPower());
				printNum(prevNum);
			}
			
		} while (!equation.equalsIgnoreCase("exit"));
		input.close();

	}
	
	public static double base() {
		Scanner numbers = new Scanner(System.in);
		System.out.print("What would you like the base number to be? ");
		double num = numbers.nextDouble();
		return num;
	}
	
	public static double add() {
		Scanner numbers = new Scanner(System.in);
		System.out.print("How many numbers would you like to add? ");
		int numCount = numbers.nextInt();
		double numTotal = 0;
		for (int i = 1; i <= numCount; i++) {
			System.out.print("Enter number " + i + ": ");
			double num = numbers.nextDouble();
			numTotal += num;
		}
		return numTotal;
	}
	
	public static double subtract() {
		Scanner numbers = new Scanner(System.in);
		System.out.print("How many numbers would you like to subtract? ");
		int numCount = numbers.nextInt();
		double numTotal = 0;
		for (int i = 1; i <= numCount; i++) {
			System.out.print("Enter number " + i + ": ");
			double num = numbers.nextDouble();
			numTotal -= num;
		}
		return numTotal;
	}
	
	public static double multiply() {
		Scanner numbers = new Scanner(System.in);
		System.out.print("How many numbers would you like to multiply? ");
		int numCount = numbers.nextInt();
		double numTotal = 1;
		for (int i = 1; i <= numCount; i++) {
			System.out.print("Enter number " + i + ": ");
			double num = numbers.nextDouble();
			numTotal *= num;
		}
		return numTotal;
	}
	
	public static double divide() {
		Scanner numbers = new Scanner(System.in);
		System.out.print("Enter number to divide by: ");
		double num = numbers.nextDouble();
		return num;
	}
	
	public static double toPower() {
		Scanner numbers = new Scanner(System.in);
		System.out.print("Enter the exponent: ");
		double num = numbers.nextDouble();
		return num;
	}
	
	public static void help() {
		System.out.println(
		"---------------------------------------------------------------------"
		+ "\nAll of the following functions will do what they say to the previous "
		+ "\nnumber, the previous number always starts at zero until you use one "
		+ "\nof the following functions. Numbers will be displayed up to 10 decimals"
		+ "\nbut the real value may be slightly higher than what is shown.\n"
		+ "\n'clear' - resets the number back to 0"
		+ "\n\n'add' - adds any number of numbers to the previous number"
		+ "\n\n'subtract' - subtracts any number of numbers from the previous number"
		+ "\n\n'multiply' - multiplies the previous number by the number entered"
		+ "\n\n'divide' - divides the previous number by the number entered"
		+ "\n\n'base' - sets the base value to a number (so you can start at like 728"
		+ "\n or something instead of 0)"
		+ "\n\n'showDecimals' - shows all decimal values of the number currently at ="
		+ "\n---------------------------------------------------------------------"
		);
	}
	
	public static void printNum(double prevNum) {
		System.out.printf("%s%.10f","= ", prevNum);
		System.out.println("\n");
	}

}
