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

public class HolidayManagement {
	static WebDriver driver;
	WebDriverAction action;
	String holidayName = "Spring Festival";

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
		action.click(By.xpath(ElementHelper.HOLIDAY_MANAGEMENT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void createHoliday() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.HM_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.HM_CREATE_DATE), "01/01/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.HM_CREATE_NAME), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test(dependsOnMethods = { "createHoliday"})
	public void searchHoliday() throws Exception {
		navigate();
		search();
	}
	
	@Test(dependsOnMethods = { "searchHoliday"})
	public void modifyHoliday() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.HM_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.HM_MODIFY_NAME), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test(dependsOnMethods = { "modifyHoliday"})
	public void log() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.HM_LOG));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.HM_LOG_NAME)), ElementHelper.USER);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test(dependsOnMethods = { "log"})
	public void delete() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.HM_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	public void search() throws Exception {
		action.sendkeys(By.id(ElementHelper.HM_NAME), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.HM_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.HM_SEARCH_DATE)), "2018/01/01");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.HM_SEARCH_NAME)), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
}
