package GITPackage;

// Syntax 
// Class to Class use the extends Key words
// abclass to class use the extends key words
// interface to class use the keyword Implements
// interface to interface use the keyword extends 

public class CW4MarInterfaceExtends implements CW4MarInterface { // Syntax to call the interface 
	//public class CW4MarInterfaceExtends implements CW4MarInterface ,CW4Mar2Interface //Interfaces can be called by this syntax also 

	
	@Override
	public void debit() {
		// TODO Auto-generated method stub
		int a = 100; int b =200;
		int debits = a*b;
		System.out.println(debits); // In interface to print a value use Sys.O.P in the MEthod created using interface method 
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		int a =20; int b =30;
		int credits = b+a;
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		int a =20; int b =30;
		int withdraw = b-a;
		
		
	}
	@Override
	public void loan() { // This is from the interface 2 declared in the CW4Mar2Interface
		// TODO Auto-generated method stub
		int a =20; int b =30;
		int loan = a*b+b-a;
		System.out.println(+loan);
		
	}
	public static void main (String[] args) { 
		CW4MarInterfaceExtends obj = new CW4MarInterfaceExtends ();
		obj.debit();
		obj.credit();
		obj.withdraw();
		obj.loan();
	
}

	
}