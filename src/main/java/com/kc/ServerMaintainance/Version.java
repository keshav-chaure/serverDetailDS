package com.kc.ServerMaintainance;

public class Version {
	int major;
	int minor;
	int patch;
	
	
	public Version() {
		super();
	}
	public Version(int major, int minor, int patch) {
		super();
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}
	public int getMajor() {
		return major;
	}
	public void setMajor(int major) {
		this.major = major;
	}
	public int getMinor() {
		return minor;
	}
	public void setMinor(int minor) {
		this.minor = minor;
	}
	public int getPatch() {
		return patch;
	}
	public void setPatch(int patch) {
		this.patch = patch;
	}
	@Override
	public String toString() {
		return "Version [major=" + major + ", minor=" + minor + ", patch=" + patch + "]";
	}
	
	

}
