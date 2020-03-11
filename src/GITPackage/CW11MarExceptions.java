package GITPackage;

public class CW11MarExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a[] = {10,20};
		System.out.println (a[5]);
		int j= 20;
		System.out.println (j/5); 
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array exceptions" +e);
		}	
	
	}
	
	
	
	
	

}
