package ExceptionHandling;

public class Test {


		public static void main(String[] args) {
			
			int[] arr = { 10, 20, 30 };
			System.out.println("Length of Array: " + arr.length);
			System.out.println("Elements of the array are: ");
			try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + " ");
			}}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("\n Exception handled");}
			
			System.out.println("\nElements are Printed");
				
	}}



