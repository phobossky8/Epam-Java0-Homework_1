import java.util.Random;

public class Task_6 {

	public static void main(String[] args) {

		Random randomNubmer = new Random();
		
		int N;		
		int reverseN = 0;
		int factor = 1;
		
		do {
			N = randomNubmer.nextInt(10000000);
		} while (N < 999999);

		System.out.println("Generated number is: " + N);

		String temp = Integer.toString(N);

		int[] array = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			array[i] = temp.charAt(i) - '0';
		}

		for (int i = 0; i < array.length; i++) {
			reverseN = reverseN + array[i] * factor;
			factor *= 10;
		}
		
		System.out.println("Reversed number is: " + reverseN);
	}

}
