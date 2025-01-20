package com.qspiders.contactManagementTask.entity;

public class Contact {

	private String firatName;
	private String lastName;
	private long mobile;
	private String email;
	private String address;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String firatName, String lastName, long mobile, String email, String address) {
		super();
		this.firatName = firatName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}
	public String getFiratName() {
		return firatName;
	}
	
	public void setFiratName(String firatName) {
		this.firatName = firatName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "[firatName=" + firatName + ", lastName=" + lastName + ", mobile=" + mobile + ", email=" + email
				+ ", address=" + address + "]";
	}
	
	
}
