package com.optum.day3project.services

import com.optum.day3project.models.Address
import com.optum.day3project.models.Doctor
import com.optum.day3project.models.Gender
import com.optum.day3project.helpers.DBHelper

import groovy.sql.Sql
class DoctorService implements DoctorFacade {
	
	private Sql conn
	private Properties properties
	private File propertyFile
	private boolean status
	private Doctor doctor
	private List<Doctor> doctorList
	
	
    public boolean createDoctorTable() {
		//loading the properties
		Properties properties=new Properties();
		File propertyFile=new File(DBHelper.getPropertyFileName())
		propertyFile.withInputStream { properties.load(it) }
		
				//establish db connection
		conn=DBHelper.getConnection()
		println properties.createDoctorTable
		
		conn.execute(properties.createDoctorTable)
		conn.close()
		status=true;
		return status;
	}
	
	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		File propertyFile=new File(DBHelper.getPropertyFileName())
		propertyFile.withInputStream { properties.load(it) }
		
				//establish db connection
		conn=DBHelper.getConnection()
		println properties.saveDoctor
		List<Object> params=new ArrayList<Object>();
		params.add(doctor.mobileNo)
		params.add(doctor.firstName)
		params.add(doctor.lastName)
		params.add(doctor.email)
		params.add(doctor.gender.toString())
		params.add(doctor.regNo)
		params.add(doctor.addressList)
		conn.connection.autoCommit=false
		try {
					
	       conn.executeInsert properties.saveDoctor, params
		   status=true
		   conn.commit()
		}
		catch(Exception ex)
		{
			conn.rollback()
			println("Transaction rollback")
		}	
		return status;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		doctorList=new ArrayList<Doctor>()
		Properties properties=new Properties();
		File propertyFile=new File(DBHelper.getPropertyFileName())
		propertyFile.withInputStream { properties.load(it) }		
		//establish db connection
		conn=DBHelper.getConnection()		
		println properties.getDoctors
		conn.query(properties.getDoctors) { resultSet ->
			while (resultSet.next()) {
			  doctor=new Doctor();
			  doctor.mobileNo=resultSet.getLong(1)
			  doctor.firstName=resultSet.getString(2)
			  doctor.lastName=resultSet.getString(3)
			  doctor.email=resultSet.getString(4)
			  doctor.gender= Gender.valueOf(resultSet.getString(5))
			  doctor.regNo=resultSet.getString(6)
			  doctorList.add(doctor);
			 
			}
		  }
		  return doctorList
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
