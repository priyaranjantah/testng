package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 * Created by PPTAH on 9/14/14.
 */
public class Bescom {
    public static void main(String[] args) {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    options.addArguments("disable-extensions");
    WebDriver driver = new ChromeDriver(options);
    driver.get ("http://bescom.org/en/consumer-portal-for-online-services/");
    driver.findElement(By.cssSelector("#post-18821 > div > p:nth-child(4) > a > img")).click();
        driver.findElement(By.cssSelector("#ctl00_ctl00_MasterPageContentPlaceHolder_ucLogin_txtUserName")).click();
        driver.findElement(By.id("ctl00_ctl00_MasterPageContentPlaceHolder_ucLogin_txtUserName")).sendKeys("bindudey");
        driver.findElement(By.cssSelector("#ctl00_ctl00_MasterPageContentPlaceHolder_ucLogin_txtPassword")).click();
        driver.findElement(By.id("ctl00_ctl00_MasterPageContentPlaceHolder_ucLogin_txtPassword")).sendKeys("ganesha123");
        driver.findElement(By.name("ctl00$ctl00$MasterPageContentPlaceHolder$ucLogin$btnLogin")).click();


}
}