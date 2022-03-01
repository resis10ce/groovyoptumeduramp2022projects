package com.optum.day2project.utilities

def process = "cmd /c dir/s *.groovy".execute()
println "${process.text}"