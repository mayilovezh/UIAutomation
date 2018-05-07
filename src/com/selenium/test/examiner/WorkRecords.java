package com.selenium.test.examiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class WorkRecords {
	static WebDriver driver;
	WebDriverAction action;
	
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
		action.click(By.xpath(ElementHelper.WORK_RECORDS));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void searchWorkRecords() throws Exception {
		navigate();
		action.sendkeys(By.id(ElementHelper.WORK_RECORDS_EXAMINER_NO), "994726");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.WORK_RECORDS_SEARCH));
		Thread.sleep(35000);
//		Assert.assertEquals(action.getText(By.xpath(ElementHelper.WORK_RECORDS_SEARCH_NAME)), "Micheal Coulson");
//		Thread.sleep(ElementHelper.SHORT_TIME_A);
//		Assert.assertEquals(action.getText(By.xpath(ElementHelper.WORK_RECORDS_SEARCH_TC)), "BJ-BLCU");
//		Thread.sleep(ElementHelper.SHORT_TIME_A);
//		Assert.assertEquals(action.getText(By.xpath(ElementHelper.WORK_RECORDS_SEARCH_CDDNO)), "242007-242013,242015-242026,242214");
//		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
}
