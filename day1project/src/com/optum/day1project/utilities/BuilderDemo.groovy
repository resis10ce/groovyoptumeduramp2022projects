package com.optum.day1project.utilities

@Grab('org.codehaus.groovy:groovy-xml:3.0.9')
import groovy.xml.*

def page=new MarkupBuilder()
page.html{
	head {title 'Optum'}
	body { 
		
		ul{
			for(count in 1..5) {
				li "Project $count"
			}
			
		}
	}
}
