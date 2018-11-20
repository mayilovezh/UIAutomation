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

public class AdminPermanentMats_Old {

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
	
	public void inputAllStorageLocation() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputAllStorageLocation(){\r\n" + 
				"  var StorageLocationLength = document.getElementsByName('StorageLocation').length\r\n" + 
				"  for(var i =0; i<StorageLocationLength; i++){\r\n" + 
				"   document.getElementsByName('StorageLocation').item(i).value = '12313'\r\n" + 
				"  }\r\n" + 
				"};return inputAllStorageLocation()");
	}
	
	public void inputAllRemark() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputAllRemark(){\r\n" + 
				"  var RemarkLength = document.getElementsByName('Remark').length\r\n" + 
				"  for(var i =0; i<RemarkLength; i++){\r\n" + 
				"   document.getElementsByName('Remark').item(i).value = '33333'\r\n" + 
				"  }\r\n" + 
				"};return inputAllRemark()");
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.PERMANENTMATERIALS_REGION), "2");
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.STOCK));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.PERMANENTMATERIALS));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Permanent Materials")
	public void step01_Search() {
		search();
	}

	@Test(description = "Update Permanent Materials")
	public void step02_Update() throws InterruptedException {
		search();
		action.click(By.xpath(ElementHelper.PERMANENTMATERIALS_UPDATEBUTTON));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_STORAGETYPE), "396");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TESTDATEYEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TESTDATEMONTH), 2);
		action.selectByValue(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TESTDATE), "10208");
		action.selectByValue(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TestCENTER), "100126");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TOTALPACKAGES));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TOTALPACKAGES), "30");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TOTALNUMBER));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_TOTALNUMBER), "40");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_REMARK));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_REMARK), "RemarkRemarkRemarkRemarkRemarkRemarkRemarkRemark");
		Thread.sleep(ElementHelper.WAIT_TIME);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}

	@Test(description = "Save Permanent Materials")
	public void step03_Save() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.PERMANENTMATERIALS_STORAGELOCATION));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.PERMANENTMATERIALS_STORAGELOCATION), "40");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.PERMANENTMATERIALS_REMARK));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.PERMANENTMATERIALS_REMARK), "50");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.PERMANENTMATERIALS_UPDATE_SAVEBUTTON));
	}

	@Test(description = "Save All Permanent Materials")
	public void step04_SaveAll() throws InterruptedException {
		search();
		inputAllStorageLocation();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		inputAllRemark();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.PERMANENTMATERIALS_CHECKALL));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.PERMANENTMATERIALS_SAVESELECT));
	}	
	
}
