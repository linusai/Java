package GITPackage;

public class CW27FebStatic {
	static int x=10;
	static int y=20;
public void add( ) {
	System.out.println("The Non Static variable assignment" + x+y);
	}
public static void sub() {
	int X=200; int Y= 300;
	System.out.println("The Static variable assignment" + (Y-X));
}
public static void main(String args[]) { 
	
	sub();
}
}

