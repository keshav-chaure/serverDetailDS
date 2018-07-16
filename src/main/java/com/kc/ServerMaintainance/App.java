package com.kc.ServerMaintainance;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String inputFileName="input.txt";
    	String splitBy="\\.";
        System.out.println( "Hello World!" );
        ServerMaintainanceServices s= new ServerMaintainanceServices();
    	Set<ServerDetail> serverDetailsSet =new HashSet();
    	serverDetailsSet=s.readTextFile(inputFileName,splitBy);
      	System.out.println("____=++++++++++++++++++++++++++++++++++++++++++");
    	
    	for(ServerDetail sd:serverDetailsSet) {
    		System.out.println(sd.getName());
    		sd.getSoftwareTypes().keySet().forEach(name -> {
    														System.out.println(name);
    														SoftwareType t=sd.getSoftwareTypes().get(name);
    														sd.getSoftwareTypes().get(name).getSoftwares().keySet().forEach(n -> {
    																															//  System.out.println(n);
    																															  
    																															  });
    														sd.getSoftwareTypes().get(name).getSoftwares().values().forEach(sf-> {
	    																														 	 System.out.println(sf.getName());
	    																															 sf.getVersions().values().forEach(x->{
	    																																 System.out.println(x.getMajor());
	    																																 System.out.println(x.getMinor());
	    																																 System.out.println(x.getPatch());
	    																															 });
    																															 
    																															});
    														 
    														});
    		 
    		
    	}
    	
    	
    }
}
