package stepdefinations;


import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.QueuePage;
import utilities.Helper;

public class QueueStep extends BaseClass {
    QueuePage queuePage;

    @Given("user open the application")
    public void user_open_the_application() {

        queuePage = new QueuePage(Helper.getDriver());
        Helper.openPage("https://dsportalapp.herokuapp.com/");
    }

    @When("user click to Get Started button")
    public void user_click_to_get_started_button() {
        queuePage.clickGetStarted();
    }

    @When("user navigate to sign in button")
    public void user_navigate_to_sign_in_button() {

        queuePage.clickSignInLink();
    }

    @When("user enters Username")
    public void user_enters_username() {

        queuePage.setUserName("Candy");
    }

    @When("user enters Password")
    public void user_enters_password() {

        queuePage.setPassword("help2010");
    }

    @Then("user should be logged In into Homepage")
    public void user_should_be_logged_in_into_homepage() {

        queuePage.clickBtnLogin();
    }

    @When("user navigate to dropdown of data-structures")
    public void user_navigate_to_dropdown_of_data_structures() {
        queuePage.navigateToDropDown();
    }

    @When("user click the queue button")
    public void user_click_the_queue_button() {
        queuePage.clickQueueButton();

    }

    @Then("User should redirected to Queue page")
    public void user_should_redirected_to_queue_page() {

    }

    @When("user click on Implementation of Queue in Python link")
    public void user_click_on_get_implementation_of_queue_in_python_link() {
        queuePage.clickQueuePythonImplementation();
    }

    @Then("user should land on Implementation of Queue in Python page")
    public void user_should_land_on_implementation_of_queue_in_python_page() {
    }


    @When("user Click to TryHere button")
    public void user_click_to_try_here_button() {
        queuePage.clickTryHere();

    }

    @Then("user will land on TryEditor page")
    public void user_will_land_on_try_editor_page() {

    }

    @When("user click the try here button")
    public void user_click_the_try_here_button() {
        queuePage.clickTryHere();
    }

    @Then("user should be redirected to the try editor page")
    public void user_should_be_redirected_to_the_try_editor_page() {

    }

    @When("user enters the {string} in the test page")
    public void user_enters_the_in_the_test_page(String string) {
        queuePage.enterInTheTestPage(string);

    }

    @When("user enters the code {string} in the test page")
    public void user_enters_the_code_in_the_test_page(String inputText) {
        queuePage.enterInTheTestPage(inputText);
    }

    @When("user clicks on Run button")
    public void user_clicks_on_run_button() {
        queuePage.clickRunButton();
    }

    @Then("user should get an Syntx error message")
    public void user_should_get_an_syntx_error_message() {

    }

    @Then("user clicks ok Button")
    public void user_clicks_ok_button() throws
            InterruptedException {

        queuePage.clickOkButton();
    }

    @When("user should see output")
    public void user_should_see_output() {
        queuePage.getOutputText();
    }
//tc005

    @When("user click on Implementation using collections.deque")
    public void user_click_on_Implementation_using_collections_deque() {
        queuePage.clickDequeImplementation();
    }

    @Then("user should land on Implementation using collections.deque")
    public void user_should_land_on_implementation_using_collection_deque() {
    }

    //tc006
    @When("user click on Implementation using Array")
    public void user_click_on_Implementation_using_array() {

        queuePage.clickArrayImplementation();
    }

    @Then("user should land on Implementation using Array")
    public void user_should_land_on_implementation_using_array() {
    }

    //  tc007
    @When("user clicks on Queue Operations")
    public void user_clicks_on_queue_operations() {

        queuePage.clickOperationButton();
    }

    @Then("user should land on Queue Operations")
    public void user_should_land_on_queue_operations() {
    }

    @When("user clicks to the Practice Questions Button")
    public void user_clicks_to_the_Practice_Questions_Button() {

        queuePage.clickPraticeButton();

    }

    @Then("user redirected to the practice questions page")
    public void user_redirected_to_the_practice_questions_page() {

    }

    @Then("user will Sign out")
    public void user_will_sign_out() {
        queuePage.clickSignOut();
    }

    @Then("user will see logout message")
    public void user_will_see_logout_message() {
        queuePage.getLoggedOut();
    }

}