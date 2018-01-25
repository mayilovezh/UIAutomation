package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.listener.WebDriverAction;
import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.TakeScreenshot;

public class TestCapture {
	
	static WebDriver driver;
	WebDriverAction action;
	TakeScreenshot ts = new TakeScreenshot();
	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	
	@Test
	public void create() {
		action.click(By.xpath(ElementHelper.TEST_CENTER));
		Reporter.log("AAAAAAAAAAA");
		ts.captureScreenShot(driver, ElementHelper.PROJECT_NAME);
		
	}

}
