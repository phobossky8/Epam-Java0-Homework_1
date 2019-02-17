import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); //for initializing variables from keyboard
		
		System.out.print("Enter weight of dinosaur in kilos: ");
		
		while(!scanner.hasNextInt()) {			//checking that user entered a number
			System.out.println("It should  be a number !!!");
			scanner.next();
		}
		
		int dinoWeightKg = scanner.nextInt();
		
		while(dinoWeightKg <= 0) {  //checking that user entered CORRECT number
			System.out.println("It should  be a positive number !!!");
			System.out.print("Enter weight of dinosaur in kilos AGAIN: ");
			dinoWeightKg = scanner.nextInt();
		}
		
		double dinoWeightTn = (double) dinoWeightKg / 1000;
		int dinoWeightGr = dinoWeightKg * 1000;
		long dinoWeightMg = (long) dinoWeightGr * 1000;
		
				
		System.out.println("Dino's weight is: " + dinoWeightMg +" Mg, or " + dinoWeightGr + " Gr, or " + dinoWeightKg + " Kg, or " + dinoWeightTn + " Tn");

	}

}
