package com.workscape.vehicleidentifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Hello world!
 * 
 */
public class VehicleIdentifier {
	public static void main(String args[]) throws IOException
	 {
	
		
	  VehicleIdentifier vi=new VehicleIdentifier();
	  System.out.println("Reading file from resources folder");
	  System.out.println("-----------------------------");
	 
	  vi.readFile("vehicles.xml");
	  
	  System.out.println("-----------------------------");
	 }
	
	 

	public  void readFile(String fileName) throws IOException
	 {
	  FileInputStream inputStream=null;
	  
	  try {
	   // Getting ClassLoader obj
	   ClassLoader classLoader = this.getClass().getClassLoader();
	   // Getting resource(File) from class loader
	   File configFile=new File(classLoader.getResource(fileName).getFile());
	  
	   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(configFile);
				
		//optional, but recommended
		//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
		doc.getDocumentElement().normalize();

		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		NodeList root=doc.getElementsByTagName("vehicle");
		System.out.println(root.getLength());		
		Node vehicle=getNode(doc.getChildNodes(),"vehicle");
		//System.out.println(vehicle);
	/*	 
				
		System.out.println("----------------------------");

		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("vehicle id : " + eElement.getElementsByTagName("id").item(0).getTextContent());
 				System.out.println("frame : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

			}
			
			
		}
		*/
		 
	 
	 
	  }  catch (Exception e) {
			e.printStackTrace();
	    }
	  finally {
	  // inputStream.close();
	  }
	 
	  
	 }



	private Node getNode(NodeList nodes, String tagName) {
		//System.out.println(nodes);
		//System.out.println(tagName);
		 for ( int x = 0; x < nodes.getLength(); x++ ) {
			 System.out.println(x);
			 
		        Node node = nodes.item(x);
		        System.out.println(node);
//		        if (node.getNodeName().equalsIgnoreCase(tagName)) {
//		            return node;
//		        }
		    }		 
		    return null;		 
	}
	
	 
}
