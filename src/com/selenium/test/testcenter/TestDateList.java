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

public class TestDateList {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeMethod
	public void setUp(){
		ce.OpenBrower("TestCenter", 5);
	}

	@AfterMethod
	public void Close() {
		ce.Close();
	}

	@Test(description = "Select")
	public void step01_Select() throws InterruptedException {
		ce.searchTestDateYear();
		ce.searchTestDateExamProductTypeButton();
		ce.searchTestDateExamFormatButton();
		ce.searchTestDateButton();
		Assert.assertEquals(ce.searchTestDateRealWarning(), ce.GetTestDateRealId());
	}
}
