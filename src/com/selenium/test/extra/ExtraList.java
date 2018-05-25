package com.selenium.test.extra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class ExtraList {
	static WebDriver driver;
	WebDriverAction action;
	String candidateNo = "313316";
	String phone = "1234567890";
	String courierNo = "987654321";
	String statusCheck = "Sent Overdue";

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
		action.click(By.id(ElementHelper.CS_EXTRA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EXTRA_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EXTRA_LIST_MONTH), 2);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_DATE), "10206");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EXTRA_LIST_STATUS), "4");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXTRA_LIST_CANDIDATE_NO), candidateNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.PENDING_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	/*@Test
	public void step01_UpdateApp() throws Exception {
		navigate();
		action.click(By.linkText(ElementHelper.EXTRA_LIST_UPDATE_APP));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.EXTRA_LIST_UPDATE_APP_PHONE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXTRA_LIST_UPDATE_APP_PHONE), phone);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.clear(By.id(ElementHelper.EXTRA_LIST_UPDATE_APP_COURIER_NO));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EXTRA_LIST_UPDATE_APP_COURIER_NO), courierNo);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}*/
	
	@Test
	public void step01_ViewLog() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXTRA_LIST_VIEW_LOG));
		Thread.sleep(ElementHelper.SHORT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXTRA_LIST_VIEW_LOG_UPDATEBY)), ElementHelper.USER_NAME_UAT);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step02_StatusCheck() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EXTRA_LIST_STATUS_CHECK)), "Sent");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}

	@Test
	public void step03_ExportExcel() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXTRA_LIST_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXTRA_LIST_EXPORT_EXCEL));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	/*@Test
	public void step03_ChangetoDone() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EXTRA_LIST_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EXTRA_LIST_DONE));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}*/
}
