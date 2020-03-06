//treeset will not allow null & Sort in ascending order 
package GITPackage;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CW6MarTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> hs = new TreeSet<Integer> ();
		hs.add(100);
		hs.add(20);
		hs.add(50);
		hs.add(40);
		//hs.add(null);
		hs.add(50);
	System.out.println("Print the List:" +hs);

	}

}
