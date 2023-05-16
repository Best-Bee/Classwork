//*************UNFINISHED**************//
import java.util.Scanner;

public class HexToNum {
	public static void main(String[] args) {
		String myHex = "";
		String tmpStr;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int aNumber = input.nextInt();
		int saveNumber = aNumber;
		
		while (aNumber > 0) {
			int r = aNumber % 16;
			tmpStr = findHex(r);
			myHex = tmpStr + myHex;
			aNumber = aNumber/16;
		}
		System.out.println("the dec number " + saveNumber + " is Hex " + myHex);
	}
	
	public static String findHex(int inum) {
		String tmpS1 = "";
		switch (inum) {
			case 0: tmpS1 = "0"; break;
			case 1: tmpS1 = "1"; break;
			case 2: tmpS1 = "2"; break;
			case 3: tmpS1 = "3"; break;
			case 4: tmpS1 = "4"; break;
			case 5: tmpS1 = "5"; break;
			case 6: tmpS1 = "6"; break;
			case 7: tmpS1 = "7"; break;
			case 8: tmpS1 = "8"; break;
			case 9: tmpS1 = "9"; break;
			case 10: tmpS1 = "A"; break;
			case 11: tmpS1 = "B"; break;
			case 12: tmpS1 = "C"; break;
			case 13: tmpS1 = "D"; break;
			case 14: tmpS1 = "E"; break;
			case 15: tmpS1 = "F"; break;
		}
		return tmpS1;
	}

}
