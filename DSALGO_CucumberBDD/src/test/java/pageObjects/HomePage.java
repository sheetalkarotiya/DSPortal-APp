package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdefinations.BaseClass;

public class HomePage extends BaseClass {

	         public WebDriver driver;
	  //constructor	         
public HomePage(WebDriver driver) {
	        	 
	    this.driver = driver;

  }         
	         
 By getstarted = By.xpath("//button[text()='Get Started']");
//TC003	 
By datastructurebtn = By.xpath("//*[contains(text(),'Data Structures-Introduction')]/../..//a");
By alert1  = By.xpath("//div[@class='alert alert-primary']");

//TC004
By dropdown = By.xpath("//a[contains(text(),'Data Structures')]");
By linkedlist = By.xpath("//a[contains(text(),'Linked List')]");
By alert2  = By.xpath("//div[@class='alert alert-primary']");

//TC005
By signin = By.xpath("//a[contains(text(),'Sign in')]");

//TC006
By register = By.xpath("//a[contains(text(),'Register')]/../../.");


//methods



public void getstarted() {
	 
	 driver.findElement(getstarted).click();

	 
}

public void Datastructure()
{
	  driver.findElement(datastructurebtn).click();
	  
}

public Boolean AlertMessage1 () {
	
	 return driver.findElement(alert1).isDisplayed();
	 
}

public void DropDown () {
	  
	  driver.findElement(dropdown).click();
}


public void LinkedList() {
	  
	  driver.findElement(linkedlist).click();
}

public Boolean AlertMessage2 () {
		
		 return driver.findElement(alert2).isDisplayed();
		 
	 }

public void signin() {
	 
	 driver.findElement(signin).click();
}

public void register() {
	 
	 driver.findElement(register).click();
}









}
