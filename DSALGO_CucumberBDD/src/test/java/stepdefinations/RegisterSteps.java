package stepdefinations;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import utilities.Helper;

public class RegisterSteps extends BaseClass{
	
	public HomePage HomePage;
        public 	RegisterPage RegisterPage;
	
	
	@Given("user Navigate to the Register Page of DSPortal")
	public void user_Navigate_to_the_Register_Page_of_DSportal() {
	 
	WebDriver driver = Helper.getDriver();
	
	driver.get("https://dsportalapp.herokuapp.com/register");
	
			RegisterPage = new RegisterPage(driver);
			
	}


	@When("user clicks registration button")
	public void user_clicks_registration_button() {
	
		
   //   Helper.openPage("https://dsportalapp.herokuapp.com/register");
		
     RegisterPage.register();
     
	}
	@Then("user should get an error message below username textbox")
	public void user_should_get_an_error_message_below_username_textbox() {
	 
	   
	}

	@Given("user enters valid username {string}")
	public void user_enters_valid_username(String username) {
	 
		RegisterPage.Username(username);
	   
	}
	@Then("user should get an error message below password textbox")
	public void user_should_get_an_error_message_below_password_textbox() {
	 
	   
	}

	@Given("the user enters valid password  {string}")
	public void _user_enters_valid_password(String password) {
	 
		RegisterPage.Password1(password);
	   
	}
	@Then("user should get an error message below password confirmation box")
	public void user_should_get_an_error_message_below_password_confirmation_box() {
	 
	   
	}

	@Given("user enters symbols as username {string}")
	public void user_enters_symbols_as_username(String username) {
	 
		RegisterPage.Username(username);
	   
	}
	@Given("the user enters valid password {string}")
	public void the_user_enters_valid_password(String password) {
	 
		RegisterPage.Password1(password);
	   
	}
	@Given("also matching confirmatory password {string}")
	public void also_matching_confirmatory_password(String password) {
	 
		RegisterPage.Password2(password);
	   
	}
	@Then("user should get an error message")
	public void user_should_get_an_error_message() {
	 
	 
	}

	@Given("also non-matching confirmatory password {string}")
	public void also_non_matching_confirmatory_password(String string) {
		
		
	  
	}
	@Then("user should get error message")
	public void user_should_get_error_message() {
	   
		
	}
	
	
	@Given("matching confirmatory password {string}")
	public void matching_confirmatory_password(String password) {
	   
		RegisterPage.Password2(password);
		
	}
	@Then("user should be redirected to homepage")
	public void user_should_be_redirected_to_homepage() {
	  
		
		
	}



	

}
