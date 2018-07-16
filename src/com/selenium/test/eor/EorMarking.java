package com.selenium.test.eor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class EorMarking {
	static WebDriver driver;
	WebDriverAction action;
	String availableExaminer = "60";
	String maxCount = "85";
	String maxAvgCount = "8.5";
	String capacityNumber = "40";
	
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
		action.click(By.xpath(ElementHelper.EOR_MARKING));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByValue(By.id(ElementHelper.EOR_MARKING_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_MARKING_YEAR), "2018");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByValue(By.id(ElementHelper.EOR_MARKING_MONTH), "4");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EOR_MARKING_DATE), 8);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EOR_MARKING_SEARCH));
		Thread.sleep(ElementHelper.LONG_TIME_A);
//		Assert.assertEquals(action.getText(By.id(ElementHelper.EOR_MARKING_AVAILABLE_EXAMINER)), "85");
	}
	
	public void search() throws Exception {
		navigate();
		action.clear(By.id(ElementHelper.EOR_MARKING_SELECT_EXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EOR_MARKING_SELECT_EXAMINER), "10");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_MARKING_CALCULATE));
		Thread.sleep(ElementHelper.LONG_TIME);
//		Assert.assertEquals(action.getText(By.id(ElementHelper.EOR_MARKING_CALCULATE_MAX_COUNT)), maxCount);
//		Thread.sleep(ElementHelper.SHORT_TIME_A);
//		Assert.assertEquals(action.getText(By.id(ElementHelper.EOR_MARKING_CALCULATE_MAX_AVG_COUNT)), maxAvgCount);
//		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	
	@Test
	public void step01_AutoAllocation() throws Exception {
		search();
		action.click(By.id(ElementHelper.EOR_MARKING_AUTO_ALLOCATION));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.chooseOkOnNextConfirmation();
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void setp02_SetCapacity() throws Exception {
		search();
		action.click(By.id(ElementHelper.EOR_MARKING_CLEAR_ALL_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.EOR_MARKING_SELECT_FIRST));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EOR_MARKING_SET_CAPACITY));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.clear(By.id(ElementHelper.EOR_MARKING_SET_CAPACITY_NUMBER));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.EOR_MARKING_SET_CAPACITY_NUMBER), "100");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
	
	@Test
	public void step03_ManualAlocationCheck() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.selectByIndex(By.id(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_EXAMINER), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.selectByIndex(By.id(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_TYPE), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.name(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_SELECT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_CHECK));
		Thread.sleep(ElementHelper.WAIT_TIME);
//		action.click(By.xpath(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_AVAILABLE_EXAMINER));
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
//		action.click(By.xpath(ElementHelper.SAVE));
//		Thread.sleep(ElementHelper.SHORT_TIME);
//		action.click(By.xpath(ElementHelper.EOR_MARKING_MANUAL_ALLOCATION_CHECK_CONFIRM_SAVE));
//		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step04_AllocationResultPage() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.EOR_MARKING_ALLOCATION_RESULT_PAGE));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.xpath(ElementHelper.EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN_EXAMINERNO)), "990801");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.isTextPrest(By.xpath(ElementHelper.EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN_EXAMINERNAME), "Andrew  Hillman");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN_CDDNO)), "005774,005808,005828,005834,005879,005882,005908,005913,005963,006001,006010");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.SAVE));
	}
}
