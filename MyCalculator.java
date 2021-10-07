package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator mycal = new Calculator();
		System.out.println("Addition : " + mycal.add(5, 8, 3));
		System.out.println("Subtraction : " + mycal.sub(5, 3));
		System.out.println("Multiplication : " + mycal.mul(5, 8));
		System.out.println("Division : " + mycal.div(8, 4));

	}

}
