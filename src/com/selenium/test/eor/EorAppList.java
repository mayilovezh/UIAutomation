package com.selenium.test.eor;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class EorAppList {
	static WebDriver driver;
	WebDriverAction action;
	String familyName = "HE";
	String givenName = "RUI";
	String markingDueFrom = "2018/04/25";
	String serviceDeadlineFrom = "2018/05/23";
	String courierNo = "111222333";
	String status = "Done";

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigateExport() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_EXPORT_MONTH), "3");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByIndex(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DATE), 1);
	}

	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.CS_EOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_FAMILY_NAME), familyName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_GIVEN_NAME), givenName);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_STATUS), "4");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_MARKING_DUE_FROM), markingDueFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.id(ElementHelper.EOR_APP_LIST_SERVICE_DEADLINE_FROM), serviceDeadlineFrom);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_APP_LIST_REFUND_STATUS), "13");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step01_ImportEMS() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH_SELECT_INPUT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EOR_APP_LIST_IMPORT_EMS));
		Thread.sleep(ElementHelper.SHORT_TIME);
		upload("\\resource\\eor\\EOR-APP.csv");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.EOR_APP_LIST_IMPORT_UPLOAD));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}

	@Test
	public void step02_StatusCheck() throws Exception {
		navigate();
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH_COURIER_NUMBER)), courierNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_APP_LIST_SEARCH_STATUS)), status);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
	}

	@Test
	public void step03_ExportDispatchList() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DISPATCH_LIST));
		Thread.sleep(ElementHelper.LONG_TIME_B);
	}

	@Test
	public void step04_ExportLRScore() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_LR_SCORE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void step05_ExportWritingScore() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_EOR_WRIT_SCORE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void step06_ExportSpeakingScore() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_EOR_SPK_SCORE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test
	public void step07_ExportDiffWriting() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DIFF_WRIT));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step08_ExportDiffSpeaking() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_DIFF_SPK));
		Thread.sleep(ElementHelper.LONG_TIME);
	}

	@Test
	public void step09_ExportScoreInformation() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_APP_LIST_EXPORT_EOR_SCORE_INFORMATION));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	public void upload(String filePath) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if (file.exists()) {
			driver.findElement(By.id(ElementHelper.EOR_APP_LIST_IMPORT_CHOOSE)).sendKeys(file.getPath());
		}
	}
}
