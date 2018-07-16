package com.selenium.test.testcenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestSessionList {
	static WebDriver driver;
	WebDriverAction action;
	String testDate = "2018-06-30";
	String testCenter = "BJ-UIBE";
	String warningMessage = "2018-06-30 has select the BJ-UIBE";

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	@Test(description = "Verify select options and existed session warnings")
	public void step01_VerifyCreate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_SESSION_LIST));
		action.getDefaultOption(By.id(ElementHelper.TS_REGION));
		action.waitElementVisibleToClick(By.id(ElementHelper.TS_CREATE));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			List<String> productOptions = Arrays
					.asList(new String[] { ElementHelper.SELECT_DEFAULT, ElementHelper.PRODUCT_IELTS,
							ElementHelper.PRODUCT_IELTS_UKVI, ElementHelper.PRODUCT_IELTS_LIFE_SKILLS });
			int productSize = productOptions.size();
			Select productselectStage = new Select(driver.findElement(By.id(ElementHelper.TS_CREATE_PRODUCT)));
			Assert.assertFalse(productselectStage.isMultiple());
			List<String> productOptions1 = new ArrayList<String>();
			for (WebElement element : productselectStage.getOptions()) {
				productOptions1.add(element.getText());
			}
			Assert.assertEquals(productOptions.toArray(), productOptions1.toArray());
			System.out.println("The select list number is" + " " + productSize);
			action.selectByValue(By.id(ElementHelper.TS_CREATE_PRODUCT), "1");
			
			List<String> formatOptions = Arrays
					.asList(new String[] { ElementHelper.SELECT_DEFAULT, ElementHelper.FORMAT_PB, ElementHelper.FORMAT_CB,
							ElementHelper.FORMAT_CD_AM, ElementHelper.FORMAT_CD_PM, ElementHelper.FORMAT_CD_EV });
			int formatSize = formatOptions.size();
			Select formatselectStage = new Select(driver.findElement(By.id(ElementHelper.TS_CREATE_FORMAT)));
			Assert.assertFalse(formatselectStage.isMultiple());
			List<String> formatOptions1 = new ArrayList<String>();
			for (WebElement element : formatselectStage.getOptions()) {
				formatOptions1.add(element.getText());
			}
			Assert.assertEquals(formatOptions.toArray(), formatOptions1.toArray());
			System.out.println("The select list number is" + " " + formatSize);
			action.selectByValue(By.id(ElementHelper.TS_CREATE_FORMAT), "1");
			action.click(By.id(ElementHelper.TS_CREATE_SEARCH));
			action.waitElementVisibleToClick(By.id(ElementHelper.TS_CREATE_TESTDATE));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.TS_CRAETE_TC));
			action.isTextPrest(By.id(ElementHelper.RESULT_WARNING), warningMessage);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.waitElementVisibleToClick(By.xpath(ElementHelper.TS_CREATE_WARNING));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Create the test session of UIBE")
	public void step02_Create() {
		navigate();
		try {
			if (action.isWebElementPreset(By.xpath(ElementHelper.TS_TEST_DATE))
					&& action.isWebElementPreset(By.xpath(ElementHelper.TS_TEST_CENTER))) {
				new DriverInstance().teardown(driver);
			} else {
				action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
				action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_SESSION_LIST));
				action.waitElementVisibleToClick(By.id(ElementHelper.TS_CREATE));
				action.waitElementVisible(By.id(ElementHelper.TS_CREATE_PRODUCT));
				action.selectByValue(By.id(ElementHelper.TS_CREATE_PRODUCT), "1");
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByValue(By.id(ElementHelper.TS_CREATE_FORMAT), "1");
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.selectByValue(By.id(ElementHelper.TS_CREATE_TESTDATE_END), "12");
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.id(ElementHelper.TS_CREATE_SEARCH));
				action.waitElementVisibleToClick(By.id(ElementHelper.TS_CREATE_TESTDATE));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.TS_CRAETE_TC));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME_B);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search the test session of 'UIBE' and test date is '2018-6-30'")
	public void step03_SearchTestSession() {
		searchTS();
	}

	@Test(description = "Modify the test session quota to '230'")
	public void step04_Modify() {
		searchTS();
		try {
			if (action.isWebElementPreset(By.xpath(ElementHelper.TS_SYNC_STATUS))){
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.linkText(ElementHelper.TS_MODIFY));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.clear(By.id(ElementHelper.TS_MODIFY_SESSION_QUOTA));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.sendkeys(By.id(ElementHelper.TS_MODIFY_SESSION_QUOTA), "230");
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
				Thread.sleep(ElementHelper.SHORT_TIME);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "View the test session's log of 'UIBE'")
	public void step05_ModifyLog() {
		searchTS();
		try {
			if(action.isWebElementPreset(By.xpath(ElementHelper.TS_SYNC_STATUS))) {
				new DriverInstance().teardown(driver);
			} else {
				action.click(By.linkText(ElementHelper.TS_LOG));
				action.isTextPrest(By.xpath(ElementHelper.TS_LOG_CREATE_BY), ElementHelper.USER_NAME_UAT);
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				action.click(By.xpath(ElementHelper.SAVE));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void navigate() {
		try {
			action.waitElementVisibleToClick(By.id(ElementHelper.TEST_CENTER));
			action.waitElementVisibleToClick(By.xpath(ElementHelper.TEST_SESSION_LIST));
			action.waitElementVisible(By.id(ElementHelper.TS_REGION));
			action.selectByValue(By.id(ElementHelper.TS_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TS_YEAR), ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.TS_MONTH), 6);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.TS_DATE), "10357");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.TS_CENTER), ElementHelper.CENTER_UIBE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.TS_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void searchTS() {
		navigate();
		action.waitElementVisibleToAssert(By.xpath(ElementHelper.TS_TEST_DATE), testDate);
		action.waitElementVisibleToAssert(By.xpath(ElementHelper.TS_TEST_CENTER), testCenter);
		
	}
	

}
