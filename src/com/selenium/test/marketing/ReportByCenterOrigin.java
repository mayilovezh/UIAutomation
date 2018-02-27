package com.selenium.test.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ReportByCenterOrigin {
	static WebDriver driver;
	WebDriverAction action;
	String dateFrom = "2018-01-01";
	String dateTo = "2018-01-06";
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
		action.click(By.id(ElementHelper.MARKETING));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.REPORT_BY_CENTER_ORIGIN));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.sendkeys(By.id(ElementHelper.REPORT_BY_CENTER_ORIGIN_DATE_FROM), dateFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.REPORT_BY_CENTER_ORIGIN_DATE_TO), dateTo);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.REPORT_BY_CENTER_ORIGIN_CITY), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.REPORT_BY_CENTER_ORIGIN_CENTER), 1);
		
		
	}
	
	@Test
	public void export() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.REPORT_BY_CENTER_ORIGIN_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.REPORT_BY_CENTER_ORIGIN_EXPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
	
	/*@Test
	public void exportCheck() {
		
	}*/
}
