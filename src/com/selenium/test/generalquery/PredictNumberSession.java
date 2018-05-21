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

public class PredictNumberSession {
	static WebDriver driver;
	WebDriverAction action;
	String quota1 = "20";
	String quota2 = "400";
	String quota3 = "400";
	String quota4 = "800";
	String quota5 = "500";
	String totalQuota = "3682";

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
		action.click(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void search() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.PREDICT_NUMBER_SESSION_CITY), "110100");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.PREDICT_NUMBER_SESSION_DATE_FROM), "2018-06-01");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH_QUOTA1)), quota1);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH_QUOTA2)), quota2);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH_QUOTA3)), quota3);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH_QUOTA4)), quota4);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH_QUOTA5)), quota5);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_SESSION_SEARCH_TOTAL_QUOTA)), totalQuota);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
}
