package com.nt.comps;

public class Student extends Person {

	
	private int studId;
	private String course;	
	
	
	public Student(String name, String address, AadharDetails aadhar ,int studId, String course) {
		super(name, address, aadhar);
		System.out.println("Student . Student () :: 5--- Param contructore");
		
		this.studId=studId;
		this.course=course;
	}

	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", course=" + course + "] ---> "+super.toString();
	}

}
