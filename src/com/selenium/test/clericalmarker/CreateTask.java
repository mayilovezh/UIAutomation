package com.selenium.test.clericalmarker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class CreateTask {
	static WebDriver driver;
	WebDriverAction action;
	String openIntervalFrom = "01/03/2018 00:00";
	String openIntervalTo = "15/03/2018 00:00";
	String venue = "BC Office";

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
		action.click(By.id(ElementHelper.CLERICAL_MARKER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CLERICAL_TASK));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	/*@Test
	public void createFirstMarkingTask() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.CLERICAL_TASK_CREATE_FM));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.CLERICAL_TASK_CREATE_FM_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_CREATE_FM_INTERVAL_FROM), openIntervalFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_CREATE_FM_INTERVAL_TO), openIntervalTo);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CLERICAL_TASK_CREATE_FM_DAY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_CREATE_FM_VENUE), venue);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}*/
	
	@Test
	public void createSecondMarkingTask() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.CLERICAL_TASK_CREATE_SM));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.CLERICAL_TASK_CREATE_SM_TESTDATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_CREATE_SM_INTERVAL_FROM), openIntervalFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_CREATE_SM_INTERVAL_TO), openIntervalTo);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CLERICAL_TASK_CREATE_SM_DAY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_CREATE_SM_VENUE), venue);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
