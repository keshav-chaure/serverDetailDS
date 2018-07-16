package com.kc.ServerMaintainance;

import java.util.Map;

public class SoftwareType {
	String name;
	Map<String,Software> softwares;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Software> getSoftwares() {
		return softwares;
	}
	public void setSoftwares(Map<String, Software> softwares) {
		this.softwares = softwares;
	}
	
	@Override
	public String toString() {
		return "SoftwareType [name=" + name + ", softwares=" + softwares + "]";
	}
	
	

}
