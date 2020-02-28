package GITPackage;

public class StringsValidationCon25FebCW {

	public static void main(String[] args) {
		// Strings are immutable , Concat function for strings will assign to orginal variable until and unless we have assigned 
		String S = "Java";
		String S1 = new String ("selenium"); // Syntax to declare the String
		StringBuffer S2 = new StringBuffer ("Test");
		StringBuffer S3= new StringBuffer("Malayalam");
		int X = 10;
		S.concat("Testing");
		X++;
		System.out.println("To integer validation :" +X);
		System.out.println("To String Concat :" +S);
		S= S.concat("Testing");
		System.out.println("To String Concat assignment:" +S);
		S1= S1.concat(S);
		System.out.println("To String Concat assignment:" +S1);
		S2.append("BufferValidation");
		System.out.println("To String Buffer assignment:" +S2);
		S2.reverse();
		System.out.println("To Reverse assignment:" +S2);
		S3.reverse();
		System.out.println("To Reverse assignment:" +S3);
	}

}
