package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;
import utilities.Helper;

public class StackSteps {
    StackPage stackPage;

    @Given("user open the DSApp")
    public void user_open_the_application() {

        stackPage = new StackPage(Helper.getDriver());
        Helper.openPage("https://dsportalapp.herokuapp.com/");
    }

    @When("user click to Get Started button on DSPortal Home page")
    public void user_click_to_get_started_button() {
        stackPage.clickGetStarted();
    }

    @When("user navigate to sign in button on DSPortal Home page")
    public void user_navigate_to_sign_in_button() {

        stackPage.clickSignInLink();
    }

    @When("user enters valid Username")
    public void user_enters_username() {

        stackPage.setUserName("Candy");
    }

    @When("user enters valid Password")
    public void user_enters_password() {

        stackPage.setPassword("help2010");
    }

    @Then("user logged In into Homepage")
    public void user_should_be_logged_in_into_homepage() {

        stackPage.clickBtnLogin();
    }

    @When("user click on dropdown on get started page")
    public void user_navigate_to_dropdown_of_data_structures() {
        stackPage.navigateToDropDown();
    }

    @When("user click the stack button")
    public void user_click_the_stack_button() {
        stackPage.clickStackButton();

    }

    @Then("User should redirected to Stack page")
    public void user_should_redirected_to_stack_page() {

    }

    @When("user click on Implementation of Stack")
    public void user_click_on_get_implementation_of_stack_in_python_link() {
        stackPage.clickImplementationLink();
    }

    @Then("user should land on Implementation of Stack in Python page")
    public void user_should_land_on_implementation_of_stack_in_python_page() {
    }

    @Then("user will land on TryEditor page on stack page")
    public void user_will_land_on_try_editor_page() {

    }

    @When("user click the try here button on stack page")
    public void user_click_the_try_here_button() {
        stackPage.clickTryHere();
    }

    @Then("user should be redirected to the try editor stack page")
    public void user_should_be_redirected_to_the_try_editor_page() {

    }

    @When("user enters the code {string} in the stack page")
    public void user_enters_the_in_the_test_page(String string) {
        stackPage.enterInTheTestPage(string);

    }

    @When("user clicks on Run button on try editor page")
    public void user_clicks_on_run_button() {
        stackPage.clickRunButton();
    }

    @Then("user should get an Syntax error message")
    public void user_should_get_an_syntx_error_message() {

    }

    @Then("user clicks ok Button on stack syntax error on stack try editor page")
    public void user_clicks_ok_button() throws
            InterruptedException {

        stackPage.clickOkButton();
    }

    @When("user should see the code output")
    public void user_should_see_output() {
        stackPage.getOutputText();
    }
//tc005

    //  tc007
    @When("user clicks on Stack Application")
    public void user_clicks_on_stack_application() {

        stackPage.clickStackApplication();
    }

    @Then("user should land on Stack Application")
    public void user_should_land_on_stack_application() {
    }

    @When("user clicks on Stack Operations")
    public void user_clicks_on_stack_operations() {

        stackPage.clickOperationButton();
    }

    @Then("user should land on Stack Operations")
    public void user_should_land_on_stack_operations() {
    }

    @When("user clicks to the Practice Questions Button on Stack page")
    public void user_clicks_to_the_Practice_Questions_Button() {

        stackPage.clickPraticeButton();

    }

    @Then("user redirected to the practice questions page on stack page")
    public void user_redirected_to_the_practice_questions_page() {

    }

    @Then("user will Sign out from stack page")
    public void user_will_sign_out() {
        stackPage.clickSignOut();
    }

    @Then("user will see logout message after signing out")
    public void user_will_see_logout_message() {
        stackPage.getLoggedOut();
    }

}