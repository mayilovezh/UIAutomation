package com.selenium.test.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ReportByRegionOrigin {
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
		action.click(By.xpath(ElementHelper.REPORT_BY_REGION_ORIGIN));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.REPORT_BY_REGION_ORIGIN_DATE_FROM), dateFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.REPORT_BY_REGION_ORIGIN_DATE_TO), dateTo);
	}
	
	@Test
	public void export() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.REPORT_BY_REGION_ORIGIN_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.REPORT_BY_REGION_ORIGIN_EXPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	/*@Test
	public void exportCheck() {
		
	}*/
}
