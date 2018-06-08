package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestSessionList {
	static WebDriver driver;
	WebDriverAction action;
	String testDate = "2018-05-05";
	String testCenter = "BJ-UIBE";

	@BeforeMethod
	public void setUp() throws Exception {
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
			action.click(By.id(ElementHelper.TEST_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TEST_SESSION_LIST));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.isVisible(By.id(ElementHelper.TS_REGION));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByIndex(By.id(ElementHelper.TS_YEAR), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TS_MONTH), 5);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.TS_DATE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TS_CENTER), "100100");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TS_TEST_DATE)), testDate);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TS_TEST_CENTER)), testCenter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Create the test session of UIBE")
	public void step01_Create() {
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TEST_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.TEST_SESSION_LIST));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.TS_CREATE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.TS_CREATE_PRODUCT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.TS_CREATE_FORMAT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TS_CREATE_TESTDATE_END), "12");
			action.click(By.id(ElementHelper.TS_CREATE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TS_CREATE_TESTDATE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.TS_CRAETE_TC));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Search the test session of 'UIBE' and test date is '2018-6-2'")
	public void step02_SearchTestSession() {
		navigate();
	}

	@Test(description = "Modify the test session quota to '230'")
	public void step03_Modify() {
		try {
			navigate();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TS_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.clear(By.id(ElementHelper.TS_MODIFY_SESSION_QUOTA));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.TS_MODIFY_SESSION_QUOTA), "230");
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "View the test session's log of 'UIBE'")
	public void step04_ModifyLog() {
		try {
			navigate();
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.linkText(ElementHelper.TS_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.TS_LOG_CREATE_BY)), ElementHelper.USER_NAME_DEV);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
