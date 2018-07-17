package com.kc.ServerMaintainance;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
      	System.out.println("____=++++++++++++++++++++++++++++++++++++++++++"+serverDetailsSet);
      	
     
      	
      	
      	
      	serverDetailsSet.forEach(sd->{
    	 	System.out.println("===");
    	 	    								 	sd.getSoftwareTypes().values().forEach(st->{
    	 	    								 		//System.out.println(st);
    	 	    								 		st.getSoftwares().values().forEach(sf-> {
    	 	    								 												System.out.println(sf);
    	 	    								 												//System.out.println("::   :: ");
    	 	    								 												//System.out.println(  sf.getVersions().values().stream().max(Comparator.comparing(i  -> i )).get());
    	 	    								 												//System.out.println(":: "+max1+" :: ");
    	 	    								 												List<Integer> max1= sf.getVersions().values().stream().map(ver1 -> ver1.getPatch()).collect(Collectors.toList());
    	 	    								 												
    	 	    								 												//geting max patch version 
    	 	    								 												Optional<Version> i1=sf.getVersions().values().stream().max(Comparator.comparingInt(Version::getPatch));
    	 	    								 												System.out.println(":: "+i1.get()+" :: ");
    	 	    								 												
    	 	    								 												Optional<Version> minVersion=sf.getVersions().values().stream().min(Comparator.comparingInt(Version::getPatch));
    	 	    								 												System.out.println(":: "+minVersion.get().getName()+" :: ");
    	 	    								 												
    	 	    								 												
    	 	    								 												
    	 	    								 												
    	 	    								 											//	System.out.println(":: "+max+" :: ");
    	 	    								 											//	sf.getVersions().keySet().forEach(verKey -> System.out.println(verKey));
    	 	    								 												sf.getVersions().values().forEach(ver -> {
    	 	    								 												
    	 	    								 												//	System.out.println(ver);
    	 	    								 												//	System.out.println(ver.getName());
    	 	    								 													System.out.print(ver.getMajor() +" ");
    	 	    								 													System.out.print(ver.getMinor()+" ");
    	 	    								 													System.out.print(ver.getPatch()+" ");
    	 	    								 													System.out.println(" ");
    	 	    								 													
    	 	    								 													});
    	 	    								 												});
    	 	    								 	});
    									});
    	
    	
    	
    }
}
