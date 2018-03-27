I have created framework in below Environment 

Selenium Webdriver - 3.8.1
IntelliJ IDEA 2017.3.3
Language - Java (1.8)
Build - Maven 4
Tools - TestNg 6.10
Windows 10 - 64Bit

It is a Page Object Model. For each web page I have created class under src/main/java/PageObjects directory. 

In src/main/java there is a TTPTechnicalTest directory in which:

	- I have created BasePage where Webdriver is declared. 
	  I have extended this page to all test pages so no need to declare driver again anywhere in framework.

	- I have created BrowserSelector class for browser selection. I am using different version of driver for each web browser.
      I have included all drivers (gecko, chrome & IE) in framework for your ready reference.	
	  Browsers are latest version. Chrome 64, Firefox 57. 
	  
	- Test data is coming from property files located under test/Resources/Properties. 
	  In LoadProp class property file loading configuration is there.

    - All reusable methods are stored in Utils class. 	  

In src/test/java there is a TTPTechnicalTest directory in which:
	  
	- There is a BeseTest class in which I have created all object of pages, BeforeMethod to openBrowser 
	  and AfterMethod to close browser and take screenshot if test fails.

    - I have created Programming page which contains Java test for Excersie 1 - Programming.
    - I have created WebFrontEndTest page which contains wikipedia functional test for Excersie 2 - Web Front-End Test.

Screenshots will be saved under target/Screenshots


 



 




	  
  


