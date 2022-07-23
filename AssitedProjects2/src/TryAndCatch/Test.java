package TryAndCatch;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int a, b;

		System.out.println("Enter two integers:");

		try {
			Scanner scanner = new Scanner(System.in);
			a = scanner.nextInt();
			b = scanner.nextInt();
		    int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Cannot be divided by zero");
		}
		System.out.println("Continue");

	}

}

