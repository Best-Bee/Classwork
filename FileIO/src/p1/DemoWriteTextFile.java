package p1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoWriteTextFile {

	public static void main(String[] args) {
		try {
			char[] arr = {'a', 'b', 'c'};
			FileWriter fw = new FileWriter("dataFolder/data.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(100);
			pw.println(65);
			pw.println(66);
			pw.printf("%10s%10.2f%10d%n", "John", 4.573, 65);
			for (char a : arr) {
				pw.print(a + " ");
			}
			
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done writing");
		
	}

}
