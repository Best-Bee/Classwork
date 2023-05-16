import java.util.Scanner;

public class GetMiddleName {

	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full name : ");
		String FullName = input.nextLine();
		//get rid of extra spaces in front or end
		String FullNameTrim = FullName.trim();
		//get the start and end of middle name
		int firstBlankIndex = FullNameTrim.indexOf(' ');
		int lastBlankIndex = FullNameTrim.lastIndexOf(' ');
		//get middle name and display it
		if (lastBlankIndex > firstBlankIndex) {
			System.out.println("The middle is : " + FullNameTrim.substring(firstBlankIndex + 1, lastBlankIndex));
		} else {
			System.out.println("There is no middle name");
		}
	}
}
