package GITPackage;

public class ArrayList24FebCW2 {
// 2diemenion array 
	public static void main(String[] args) {
		int b[][] = new int [2][2];
	    b[0][0] = 10;
	    b[0][1] = 20;
	    b[1][0] = 30;
	    b[1][1] = 50;
	    // Print Ascii value 
	 //   System.out.println("Print the value" + b[0][0]);
	    System.out.println("Print the value:");
	    for(int i=0; i< b.length; i++) {
	    	for(int j=0; j< b[i].length; j++) {
	    		
	    		System.out.print( b[i][j] + "");
	    	}
	    }
	    	System.out.println("");
	}

}
