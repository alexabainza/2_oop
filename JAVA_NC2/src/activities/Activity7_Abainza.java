package activities;
import java.util.Scanner;

public class Activity7_Abainza {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Printing even numbers from 1 to 20");
		printEvenNumbers();
		System.out.println("\n====================");
		System.out.println("\n2. Calculate factorial");
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		int factResult = calculateFactorial(num);
		System.out.printf("Factorial of %d is %d", num, factResult);
		System.out.println("\n====================\n3. Check password\n");
		checkPassword("openSesame");
		// TODO Auto-generated method stub
		System.out.println("\n====================\n4. Array iteration\n");
		int[] numArr = {6,7,1,4,9};
		arrayIteration(numArr);
	}
	
	public static void printEvenNumbers(){
		int i;
		for(i=2; i<20; i+=2) {
			System.out.printf("%d ", i);
		}
	}
	
	public static int calculateFactorial(int num) {
		int factorial=1, i=1;
		while(i<=num) {
			factorial *= i;
			i++;
		}
		return factorial;
	}
	
	public static void checkPassword(String password) {
		Scanner scanner = new Scanner(System.in);
		String entry;
		do {
			System.out.println("Enter password: ");
			entry = scanner.nextLine();
		}
		while(!entry.equals(password));
		System.out.println("\nYou got it right!\n");
	}

	public static void arrayIteration(int[] numArray) {
		int i;
		for(i=0; i<numArray.length; i++) {
			System.out.printf("%d ", numArray[i]);
		}
	}
}
