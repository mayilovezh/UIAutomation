package com.selenium.test.pretestarrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class PrebookingSyncResult {
	static WebDriver driver;
	WebDriverAction action;
	String testdate = "19/05/2018";
    String misReleased = "147";
    String neeaReleased = "140";
    String misAM = "77";
    String misPM = "70";
    String neeaAM = "77";
    String neeaPM = "63";
    
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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.PREBOOKING_SYNC_RESULT_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.PREBOOKING_SYNC_RESULT_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.PREBOOKING_SYNC_RESULT_DATE), "10215");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check the sync data 'CUEB' for NEEA and MIS")
	public void step01_CheckSyncData() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_TEST_DATE), testdate);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_MIS2_RELEASED), misReleased);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_NEEA_RELEASED), neeaReleased);
			action.click(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_EXPAND));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_MIS_AM), misAM);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_MIS_PM), misPM);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_NEEA_AM), neeaAM);
			action.assertText(By.xpath(ElementHelper.PREBOOKING_SYNC_RESULT_SEARCH_NEEA_PM), neeaPM);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
