package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by PPTAH on 9/14/14.
 */
public class Bangaloreone {
    public static void main(java.lang.String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.bangaloreone.gov.in/public/default.aspx");
        driver.findElement(By.cssSelector("#msuLoginSubmit")).click();
        driver.findElement(By.cssSelector("#txtUserId")).click();
        driver.findElement(By.id("txtUserId")).sendKeys("bindudey");
        driver.findElement(By.cssSelector("#password")).click();
        driver.findElement(By.name("password")).sendKeys("ganesha123");
        driver.findElement(By.name("msuLoginSubmit")).click();
        driver.findElement(By.id("dtgServices__ctl2_lkbMenu")).click();
        driver.findElement(By.cssSelector("#txtAccountNo")).click();
        driver.findElement(By.name("txtAccountNo")).sendKeys("2785155000");
        driver.findElement(By.id("btnSearch")).click();
}
}

