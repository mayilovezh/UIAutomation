package com.selenium.test.postest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class JaggedProfileInfo {
	static WebDriver driver;
	WebDriverAction action;
	String testDateFrom = "2017/01/01";
	String testDateTo = "2017/12/31";

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
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.JAGGED_PROFILE_INFO));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void exportJPRate() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.JAGGED_TEST_DATE_FROM));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.className(ElementHelper.JAGGED_TEST_DATE_FROM_YEAR), "2017");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.className(ElementHelper.JAGGED_TEST_DATE_FROM_MONTH), "0");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.JAGGED_TEST_DATE_FROM_DATE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.JAGGED_TEST_DATE_TO));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.className(ElementHelper.JAGGED_TEST_DATE_TO_YEAR), "2017");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.className(ElementHelper.JAGGED_TEST_DATE_TO_MONTH), "11");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.JAGGED_TEST_DATE_TO_DATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.JAGGED_EXPORT));
		Thread.sleep(60000);
	}
}
