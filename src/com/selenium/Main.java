package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args)  throws InterruptedException
    {
        // to open the Chrome browser
        System.setProperty("webdriver.chrome.driver","C://salenium jar and drivers//chromedriver/chromedriver.exe");
       WebDriver driver= new ChromeDriver();

       // to Navigate the page
        driver.navigate().to("https://vprismqc.vidgyor.com/");

      // to maximize
      driver.manage().window().maximize();

        //click on SIGN IN button
        driver.findElement(By.className("hydrated")).click();

        // to close the browser
        Thread.sleep(6000);
        driver.close();

    }
}