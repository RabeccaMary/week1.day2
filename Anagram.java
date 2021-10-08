package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		char[] c1 = text1.toCharArray();
		boolean status = false;
		System.out.println("1st String is " + text1);
		String text2 = "potss";
		char[] c2 = text2.toCharArray();
		System.out.println("2nd String is " + text2);
		if (c1.length == c2.length) {
			System.out.println("Length of both strings are same ; " + c1.length);
			Arrays.sort(c1);
			Arrays.sort(c2);
			status = Arrays.equals(c1, c2);
			if (status == true)
			System.out.println("The String is a Anagram");
			else
				System.out.println("Contents are not equal");
		}
		else
			System.out.println("Length of the strings are not equal");
	}

}
