package com.nt.comps;

public class Customer extends Person {

	
	private double billAmt;
	private String txId;
	
	
	public Customer(String name, String address, AadharDetails aadhar ,double billAmt, String txtId) {
		super(name, address, aadhar);
		System.out.println("Cumstomer . Customer () :: 2--- Param contructore");
		
		this.billAmt=billAmt;
		this.txId=txtId;
	}


	@Override
	public String toString() {
		return "Customer [billAmt=" + billAmt + ", txId=" + txId + "] --->"+super.toString();
	}


	

}
