package stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utilities.Helper;

public class DataStructureSteps extends BaseClass{

	public HomePage HomePage;
    public 	RegisterPage RegisterPage;
    public LoginPage LoginPage;
    public DataStructurePage DataStructurePage;
    
    WebDriver driver = Helper.getDriver();
    
   

	@When("user click to Get Started button below Data Structure")
	public void user_click_to_get_started_button_below_data_structure() {
	    
		
		 DataStructurePage = new DataStructurePage (driver);
		
		 DataStructurePage.DataStructurebtn();
		 
		
	}
	@Then("User should land on DataStructures-Introducti-on-Introduction page")
	public void user_should_land_on_data_structures_introducti_on_introduction_page() {
	   
		
	}
}
