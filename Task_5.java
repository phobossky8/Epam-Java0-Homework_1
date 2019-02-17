import java.util.Random;

public class Task_5 {

	public static void main(String[] args) {
		Random randomNubmer = new Random();
		int N;
		double arithmeticalAverage = 0;
		double geometricalAverage = 1;
		do {
			N = randomNubmer.nextInt(1000000);
		} while (N < 99999);

		System.out.println("Generated number is: " + N);

		String temp = Integer.toString(N);

		int[] array = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			array[i] = temp.charAt(i) - '0';
		}
		
		for (int i = 0; i < array.length; i++) {
			arithmeticalAverage = arithmeticalAverage + array[i];
		}
			arithmeticalAverage = arithmeticalAverage / array.length;
		System.out.println("Arithmetical average is: " + arithmeticalAverage);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] !=0) {
				geometricalAverage = geometricalAverage * array[i];
			} else {
				geometricalAverage = geometricalAverage * 1;
			}
			
		}
		geometricalAverage = Math.pow(geometricalAverage, (1.0/6));
		System.out.println("Geometrical average is: " + geometricalAverage);
	}
	
	

}
