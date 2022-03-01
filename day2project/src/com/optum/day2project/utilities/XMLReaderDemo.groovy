package com.optum.day2project.utilities
@Grab('org.codehaus.groovy:groovy-xml:3.0.9')
import groovy.xml.XmlSlurper
filePath="src/com/optum/day2project/resources/product.xml"

def products=new XmlSlurper().parse(new File(filePath))

for(Object obj : products.Product) {
	println "$obj.Name ===> $obj.Price"
}