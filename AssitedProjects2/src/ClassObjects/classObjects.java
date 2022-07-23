package ClassObjects;
	import java.util.Scanner;

	public class classObjects {

	void add(double x, double y) {
	System.out.println("Sum is: " + (x + y));
	}

	void multiply(double x, double y) {
	System.out.println("multiplication is: " + (x * y));
	}

	void divide(double x, double y) {
	System.out.println("Sum is: " + (x / y));
	}

	public static void main(String[] args) {
	try {
	int x, y;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter x: ");
	x = sc.nextInt();
	System.out.println("enter y: ");
	y = sc.nextInt();

	classObjects obj = new classObjects();
	obj.add(x, y);
	obj.multiply(x, y);
	obj.divide(x, y);
	} catch (Exception e) {
	System.out.println("error occured:" + e);
	}
	}
	}



