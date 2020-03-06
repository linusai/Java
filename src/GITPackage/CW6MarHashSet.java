// hashset will not give the value in a random order not the order given by the user
// duplicates will be removed in the Set / Hash Set and Linked Hash Set
package GITPackage;

import java.util.HashSet;

public class CW6MarHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer> ();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(null);
		hs.add(50);
		
		System.out.println("Print the List:" +hs);
	}

}
