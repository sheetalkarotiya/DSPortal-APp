package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdefinations.BaseClass;

public class LoginPage extends BaseClass {
	
	public WebDriver driver;

	           
	
public LoginPage (WebDriver driver) {
	        	   	 
	       	    this.driver = driver;

	         }
	           
	
	 By signin = By.xpath("//a[contains(text(),'Sign in')]");
	 By Username = By.xpath("//input[@name='username']");
	 By Password = By.xpath("//input[@name='password']");
	 By login    = By.xpath("//input[@type='submit']");
	

	 
public void SignIn() {
	
	driver.findElement(signin).click();
	
}
	 
public void Username(String username) {
	
	driver.findElement(Username).sendKeys(username);
	
	
}
	 
public void Password(String password) {
	
	driver.findElement(Password).sendKeys(password);
	
	
}
	 
public void loginbutton() {
	
	driver.findElement(login).click();
}
	

public void validUsername() {
	
	driver.findElement(Username).sendKeys("SheetalKarotiya");
	
	
}

public void ValidPassword()	{
	
	driver.findElement(Password).sendKeys("Gill@1234");
	
}


	
}

