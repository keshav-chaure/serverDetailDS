package com.kc.ds;

import java.util.HashMap;

public class Demo {
	

	public static void main(String[] args) {
		System.out.println("Hi");

		demoMyLinkList();	 	 
	 	countWordOccarance("Nothing is as easy as it looks");
	 	Boolean b=true;
	 	 System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");

	}

	private static void demoMyLinkList() {
		MyLinkList l = new MyLinkList();	 
		l.insertNode("A");	 
		l.insertNode("B");	 
		l.insertNode("C");
	 	
		l.insertNode("D");
	 	l.display();
 
	 	
	 	
	 	MyLinkList<Integer> i = new MyLinkList();
	 	i.insertNode(1);
	 	i.insertNode(4);
	 	i.insertNode(6);
	 	i.display();
	}

	private static void countWordOccarance(String  str) {
		String[] data = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
	 	 

	 	for (String key : data)
	 	{
	 		// here will return null if HashMap hm does not have String key 
	 		Integer freq = hm.get(key);
	 		System.out.println(freq);
	 		if(freq == null) freq = 1; else freq ++;
	 		hm.put(key, freq);
	 	}
	 	System.out.println(hm);
	}

}
