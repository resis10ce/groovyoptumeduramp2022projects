package com.optum.day2project.utilities

import com.optum.day2project.models.Doctor

class DoctorApp {

	static void main(args) {
		// TODO Auto-generated method stub
		//create object
		def doctor1=new Doctor()
		doctor1.mobileNo=5969879
		def doctor2=new Doctor()
		doctor2.mobileNo=3274769
		println "Doctor Name $doctor1"		
		println doctor1.equals(doctor2)
		println doctor1.hashCode()
		println doctor2.hashCode()
	}
}
