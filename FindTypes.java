package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] array = test.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if ((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z'))
				letter = letter + 1;

			else if (array[i] >= '0' && array[i] <= '9')
				num++;
			else if (array[i] == ' ')
				space++;
			else
				specialChar++;

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
