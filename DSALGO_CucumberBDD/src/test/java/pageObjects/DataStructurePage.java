package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import stepdefinations.BaseClass;

public class DataStructurePage  extends BaseClass{

	WebDriver driver;
	
	public DataStructurePage( WebDriver driver) {
		
		this.driver = driver;
	}
	
	By datastructurebtn = By.xpath("//*[contains(text(),'Data Structures-Introduction')]/../..//a");


	 
	 public void DataStructurebtn() {
		 
		 driver.findElement(datastructurebtn).click();
		 
	 }
	 
	 
	 
}
