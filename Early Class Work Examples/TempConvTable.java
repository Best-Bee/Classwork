import java.util.Scanner;

public class TempConvTable {

	public static void main(String[] args) {
		int iWhich ;
		int count = 0;
		double fahrenheit,celsius;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"Temperature conversion choose one:\n" + 
					"        1) fahrenheit to celsius.\n" + 
					"        2) celsius to fahrenheit.");
			System.out.print(">");
			iWhich = input.nextInt();
		} while (! (iWhich == 1 || iWhich == 2));
		
		if (iWhich == 1) {

			System.out.printf("%10s%10s", "Fahrenheit", "Celsius");
			fahrenheit = 32;
			count = 0;
			
			while (count <= 10) {

				// Convert Fahrenheit to Celsius
				celsius = (5.0 / 9) * (fahrenheit - 32);
				System.out.printf("\n%10.2f%10.2f", fahrenheit, celsius);
				fahrenheit += 18;
				count++;
			}
		}else{
			
			System.out.printf("%10s%10s", "Fahrenheit", "Celsius");
			celsius = 10;
			count = 0;
			
			for (count = 0; count < 10; count++) {
		    	fahrenheit = 9.0/5*celsius + 32;
		    	System.out.printf("\n%10.2f%10.2f", fahrenheit, celsius);
		    	celsius += 10;
		    
			}
		}
		
	}

}
