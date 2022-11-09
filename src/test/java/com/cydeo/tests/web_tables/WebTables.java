package com.cydeo.tests.web_tables;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {

  @Test
  public void webTables() {

    driver.get("https://practice.cydeo.com/tables");
WebElement row1Cell1= driver.findElement(By.xpath("//table[@id='table1']//th[.='Last Name']"));
    System.out.println("row1Cell1.getText() = " + row1Cell1.getText());

    List<WebElement> allCellsInRow1= driver.findElements(By.xpath("//table[@id='table1']//thead"));

      for (WebElement eachCell : allCellsInRow1) {
          System.out.println("eachCell.getText() = " + eachCell.getText());

      }
  }


}
