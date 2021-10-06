package week1.day2.classroom;

public class ReverseString {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] array = str.toCharArray();
		int length = array.length;
		for(int i=length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
