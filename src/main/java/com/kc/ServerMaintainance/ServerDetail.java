package com.kc.ServerMaintainance;

import java.util.Map;

public class ServerDetail {
	String name;
	Map<String,SoftwareType> softwareTypes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, SoftwareType> getSoftwareTypes() {
		return softwareTypes;
	}
	public void setSoftwareTypes(Map<String, SoftwareType> softwareTypes) {
		this.softwareTypes = softwareTypes;
	}
	@Override
	public String toString() {
		return "ServerDetail [name=" + name + ", softwareTypes=" + softwareTypes + "]";
	}
	
	
	
	

}
