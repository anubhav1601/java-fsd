package Polymorphism;

public class polymorphism {
	void add(int x,int y) {
		System.out.println("sum of two integer numbers is: "+(x+y));
		}
		void add(double x,double y) {
		System.out.println("sum of two decimal numbers is: "+(x+y));
		}
		void add(int x,int y,int z) {
		System.out.println("sum of three numbers is: "+(x+y+z));
		}
		void add(double x,double y,double z) {
		System.out.println("sum of three decimal numbers is: "+(x+y));
		}

		public static void main(String[] args) {
		polymorphism obj = new polymorphism();
		obj.add(10,20);
		obj.add(1.5, 2.5);
		obj.add(2.5,3.5,5.5);
		obj.add(1,2,3);

}}
