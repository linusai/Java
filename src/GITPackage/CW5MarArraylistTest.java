package GITPackage;

import java.util.ArrayList;
import java.util.List;

//Iterable --> Collection-->
//Collection--> List -->(ArrayList , Linked List) 
public class CW5MarArraylistTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> lis = new ArrayList <Integer> (); //<> is called as generic 
		ArrayList<Integer> Alis = new ArrayList <Integer> (); //Syntax to use call the collection
		lis.add(10); lis.add(20); lis.add(30);
		Alis.add(20); Alis.add(30); Alis.add(50);
		
		for(int i= 0; i <lis.size(); i++) {
			System.out.println("Print the Forloop:" +lis.get(i));
		}
		System.out.println("Print the List:" +lis.get(0) +lis.get(2));
		System.out.println("Print the List:" +lis.get(1));
		System.out.println("Print the List:" +lis.get(2));
		System.out.println("Print the Array List:" +Alis.get(0));
		System.out.println("Print the Array List:" +Alis.get(1));
		System.out.println("Print the Array List:" +Alis.get(2));
	}

}
