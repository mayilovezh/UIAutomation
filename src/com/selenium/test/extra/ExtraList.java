package com.selenium.test.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ExtraList {
	static WebDriver driver;
	WebDriverAction action;
	String name = "Zhang Yifan";
	String candidateNo = "188736";
	String phone = "1234567890";
	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EXTRA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXTRA_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_YEAR), "2017");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EXTRA_LIST_MONTH), 9);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_DATE), "10170");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXTRA_LIST_CANDIDATE_NO), candidateNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.PENDING_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step01_UpdateApp() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.EXTRA_LIST_UPDATE_APP));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.EXTRA_LIST_UPDATE_APP_PHONE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXTRA_LIST_UPDATE_APP_PHONE), phone);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		
	}
	
	@Test
	public void step02_ExportExcel() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXTRA_LIST_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXTRA_LIST_EXPORT_EXCEL));
		Thread.sleep(ElementHelper.WAIT_TIME);
//		exportCheck();
		
	}
	
	@Test
	public void step03_ChangetoDone() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXTRA_LIST_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXTRA_LIST_DONE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	
	/*public void exportCheck() {
		
	}*/
	
	
}
