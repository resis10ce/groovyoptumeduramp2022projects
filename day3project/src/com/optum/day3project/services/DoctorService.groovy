package com.optum.day3project.services

import com.optum.day3project.models.Address
import com.optum.day3project.models.Doctor
import com.optum.day3project.helpers.DBHelper

import groovy.sql.Sql
class DoctorService implements DoctorFacade {
	
	private Sql conn
	

	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		conn=DBHelper.getConnection()
		return true;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorById(long mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDoctorById(long mobileNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Doctor updateDoctorAddress(long mobileNo, Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

	
	
	
}
