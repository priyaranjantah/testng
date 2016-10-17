package com.selenium;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by PPTAH on 5/11/2016.
 */
@Test
public class WebDriverTest extends SelTestCase{
    public  void testWikipedia () throws InterruptedException {
        driver.get("https://www.wikipedia.org/");
        Thread.sleep(5000);
        driver.findElement(By.id("searchInput")).sendKeys("Selenium Software");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#search-form > fieldset > button")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".mw-search-results li:nth-of-type(1) a")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector("img[src='//upload.wikimedia.org/wikipedia/en/thumb/5/5c/Seleniumlogo.png/100px-Seleniumlogo.png']")).isDisplayed());
//        driver.close();
//        driver.quit();
    }
}
