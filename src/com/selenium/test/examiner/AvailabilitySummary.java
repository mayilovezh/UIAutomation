package com.selenium.test.examiner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class AvailabilitySummary {
	static WebDriver driver;
	WebDriverAction action;
	String lockSpkDate = "2018-07-01";
	String lockWrtDate = "2018-07-01";
	String dateFrom = "2018-04-01";
	String dateTo = "2018-05-01";
	String logSpk = "Lock SPK date";
	String logWrt = "Lock WRT/2nd/EOR date";
	String logOperation = "Change Lock Date from 2018-06-29 to 2018-06-29";

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
			action.click(By.id(ElementHelper.EXAMINER));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.AVAILABILITY_SUMMARY));
			action.waitElementVisible(By.id(ElementHelper.AVAILABILITY_SUMMARY_REGIOM));
			action.selectByValue(By.id(ElementHelper.AVAILABILITY_SUMMARY_REGIOM), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.AVAILABILITY_SUMMARY_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.AVAILABILITY_SUMMARY_MONTH), "7");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.AVAILABILITY_SUMMARY_SEARCH));
			Thread.sleep(ElementHelper.LONG_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
	}
	
	/*@Test
	public void step01_ModifyAvailability() throws Exception {
		navigate();
		action.click(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_AVAIL));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_AVAIL_PAGE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.name(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_AVAIL_YES));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_AVAIL_REMARK), ElementHelper.REMARK_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_AVAIL_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_AVAIL_SAVE));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step02_ModifyLock() {
		try {
			navigate();
			action.click(By.id(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_LOCK));
			Thread.sleep(ElementHelper.LONG_TIME);
			action.clear(By.id(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_LOCK_SPK_DATE));
			action.sendkeys(By.id(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_LOCK_SPK_DATE), lockSpkDate);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.clear(By.id(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_LOCK_WRT_DATE));
			action.sendkeys(By.id(ElementHelper.AVAILABILITY_SUMMARY_MODIFY_LOCK_WRT_DATE), lockWrtDate);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
	}*/
	
	@Test
	public void step03_ModifyLockLog() {
		navigate();
		action.click(By.id(ElementHelper.AVAILABILITY_SUMMARY_LOG));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_LOCK_SPK_LOG_TYPE), logSpk);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_LOCK_SPK_LOG_OPERATION),
					logOperation);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_LOCK_SPK_LOG_CREATEBY),
					ElementHelper.USER_NAME_UAT);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_LOCK_WRT_LOG_TYPE), logWrt);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_LOCK_WRT_LOG_OPERATION),
					logOperation);
			action.waitElementVisibleToAssert(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_LOCK_WRT_LOG_CREATEBY),
					ElementHelper.USER_NAME_UAT);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
	}
	
	@Test
	public void step04_ExportAvailability() {
		try {
			navigate();
			action.click(By.xpath(ElementHelper.AVAILABILITY_SUMMARY_EXPORT_AVAIL));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.chooseOkOnNextConfirmation();
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		}
	}
}
