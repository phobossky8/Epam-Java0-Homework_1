import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {

		int R1;
		int R2;
		double ringArea;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter R1: ");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Enter Correct number!");
		}

		R1 = scanner.nextInt();

		System.out.print("Enter R2: ");

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Enter Correct number!");
		}

		R2 = scanner.nextInt();

		if (R1 > R2) {
			ringArea = (Math.PI * Math.pow(R1, 2)) - (Math.PI * Math.pow(R2, 2));
			System.out.println("Area of ring is: " + ringArea);
		} else {
			System.out.println("Conditions of this task are not correct (R2 > R1)");
		}

	}

}
