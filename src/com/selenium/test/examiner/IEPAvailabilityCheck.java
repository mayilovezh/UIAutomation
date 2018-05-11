package com.selenium.test.examiner;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class IEPAvailabilityCheck {
	static WebDriver driver;
	WebDriverAction action;

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().loginIEP(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	/*@Test
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.LONG_TIME_A);
		action.click(By.xpath(ElementHelper.IEP_AVAILABILITY));
		Thread.sleep(ElementHelper.LONG_TIME_A);
		action.click(By.id(ElementHelper.IEP_AVAILABILITY_DAY31));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.IEP_AVAILABILITY_SAVE));
		Thread.sleep(ElementHelper.LONG_TIME);
	}*/
}
