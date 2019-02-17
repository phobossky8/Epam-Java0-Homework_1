import java.util.Random;

public class Task_1 {

	public static void main(String[] args) {

		Random randomNumber = new Random(); //for creating random numbers

		//initializing variables with random numbers between 1 to 10
		int a = randomNumber.nextInt(10);
		int b = randomNumber.nextInt(10);
		int c = randomNumber.nextInt(10);

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);

		if (a == b && b == c) {
			System.out.println("All numbers are equal :)");
		} else if (a != b && b != c && a != c) {
			System.out.println("All numbers are NOT equal!");
		} else {
			if (a == b) {
				System.out.println("a number equals b");
			} else if (a == c) {
				System.out.println("a number equals c");
			} else if (b == c) {
				System.out.println("b number equals c");
			}

		}

	}
}
