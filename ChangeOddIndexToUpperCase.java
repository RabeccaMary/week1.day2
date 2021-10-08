package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		System.out.println("Initial String : " + test);
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0)
				array[i] = Character.toUpperCase(array[i]);
		}
		System.out.println("Converted string : " + new String(array));

	}

}
