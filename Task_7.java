import java.util.Random;

public class Task_7 {

	public static void main(String[] args) {
		
		Random randomNubmer = new Random();
		
		int a = randomNubmer.nextInt(100);
		int b = randomNubmer.nextInt(100);
		
		System.out.println("a = " + a + ", b = " + b);
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
	
		System.out.println("a = " + a + ", b = " + b);
	}

}
