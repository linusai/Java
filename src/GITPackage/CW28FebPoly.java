package GITPackage;
// method overloading Ploymorphism
public class CW28FebPoly {
	public static void add() {
		int x=10; int y=20;
		int a= x+y;
		System.out.println("Add operation for the Method signuatre:" +a);
	}
	public static void add(int x, int y) {
		int b= x-y;
				System.out.println("Method with 2 Arugments" +b);
	}
	public static void add(double x, int y) {
		 double c= (double) (x*y); //type casting syntax
		System.out.println("Method with 2 Arugments with different data types multiply:" +c);
	}
	public static void add(int x, double y, String s) { // When calling the method what ever sequence you have declared in the method same should be declared
		double d= (double) (x/y);
		System.out.println("Method with 2 Arugments with different data types:" +d+s);
		}
public static void main (String[] args) { 
	add();
	add(100,300);
	add(45.22,5628);
	add(100,20.3,"Testing");
}
}

