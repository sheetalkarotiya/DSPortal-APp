package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepdefinations.BaseClass;

public class RegisterPage extends BaseClass{
   
	public WebDriver driver;

	 

	public RegisterPage(WebDriver driver) {
   	 
	    this.driver = driver;

  }
	 
	 By register = By.xpath("//a[text()=' Register ']");
	 By registerBtn = By.xpath("//input[@value='Register']");
	// By username = By.name("username");
	// By password = By.name("password1");
	// By password2 = By.name("password2");
	// By errorMessage = By.xpath("//div[@class='alert alert-primary']");
	 

	 
	 public void register() {
		 
		 driver.findElement(register).click();
		 
	 }
	 
	 public void registerbutton() {
		 
		 driver.findElement(registerBtn).click();
		 
	 }
	 
	 public void Username(String username) {
		 
	
		 WebElement usernameinput= driver.findElement(By.name("username"));
		 usernameinput.sendKeys(username);
		 	 
		 
	 }
	 
	 public void Password1(String password) {
		 
			
		 WebElement passwordinput= driver.findElement(By.name("password1"));
		 passwordinput.sendKeys(password);
		 	 
		 
	 } 
	 
	 public void Password2(String password) {
		 
			
		 WebElement passwordinput2= driver.findElement(By.name("password2"));
		 passwordinput2.sendKeys(password);
		 	 
	 }
	
	 
	 
	
	
	
}
