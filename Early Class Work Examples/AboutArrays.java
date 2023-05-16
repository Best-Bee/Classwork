import java.util.Arrays;

public class AboutArrays {
	public static void main(String[] args) {
		
		int student1 = 90;
		int student2 = 59;
		int student3 = 98;
		int student4 = 85;
		int student5 = 74;
		double gradeAve = (student1 + student2 + student3 + student4 + student5) / 5.0;
		System.out.println("The average is: " + gradeAve);
		
		int[] student;
		student = new int[5];
		student[0] = 90;
		student[1] = 59;
		student[2] = 98;
		student[3] = 85;
		student[4] = 74;
		printAry(student);
		double gradeSum = 0;
		for (int i = 0; i < student.length; i++) {
			gradeSum += student[i];
		}
		System.out.println("\nThe average of student grade is : " + 
		(gradeSum / student.length));
		
		int[] stud1 = new int[5];
		int[] studinit = {90,59,98,85,74,86};
		
		printAry(studinit);
		
		System.out.println("\n\n***** before sort *****");
		printAry(student);
		Arrays.parallelSort(student);
		System.out.println("\n***** after sort *****");
		printAry(student);
		
		System.out.println();
		
		System.out.println("\nCheck for 85: \nIndex = " + Arrays.binarySearch(student, 85));
		System.out.println("\nCheck for 91: \nIndex = " + Arrays.binarySearch(student, 91));
	
		System.out.println("\ntoString is: " + Arrays.toString(student));
	
		
		System.out.println("");
		for (int i: studinit) {
			System.out.print(i + " ");
		}
	
	}
	
	public static void printAry(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
			//if ((i + 1) % 3.0 == 0) {
			//	System.out.println();
			//}
		}
	}
}
