package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	
	 

	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;

	@FindBy(xpath = "//button[@name='login']")
	WebElement btnLogin;

	public void setUserName(String name) {
		 username.sendKeys(name);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickSubmit() {
		btnLogin.click();

}

	 
}