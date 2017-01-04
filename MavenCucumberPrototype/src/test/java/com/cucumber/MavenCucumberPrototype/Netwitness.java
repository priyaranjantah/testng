package com.cucumber.MavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by tahp1 on 11/15/2016.
 */
public class Netwitness {

    WebDriver driver = null;


    @Given("^I am on Netwitness login page$")
    public void i_am_on_Netwitness_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("http://nweuiapp.azurewebsites.net/nwepc-ui/#/login");
    }

    @When("^I enter user name as \"([^\"]*)\"$")
    public void i_enter_user_name_as(String arg1) throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.id("ember449")).sendKeys("ecat10");
    }

    @When("^I enter the password as \"([^\"]*)\"$")
    public void i_enter_the_password_as(String arg1) throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.id("ember451")).sendKeys("mypassword");
    }

    @Then("^I am able to login to the portal$")
    public void i_am_able_to_login_to_the_portal() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.id("ember460")).click();
        Thread.sleep(5000);


        List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/table/thead/tr"));
        System.out.println("printing header count:" + header.size());
        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/table/tbody/tr"));
        System.out.println("printing row count:" + row.size());
        Thread.sleep(5000);
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/table/tbody/tr[1]/td"));
        System.out.println("printing column count:" + col.size());

    }

    @When("^I click on Agents tab in the portal$")
    public void i_click_on_Agents_tab_in_the_portal() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ember378\"]/div/div/div[2]")).click();
    }

    @Then("^I am able to view the Agent counts$")
    public void i_am_able_to_view_the_Agent_counts() throws Throwable {
        Thread.sleep(10000);
    }

    @When("^I click on IOC tab in the portal$")
    public void i_click_on_IOC_tab_in_the_portal() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ember378\"]/div[1]/div/div[3]")).click();
    }

    @Then("^I am able to view the IOC counts$")
    public void i_am_able_to_view_the_IOC_counts() throws Throwable {
        Thread.sleep(10000);
        List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/div/table/thead/tr"));
        System.out.println("printing header count:" + header.size());

        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/div/table/tbody/tr"));
        System.out.println("printing row count:" + row.size());
        Thread.sleep(5000);
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/div/table/tbody/tr[1]/td"));
        System.out.println("printing column count:" + col.size());

        Thread.sleep(5000);
        driver.findElement(By.id("piechartsample")).isDisplayed();
    }

    @When("^I click on the agent link$")
    public void i_click_on_the_agent_link() throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/div/table/tbody/tr[1]")).click();


    }

    @Then("^I am able to view the agent module$")
    public void i_am_able_to_view_the_agent_module() throws Throwable {
        Thread.sleep(10000);

        List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/table/thead/tr"));
        System.out.println("printing header count:" + header.size());

        List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/table/tbody/tr"));
        System.out.println("printing row count:" + row.size());
        Thread.sleep(5000);
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"ember378\"]/div[2]/header/div/article/div/table/tbody/tr[1]/td"));
        System.out.println("printing column count:" + col.size());
    }
}