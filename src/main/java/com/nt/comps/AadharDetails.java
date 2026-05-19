package com.nt.comps;

public class AadharDetails 
{
private long AadharNo;
private int age;
private long MobileNo;

		//  alt + shif +s, o ---> constructore
public AadharDetails(long aadharNo ,int age,long mobileNo) {
	super();
	this.AadharNo = aadharNo;
	this.age = age;
	this.MobileNo = mobileNo;
	
}

@Override
public String toString() {
	return "AadharDetails [AadharNo=" + AadharNo + ", age=" + age + ", MobileNo=" + MobileNo + "]";
}
}
