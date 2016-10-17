package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AzureDebugConsole {
//	public  void testAzure () throws InterruptedException {

public static void main(String[] args) throws InterruptedException{
	
	
	System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
		 WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.portal.azure.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.findElement(By.id("priya_tah_rsaglobaltest_onmicrosoft_com")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("cred_password_inputtext")).sendKeys("$Ganesha123");

}
}
