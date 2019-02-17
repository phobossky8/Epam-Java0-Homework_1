import java.util.Random;

public class Task_4 {

	public static void main(String[] args) {

		Random randomNubmer = new Random();

		int countUp = 0;
		int countDown = 0;

		int N = randomNubmer.nextInt(10000);

		System.out.println("Generated number is: " + N);

		String temp = Integer.toString(N);

		int[] array = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			array[i] = temp.charAt(i) - '0';
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				countDown++;
			}
			if (array[i] < array[i + 1]) {
				countUp--;
			}
		}

		if (countDown == 3) {
			System.out.println("The sequence is decreasing");
		} else if (countUp == -3) {
			System.out.println("The sequence is increasing");
		} else {
			System.out.println("The sequence is NOT increasing or decreasing");
		}

	}

}
