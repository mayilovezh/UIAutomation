package com.selenium.test.pretestarrange;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.WebDriverAction;

public class WrittenApportionment {

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
	
	public void navigate() {
		
	}
}
