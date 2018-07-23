package com.selenium.test.testcenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SpkRoomAvailability {
	static WebDriver driver;
	WebDriverAction action;
	String dateFrom = "2018-06-01";
	String dateTo = "2018-06-30";
	String testDate = "2018-07-28";
	String modifyLog = "Modify TC Speaking Availability";

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
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ROOM_AVAILABILITY));
			action.waitElementVisible(By.id(ElementHelper.SPK_ROOM_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_PRODUCT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_FORMAT), "1");
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_TEST_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Create the speaking availability of saturday")
	public void step01_Create() {
		search();
		try {
			if (action.isTextExist(By.xpath(ElementHelper.SPK_ROOM_SEARCH_TESTDATE), testDate)
					&& action.isTextExist(By.xpath(ElementHelper.SPK_ROOM_SEARCH_TEMPLATE), "BJ-UIBE-Sat")) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.id(ElementHelper.SPK_ROOM_CREATE));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.waitElementVisible(By.id(ElementHelper.SPK_ROOM_CREATE_TEST_CENTER));
				action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_TEST_CENTER), ElementHelper.CENTER_UIBE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.SPK_ROOM_CREATE_TEMPLATE_TYPE), 2);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByIndex(By.id(ElementHelper.SPK_ROOM_CREATE_TEMPLATE_NAME), 1);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_REGION), ElementHelper.REGION_VALUE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_FORMAT), "1");
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_TC), ElementHelper.CENTER_UIBE);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.SPK_ROOM_CREATE_SEARCH));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.id(ElementHelper.SPK_ROOM_CREATE_TEST_DATE));
				Thread.sleep(ElementHelper.SHORT_TIME);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public void search() {
		navigate();
		try {
			action.click(By.xpath(ElementHelper.SPK_ROOM_CALENDAR_FROM));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.linkText(ElementHelper.SPK_ROOM_TESTDATE_FROM));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SPK_ROOM_CALENDAR_TO));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.SPK_ROOM_TESTDATE_TO));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.id(ElementHelper.SPK_ROOM_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_ROOM_SEARCH_TESTDATE)), testDate);
			action.isTextExist(By.xpath(ElementHelper.SPK_ROOM_SEARCH_TEMPLATE), "BJ-UIBE-Sat");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search the speaking availability of saturday")
	public void step02_SearchAvailability() {
		search();
	}

	@Test(description = "Modify the speaking availability's room of saturday ")
	public void step03_Modify() {
		try {
			search();
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_ROOM_MODIFY));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.sendkeys(By.id(ElementHelper.SPK_ROOM_MODIFY_REMARK), ElementHelper.REMARK_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the speaking availability's detail")
	public void step04_View() {
		try {
			search();
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_ROOM_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.id(ElementHelper.SPK_ROOM_VIEW_REMARK)), ElementHelper.REMARK_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.CANCEL));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the speaking availability's modify log")
	public void step05_Log() {
		try {
			search();
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_ROOM_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_ROOM_LOG_CONTENT)), modifyLog);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Delete the speaking availability of saturday")
	public void step06_Detlete() {
		try {
			search();
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_ROOM_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Delete the speaking template of saturday")
	public void step07_DeleteSpkTemplateSat() {
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
			action.waitElementVisible(By.id(ElementHelper.SPK_TEMPLATE_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_TEMPLATE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(description = "Delete the speaking template of thursday")
	public void step08_DeleteSpkTemplateThu() {
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
			action.waitElementVisible(By.id(ElementHelper.SPK_TEMPLATE_REGION));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_TEMPLATE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
