package com.nt.client;

import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

public class FacteryPatterSolutionTest  {

	public static void main(String[] args)
	{
		AadharDetails details = new AadharDetails(99999999L,22,8888888888L);	//dependent class object 
		Person st = new Student("Noor_","Khargone",details,1048,"Adv_Java"); // target class object having target class object
		System.out.println(st);
		
	System.out.println("==========================================================================================");
	
	AadharDetails details1 = new AadharDetails(1111111111L,23,444444444L);	//dependent class object 
	Person emp = new Employee("Noora_Ali","nizamabad",details1,448,"Java_AI_Developer"); // target class object having target class object
	System.out.println(emp);
	
	
	}

}
