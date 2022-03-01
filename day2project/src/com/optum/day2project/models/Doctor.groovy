package com.optum.day2project.models

import groovy.transform.Canonical

//@Canonical
class Doctor {
	//auto generated setters and getters
	private long mobileNo
	private String firstName;
	private String lastName;
	private Address[] addressList;
	private String email
	private String regNo
	private Gender gender

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName=$firstName, MobileNo=$mobileNo";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Doctor doctorObj=obj;
		return this.mobileNo == doctorObj.mobileNo
	}
	
	
	
}
