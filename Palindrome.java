package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam", rev = "";
		System.out.println("The original string is " + str);
		char[] array = str.toCharArray();
		int length = array.length;
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + array[i];
		}
		System.out.println("The reversed string is " + rev);
		if (str.equalsIgnoreCase(rev))
			System.out.println("The String is a Palindrome");
		else
			System.out.println("The string is not a palindrome");
	}

}
