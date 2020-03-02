package GITPackage;

import java.util.Scanner;

public class CW2MarMethodsPloyChildClass extends CW2MarMethodsPloy {
	
	double kms = 1.60934;
	double gal =35;
	double lts = 3.784;
	double inch =20;
	double foot = 0.0833;
	
	public void mestat1() { // Non Static Method Creation
		double cmtok = miles * kms;
		System.out.println("Print the Child Class Conversion mile to Kms:" +cmtok);
	}
	public void mestat2() { // Non Static Method Creation
		double cgaltolts = gal * lts;
		System.out.println("Print the Child Class Conversion gallon to litres :" +cgaltolts);
	}
	public void mestat3() {
		
		System.out.println("Enter the Miles:");
		Scanner dataentry = new Scanner (System.in); // Syntax to use and call the user input
		double miles =dataentry.nextDouble();
		double cinctofoot = inch * foot;
		System.out.println("Print the Child Class Conversion inches to foot :" +cinctofoot );
		System.out.println("Print the Child Class miles :" +miles );
	}

	public static void main (String[] args) { 
		CW2MarMethodsPloy pc = new CW2MarMethodsPloy (); // Creating new objecct "pc" for parent class
		pc.mestat3 (); // syntax call the object.pc and then call the method of parent class 
		
		CW2MarMethodsPloyChildClass cc = new CW2MarMethodsPloyChildClass ();
		cc.mestat3();
		
		CW2MarMethodsPloy parentchild = new CW2MarMethodsPloyChildClass (); // This syntax will call the child class method 
		parentchild.mestat1(); // This syntax will call only the Child class methods and not the parent class methods 
			
		
		
	}
}
