package com.selenium.test.pretestarrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class PrintDocuments {
	static WebDriver driver;
	WebDriverAction action;
	String cddNo = "049938";
	String cddName = "LI YANG";
	String examinerInitial = "AL2";
	String examinerNo = "986179";
	String spkBuilding = "No.1 Building, Hongmiao Campus of Capital University of Economics and Business";
	String spkRoom = "RM01";
	
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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.PRINT_DOCUMENTS));
		action.waitElementVisible(By.id(ElementHelper.PRINT_DOCUMENTS_REGION));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.selectByValue(By.id(ElementHelper.PRINT_DOCUMENTS_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.PRINT_DOCUMENTS_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.PRINT_DOCUMENTS_DATE), "10352");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.PRINT_DOCUMENTS_TC), "48");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Search and check the spking arrangement")
	public void step01_Search() {
		navigate();
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.PRINT_DOCUMENTS_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.assertText(By.xpath(ElementHelper.PRINT_DOCUMENTS_SEARCH_CDD_NO), cddNo);
			action.assertText(By.xpath(ElementHelper.PRINT_DOCUMENTS_SEARCH_CDD_NAME), cddName);
			action.assertText(By.xpath(ElementHelper.PRINT_DOCUMENTS_SEARCH_EXAMINER_INITIAL), examinerInitial);
			action.assertText(By.xpath(ElementHelper.PRINT_DOCUMENTS_SEARCH_EXAMINER_NO), examinerNo);
			action.assertText(By.xpath(ElementHelper.PRINT_DOCUMENTS_SEARCH_SPK_BUILDING), spkBuilding);
			action.assertText(By.xpath(ElementHelper.PRINT_DOCUMENTS_SEARCH_SPK_ROOM), spkRoom);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
