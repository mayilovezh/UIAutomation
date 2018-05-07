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

public class PredictNumberNational {
	static WebDriver driver;
	WebDriverAction action;
	String quota1 = "29265";
	String quota2 = "26722";
	String quota3 = "9218";

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
		action.click(By.xpath(ElementHelper.PREDICT_NUMBER_NATIONAL));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void search() throws Exception {
		navigate();
		action.sendkeys(By.id(ElementHelper.PREDICT_NUMBER_NATIONAL_DATE_FROM), "2018-03-01");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.PREDICT_NUMBER_NATIONAL_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_NATIONAL_SEARCH_QUOTA1)), quota1);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_NATIONAL_SEARCH_QUOTA2)), quota2);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	    Assert.assertEquals(action.getText(By.xpath(ElementHelper.PREDICT_NUMBER_NATIONAL_SEARCH_QUOTA3)), quota3);
	    Thread.sleep(ElementHelper.SHORT_TIME_A);
	}
}
