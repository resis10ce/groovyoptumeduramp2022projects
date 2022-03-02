package com.optum.day3project.parsers
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
//run as java application
if(args.size()<=0)
	println "Not Exists"

fileName=args[0]

println "$fileName"

//json string to json object
jsonObject=new JsonSlurper().parseText('{"customerId":27469,"name":"Rathna"}')

println "$jsonObject.customerId,$jsonObject.name"



