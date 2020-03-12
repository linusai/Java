package GITPackage;
//Maps (Key,Value) we will be using Put method rather than Get method when compared to Collection 
//Types of Map(Hash Map/ Linked Hash Map / Tree Map) 
//Map <Integer ,String> M= New HashMap <Interger String>();
//Cannot have duplicate key where as value can be duplicated 
// Only For each can 

import java.util.HashMap;
import java.util.Map;

public class CW11MarMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap <Integer,String> ();
		m.put(10,"Selenium");
		System.out.println("Map Testing :" +m.get(20));
		System.out.println (m);
		
		
		;

		
	}

}
