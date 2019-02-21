import java.util.Scanner;

public class Dragon {

	public static void main(String[] args) {

		int N, dragonHeads = 3, dragonEyes;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the age of dragon: ");

		while (!scanner.hasNextInt()) {
			System.out.println("It should  be a number !!!");
			scanner.next();
		}

		N = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			
			if ( i < 200) {
				dragonHeads += 3;			
			}
			
			if( i >= 200) {
				dragonHeads += 2;
			}
		
			if( i >= 300) {
				dragonHeads += 1;
			}
		}

		dragonEyes = dragonHeads * 2;

		System.out.println("Dragons is " + N + " y.o. and have " + dragonHeads + " heads and " + dragonEyes + " eyes");
	}

}
