package com.optum.day1project.utilities

import java.awt.FlowLayout
@Grab('org.codehaus.groovy:groovy-swing:3.0.9')
def swingBuilder=new groovy.swing.SwingBuilder()
def langs=["Groovy", "Java", "C#", "Python"]
gui=swingBuilder.frame(size:[400,200],contentPane: null, 
	defaultCloseOperation: 0, title: 
	"Select Favourite Language", glassPane: null, layeredPane: null){
	
	
}

gui.show()