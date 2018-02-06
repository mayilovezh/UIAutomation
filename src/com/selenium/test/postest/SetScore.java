package com.selenium.test.postest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SetScore {
	static WebDriver driver;
	WebDriverAction action;
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
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SET_SCORE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	
	@Test
	public void setScoreAll() throws Exception {
		navigate();
		action.selectByIndex(By.id(ElementHelper.SET_SCORE_YEAR), 0);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.SET_SCORE_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.SET_SCORE_DATE), 0);
		Thread.sleep(ElementHelper.SHORT_TIME);
		
		
	}
	
	
	
	
}
