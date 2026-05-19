package com.nt.client;

import com.nt.comps.AadharDetails;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.factory.PersonFactory;

public class FactoryPstternSolutionTest {

	public static void main(String[] args) {
		
		Person emp = PersonFactory.getInstance("emp");
		
		System.out.println(emp);
		
		
		Person st =PersonFactory.getInstance("stud");
		
		System.out.println(st);
		
	}

}
