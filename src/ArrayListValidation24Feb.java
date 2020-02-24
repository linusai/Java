
public class ArrayListValidation24Feb {

	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[] = new int [3];
		    b[0] = 10;
		    b[1] = 20;
		Object obj[] = new Object [3];
		obj[0]= 10;
		obj [1] = "JavaTesting";
		obj [2] = 20.4;
		// This program will run and and display the ascii value , coz we need to have for loop so that we have a proper output generated
		System.out.println ("The value of the (A) array will be " + a);
		System.out.println ("The value of the (B) array will be " + b);
		System.out.println ("The value of the (obj) array will be " + obj);
		// The below statement will help to show the Array values based on the following format  a [10], b[20], c[30]
		for(int i=0; i< a.length; i++) {
			System.out.println ("The value of the (A) array will be " + a[i]);
		}
		for(int j=0; j< obj.length; j++) {
				System.out.println ("The value of the (obj) array will be " + obj[2]);
				// Since we have given obj.length it will take a reference of the new object declaration [3] the for loop will run for 3 times and display the value of the object 
		}
		

	}

}
