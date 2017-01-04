package com.cucumber.MavenCucumberPrototype;

/**
 * Created by tahp1 on 12/21/2016.
 */

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.List;
import java.util.concurrent.TimeUnit;

    public class Wsus {

        WebDriver driver = null;

        @Given("^I am on suvp login page$")
        public void i_am_on_suvp_login_page() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.navigate().to("https://connect.microsoft.com/suvp/downloads");

        }

        @When("^I enter account name as \"([^\"]*)\"$")
        public void i_enter_account_name_as(String arg1) throws Throwable {
            Thread.sleep(5000);
            driver.findElement(By.id("i0116")).sendKeys("ankit.mathur@emc.com");

        }

        @When("^I click on next button$")
        public void i_click_on_next_button() throws Throwable {
            Thread.sleep(5000);
            driver.findElement(By.id("idSIButton9")).click();

        }

        @When("^I type the password as \"([^\"]*)\"$")
        public void i_type_the_password_as(String arg1) throws Throwable {
            Thread.sleep(5000);
            driver.findElement(By.id("i0118")).sendKeys("PWRkiller!");

        }

        @When("^I click on the keep me signed in checkbox$")
        public void i_click_on_the_keep_me_signed_in_checkbox() throws Throwable {
            driver.findElement(By.id("idTd_PWD_KMSI_Cb")).click();
        }

        @Then("^I am logged in to the portal$")
        public void i_am_logged_in_to_the_portal() throws Throwable {
            driver.findElement(By.id("idSIButton9")).click();

            List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadList\"]/tbody/tr[2]"));
            System.out.println("printing header count:" + header.size());
            List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadList\"]/tbody/tr"));
            System.out.println("printing row count:" + row.size());
            Thread.sleep(5000);
            List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadList\"]/tbody/tr[3]/td"));
            System.out.println("printing column count:" + col.size());
        }

        @When("^I click on the link containing \"([^\"]*)\" for the current month$")
        public void i_click_on_the_link_containing_for_the_current_month(String arg1) throws Throwable {
            driver.findElement(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadList\"]/tbody/tr[3]/td[2]/div/a")).click();
        }

        @Then("^I am download the respective update and metadata files to my local computer$")
        public void i_am_download_the_respective_update_and_metadata_files_to_my_local_computer() throws Throwable {

            List<WebElement> header = driver.findElements(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadDetail\"]/tbody/tr[1]"));
            System.out.println("printing header count:" + header.size());
            List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadDetail\"]/tbody/tr"));
            System.out.println("printing row count:" + row.size());
            Thread.sleep(5000);
            List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadDetail\"]/tbody/tr[2]/td"));
            System.out.println("printing column count:" + col.size());
            driver.findElement(By.xpath("//*[@id=\"ctl00_MasterBody_DownloadDetail_ctl02_DownloadFileLink\"]")).click();
            Thread.sleep(50000);
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.download.manager.showWhenStarting", false);
            profile.setPreference("browser.download.dir", "C:\\WSUS_Local_Download");
            profile.setPreference("browser.download.folderList", 2);
            profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/exe");
            profile.setPreference( "browser.download.manager.showWhenStarting", false );
            profile.setPreference( "pdfjs.disabled", true );

        }
    }


