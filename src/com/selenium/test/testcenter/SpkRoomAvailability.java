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
	String dateFrom = "2018-01-01";
	String dateTo = "2018-01-31";
	String dateFrom1 = "2018-12-01";
	String dateTo1 = "2018-12-31";
	String testDate = "2018-12-13";
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
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.TEST_CENTER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SPK_ROOM_AVAILABILITY));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_PRODUCT), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_FORMAT), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), ElementHelper.TEST_CENTER_ID);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void step01_Create() {
		navigate();
		try {
			action.sendkeys(By.id(ElementHelper.SPK_ROOM_DATE_FROM), dateFrom);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.SPK_ROOM_DATE_FROM), dateTo);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.SPK_ROOM_CREATE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_TEST_CENTER), ElementHelper.TEST_CENTER_ID);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SPK_ROOM_CREATE_TEMPLATE_TYPE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SPK_ROOM_CREATE_TEMPLATE_NAME), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_FORMAT), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_TC), ElementHelper.TEST_CENTER_ID);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_YEAR_FROM), "2018");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_MONTH_FROM), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_YEAR_TO), "2018");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SPK_ROOM_CREATE_MONTH_TO), "12");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_ROOM_CREATE_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.SPK_ROOM_CREATE_TEST_DATE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void search() {
		navigate();
		try {
			/*action.click(By.cssSelector(ElementHelper.SPK_ROOM_DATE_FROM_CALENDAR));
			Thread.sleep(ElementHelper.SHORT_TIME_B);*/
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SPK_ROOM_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_ROOM_SEARCH_TESTDATE)), testDate);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void step02_SearchAvailability() {
		search();
	}

	@Test
	public void step03_Modify() {
	 search();
	 try {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.SPK_ROOM_MODIFY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.sendkeys(By.id(ElementHelper.SPK_ROOM_MODIFY_REMARK), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
	@Test
	public void step04_View() {
		search();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.linkText(ElementHelper.SPK_ROOM_VIEW));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_ROOM_VIEW_REMARK)), ElementHelper.REMARK_VALUE);
		    Thread.sleep(ElementHelper.SHORT_TIME);
		    action.click(By.xpath(ElementHelper.CANCEL));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void step05_Log() {
		search();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.linkText(ElementHelper.SPK_ROOM_LOG));
			Thread.sleep(ElementHelper.SHORT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.SPK_ROOM_LOG_CONTENT)), modifyLog);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void step06_Detlete() {
		search();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.linkText(ElementHelper.SPK_ROOM_DELETE));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void step07_DeleteSpkTemplateSat() throws InterruptedException {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), "100100");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_SEARCH));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step08_DeleteSpkTemplateThu() throws InterruptedException {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.TEST_CENTER));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SPK_ROOM_TEMPLATE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_REGION), "1");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.SPK_TEMPLATE_TEST_CENTER), "100100");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.SPK_TEMPLATE_SEARCH));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.linkText(ElementHelper.SPK_TEMPLATE_DELETE));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	

}
