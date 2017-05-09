package com.nodom.model;

public class Customer {
	
	
	private int customerId;
	private String name;
	private String address;
	private long noOfOrder;
	
	public Customer(){
		super();
	}
	
	public Customer(int customerId, String name, String address, long noOfOrder){
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.noOfOrder = noOfOrder;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getNoOfOrder() {
		return noOfOrder;
	}
	public void setNoOfOrder(long noOfOrder) {
		this.noOfOrder = noOfOrder;
	}
	
	
}
