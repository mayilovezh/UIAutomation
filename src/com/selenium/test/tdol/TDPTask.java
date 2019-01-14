package com.selenium.test.tdol;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TDPTask{
	TdolElements te = new TdolElements();
	TdolInput ti = new TdolInput();
	
	@BeforeClass
	public void setUp(){
		te.OpenBrower("TDOL", 2);
	}

	@AfterClass
	public void Close() {
		te.Close();
	}

	@Test
	public void step01_Create(){
		te.CreateTDPTask();
		te.CreateTDPTaskRegion();
		te.CreateTDPTaskTestDateYear();
		te.CreateTDPTaskTestDateMonth();
		te.CreateTDPTaskTestDate();
		te.InputTDPTaskOpenIntervalStartDate();
		te.InputTDPTaskOpenIntervalEndDate();
		te.CreateTDPTaskTestDayChoose();
		te.CreateTDPTaskTestDayRemarksForStaff();
		te.CreateTDPTaskTestDayDescriptionForTDP();
		te.ModifySaveClick();
		te.ShortWaitTime();
	}

	@Test
	public void step02_Search(){
		te.SearchTDPTaskRegion();
		te.SearchTDPTaskTestDateStart();
		te.SearchTDPTaskTestDateEnd();
		te.SearchTDPTask();
		Assert.assertEquals(te.ListOfRegionNameWarning(), te.ListOfRegionNameWarning());
	}

	@Test
	public void step03_Reset(){
		te.SearchTDPTaskRegion();
		te.SearchTDPTaskTestDateStart();
		te.SearchTDPTaskTestDateEnd();
		te.ResetTDPTask();
		Assert.assertEquals(te.ListOfRegionNameWarning(), te.ListOfRegionNameWarning());
	}

	@Test
	public void step04_Modify(){
		te.ShortWaitTime();
		te.ModifyTDPTask();
		te.ShortWaitTime();
		te.ModifyTDPTaskTestDayRemarksForStaff();
		te.ModifySaveClick();
	}
	
}
