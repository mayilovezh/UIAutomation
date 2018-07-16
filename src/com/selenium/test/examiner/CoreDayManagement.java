package com.selenium.test.examiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class CoreDayManagement {
	static WebDriver driver;
	WebDriverAction action;
	String examinerNo = "983493";
	
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
		action.click(By.id(ElementHelper.EXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.CORE_DAY_MANAGEMENT));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.selectByValue(By.id(ElementHelper.CORE_DAY_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.CORE_DAY_MONTH), 5);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.CORE_DAY_EXAMINER_NO), examinerNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.CORE_DAY_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.CORE_DAY_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
	
	@Test
	public void step01_CoredayAdd() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.CORE_DAY_ADD));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.CORE_DAY_ADD_DATE));
		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.xpath(ElementHelper.SAVE));
//		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step02_ReleaseToIEP() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.CORE_DAY_RELEASE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
}
