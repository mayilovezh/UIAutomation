package com.selenium.test.generalquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class RegistrationNumberList {
	static WebDriver driver;
	WebDriverAction action;
	ExcelReader reader = new ExcelReader(".\\resource\\generalquery\\registration.xlsx");
    String quota = "400";
    String totalRegistered = "0";
    String totalQuota = "1201";
	
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
		action.click(By.xpath(ElementHelper.REGISTRATION_NUMBER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void search() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.RUL_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.RUL_TC), ElementHelper.TC_BFSU);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.RUL_DATE_FROM), "2018-06-01");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.RUL_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA106)),"401");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA113)),quota);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA118)),quota);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_TOTAL_REGISTERED)),totalRegistered);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_TOTAL_QUOTA)),totalQuota);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.RUL_EXPORT_REGISTRATION_NUMBER));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
