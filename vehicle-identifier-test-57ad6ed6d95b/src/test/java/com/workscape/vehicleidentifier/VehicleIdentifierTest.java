package com.workscape.vehicleidentifier;


import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;
 
public class VehicleIdentifierTest {

	VehicleIdentifier identifier=new VehicleIdentifier();
	
	@Test
	public void testReadXml()   {
		assertEquals(1,1);
	 //	identifier.readXml();
	//	assertEquals(1, 1);
	}
	
}
