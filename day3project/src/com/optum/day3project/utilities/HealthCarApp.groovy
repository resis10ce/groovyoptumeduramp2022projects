package com.optum.day3project.utilities

import com.optum.day3project.models.Doctor
import com.optum.day3project.services.DoctorFacade
import com.optum.day3project.services.DoctorService
import com.optum.day3project.models.Gender
class HealthCarApp {
	def static void main(String[] args) {
		DoctorFacade doctorFacade=new DoctorService()		
		getDoctors()		
	}
	
	def static Doctor getDoctorInfo() {
		def doctor=new Doctor()
		doctor.mobileNo=9952032861
		doctor.firstName="Parameswari"
		doctor.lastName="Bala"
		doctor.gender=Gender.FEMALE
		println "$doctor.gender"
		doctor.email="Parameswaribala@gmail.com"
		doctor.regNo="TN48586"
		doctor.addressList
		return doctor
	}
	
	def static getDoctors() {
		List<Doctor> doctorList=new DoctorService().getAllDoctors()
		doctorList.forEach { t ->
			println "$t"
		}
	}
}
