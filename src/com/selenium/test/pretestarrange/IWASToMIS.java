package com.selenium.test.pretestarrange;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class IWASToMIS {
	
	static WebDriver driver;
	WebDriverAction action;
	String logMessage = "Import 460 Candidates";
	String number = "460";
	
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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.IWAS_TO_MIS));
		action.waitElementVisible(By.id(ElementHelper.IWAS_TO_MIS_YEAR));
		action.selectByValue(By.id(ElementHelper.IWAS_TO_MIS_YEAR), "2017");
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.IWAS_TO_MIS_MONTH), 7);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.IWAS_TO_MIS_DATE), "10161");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.IWAS_TO_MIS_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Import csv file for '2017-08-19_BFSU_IELTS'")
	public void step01_Import() {
		navigate();
		action.click(By.xpath(ElementHelper.IWAS_TO_MIS_IMPORT));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.uploadFile(".\\resource\\pretestArrange\\20170819-BJ-BFSU.csv", By.id(ElementHelper.IWAS_TO_MIS_IMPORT_CHOOSE));
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.click(By.cssSelector(ElementHelper.IWAS_TO_MIS_IMPORT_UPLOAD));
			Thread.sleep(ElementHelper.LONG_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check import number and logs.")
	public void step02_Log() {
		navigate();
		action.assertText(By.xpath(ElementHelper.IWAS_TO_MIS_SEARCH_CDD_NO), number);
		action.assertText(By.xpath(ElementHelper.IWAS_TO_MIS_SEARCH_IMPORT_NO), number);
		action.click(By.xpath(ElementHelper.IWAS_TO_MIS_LOG));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.IWAS_TO_MIS_LOG_MESSAGE), logMessage);
			action.assertText(By.xpath(ElementHelper.IWAS_TO_MIS_LOG_CREATE_BY), ElementHelper.USER_NAME_UAT);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
