package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoReadTextFile {

	public static void main(String[] args) {
		File file = new File("dataFolder/data.txt");
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
