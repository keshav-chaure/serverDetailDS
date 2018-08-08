package com.workscape.vehicleidentifier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

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
	Set<Vehicle> vehicles=new HashSet();
	Vehicle v=new Vehicle();
	
	
	 
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
	   
	   ClassLoader classLoader = this.getClass().getClassLoader();	   
	   File configFile=new File(classLoader.getResource(fileName).getFile());	  
	   DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	   DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	   Document doc = dBuilder.parse(configFile);		 
		doc.getDocumentElement().normalize();	 
		NodeList root=doc.getElementsByTagName("vehicle");
		 for (int i=0;i< root.getLength() ;i++){
			 Node n=root.item(i);			 
			 getNodeValue(n);	 
		 }
	 
	  }  catch (Exception e) {
			e.printStackTrace();
	    }
	  finally {
	   inputStream.close();
	  }	  
	}

	public  void getNodeValue(Node node) {
		String value=null;
		if(node.hasChildNodes() && node.getChildNodes().getLength() >0) {
			NodeList tempList=node.getChildNodes();
			for(int i=0;i<tempList.getLength(); i++) {
				Node tempNode=tempList.item(i);
				getNodeValue(tempNode);
			}
		}else{
			
			
			if(node.getNodeType()==3 ) {			
				if(node.getParentNode().getNodeName().equalsIgnoreCase("id")) {
					v.setVehicleID( node.getNodeValue() );
				}else if(node.getParentNode().getNodeName().equalsIgnoreCase("material")) {
					
				}else if(node.getParentNode().getNodeName().equalsIgnoreCase("position")) {
					
				}  
			System.out.println( "parnet Name :"+ node.getParentNode().getNodeName().toString() + "    node name : "+ node.getNodeValue() +", value :" +(node.getTextContent()));				
			}else if(node.getNodeType()==1) {
				if(node.getParentNode().getNodeName().equalsIgnoreCase("powertrain")) {
					
				  } 
			 	 
			}
		 
		}
		 
	}

	 
	
	 
	
	 
}
