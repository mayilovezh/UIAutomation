package com.selenium.test.eor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class UnProcessingList {
	static WebDriver driver;
	WebDriverAction action;
	String caddNo = "004406";
	String addTime = "2018-05-22 16:11:22";
	String date = "2018-04-07";
	
	
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
			action.click(By.id(ElementHelper.CS_EOR));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.UNPROCESSING_LIST));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Search the matching data")
	public void step01_Search() {
		navigate();
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH_CDDNO)), caddNo);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH_DATE)), date);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Export the matching data")
	public void step02_Export() {
		navigate();
		action.waitElementVisible(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH_CDDNO));
		action.click(By.id(ElementHelper.UNPROCESSING_LIST_EXPORT));
		action.setTimeout("10");
	}
	
}
