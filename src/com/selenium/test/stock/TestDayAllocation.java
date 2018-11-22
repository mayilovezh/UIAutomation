package com.selenium.test.stock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestDayAllocation {

	StockElements se = new StockElements();
	StockInputData si = new StockInputData();
	
	@BeforeClass
	public void setUp(){
		se.OpenBrower("Stock", 4);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}

	@Test(description = "Search Test Day Allocation")
	public void step01_Search(){
		se.SelectTestDayAllocationRegion();
		se.SelectTestDayAllocationTestDateYear();
		se.SelectTestDayAllocationTestDateMonth();
		se.SelectTestDayAllocationTestDate();
		se.SelectTestDayAllocationTestCenter();
		se.TestDayAllocationSearchClick();
		se.WaitTime();
		se.WaitTime();
	}

	@Test(description = "Auto Arrange for Current Centre")
	public void step02_AutoArrangeforCurrentCentre(){
		se.TestDayAllocationAutoArrangeForCurrentCentre();
		se.TestDayAllocationSaveClick();
		se.WaitTime();
	}

	@Test(description = "Clear Arrange of Current Centre")
	public void step03_ClearArrangeofCurrentCentre(){
		se.TestDayAllocationClearArrangeOfCurrentCentre();
		se.WindowAlertConfirm();
		se.ModifyFirstClick();
		se.WaitTime();
		se.TestDayAllocationSaveClick();
		se.WaitTime();
		se.WaitTime();
		
	}		

	@Test(description = "Repeat Auto Arrange for Current Centre")
	public void step04_RepeatAutoArrangeforCurrentCentre(){
		se.SelectTestDayAllocationRegion();
		se.SelectTestDayAllocationTestDateYear();
		se.SelectTestDayAllocationTestDateMonth();
		se.SelectTestDayAllocationTestDate();
		se.SelectTestDayAllocationTestCenter();
		se.TestDayAllocationSearchClick();
		se.TestDayAllocationAutoArrangeForCurrentCentre();
		se.TestDayAllocationSaveClick();
	}
}
