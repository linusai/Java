package GITPackage;

public class CW2MarMethodsPloy {
	double miles =1;
	double kms = 1.60934;
	double gal =2;
	double lts = 3.784;
	double inch =1;
	double foot = 0.0833;
	
	public void mestat1() { // Non Static Method Creation
		double cmtok = miles * kms;
		System.out.println(cmtok);
	}
	public void mestat2() { // Non Static Method Creation
		double cgaltolts = gal * lts;
		System.out.println(cgaltolts);
	}
	public void mestat3() {
		double cinctofoot = inch * foot;
		System.out.println(cinctofoot);
	}
	
}