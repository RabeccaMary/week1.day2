package week1.day2.classroom;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] array = str.toCharArray();
		int length = array.length;
		for(int i=0; i<length;i++) {
			if(array[i]=='c')
				count++;
		}
		System.out.println(count);

	}

}
