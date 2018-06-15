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

public class KeyDates {
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
		action.click(By.id(ElementHelper.GENERAL_QUERY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.KEY_DATES));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.KEY_DATES_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.KEY_DATES_MONTH_FROM), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.KEY_DATES_MONTH_TO), "6");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.KEY_DATES_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	/*@Test
	public void step01_GenerateKeydates() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.KEY_DATES_GENERATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.xpath(ElementHelper.SAVE));
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}*/
	
	@Test
	public void step02_HiddenOnViewPage() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.KEY_DATES_SHOW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getValue(By.xpath(ElementHelper.KEY_DATES_HIDDEN)), "Hidden On View Page");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step03_ShowOnViewPages() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.KEY_DATES_HIDDEN));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getValue(By.xpath(ElementHelper.KEY_DATES_SHOW)), "Shown On View Page");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step04_ExportKeyDates() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.KEY_DATES_EXPORT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
