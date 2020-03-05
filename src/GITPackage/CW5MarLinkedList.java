package GITPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class CW5MarLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> linlis = new LinkedList <Integer> (); //Always use this syntax to call the linked list
		LinkedList <String> linStr = new LinkedList <String> ();
		linlis.addFirst(45);
		linlis.add(10); // Middle Position
		linlis.add(20); //Middle Position
		linlis.addFirst(20); //2nd position
		linlis.addLast(25); // last position
		linlis.addFirst(35); //1st Position
		linStr.add("Linusai");
		linStr.addFirst("U.");
		for(int i= 0; i <linlis.size(); i++) {
			System.out.println("Print the Forloop:" +linlis.get(i));

	}
		for(int i= 0; i <linStr.size(); i++) {
			System.out.println("Print the Forloop:" +linStr.get(i));

	}
	}
}
