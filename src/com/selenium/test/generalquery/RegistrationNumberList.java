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
		action.click(By.id(ElementHelper.GENERAL_QUERY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.REGISTRATION_NUMBER_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void search() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.RUL_REGION), ElementHelper.VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.RUL_TC), "50");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.RUL_DATE_FROM), "2018-01-01");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.RUL_SEARCH));
		Thread.sleep(30000);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA106)),
				reader.getCellValue("Registration", 1, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA113)),
				reader.getCellValue("Registration", 2, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA118)),
				reader.getCellValue("Registration", 3, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_MIS_QUOTA120)),
				reader.getCellValue("Registration", 4, 0));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_NEEA_QUOTA106)),
				reader.getCellValue("Registration", 1, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_NEEA_QUOTA113)),
				reader.getCellValue("Registration", 2, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_NEEA_QUOTA118)),
				reader.getCellValue("Registration", 3, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_NEEA_QUOTA120)),
				reader.getCellValue("Registration", 4, 1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_TOTAL_REGISTERED)),
				reader.getCellValue("Registration", 1, 3));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.RUL_TOTAL_QUOTA)),
				reader.getCellValue("Registration", 1, 4));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.RUL_EXPORT_REGISTRATION_NUMBER));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
}
