package GITPackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CW6MarForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer> ();
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(40);
		hs.add(null);
		hs.add(50);
		for (Integer a : hs) { //for each loop
		System.out.println("Print the List:" +hs);
		}
		Iterator it = hs.iterator(); // Iterator will work only when the Set is created 

		while (it.hasNext()) {
			System.out.println("Print the Iterator:" +it.next());

		}
		
		
	

	}

}
