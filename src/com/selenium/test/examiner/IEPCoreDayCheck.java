package com.selenium.test.examiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class IEPCoreDayCheck {
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
		Thread.sleep(ElementHelper.LONG_TIME);
	}*/
}
