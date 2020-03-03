package GITPackage;

import java.util.Scanner;

//Act of reprsentating the data without showing the internal implementation (1 Abstract Class & Interface)
public abstract class CW3MarAbstraction {
	public void noabsmethod() {
		System.out.println("Enter the Miles:");
		Scanner dataentry = new Scanner (System.in); // Syntax to use and call the user input
		double miles =dataentry.nextDouble();
		double kms = 1.60934;
		double milestokms = miles * kms;
		System.out.println("Print the Child Class Conversion miles to kms :" +milestokms );
		
	}
	public abstract void abmethod (); //Abstract method is called in another class 
	// In abstraction method System.out.Println will not work. 
	//Scanner dataentry = new Scanner (System.in); // Syntax to use and call the user input
	double gal =10;
	double lts = 3.784;
	double galtolts = gal * lts;
	
}


