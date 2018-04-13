package com.selenium.test.pretestplanning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ResourcePlanning {
	static WebDriver driver;
	WebDriverAction action;

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
		action.click(By.id(ElementHelper.PRE_TEST_PLANNING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.RESOURCE_PLANNING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.RESOURCE_PLANNING_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.RESOURCE_PLANNING_DATE), "10207");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void search() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.RESOURCE_PLANNING_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		
	}
}