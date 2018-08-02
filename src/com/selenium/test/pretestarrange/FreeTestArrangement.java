package com.selenium.test.pretestarrange;

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

public class FreeTestArrangement {
	static WebDriver driver;
	WebDriverAction action;
	ExcelReader reader = new ExcelReader(".\\resource\\pretestArrange\\FreeTestArrangement.xlsx");
	String roomName = "RM 02";
	String lastTestDate = "06/01/2018";
	String testDate = "03/03/2018";

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
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT));
		try {
			action.waitElementVisible(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_YEAR));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_MONTH), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_DATE), "10342");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void search_Listening() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_TYPE), "50");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_FREE_TYPE),
					reader.getCellValue("Sheet1", 1, 0));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NO),
					reader.getCellValue("Sheet1", 1, 1));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NAME),
					reader.getCellValue("Sheet1", 1, 2));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TEST_DATE), lastTestDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TC),
					reader.getCellValue("Sheet1", 1, 4));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TEST_DATE), testDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TC),
					reader.getCellValue("Sheet1", 1, 6));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void search_Reading() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_TYPE), "51");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_FREE_TYPE),
					reader.getCellValue("Sheet1", 2, 0));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NO),
					reader.getCellValue("Sheet1", 2, 1));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NAME),
					reader.getCellValue("Sheet1", 2, 2));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TEST_DATE), lastTestDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TC),
					reader.getCellValue("Sheet1", 2, 4));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TEST_DATE), testDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TC),
					reader.getCellValue("Sheet1", 2, 6));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void search_Writing() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_TYPE), "52");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_FREE_TYPE_ITEM2),
					reader.getCellValue("Sheet1", 3, 0));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NO_ITEM2),
					reader.getCellValue("Sheet1", 3, 1));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NAME_ITEM2),
					reader.getCellValue("Sheet1", 3, 2));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TEST_DATE_ITEM2), lastTestDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TC_ITEM2),
					reader.getCellValue("Sheet1", 3, 4));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TEST_DATE_ITEM2), testDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TC_ITEM2),
					reader.getCellValue("Sheet1", 3, 6));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void search_Speaking() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_TYPE), "53");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_FREE_TYPE),
					reader.getCellValue("Sheet1", 4, 0));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NO_ITEM2),
					reader.getCellValue("Sheet1", 4, 1));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_CDD_NAME_ITEM2),
					reader.getCellValue("Sheet1", 4, 2));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TEST_DATE_ITEM2), lastTestDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_LAST_TC_ITEM2),
					reader.getCellValue("Sheet1", 4, 4));
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TEST_DATE_ITEM2), testDate);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_SEARCH_TC_ITEM2),
					reader.getCellValue("Sheet1", 4, 6));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	/*	@Test(description = "Check and add testroom for 'Free Listening'")
	public void step01_AddTestRoom_Listening() {
		search_Listening();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isWebElementPreset(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE))) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_TESTROOM), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Amend testroom to 'ROM 2' for 'Free Listening'")
	public void step02_AmendTestRoom_Listening() {
		search_Listening();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_AMEND));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_TESTROOM), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the details for 'Free Listening'")
	public void step03_View_Listening() {
		search_Listening();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW_ROOM), roomName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Delete the test room arrange for 'Free Listening'")
	public void step04_DeleteTestRoom_Listening() {
		search_Listening();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Check and add testroom for 'Free Reading'")
	public void step05_AddTestRoom_Reading() {
		search_Reading();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isWebElementPreset(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE))) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_ADD));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_TESTROOM), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Amend testroom to 'ROM 2' for 'Free Reading'")
	public void step06_AmendTestRoom_Reading() {
		search_Reading();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_AMEND));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_TESTROOM), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the details for 'Free Reading'")
	public void step07_View_Reading() {
		search_Reading();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW_ROOM), roomName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Delete the test room arrange for 'Free Reading'")
	public void step08_DeleteTestRoom_Reading() {
		search_Reading();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Check and add testroom for 'Free Writting'")
	public void step09_AddTestRoom_Writting() {
		search_Writing();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isWebElementPreset(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE_ITEM2))) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_ITEM2));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_TESTROOM), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Amend testroom to 'ROM 2' for 'Free Writting'")
	public void step10_AmendTestRoom_Writting() {
		search_Writing();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_AMEND_ITEM2));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_TESTROOM), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the details for 'Free Writting'")
	public void step11_View_Writting() {
		search_Writing();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW_ITEM2));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW_ROOM), roomName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Delete the test room arrange for 'Free Writting'")
	public void step12_DeleteTestRoom_Writting() {
		search_Writing();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE_ITEM2));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}*/

	@Test(description = "Check and add test room for 'Free Speaking'")
	public void step13_AddTestRoom_Speaking() {
		search_Speaking();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			if (action.isWebElementPreset(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE_SPK))) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_ITEM2));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_SPK_TEST_DATE), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_SPK_ROOM), 1);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Amend testroom to 'ROM 2' for 'Free Speaking'")
	public void step14_AmendTestRoom_Speaking() {
		search_Speaking();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_AMEND_ITEM2));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByIndex(By.id(ElementHelper.FREE_TEST_ARRANGEMENT_ADD_SPK_ROOM), 2);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the details for 'Free Speaking'")
	public void step15_View_Speaking() {
		search_Speaking();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW_SPK));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_VIEW_ROOM_SPK), roomName);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Delete the test room arrange for 'Free Speaking'")
	public void step16_DeleteTestRoom_Speaking() {
		search_Speaking();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FREE_TEST_ARRANGEMENT_DELETE_SPK));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
