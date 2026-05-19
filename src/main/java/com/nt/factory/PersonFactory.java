package com.nt.factory;

import com.nt.comps.AadharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

// fectory  pattern  class
public class PersonFactory 
{
	// public static  Factory methode creating returing  one of Person(AC) sub class object
	
	// this methode contains factory pattern 
	public static Person getInstance(String PersonType)
	{
		Person per = null;
		if (PersonType.equalsIgnoreCase("emp"))
		{
			AadharDetails details = new AadharDetails(33333333L,23,444444444444L);		//dependance  class obje
			per = new Employee("Noor Khan", "Khargone", details,1001,"Clerk");   		// target classs subj 
		}
		
		else if (PersonType.equalsIgnoreCase("cust"))
		{
			AadharDetails details = new AadharDetails(33333333L,24,444444444444L);
			per = new Customer(" Noora Allyyy", "Maharashtra", details,4000,"333RR33");
		}
		
		else if (PersonType.equals("stud"))
		{
			AadharDetails details = new AadharDetails(33333333L,25,444444444444L);
			per = new Student("Fateh Khan", "Khargone", details,4448,"Adv.Java");
		}
		else {
			throw new IllegalArgumentException("Invalide Peron Types");
		}
		return per;
	}

	private static Exception IllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
