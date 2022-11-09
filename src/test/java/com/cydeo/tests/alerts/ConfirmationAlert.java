package com.cydeo.tests.alerts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ConfirmationAlert {
    WebDriver driver;

    @BeforeMethod()
    public void setUp(){
        // 1. Set up browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void confirmationAlert(){

        driver.get("https://practice.cydeo.com/javascript_alerts");
        WebElement confAlert= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confAlert.click();
        Alert confAl= driver.switchTo().alert();
        System.out.println("confirmation alert message = " + confAl.getText());
        confAl.dismiss();

        WebElement message= driver.findElement(By.xpath("//p[@id='result']"));
        String expectedMsg= "You clicked: Cancel";
        String actualMsg= message.getText();

        Assert.assertEquals(actualMsg, expectedMsg);

    }

    @AfterMethod
    public void tearDown(){ driver.quit();}

}
