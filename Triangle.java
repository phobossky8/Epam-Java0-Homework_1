import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		int x1, y1, x2, y2, x3, y3;

		double sideAB, sideBC, sideAC;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entering dot A with coordinates X1, Y1 ");
		System.out.print("Enter X1 coordinate: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		x1 = scanner.nextInt();

		System.out.print("Enter Y1 coordinate: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		y1 = scanner.nextInt();

		System.out.println("Entering dot B with coordinates X2, Y2 ");
		System.out.print("Enter X2 coordinate: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		x2 = scanner.nextInt();

		System.out.print("Enter Y2 coordinate: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		y2 = scanner.nextInt();

		System.out.println("Entering dot C with coordinates X3, Y3 ");
		System.out.print("Enter X3 coordinate: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		x3 = scanner.nextInt();

		System.out.print("Enter Y3 coordinate: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		y3 = scanner.nextInt();

		System.out.println(
				"Entered DOTs are: A(" + x1 + "," + y1 + "); B(" + x2 + "," + y2 + "); C(" + x3 + "," + y3 + ").");

		if ((x1 == x2 & x2 == x3) || (y1 == y2 & y2 == y3)) {
			System.out.println("Entered Dots don't form a triangle");
			System.exit(0);
		} else
			System.out.println("Entered Dots form a triangle ABC.");

		sideAB = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		sideBC = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		sideAC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

		if ((Math.pow(sideAB, 2) == (Math.pow(sideBC, 2) + Math.pow(sideAC, 2)))
				|| (Math.pow(sideBC, 2) == (Math.pow(sideAB, 2) + Math.pow(sideAC, 2)))
				|| (Math.pow(sideAC, 2) == (Math.pow(sideAB, 2) + Math.pow(sideBC, 2)))) {
			System.out.println("Triangle ABÑ is right triangle! :)");
		} else System.out.println("Triangle ABC is NOT right triangle");

	}

}
