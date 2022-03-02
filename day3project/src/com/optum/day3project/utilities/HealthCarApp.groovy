package com.optum.day3project.utilities

import com.optum.day3project.services.DoctorFacade
import com.optum.day3project.services.DoctorService

class HealthCarApp {
	def static void main(String[] args) {
		//DoctorFacade doctorFacade=new DoctorService()
		def status = new DoctorService().createDoctorTable()
		println "$status"		
	}
	
}
