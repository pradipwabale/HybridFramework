package TestCases;

import org.testng.annotations.Test;

import DataDriven.ReadPropertyFile;
import PageObject.LoginPage;

@Test
public class TC_01 extends BaseClass{
	
	 
	public void LoginTest(){
		
		LoginPage lp=new LoginPage(driver);
		
		
		 lp.setUserName("pradip");
		lp.setPassword("wable");
		lp.clickSubmit();
		 
	}
	

}
