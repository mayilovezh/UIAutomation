package com.selenium.test.examiner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AvailabilitySummary{
	ExaminerElements ee = new ExaminerElements();
	ExaminerInputData ei = new ExaminerInputData();
	
	@BeforeClass
	public void setUp(){
		ee.OpenBrower("Examiner", 11);
	}

	@AfterClass
	public void Close() {
		ee.Close();
	}

	@Test
	public void step01_Search(){
		ee.SearchAvailabilitySummaryRegion();
		ee.SearchAvailabilitySummaryYear();
		ee.SearchAvailabilitySummaryMonth();
		ee.SearchAvailabilitySummaryClick();
		ee.WaitTime();
		Assert.assertEquals(ee.SearchAvailabilitySummaryWarning(), ee.SearchAvailabilitySummaryWarning());
	}
	/*
	@Test
	public void step02_ModifyLock(){
		ee.ModifyLockAvailabilitySummaryClick();
		ee.InputModifyLockLockSPKdate();
		ee.ModifyFirstClick();
	}

	@Test
	public void step03_ModifyAvailability(){
		ee.WaitTime();
		ee.AvailabilitySummaryModifyAvailabilityClick();
		ee.WaitTime();
		ee.ModifyAvailabilitySummary();
		ee.ModifyFirstClick();
	}
	*/
}
