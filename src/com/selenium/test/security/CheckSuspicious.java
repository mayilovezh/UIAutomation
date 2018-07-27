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

public class CheckSuspicious {
	static WebDriver driver;
	WebDriverAction action;
	String testdateFrom = "2018-07-21";
	String testdateTo = "2018-07-21";
	ExcelReader reader = new ExcelReader(".\\resource\\security\\CheckSuspicious.xlsx");
	String levelOrange = "Orange";
	String levelYellow = "Yellow";
	String levelRed = "Red";
	String levelDelete = "Delete";
	
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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.CHECK_SUSPICIOUS));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.CHECK_SUSPICIOUS_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CHECK_SUSPICIOUS_PRODUCT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_TESTDATE_FROM), testdateFrom);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_TESTDATE_TO), testdateTo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.CHECK_SUSPICIOUS_TC), ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Add candidate security level 'Orange' to suspicious list.")
	public void step01_Add_Orange() {
		try {
			navigate();
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_CDD_NO), reader.getCellValue("Sheet1", 1, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isContentExist(By.xpath(ElementHelper.CHECK_SUSPICIOUS_SEARCH_LEVEL),levelOrange)) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.name(ElementHelper.CHECK_SUSPICIOUS_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_LEVEL), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_REASON), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_REMARK), ElementHelper.REMARK_VALUE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Add candidate security level 'Yellow' to suspicious list.")
	public void step02_Add_Yellow() {
		navigate();
		try {
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_CDD_NO), reader.getCellValue("Sheet1", 2, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isContentExist(By.xpath(ElementHelper.CHECK_SUSPICIOUS_SEARCH_LEVEL),
					reader.getCellValue("Sheet1", 2, 1))) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.WAIT_TIME);
				action.click(By.name(ElementHelper.CHECK_SUSPICIOUS_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_LEVEL), 2);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_REASON), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_REMARK), ElementHelper.REMARK_VALUE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Add candidate security level 'Red' to suspicious list.")
	public void step03_Add_Red() {
		navigate();
		try {
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_CDD_NO), reader.getCellValue("Sheet1", 3, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isContentExist(By.xpath(ElementHelper.CHECK_SUSPICIOUS_SEARCH_LEVEL),
					reader.getCellValue("Sheet1", 3, 1))) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.WAIT_TIME);
				action.click(By.name(ElementHelper.CHECK_SUSPICIOUS_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_LEVEL), 3);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_REASON), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_REMARK), ElementHelper.REMARK_VALUE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Add candidate security level 'Delete' to suspicious list.")
	public void step04_Add_Delete() {
		navigate();
		try {
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_CDD_NO), reader.getCellValue("Sheet1", 4, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isContentExist(By.xpath(ElementHelper.CHECK_SUSPICIOUS_SEARCH_LEVEL),
					reader.getCellValue("Sheet1", 4, 1))) {
				new DriverInstance().teardown(driver);
			} else {
				Thread.sleep(ElementHelper.WAIT_TIME);
				action.click(By.name(ElementHelper.CHECK_SUSPICIOUS_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_LEVEL), 4);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.CHECK_SUSPICIOUS_ADD_REASON), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_REMARK), ElementHelper.REMARK_VALUE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Export suspicious candidate.")
	public void step05_Export() {
		navigate();
		try {
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_CDD_NO), reader.getCellValue("Sheet1", 5, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_EXPORT));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Export suspicious candidate history record.")
	public void step06_ExportHistoryRecord() {
		navigate();
		try {
			action.sendkeys(By.id(ElementHelper.CHECK_SUSPICIOUS_CDD_NO), reader.getCellValue("Sheet1", 5, 0));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.CHECK_SUSPICIOUS_EXPORT_HISTORY_RECORD));
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
