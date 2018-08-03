package com.kc.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
	
public static void printDistinctChar(String input) {
	Map<Character,Integer> distinctChar=new HashMap();
	char[] charArray=input.toCharArray();
	for(char c: charArray) {
		distinctChar.merge(c,2, Integer::sum);
	}
	System.out.println(distinctChar);
	
	
	
}

public static boolean checkPalendromString(String input) {
	boolean result =true;
	int size=input.length();
	
//	System.out.println("input length: "+size);
	for(int i=0;i < size/2; i++ ) {
		if(input.charAt(i)!=input.charAt(size-i-1)) {
			result=false;
			break;
		} 
	}
	return result;
}
public static int findNoOfPalendrom(String input,int subStringLength) {
	int noOfPalendrom=0;
	int size=input.length();
	 List<String> stringList=splitToNChar(input,subStringLength);
	 for(String s:stringList) {
		if(checkPalendromString(s)) {
			noOfPalendrom++;
		};
		// System.out.println(s);	 
	 }
	 
	return  noOfPalendrom;
}
private static List<String> splitToNChar(String text, int size) {	 
	List<String> parts = new ArrayList<>();
    int length = text.length();
    for (int i = 0; i < length; i += size) {
        parts.add(text.substring(i, Math.min(length, i + size)));
    }
    return parts;
}

	public static void main(String[] args) {
		System.out.println("Hi");
	// printDistinctChar("keshavchaure");
	//	System.out.println(checkPalendromString("abchcbaf"));
		System.out.println(findNoOfPalendrom("abacbahcbafaba",3));
		 

	//demoMyLinkList();	 	 
	 //	countWordOccarance("Nothing is as easy as it looks");
	 //	Boolean b=true;
	 //	 System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");

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
