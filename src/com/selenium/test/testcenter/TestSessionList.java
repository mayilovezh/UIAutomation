package com.selenium.test.testcenter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.DriverInstance;
import com.selenium.test.element.ElementHelper;
import com.selenium.test.listener.WebDriverAction;

public class TestSessionList {
	static WebDriver driver;
	WebDriverAction action;
	String testDate = "2017-03-04";
	String testCenter = "BJ-UIBE";

	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate(){
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TEST_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TEST_SESSION_LIST));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void search() {
		action.isVisible(By.id(ElementHelper.TS_REGION));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByIndex(By.id(ElementHelper.TS_YEAR), 0);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TS_MONTH), 2);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TS_DATE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TS_CENTER), "100100");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TS_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TS_TEST_DATE)), testDate);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TS_TEST_CENTER)), testCenter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void create() {
		try {
			navigate();
			action.click(By.id(ElementHelper.TS_CREATE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TS_CREATE_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.TS_CREATE_YEAR_START), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TS_CREATE_MONTH_START), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TS_CREATE_YEAR_END), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TS_CREATE_YEAR_END), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TS_CREATE_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.TS_CREATE_TESTDATE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void searchTS() {
			navigate();
			search();
	}
	
	@Test
	public void modify() {
		try {
			navigate();
			search();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TS_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TS_MODIFY_SESSION_QUOTA), "200");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void modifyLog() {
		try {
			navigate();
			search();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TS_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
