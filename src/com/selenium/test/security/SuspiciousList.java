package com.selenium.test.security;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class SuspiciousList {
	static WebDriver driver;
	WebDriverAction action;
	ExcelReader reader = new ExcelReader(".\\resource\\security\\CheckSuspicious.xlsx");
	String testDate = "21/07/2018";

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
		action.waitElementVisibleToClick(By.id(ElementHelper.SECURITY));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SUSPICIOUS_LIST));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SUSPICIOUS_LIST_PRODUCT), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SUSPICIOUS_LIST_FORMAT), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_TESTDATE_FROM_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SUSPICIOUS_LIST_TESTDATE_FROM_MONTH), 6);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_TESTDATE_FROM_DATE), "10223");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_TESTDATE_TO_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SUSPICIOUS_LIST_TESTDATE_TO_MONTH), 6);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_TESTDATE_TO_DATE), "10223");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_TC), ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.SUSPICIOUS_LIST_CDD_NO), reader.getCellValue("Sheet1", 5, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SUSPICIOUS_LIST_LEVEL));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SUSPICIOUS_LIST_SEARCH));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println();
		}
	}

	@Test(description = "Verify the suspicious candidate.")
	public void step01_Search() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_LEVEL_ORANGE),
					reader.getCellValue("Sheet1", 1, 1));
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_LEVEL_YELLOW),
					reader.getCellValue("Sheet1", 2, 1));
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_LEVEL_RED),
					reader.getCellValue("Sheet1", 3, 1));
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_LEVEL_DELETE),
					reader.getCellValue("Sheet1", 4, 1));
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_STATUS),
					reader.getCellValue("Sheet1", 1, 2));
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_TEST_DATE), testDate);
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_CDD_NO),
					reader.getCellValue("Sheet1", 1, 0));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Update suspicious reason to 'Fake ID'")
	public void step02_Update() {
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.name(ElementHelper.SUSPICIOUS_LIST_UPDATE));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_UPDATE_REASON), "216");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the suspicious reason modify log.")
	public void step03_ViewLog() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.cssSelector(ElementHelper.SUSPICIOUS_LIST_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_VIEW_LOG_DETAIL),
					ElementHelper.USER_NAME_QA + " Changed 'Security Reason' From 'Dodgy Address' To 'Fake ID'");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.name(ElementHelper.SUSPICIOUS_LIST_UPDATE));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SUSPICIOUS_LIST_UPDATE_REASON), "218");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Export the suspicious candidate details.")
	public void step04_Export() {
		navigate();
		action.click(By.id(ElementHelper.SUSPICIOUS_LIST_EXPORT));
	}

	@Test(description = "Export the candidate details.")
	public void step05_ExportWatchList() {
		navigate();
		action.click(By.id(ElementHelper.SUSPICIOUS_LIST_EXPORT_WATCHLIST));
	}
}
