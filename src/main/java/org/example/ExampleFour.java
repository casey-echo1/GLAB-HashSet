package org.example;

import java.util.HashSet;

public class ExampleFour {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();

		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		//add duplicate items
		hset.add("Apple");
		hset.add("Mango");
		// add null values
		hset.add(null);
		hset.add(null);

		for(String s : hset) {
			System.out.println(" ---> " + s);
		}

	}
}
