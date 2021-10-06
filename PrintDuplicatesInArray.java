package week1.day2.classroom;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] array = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int length = array.length;
		for (int i = 0; i < (length); i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j])
					System.out.println("Duplicate number is " +array[i]);
			}
							
		}
	}

}
