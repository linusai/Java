package GITPackage;

public class CW3MarAbsIn extends CW3MarAbstraction{
	
	@Override
	public void abmethod() {
		// TODO Auto-generated method stub
		//System.out.println("Enter the Miles:");
		System.out.println("Print the Child Class Conversion gal to lts :" +galtolts );
	}
	public static void main (String[] args) { 
		CW3MarAbsIn n= new CW3MarAbsIn (); //Create object when your calling no Static method to Static 
		n.noabsmethod();
		n.abmethod();
		
	
		
		
	}
}
