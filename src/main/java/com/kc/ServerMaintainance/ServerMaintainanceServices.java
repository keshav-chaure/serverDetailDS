package com.kc.ServerMaintainance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ServerMaintainanceServices {

	public Set<ServerDetail> readTextFile(String inputFileName, String splitBy) {

		ServerDetail s = new ServerDetail();
		File file = new File(inputFileName);
		Scanner scan = null;
		Set<ServerDetail> serverDetailsSet =new HashSet();
		

		ServerDetail sd=new ServerDetail();
		Map<String,SoftwareType> softwaresTypes=new HashMap();
		SoftwareType st=new SoftwareType();
		Map<String,Software> softwares=new HashMap();
		Software sw=new Software();
	
		Map<String,Version> versions=new HashMap();	
		try {
			scan = new Scanner(file);

			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] lineArray = line.split(",");
				
				String serverName=lineArray[0].trim();
				sd.setName(serverName); 				
				
				Version v=new Version();
				String[] ver=lineArray[3].split("\\.");
				String versionName=lineArray[3].trim();
				v.setName(versionName);
				v.setMajor(Integer.parseInt(ver[0].trim()));
				v.setMinor(Integer.parseInt(ver[1].trim()));
				v.setPatch(Integer.parseInt(ver[2].trim()));
				System.out.println(v);
				
				versions.put(versionName,v);
				
				String softwareName=lineArray[2].trim();
				sw.setName(softwareName);	
				sw.setVersions(versions);
				
				
				softwares.put(softwareName,sw);
				//System.out.println(sw);
				
				String softwareTypeName=lineArray[1].trim();
			 	st.setName(softwareTypeName);
			 	st.setSoftwares(softwares);
			 	
				softwaresTypes.put(softwareTypeName,st);		
				
				//System.out.println(st);
				
				sd.setName(serverName);
				sd.setSoftwareTypes(softwaresTypes);
				
				System.out.println(sd);
				System.out.println("-------------------");
				
				serverDetailsSet.add(sd);
				
			//	String softwareTypeName=lineArray[1].trim();
			//	st.setName(softwareTypeName);
				
				
				
				
				//sw.setName(name);
				//softwares.put();
				//sd.put(serverName,st);
				
				
				
				
				
				
			/*	
				Version v=new Version();
				
				String[] ver=lineArray[3].split("\\.");
				v.setMajor(Integer.parseInt(ver[0].trim()));
				v.setMinor(Integer.parseInt(ver[1].trim()));
				v.setPatch(Integer.parseInt(ver[2].trim()));
				
			//	Software sw=new Software();
				
				String versionName=lineArray[3];
				 
			//	sw.setName(versionName);
				versions.put(versionName, v);
				
				*/
				
				
				
				
				
			/*	ServerDetail sd=new ServerDetail();
				SoftwareType st=new SoftwareType();
				Software sw=new Software();
				Version v=new Version();
							
									 				
			
				
				Map<String,SoftwareType> softwaresTypes=new HashMap();
				
	            Map<String,Version> versions=new HashMap();	
				
				
				String[] ver=lineArray[3].split("\\.");
				v.setMajor(Integer.parseInt(ver[0].trim()));
				v.setMinor(Integer.parseInt(ver[1].trim()));
				v.setPatch(Integer.parseInt(ver[2].trim())); 
				
				Map<String,Software> softwares=new HashMap();
				
				sd.setName(lineArray[0].trim());	
				sd.setSoftwareTypes(softwaresTypes);
				
				st.setName(lineArray[1].trim());
				st.setSoftwares(softwares);					
				softwaresTypes.put(lineArray[1].trim(), st);
				
				 sw.setName(lineArray[2].trim()); 
				 sw.setVersions(versions);
				 softwares.put(lineArray[2].trim(), sw);
				 
				 versions.put(lineArray[3].trim(), v);
				 
				 
				 
				 
				
				serverDetailsSet.add(sd);
				*/
			/*	if(serverDetailsSet.isEmpty()) {					
					sd.setSoftwareTypes(softwaresTypes);					
					st.setSoftwares(softwares);								
					sw.setVersions(versions);						
				}else {
					if(serverDetailsSet.contains(sd.getName())) {
						
					}					
				}
				*/				
			

			}
			
			System.out.println(serverDetailsSet);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

		return serverDetailsSet;
	}

}
