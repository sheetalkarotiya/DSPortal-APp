package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import stepdefinations.BaseClass;

public class QueuePage extends BaseClass {

    public WebDriver driver;
    By practicequestnbtn = By.xpath("//a[contains(text(),'Practice Questions')]");
    By tryherebtn = By.xpath("//a[contains(text(),'Try here>>>')]");
    By input = By.xpath("//div[@class='input']");
    By runbtn = By.xpath("//button[@type='button']");

    By pythonQueueImplmentation = By.xpath("//a[contains(text(),'Implementation of Queue in Python')]");

    By dequeImplmentation = By.xpath("//a[contains(text(),'Implementation using collections.deque')]");
    By arrayImplmentation = By.xpath("//a[contains(text(),'Implementation using array')]");

    By dropdown = By.xpath("//div[@class='nav-item dropdown']");
    By queuebutton = By.xpath("//a[contains(text(),'Queue')]");

    By queueOperation = By.xpath("//a[contains(text(),'Queue Operations')]");

    By signoutbutton = By.xpath("//a[contains(text(),'Sign out')]");
    By output = By.id("output");
    By loggedOutAlert = By.xpath("//div[@class='alert alert-primary']");

    public QueuePage(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToDropDown() {
        driver.findElement(dropdown).click();
    }

    public void clickQueueButton() {
        driver.findElement(queuebutton).click();

    }


    public void clickQueuePythonImplementation() {

        driver.findElement(pythonQueueImplmentation).click();
    }

    public void clickTryHere() {
        driver.findElement(tryherebtn).click();

    }

    public void enterInTheTestPage(String string) {
        driver.findElement(input).click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND);
        actions.sendKeys(string).perform();

    }

    public void clickRunButton() {

        driver.findElement(runbtn).click();
    }

    public void clickOkButton() throws
            InterruptedException {

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.accept();//click ok button
    }

    public void clickPraticeButton() {

        driver.findElement(practicequestnbtn).click();
    }

    public void getOutputText() {

        driver.findElement(output).getText();
    }
//tc005

    public void clickDequeImplementation() {

        driver.findElement(dequeImplmentation).click();
    }

    //tc006
    public void clickOperationButton() {

        driver.findElement(queueOperation).click();
    }

    //  tc007
    public void clickArrayImplementation() {

        driver.findElement(arrayImplmentation).click();
    }

    public void clickSignOut() {
        driver.findElement(signoutbutton).click();
    }

    public void getLoggedOut() {
        driver.findElement(loggedOutAlert).getText();
    }
}
