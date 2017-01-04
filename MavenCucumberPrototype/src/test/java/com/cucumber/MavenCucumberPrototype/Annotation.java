package com.cucumber.MavenCucumberPrototype;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by tahp1 on 11/5/2016.
 */
public class Annotation {

    WebDriver driver = null;

    @Given("^I am on Facebook login page$")
    public void goToFacebook() {
//        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
    }

    @When("^I enter username as \"(.*)\"$")
    public void enterUsername(String arg1) {
        driver.findElement(By.id("email")).sendKeys("priyaranjantah@gmail.com");
    }

    @When("^I enter password as \"(.*)\"$")
    public void enterPassword(String arg1) {
        driver.findElement(By.id("pass")).sendKeys("$Parvati123");
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^Login should pass$")
    public void checkFail() {
        if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php? login_attempt=1&lwv=110")) {
            System.out.println("Test1 Pass");
        } else {
            System.out.println("Test1 Failed");
        }
        driver.close();
    }

    @Then("^Relogin option should be available$")
    public void checkRelogin() {
        if (driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php? login_attempt=1&lwv=110")) {
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }
        driver.close();

    }
}