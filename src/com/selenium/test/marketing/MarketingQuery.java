package com.selenium.test.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class MarketingQuery {
	static WebDriver driver;
	WebDriverAction action;
	String dateFrom = "2018-01-01";
	String dateTo = "2018-01-06";
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
		action.click(By.id(ElementHelper.MARKETING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.MARKETING_QUERY));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.MARKETING_QUERY_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.MARKETING_QUERY_DATE_FROM), dateFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.MARKETING_QUERY_DATE_TO), dateTo);
	}
	
	@Test
	public void step01_Export_A() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.MARKETING_QUERY_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.MARKETING_QUERY_EXPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step02_NewExport_A() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.MARKETING_QUERY_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.MARKETING_QUERY_NEW_EXPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step03_Export_B() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.MARKETING_QUERY_TYPE_B));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.MARKETING_QUERY_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.MARKETING_QUERY_EXPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	@Test
	public void step04_NewExport_B() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.MARKETING_QUERY_TYPE_B));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.MARKETING_QUERY_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.MARKETING_QUERY_NEW_EXPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
}
