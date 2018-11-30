package com.selenium.test.testcenter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.test.utils.DynamicVariables;

public class TestDateList {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	DynamicVariables dv = new DynamicVariables();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 5);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Select")
	public void step01_Select() throws InterruptedException {
		ce.searchTestDateYear();
		ce.searchTestDateExamProductTypeButton();
		ce.searchTestDateExamFormatButton();
		ce.searchTestDateButton();
		Assert.assertEquals(ce.searchTestDateRealWarning(), dv.GetTestDateRealId());
	}
}
