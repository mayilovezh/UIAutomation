package com.selenium.test.marketing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class MarketingQuery {
	static WebDriver driver;
	WebDriverAction action;
	String dateFrom = "2018-01-01";
	String dateTo = "2018-01-06";
	String emailContent = "Sent email successfully.";
	
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
			action.click(By.id(ElementHelper.MARKETING));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.MARKETING_QUERY));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.MARKETING_QUERY_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.sendkeys(By.id(ElementHelper.MARKETING_QUERY_DATE_FROM), dateFrom);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.MARKETING_QUERY_DATE_TO), dateTo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Send candidate data to specified email.")
	public void step01_SendEmail() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.MARKETING_QUERY_SEARCH));
			Thread.sleep(ElementHelper.LONG_TIME);
			action.isWebElementPreset(By.xpath(ElementHelper.MARKETING_QUERY_SEARCH_LIST_ITEM));
			action.click(By.id(ElementHelper.MARKETING_QUERY_SEND_EMAIL));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check email sent successful.")
	public void step02_EmailLog() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.MARKETING_QUERY_SEARCH));
			Thread.sleep(ElementHelper.LONG_TIME);
			action.waitElementVisible(By.xpath(ElementHelper.MARKETING_QUERY_SEARCH_LIST_ITEM));
			action.click(By.id(ElementHelper.MARKETING_QUERY_SEND_EMAIL_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.MARKETING_QUERY_SEND_EMAIL_LOG_CONTENT), emailContent);
			action.assertText(By.xpath(ElementHelper.MARKETING_QUERY_SEND_EMAIL_LOG_CREATE_BY), ElementHelper.USER_NAME_QA);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	
}
