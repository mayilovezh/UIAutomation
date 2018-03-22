package com.selenium.test.generalquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class KeyDatesView {
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
		action.click(By.id(ElementHelper.GENERAL_QUERY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.KEY_DATES_VIEW));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.KEY_DATES_VIEW_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.KEY_DATES_VIEW_MONTH_FROM), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.KEY_DATES_VIEW_MONTH_TO), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.KEY_DATES_VIEW_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void searchKeyDates() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.KEY_DATES_VIEW_SEARCH_DATE)), "02/06/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test(dependsOnMethods = { "searchKeyDates"})
	public void exportKeyDates() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.KEY_DATES_VIEW_EXPORT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
