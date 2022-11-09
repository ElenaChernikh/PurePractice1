package com.cydeo.tests.test_case_18_57;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_18_68 extends TestBase {


   /* @Test
    public void tc68amanagers() throws InterruptedException {

        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys("storemanager71");
        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
        inputPassword.sendKeys("UserUser123");
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        Actions actions = new Actions(Driver.getDriver());
        WebElement fleet = driver.findElement(By.xpath("//*[@id='oroplatform-header']/div[2]/ul/li[2]/a/span"));

            actions.moveToElement(fleet);
            Thread.sleep(2000);
        WebElement vehOdom = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        actions.moveToElement(vehOdom).click();

        WebElement errorMsg= driver.findElement(By.xpath("//*[@id='flash-messages']/div/div/div/div"));
        Assert.assertTrue(errorMsg.isDisplayed());
 }*/
    @Test
    public void tc68drivers() throws InterruptedException {


        WebElement inputUsername = driver.findElement(By.id("prependedInput"));
        inputUsername.sendKeys("user25");
        WebElement inputPassword = driver.findElement(By.id("prependedInput2"));
        inputPassword.sendKeys("UserUser123");
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        Actions actions = new Actions(Driver.getDriver());
        WebElement fleet = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/a/span"));

        actions.moveToElement(fleet);
        Thread.sleep(2000);
        WebElement vehOdom = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[4]/a/span"));
        actions.moveToElement(vehOdom).click();

        WebElement viewPerPage= driver.findElement(By.xpath("//*[@id='grid-custom-entity-grid-1048271007']/div[2]/div[1]/div/div[3]/div[2]/div/div/button"));
        viewPerPage.click();

       // WebElement defaultPg= driver.findElement(By.xpath("//*[@id='grid-custom-entity-grid-1048271007']/div[2]/div[1]/div/div[4]/ul/li[2]/input"));
        // System.out.println("defaultPg.getAttribute() = " + defaultPg.getAttribute("value"));
        //Assert.assertTrue(errorMsg.isDisplayed());


    }



    }


