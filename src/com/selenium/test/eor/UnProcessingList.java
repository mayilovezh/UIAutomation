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
	String caddNo = "242218";
	String addTime = "2018-05-14 14:40:35";
	String date = "2017-12-16";
	
	
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
		action.click(By.id(ElementHelper.CS_EOR));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.UNPROCESSING_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step01_RejectNotMatch() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_MATCH_STATUS), "2");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.UNPROCESSING_LIST_REJECT));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.SAVE));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	/*@Test
	public void step02_AddCdd() throws Exception {
		navigate();
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.UNPROCESSING_LIST_ADD));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_ADD_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_ADD_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_ADD_MONTH), "12");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_ADD_TEST_DATE), "10178");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.UNPROCESSING_LIST_ADD_CDD_NO), caddNo);
	}*/
	
	@Test
	public void step03_SearchTRFReceived() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_YEAR), "2017");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_MONTH), "12");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_DATE), "10178");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.UNPROCESSING_LIST_MATCH_STATUS), "3");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH_CDDNO)), caddNo);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.UNPROCESSING_LIST_SEARCH_DATE)), date);
	}
	
}
