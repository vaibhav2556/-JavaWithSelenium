Feature: Login Functionality 


Background: Login user 
	Given user available on login page 
	When user enter "Admin" 
	When user  are enter "admin123" 
	When user click on login button 
	
	
	
	
	@smoke
Scenario: Verify Login Functionality 
#Given user available on login page 
#When user enter "<username>" 
#When user  are enter "<password>"
#When user click on login button 
#Then user  navigate to home page 
	Then user  navigate to home page 
	When user click on welcome button 
	Then user click on logout button 
	Then user able to logout from application 
	And close the browser 
	
	#Examples: 
	
	#	|username|password|
	#	|Admin|admin123|
    #	|Admin4544|admin123|
	
	# when we used  Scenario with outline and example keyword then
	# we cannot use background keyword
	#
	
    Scenario: Verify PIN Module 


	When  user click on PIN Module 
	Then  user able to see sub module and user click on Reports module 
	Then  user navigate to report page and user enter report name into text box 
	And  click on search button 
	Then  user able to see report 
	#When user is click on welcome button 
	#Then user click on logout button and wait
	#Then user able to logout 
	And  finaly close the browser 
	
	
	
	
	
	
