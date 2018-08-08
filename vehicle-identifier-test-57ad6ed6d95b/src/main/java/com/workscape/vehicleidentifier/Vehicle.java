package com.workscape.vehicleidentifier;

import java.util.Set;

public class Vehicle {
	
	String vehicleID;
	String frameMaterial;
	Set<Wheel> leftRear;
	String powerTrain;
	
	public String getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getFrameMaterial() {
		return frameMaterial;
	}

	public void setFrameMaterial(String frameMaterial) {
		this.frameMaterial = frameMaterial;
	}

	public Set<Wheel> getLeftRear() {
		return leftRear;
	}

	public void setLeftRear(Set<Wheel> leftRear) {
		this.leftRear = leftRear;
	}

	public String getPowerTrain() {
		return powerTrain;
	}

	public void setPowerTrain(String powerTrain) {
		this.powerTrain = powerTrain;
	}

	
	
	 class Wheel {	 
			String position;
			String material;
			 
			public String getPosition() {
				return position;
			}
			public void setPosition(String position) {
				this.position = position;
			}
			public String getMaterial() {
				return material;
			}
			public void setMaterial(String material) {
				this.material = material;
			}
					
	}

	

}
