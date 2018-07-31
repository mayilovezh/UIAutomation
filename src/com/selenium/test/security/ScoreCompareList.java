package com.selenium.test.security;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class ScoreCompareList {
	static WebDriver driver;
	WebDriverAction action;
	String cddNo;
	ExcelReader reader = new ExcelReader(".\\resource\\security\\ScoreCompare.xlsx");
	String sheetName = "Sheet1";
	String levelOrange = "Orange";
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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SCORE_COMPARE_LIST));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.SCORE_COMPARE_LIST_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SCORE_COMPARE_LIST_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search candidate suspicious tag is '>=2.2'")
	public void step01_SearchOverall2() {
		navigate();
		try {
			selectMonth(0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			selectDate("10199");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectProduct(1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectFormat("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectTC(ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectSuspiciousTag("4");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_PRODUCT),
					reader.getCellValue(sheetName, 1, 0));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_FORMAT),
					reader.getCellValue(sheetName, 1, 1));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TEST_DATE),
					reader.getCellValue(sheetName, 1, 2));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TC),
					reader.getCellValue(sheetName, 1, 3));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CHINESE_NAME),
					reader.getCellValue(sheetName, 1, 4));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CDD_NO),
					reader.getCellValue(sheetName, 1, 5));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_OVERALL_SCORE),
					reader.getCellValue(sheetName, 1, 6));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search candidate suspicious tag is 'S vs LRW'")
	public void step02_SearchSvsLRW() {
		navigate();
		try {
			selectMonth(0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			selectDate("10199");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectProduct(1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectFormat("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectTC(ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectSuspiciousTag("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_PRODUCT),
					reader.getCellValue(sheetName, 2, 0));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_FORMAT),
					reader.getCellValue(sheetName, 2, 1));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TEST_DATE),
					reader.getCellValue(sheetName, 2, 2));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TC),
					reader.getCellValue(sheetName, 2, 3));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CHINESE_NAME),
					reader.getCellValue(sheetName, 2, 4));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CDD_NO),
					reader.getCellValue(sheetName, 2, 5));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search candidate suspicious tag is 'S vs Individual>=3'")
	public void step03_SearchIndividual3() {
		navigate();
		try {
			selectMonth(0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			selectDate("10199");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectProduct(1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectFormat("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectTC(ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectSuspiciousTag("2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_PRODUCT),
					reader.getCellValue(sheetName, 2, 0));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_FORMAT),
					reader.getCellValue(sheetName, 2, 1));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TEST_DATE),
					reader.getCellValue(sheetName, 2, 2));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TC),
					reader.getCellValue(sheetName, 2, 3));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CHINESE_NAME),
					reader.getCellValue(sheetName, 2, 4));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CDD_NO),
					reader.getCellValue(sheetName, 2, 5));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search candidate suspicious tag is '3.3'")
	public void step04_SearchRepeater3() {
		navigate();
		try {
			selectMonth(0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			selectDate("10200");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectProduct(1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectFormat("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectTC(ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectSuspiciousTag("3");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_PRODUCT),
					reader.getCellValue(sheetName, 3, 0));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_FORMAT),
					reader.getCellValue(sheetName, 3, 1));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TEST_DATE),
					reader.getCellValue(sheetName, 3, 2));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_TC),
					reader.getCellValue(sheetName, 3, 3));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CHINESE_NAME),
					reader.getCellValue(sheetName, 3, 4));
			action.assertText(By.xpath(ElementHelper.SCORE_COMPARE_LIST_SEARCH_CDD_NO),
					reader.getCellValue(sheetName, 3, 5));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Select a candidate to saved.")
	public void step05_SaveSelected() {
		searchSavedSvsLRW();
		getCandidateNo();
		action.click(By.name(ElementHelper.SCORE_COMPARE_LIST_SELECT_CHECKBOX));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SAVE_SELECTED));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Check the added candidate suspicious list is 'Orange'.")
	public void step06_CheckSavedSelect() {
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
			action.sendkeys(By.id(ElementHelper.SUSPICIOUS_LIST_CDD_NO), cddNo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SUSPICIOUS_LIST_LEVEL));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SUSPICIOUS_LIST_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_LEVEL_ORANGE), levelOrange);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Select a candidate to delete.")
	public void step07_DeleteSelected() {
		searchDeleteSvsLRW();
		getCandidateNo();
		action.click(By.name(ElementHelper.SCORE_COMPARE_LIST_SELECT_CHECKBOX));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_DELETE_SELECTED));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Check the delete candidate suspicious level is 'Delete'.")
	public void step08_CheckDeleteSelect() {
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
			action.sendkeys(By.id(ElementHelper.SUSPICIOUS_LIST_CDD_NO), cddNo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SUSPICIOUS_LIST_LEVEL));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SUSPICIOUS_LIST_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.SUSPICIOUS_LIST_SEARCH_LEVEL_ORANGE), levelDelete);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Export candidate score compare list.")
	public void step09_Export() {
		searchDeleteSvsLRW();
		try {
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_EXPORT));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Export candidate score compare history.")
	public void step10_ExportHistory() {
		searchDeleteSvsLRW();
		try {
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_EXPORT_HISTORY));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void selectMonth(int value) {
		action.selectByIndex(By.id(ElementHelper.SCORE_COMPARE_LIST_MONTH), value);
	}

	public void selectDate(String value) {
		action.selectByValue(By.id(ElementHelper.SCORE_COMPARE_LIST_DATE), value);
	}

	public void selectProduct(int value) {
		action.selectByIndex(By.id(ElementHelper.SCORE_COMPARE_LIST_PRODUCT), value);
	}

	public void selectFormat(String value) {
		action.selectByValue(By.id(ElementHelper.SCORE_COMPARE_LIST_FORMAT), value);
	}

	public void selectTC(String value) {
		action.selectByValue(By.id(ElementHelper.SCORE_COMPARE_LIST_TC), value);
	}

	public void selectSuspiciousTag(String value) {
		action.selectByValue(By.id(ElementHelper.SCORE_COMPARE_LIST_SUSPICIOUS_TAG), value);
	}

	public void searchSavedSvsLRW() {
		navigate();
		try {
			selectMonth(0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			selectDate("10200");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectProduct(1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectFormat("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectSuspiciousTag("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void searchDeleteSvsLRW() {
		navigate();
		try {
			selectMonth(0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			selectDate("10197");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectProduct(1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectFormat("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			selectSuspiciousTag("1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_COMPARE_LIST_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void getCandidateNo() {
		List<WebElement> table = driver.findElements(By.xpath(ElementHelper.SCORE_COMPARE_LIST_TABLE_LIST_CDD_NO));
		for (int i = 0; i < table.size(); i++) {
			if (!table.get(i).getText().isEmpty()) {
				cddNo = table.get(i).getText();
				break;
			} else {
				driver.quit();
			}
		}
	}
}
