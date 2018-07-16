package com.kc.ServerMaintainance;

import java.util.Map;

public class Software {
	String name;
	Map<String,Version> versions;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Version> getVersions() {
		return versions;
	}
	public void setVersions(Map<String, Version> versions) {
		this.versions = versions;
	}
	@Override
	public String toString() {
		return "Software [name=" + name + ", versions=" + versions + "]";
	}
	

}
