
public class PassParmToMain {

	public static void main(String[] args) {
		int [] myArr = {90,87,56,45,45,78,100};
		printAry(myArr);
		printAry(args);
	}
	
	public static void printAry(String[] strs) {
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	public static void printAry(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (i != (ary.length -1)) {
				System.out.print(ary[i] + ", ");
			} else {
				System.out.print(ary[i]);
			}
		}
	}
}
