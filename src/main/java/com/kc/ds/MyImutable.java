package com.kc.ds;

import java.util.Date;

class City{
 
	String name;	
	 
	City(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
} 

public final class MyImutable {
	private final int id;
	private  final String name;
    private final Date mutableDate;
    private final City city;
	
	MyImutable(int id,String name,Date date,City city){
		this.id=id;
		this.name=name;
		 this.mutableDate=new Date(date.getTime());
		 this.city= new City(city.getName());		 
	}
	
	public int getId() {
		return this.id;
	}
	
	public String  getName() {
		return this.name;
	}

	public Date getMutableDate() {
		return new Date(mutableDate.getTime());
	}
}
