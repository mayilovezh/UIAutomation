package com.selenium.test.postest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ImportLog {
	static WebDriver driver;
	WebDriverAction action;
	String testCenter = "Xuzhou";
	String release = "First Release";
	String marking = "First Marking";
    String totalNum = "81";
    String successNum = "81";
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().loginEast(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.IMPORT_LOG));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void searchImportLog() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.IMPORT_LOG_TESTCENTER_RELEASE)), testCenter);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.IMPORT_LOG_FIRST_RELEASE)), release);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.IMPORT_LOG_TOTAL_NUM)), totalNum);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.IMPORT_LOG_SUCCESS_NUM)), successNum);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.IMPORT_LOG_FIRST_MARKING)), marking);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
}
