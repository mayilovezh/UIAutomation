package com.selenium.test.tdol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TDPTask {
	static WebDriver driver;
	WebDriverAction action;
	String intervalStart = "30/01/2018 00:00";
	String intervalEnd = "20/02/2018 00:00";
	String testdateFrom = "20/02/2018";
	String testdateTo = "23/02/2018";
	String testDate = "2018-09-29";
	String openintervalStart = "30/Jan/2018  00:00";
	String openintervalEnd = "20/Feb/2018  00:00";

	@BeforeMethod
	public void setUp() {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() {
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TDOL));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TDP_TASK));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void step01_Create() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.TDP_TASK_CREATE));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.TDP_TASK_CREATE_REGION), ElementHelper.VALUE);
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.setTimeout("30");
			action.selectByValue(By.id(ElementHelper.TDP_TASK_CREATE_TESTDATE), "10248");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TDP_TASK_CREATE_OPEN_START), intervalStart);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TDP_TASK_CREATE_OPEN_END), intervalEnd);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TDP_TASK_CREATE_TESTDAY_1));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TDP_TASK_CREATE_TESTDAY_2));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchTask() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.sendkeys(By.id(ElementHelper.TDP_TASK_TESTDATE_FROM), testdateFrom);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TDP_TASK_TESTDATE_TO), testdateTo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TDP_TASK_SEARCH));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TDP_TASK_SEARCH_TESTDATE)), testDate);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TDP_TASK_SEARCH_OPENINTERVAL_START)),
					openintervalStart);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TDP_TASK_SEARCH_OPENINTERVAL_END)),
					openintervalEnd);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void step02_Search() {
		searchTask();
	}

	@Test
	public void step03_View() {
		searchTask();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TDP_TASK_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void step04_Modify() {
		searchTask();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.TDP_TASK_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.TDP_TASK_MODIFY_DESCRIPTION), ElementHelper.REMARK_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void step05_Log() {
		searchTask();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TDP_TASK_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
