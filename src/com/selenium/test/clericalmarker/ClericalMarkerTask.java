package com.selenium.test.clericalmarker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ClericalMarkerTask {
	static WebDriver driver;
	WebDriverAction action;
	String openIntervalFrom = "01/03/2018 00:00";
	String openIntervalTo = "15/03/2018 00:00";
	String venue = "BC Office";
	String testDate = "15/Dec/2018";
	String typeFirst = "1st Marking";
	String typeSecond = "2nd Marking";
	String createBy = "Zhang Yifan";

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
	public void step01_CreateFirstMarkingTask() throws Exception {
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
	}

	@Test
	public void step02_CreateSecondMarkingTask() throws Exception {
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
*/
	@Test
	public void step03_SearchTask() throws Exception {
		navigate();
		search();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_SEARCH_TEST_DATE_FIRST)), testDate);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_SEARCH_TEST_DATE_SECOND)), testDate);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_SEARCH_TYPE_FIRST)), typeFirst);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_SEARCH_TYPE_SECOND)), typeSecond);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_SEARCH_CREATE_BY_FIRST)), createBy);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_SEARCH_CREATE_BY_SECOND)), createBy);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	@Test
	public void step04_ModifyTask() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.CLERICAL_TASK_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CLERICAL_TASK_MODIFY_DAY));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.clear(By.id(ElementHelper.CLERICAL_TASK_MODIFY_REMARK));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.CLERICAL_TASK_MODIFY_REMARK), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void step05_ViewTask() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.CLERICAL_TASK_VIEW));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}

	@Test
	public void step06_ViewLog() throws Exception {
		navigate();
		search();
		action.click(By.linkText(ElementHelper.CLERICAL_TASK_LOG));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.CLERICAL_TASK_LOG_USER)), createBy);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step07_Report() throws Exception {
		navigate();
		search();
		action.click(By.xpath(ElementHelper.CLERICAL_TASK_REPORT));
		Thread.sleep(ElementHelper.LONG_TIME);
		
	}

	public void search() throws InterruptedException {
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.CLERICAL_TASK_TEST_DATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.CLERICAL_TASK_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}
}
