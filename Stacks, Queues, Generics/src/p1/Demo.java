package p1;

public class Demo {

	public static void main(String[] args) {
		String paragraph = "hi, how are you. I'm doing pretty good. where am I? heehoo";
		String[] a = paragraph.split("[.,!,?]");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "\n");
		}
		

	}

}
