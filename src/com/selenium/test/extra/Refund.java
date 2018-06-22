package com.selenium.test.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class Refund {
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
	
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EXTRA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.REFUND));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.REFUND_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void confirmStatus() throws Exception {
		navigate();
//		action.click(By.xpath(ElementHelper.REFUND_SELECT));
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.id(ElementHelper.REFUND_CONFIRM));
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.xpath(ElementHelper.SAVE));
//		Thread.sleep(ElementHelper.SHORT_TIME);
	}
}
