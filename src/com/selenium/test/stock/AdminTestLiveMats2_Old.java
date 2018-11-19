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

public class AdminTestLiveMats2_Old {

	static WebDriver driver;
	WebDriverAction action;
	
	public void inputOneStorageLocation() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputOneStorageLocation(){\r\n" + 
				"document.getElementsByName('StorageLocation').item(0).value = '222'" + 
				"};return inputOneStorageLocation()");
	}
	
	public void inputOneRemark() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputOneRemark(){\r\n" + 
				"document.getElementsByName('Remark').item(0).value = '222'" + 
				"};return inputOneRemark()");
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.LIVE_MATERIALS_REGION), "2");
		action.selectByValue(By.id(ElementHelper.LIVE_MATERIALS_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.LIVE_MATERIALS_TESTDATE_MONTH), 3);
		action.selectByValue(By.id(ElementHelper.LIVE_MATERIALS_TESTDATE), "10210");
		action.selectByValue(By.id(ElementHelper.LIVE_MATERIALS_STOCKTYPE), "340");
		try {


			action.click(By.id(ElementHelper.LIVE_MATERIALS_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.LIVE_MATERIALS_LISTOFCATEGORYNAME), ElementHelper.LIVE_MATERIALS_CATEGORYNAME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.STOCK));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.LIVE_MATERIALS));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Live Test Materials")
	public void step01_Search() {
		search();
	}

	@Test(description = "Update Live Test Materials")
	public void step02_Update() throws InterruptedException {
		search();
		action.click(By.xpath(ElementHelper.LIVE_MATERIALS_UPDATEBUTTON));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_STORAGETYPE), "396");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_TOTALPACKAGES));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_TOTALPACKAGES), "30");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_TOTALNUMBER));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_TOTALNUMBER), "40");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_EXPIREDAY));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_EXPIREDAY), "50");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.clear(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_REMARK));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.LIVE_MATERIALS_UPDATE_REMARK), "RemarkRemarkRemarkRemarkRemarkRemarkRemarkRemark");
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.LIVE_MATERIALS_UPDATE_SAVEBUTTON));
	}

	@Test(description = "Save Live Test Materials")
	public void step03_Save() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.WAIT_TIME);
		inputOneStorageLocation();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		inputOneRemark();
		action.click(By.id(ElementHelper.LIVE_MATERIALS_SAVEBUTTON));
	}
	
	
	
}
