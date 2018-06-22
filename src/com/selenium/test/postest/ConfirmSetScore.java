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

public class ConfirmSetScore {
	static WebDriver driver;
	WebDriverAction action;
	boolean isTextPrest = false;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().loginEast(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate(){
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.POST_TEST));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.CONFIRM_SET_SCORE));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Confirm set all candidates scores to '0'")
	public void confirmSetAll() {
		try {
			navigate();
			action.selectByValue(By.id(ElementHelper.CONFIRM_SET_SCORE_YEAR), "2018");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.CONFIRM_SET_SCORE_MONTH), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CONFIRM_SET_SCORE_DATE), "10334");
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.CONFIRM_SET_SCORE_TC), "100084");
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.id(ElementHelper.CONFIRM_SET_SCORE_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.CONFIRM_SET_SCORE_SELECTALL));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.CONFIRM_SET_SCORE_SET));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.LONG_TIME);
			action.isTextPrest(By.xpath(ElementHelper.SET_SCORE_SUCCESS_TEXT), ElementHelper.SUCCESS_TEXT);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
