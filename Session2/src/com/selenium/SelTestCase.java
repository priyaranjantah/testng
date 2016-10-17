package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SelTestCase {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser(){
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver = new InternetExplorerDriver();
	
		
		
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		driver.quit();
		
	}

}
