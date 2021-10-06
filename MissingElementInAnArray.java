package week1.day2.classroom;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] array = {1,2,3,5,7,6,8};
		Arrays.sort(array);
		for(int i = 1; i<array.length; i++) {
			if(i!=array[i-1]) {
				System.out.println(i);
				break;
			}
		}
	}

}
