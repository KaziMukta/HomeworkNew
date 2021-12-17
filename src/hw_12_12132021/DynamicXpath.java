package hw_12_12132021;


public class DynamicXpath {
	
	/* 1. Tag with a single attribute:
	
	 Source: https://www.bankofamerica.com/
	Example:
	Small Business =//a[@id='NAV_BUSINESS_ADVANTAGE'] 
	Checking=//a[@id='navChecking']
	Online ID=//input[@id='onlineId1']
	
	 2. Tag with multiple attribute with 'and' logic 
	 Source: https://www.bankofamerica.com/
	 Example:
	 Online ID= //input[@class='spa-input-text' and @name='onlineId1']	
	 Password = //input[@name='passcode1' and @class='tl-private spa-input-text']
	 Security and Help= //a[@id='security' and @class='spa-ui-layer-link spa-fn spa-ui-layer-modal-link']		
			
			
	3. Tag with multiple attribute with 'or' logic:
	 Source: https://www.bankofamerica.com/
	Example:
	Online ID=(//input[@class='spa-input-text' or @name='onlineId1'])[3]
	PassCode=//input[@id='passcode1'or @name='passcode1']
	Schedule An Appointment=//a[@id='apptScheduler' or @class='appt-scheduler']
			
		
	4. Tag with inner text [means complete text] 		
	Source: https://www.bankofamerica.com/
	Example:
	Credit Cards=(//span[text()='Credit Cards'])[1]
	Savings= (//span[text()='Savings'])[1]
	Open Account= //div[text()='Open account']
	Home Loans= (//span[text()='Home Loans'])[1]
	Mobile Banking =(//a[text()='Mobile Banking'])[2]
	
   5) Tag with inner text [not actual text, means partial text as well as actual text] 
      Source: https://www.bankofamerica.com/
	Example:
	Better Money Habits@=//span[contains(text(),'Bet')]
	Investing=(//span[contains(text(),'Inv')])[1]
	Home Loans=(//span[contains(text(),'Hom')])[1]
	
   
   6) Tag with attributes and use of contains 
    Source: https://www.bankofamerica.com/
	Example:
   Security=//a[contains(@id,'NAV_SEC')]
   Contact Us =(//a[contains(@class,'non')])[1]
   Enroll= //a[contains(@id,'enr')]
   
   7) Normalize space -- eliminates leading and trailing spaces.
    Source: https://www.bankofamerica.com/
	Example:
	Search= //span[normalize-space(text())='Search']
	
	8) Starts with text
	 Source: https://www.bankofamerica.com/
	Example:
	Celebrate the season= //span[starts-with(text(),'Cel')]
	Open account =//div[starts-with (text(),'Open ac')]
	Security & help=//a[starts-with(text(),'Security &')]
	
	 9) Starts with attribute 
	  Source: https://www.bankofamerica.com/
	Example:
	Personal= (//a[starts-with(@id,'NA')])[1]
	Savings= (//span[starts-with(@class,'tit')])[2]

   
	*/
	
	
}
