
public class isPalindrome {

	public static void main(String[] args) {
		String str = "aaabbaaa";
		int flag = 0;
		
		int i = 0, j = str.length() - 1;
		 
        while (i < j) {
 
            if (str.charAt(i) != str.charAt(j))
                flag = 1;

            i++;
            j--;
        }
		
		if (flag == 0) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}
	}

}
