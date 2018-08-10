package com.selenium.test.pretestarrange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class SetUploadStatus {
	static WebDriver driver;
	WebDriverAction action;
	String tc = "BJ-CUEB";
	String testDate = "2018-05-19";
	String quota = "282";
	String registeredQuota = "465";
	String preUpload = "147";
	String ATUploaded = "465";
	String ATNeeaUploaded = "465";

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
		action.waitElementVisibleToClick(By.xpath(ElementHelper.SET_UPLOAD_STATUS));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.SET_UPLOAD_STATUS_VIEW_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.SET_UPLOAD_STATUS_VIEW_MONTH), 4);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.SET_UPLOAD_STATUS_VIEW_DATE), "10215");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SET_UPLOAD_STATUS_VIEW_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "View the data 'CUEB' for NEEA and iTap")
	public void step01_ViewUploadData() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_TC), tc);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_TEST_DATE), testDate);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_PRODUCT), ElementHelper.PRODUCT_IELTS);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_QUOTA), quota);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_REGISTERED), registeredQuota);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_PRE_UPLOAD), preUpload);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_AT_UPLOADED), ATUploaded);
			action.assertText(By.xpath(ElementHelper.SET_UPLOAD_STATUS_VIEW_AT_NEEA_RECEIVED), ATNeeaUploaded);
			action.click(By.xpath(ElementHelper.SAVE));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
