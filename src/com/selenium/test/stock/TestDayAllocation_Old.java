package com.selenium.test.stock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestDayAllocation_Old {

	static WebDriver driver;
	WebDriverAction action;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void inputStockArrangel() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputStockArrangel(){\r\n" + 
				"  var inputText = document.getElementsByName('stockarrange').length\r\n" + 
				"  for(var i =0; i<inputText; i++){\r\n" + 
				"   document.getElementsByName('stockarrange').item(i).value = '10'\r\n" + 
				"  }\r\n" + 
				"};return inputStockArrangel()");
	}
	
	public void inputBackupNumber() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputBackupNumber(){\r\n" + 
				"  var BackupNumber = document.getElementsByName('BackupNumber').length\r\n" + 
				"  for(var i =0; i<BackupNumber; i++){\r\n" + 
				"   document.getElementsByName('BackupNumber').item(i).value = '20'\r\n" + 
				"  }\r\n" + 
				"};return inputBackupNumber()");
	}
	
	public void inputCenterBackupNumber() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputCenterBackupNumber(){\r\n" + 
				"  var CenterBackupNumber = document.getElementsByName('centerBackupNumber').length\r\n" + 
				"  for(var i =0; i<CenterBackupNumber; i++){\r\n" + 
				"   document.getElementsByName('centerBackupNumber').item(i).value = '10'\r\n" + 
				"  }\r\n" + 
				"};return inputCenterBackupNumber()");
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.TESTDAYALLOCATION_REGION), "2");
		action.selectByValue(By.id(ElementHelper.TESTDAYALLOCATION_TESTDATEYEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.TESTDAYALLOCATION_TESTDATEMONTH), 2);
		action.selectByValue(By.id(ElementHelper.TESTDAYALLOCATION_TESTDATE), "10208");
		action.selectByValue(By.id(ElementHelper.TESTDAYALLOCATION_TestCENTER), "100126");
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TESTDAYALLOCATION_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.STOCK));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.TESTDAYALLOCATION));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Test Day Allocation")
	public void step01_Search() {
		search();
	}

	@Test(description = "Auto Arrange for Current Centre")
	public void step02_AutoArrangeforCurrentCentre() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.waitElementVisibleToClick(By.id(ElementHelper.TESTDAYALLOCATION_AUTOARRAGECURRENTCENTRE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.waitElementVisibleToClick(By.id(ElementHelper.TESTDAYALLOCATION_SAVE));
	}
	
	@Test(description = "Clear Arrange of Current Centre")
	public void step03_ClearArrangeofCurrentCentre() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.waitElementVisibleToClick(By.id(ElementHelper.TESTDAYALLOCATION_CLEARARRANGEOFCURRENTCENTRE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		driver.switchTo().alert().accept();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.waitElementVisibleToClick(By.xpath(ElementHelper.TESTDAYALLOCATION_MESSAGEYES));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.waitElementVisibleToClick(By.id(ElementHelper.TESTDAYALLOCATION_SAVE));
	}		

	@Test(description = "Save")
	public void step04_Save() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		inputStockArrangel();
		inputBackupNumber();
		inputCenterBackupNumber();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.waitElementVisibleToClick(By.id(ElementHelper.TESTDAYALLOCATION_SAVE));
	}
}
