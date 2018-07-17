package com.kc.ds;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hi");

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

}
