package com.nt.comps;

public class Employee extends Person {

	
	private int empId;
	private String desg;
	
	
	public Employee(String name, String address, AadharDetails aadhar ,int emp , String desg) {
		super(name, address, aadhar);
		System.out.println("Employee . Employee () :: (5)--- Param contructore");
		
		this.empId= empId;
		this.desg=desg;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", desg=" + desg + "]--> "+super.toString();
	}

}
