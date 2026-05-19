package com.nt.comps;

public class Person 
{
private String name;
private String Address ;
private AadharDetails Aadhar;

public Person(String name, String address, AadharDetails aadhar) {
		System.out.println("Person :: (5)---------------------------------- Param Contructore");
	this.name = name;
	this.Address = address;
	this.Aadhar = aadhar;
	
}

@Override
public String toString() {
	return "Person [name=" + name + ", Address=" + Address + ", Aadhar=" + Aadhar + "] ";
}
}
