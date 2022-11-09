package com.cydeo.tests.alerts;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PromptAlert extends TestBase {

   @Test
    public void promptAlert(){
        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement promptAlert= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        promptAlert.click();
        Alert prompt= driver.switchTo().alert();
        System.out.println("prompt.getText() = " + prompt.getText());
        prompt.sendKeys("I will be an awesome SDET");
        prompt.accept();
        WebElement msg= driver.findElement(By.xpath("//p[@id='result']"));
        String actualMsg= msg.getText();
        String expectedMsg= "You entered: I will be an awesome SDET";
       Assert.assertEquals(actualMsg, expectedMsg);
     }

}
