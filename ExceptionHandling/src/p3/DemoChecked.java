package p3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoChecked {

	public static void main(String[] args) {
		
		//compiler is a java program that turns source code into machine code
		File file = new File("Data.txt");
		
		//checked (by compiler) exception
		//must handle these exceptions
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("The end");
		
		
	}

}
