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

public class HolidayManagement_Old {
	static WebDriver driver;
	WebDriverAction action;
	String holidayName = "Children's day";

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
		action.click(By.xpath(ElementHelper.HOLIDAY_MANAGEMENT));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step01_CreateHoliday() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.HM_CREATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.HM_CREATE_DATE), "06/01/2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.HM_CREATE_NAME), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	@Test
	public void step02_SearchHoliday() throws Exception {
		navigate();
		search();
	}
	
	@Test
	public void step03_ModifyHoliday() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.HM_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.HM_MODIFY_NAME));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.HM_MODIFY_NAME), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step04_Log() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.HM_LOG));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.HM_LOG_NAME)), ElementHelper.USER_NAME_QA);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step05_Delete() throws Exception {
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
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.HM_SEARCH_DATE)), "2018/06/01");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.HM_SEARCH_NAME)), holidayName);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
}
