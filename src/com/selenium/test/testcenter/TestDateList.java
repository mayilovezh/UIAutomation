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

public class TestDateList {
	static WebDriver driver;
	WebDriverAction action;
	String testdate1 = "2018-01-06";
	String testdate2 = "2018-01-13";
	String testdate3 = "2018-01-18";
	String testdate4 = "2018-01-20";
	

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
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.TEST_DATE_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void search() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.TD_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.TD_EXAM_PRODUCT_TYPE), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.TD_EXAM_FORMAT), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.TD_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TD_SEARCH_DATE1)), testdate1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TD_SEARCH_DATE2)), testdate2);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TD_SEARCH_DATE3)), testdate3);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.TD_SEARCH_DATE4)), testdate4);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	/*@Test
	public void importFile() {

	}*/
}
