// Class definition 
public class CW27FebClass {
	static int tail =1;
	int legs =2;
	// Non Static method declaration. This will not allocate memory which will be instance 
public void bark() { //Class Method declaration
	int body = tail+legs; // add function
	System.out.println("Print the Class Method Declaration this will be called by the Syntax dog.bark");
	System.out.println("Print the add function assigned in the method:- " + body);
	}
public void walk() { //Class Method declaration
	int face = legs-tail; // subraction 
	System.out.println("Print the Class Method Declaration this will be called by the Syntax dog.walk");
	System.out.println("Print the Subtraction function assigned in the method:- " + face);
	}
//When defining the class the Main method syntax has to be public static void main (string args[]) to run the current program else old buffer will run
//Main method is the 1st activity which JVM will execute
public static void main(String args[]) { 
	CW27FebClass dog =new CW27FebClass(); //Constructor declaration
	dog.bark(); // Object creation & Calling the Class method execution 
	dog.walk();
	System.out.println("Print the Class Method Declaration tail variable :" +dog.tail);
	System.out.println("Print the Class Method Declaration legs variable :" +dog.legs);
	
}
}
