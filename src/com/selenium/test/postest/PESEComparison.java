package com.selenium.test.postest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class PESEComparison {
	static WebDriver driver;
	WebDriverAction action;
	String r_score = "13";
	String s_LR_score = "2";

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
		action.click(By.id(ElementHelper.POST_TEST));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.PE_SE_COMPARISON));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void firstMarkingCheck() throws Exception {
		navigate() ;
		action.selectByIndex(By.id(ElementHelper.PE_SE_YEAR), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.PE_SE_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.PE_SE_DATE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.PE_SE_TC), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.PE_SE_1STMARKING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.PE_SE_SEARCH_R)), r_score);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.PE_SE_2NDMARKING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.PE_SE_SEARCH_S_LR)), s_LR_score);
		
	}
}
