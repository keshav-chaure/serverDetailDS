package com.kc.ServerMaintainance;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mockito;


public class ServerMaintainanceServicesTest {

	 
	ServerMaintainanceServices test = Mockito.mock(ServerMaintainanceServices.class);

	@Test
	public void testReadTextFile() {
	 Set<ServerDetail> sd =test.readTextFile("input", ",");
	 Iterator i=sd.iterator();
	 System.out.println("hi");
	 while(i.hasNext()) {
		 System.out.println(i.next());
	 }
	 
	 assertEquals(43, 43);

	}

}
