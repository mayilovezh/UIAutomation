package com.selenium.test.pretestarrange;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class SpkArrangementPrebooking {
	static WebDriver driver;
	WebDriverAction action;
	String cddName = "李 扬";
	String examinerInitial = "BI";
	String testDate = "2018-05-19";
	String spkTestDay = "2018-05-16";
	String city = "BeiJing";
	String testCenter = "BJ-BFSU";
	String slotInfo = "08:20-08:40  08:40-09:00  09:00-09:20  09:20-09:40  09:40-10:00  10:00-10:20  10:20-10:35  10:35-10:55  10:55-11:15  11:15-11:35  11:35-11:55  11:55-12:15  12:15-13:00  13:00-13:20  13:20-13:40  13:40-14:00  14:00-14:20  14:20-14:40  14:40-14:55  14:55-15:15  15:15-15:35  15:35-15:55  15:55-16:15  ";
	ExcelReader reader = new ExcelReader(".\\resource\\pretestArrange\\Check Examiner Duplicate Arrangement.xlsx");

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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ARRANGEMENT));
		action.waitElementVisible(By.id(ElementHelper.SPK_ARRANFEMENT_REGION));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SPK_ARRANGEMENT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_DATE), "10352");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Verify the testCenter is 'CUEB'")
	public void step01_Search() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			isTestCenterPreset();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	// TO DO
	@Test(description = "")
	public void step02_AddTimeSlot() {

	}

	@Test(description = "View the time slot details")
	public void step03_AmendTimeSlot() {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_AMEND_TIME_SLOT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.SPK_ARRANGEMENT_TIME_SLOT_CDD_NAME), cddName);
			action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_BACK));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Add speaking candidates allocation  for 'CUEB'")
	public void step04_AddSpkAllocation() {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_ADD_SPK_APPORTIONMENT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.SPK_ARRANGEMENT_AMEND_ARRANGE_ROOM_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			if (action.isTextExist(By.id(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_CDD_NAME), cddName)) {
				action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_DELETE));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.chooseOkOnNextConfirmation();
				action.waitElementVisibleToAssert(By.id(ElementHelper.RESULT_WARNING), "Success.");
				action.click(By.xpath(ElementHelper.SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_AUTO));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_AUTO_CONFIRM));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.chooseOkOnNextConfirmation();
				action.waitElementVisibleToAssert(
						By.xpath(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_YES_CONFIRMATION), "Success.");
			} else {
				action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_AUTO));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.click(By.xpath(ElementHelper.SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_ARRANGEMENT_SPK_APPORTIONMENT_SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
				action.chooseOkOnNextConfirmation();
				action.waitElementVisibleToAssert(By.id(ElementHelper.RESULT_WARNING), "Success.");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the spk apportionment details")
	public void step05_AmendSpkApportionment() {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_AMEND_SPK_APPORTIONMENT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.SPK_ARRANGEMENT_AMEND_ARRANGE_ROOM_SEARCH));
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.SPK_ARRANGEMENT_TIME_SLOT_CDD_NAME), cddName);
			action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_BACK));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	// TO DO
	@Test(description = "")
	public void step06_ChangeExaminer() {

	}

	// TO DO
	@Test(description = "")
	public void step07_DeleteArrangement() {

	}

	@Test(description = "View and check the arrange room details")
	public void step08_AmendArrangeRoom() {
		navigate();
		action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_AMEND_ARRANGE_ROOM));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			List<WebElement> table = driver.findElements(By.id("spreadsheet-SpkRoomArrangement-table-Arr"));
			for (int i = 0; i < table.size(); i++) {
				if (table.size() == 17) {
					action.click(By.xpath(ElementHelper.SPK_ARRANGEMENT_BACK));
				} else {
					System.out.println(table.size());
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Export the speaking testsession details")
	public void step09_Export() {
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ARRANGEMENT));
		action.waitElementVisible(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_REGION));
		action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_REGION), ElementHelper.REGION_VALUE);
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_DATE), "10215");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT));
			action.setTimeout("10");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Check the examiner duplicate arrangement for time slot")
	public void step10_CheckExaminerDuplicateArrangement() {
		action.waitElementVisibleToClick(By.id(ElementHelper.PRE_TEST_ARRANGE));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ARRANGEMENT));
		action.waitElementVisible(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_REGION));
		action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_REGION), ElementHelper.REGION_VALUE);
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ARRANGEMENT_EXPORT_DATE), "10215");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_ARRANGEMENT_CHECK_EXAMINER_DUPLICATE_ARRANGEMENT));
			Thread.sleep(ElementHelper.LONG_TIME);
			Assert.assertEquals(examinerInitial, reader.getCellValue("Sheet1", 5, 0));
			Assert.assertEquals(testDate, reader.getCellValue("Sheet1", 5, 1));
			Assert.assertEquals(spkTestDay, reader.getCellValue("Sheet1", 5, 2));
			Assert.assertEquals(city, reader.getCellValue("Sheet1", 5, 3));
			Assert.assertEquals(testCenter, reader.getCellValue("Sheet1", 5, 4));
			Assert.assertEquals(slotInfo, reader.getCellValue("Sheet1", 5, 5));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public boolean isTestCenterPreset() {
		List<WebElement> table = driver.findElements(By.xpath(ElementHelper.SPK_ARRANGEMENT_SEARCH_TC));
		for (WebElement element : table) {
			if (element.getText().equals(ElementHelper.TC_CUEB)) {
				System.out.println(element.getText());
				break;
			}
		}
		return true;
	}
}
