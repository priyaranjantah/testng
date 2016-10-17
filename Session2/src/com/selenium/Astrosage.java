package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by PPTAH on 9/14/14.
 */

public class Astrosage {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.get ("http://www.astrosage.com/kundli/");
        driver.findElement(By.cssSelector("#Name")).click();
        driver.findElement(By.id("Name")).sendKeys("Priya Ranjan Tah");
        driver.findElement(By.cssSelector("#Day")).click();
        driver.findElement(By.id("Day")).sendKeys("19");
        driver.findElement(By.cssSelector("#Month")).click();
        driver.findElement(By.id("Month")).sendKeys("8");
        driver.findElement(By.cssSelector("#Year")).click();
        driver.findElement(By.id("Year")).sendKeys("1977");
        driver.findElement(By.cssSelector("#Hrs")).click();
        driver.findElement(By.id("Hrs")).sendKeys("4");
        driver.findElement(By.cssSelector("#Min")).click();
        driver.findElement(By.id("Min")).sendKeys("24");
        driver.findElement(By.cssSelector("#Sec")).click();
        driver.findElement(By.id("Sec")).sendKeys("0");
        driver.findElement(By.cssSelector("#place")).click();
        driver.findElement(By.id("place")).sendKeys("Burdwan");
        driver.findElement(By.cssSelector("#aTag")).click();
        driver.findElement(By.cssSelector("#LongDeg")).click();
        driver.findElement(By.id("LongDeg")).sendKeys("087");
        driver.findElement(By.cssSelector("#LongMin")).click();
        driver.findElement(By.id("LongMin")).sendKeys("52");
        driver.findElement(By.id("LongEW")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("#LongEW > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#LatDeg")).click();
        driver.findElement(By.id("LatDeg")).sendKeys("023");
        driver.findElement(By.cssSelector("#LatMin")).click();
        driver.findElement(By.id("LatMin")).sendKeys("15");
        driver.findElement(By.id("LatNS")).click();
        driver.findElement(By.cssSelector("#LatNS > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#timeZone")).click();
        driver.findElement(By.id("timeZone")).sendKeys("5.5");
        Thread.sleep(4000);
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.cssSelector("#form1 > div > div > ul > li:nth-child(6) > a")).click();
        driver.findElement(By.cssSelector("#form1 > div > div > ul > li:nth-child(7) > a")).click();
        driver.findElement(By.cssSelector("#form1 > div > div > ul > li:nth-child(8) > a")).click();
        driver.findElement(By.cssSelector("#form1 > div > div > ul > li:nth-child(36) > a")).click();

}
}
