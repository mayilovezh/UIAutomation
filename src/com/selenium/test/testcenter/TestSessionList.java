package com.selenium.test.testcenter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSessionList {

	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 4);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Create Session")
	public void step01_CreateSession(){
		ce.CreateTestSessionClick();
		ce.CreateTestSeesionRegionClick();
		ce.CreateTestSesstionProductClick();
		ce.CreateTestSessionTestCenterClick();
		ce.CreateTestSessionFormatClick();
		ce.CreateTestSessionTimeTableClick();
		ce.CreateTestSessionStartTestYearClick();
		ce.CreateTestSessionStartTestMonthClick();
		ce.CreateTestSessionEndTestYearClick();
		ce.CreateTestSessionEndTestMonthClick();
		ce.CreateTestSessionEndSearchClick();
		ce.CreateTestSessionTestDate();
		ce.ModifyFirstClick();
		ce.ModifySecondClick();
	}

	@Test(description = "Logout session")
	public void step02_LogOut(){
		ce.WaitTime();
		ce.LogOutClick();
		ce.OpenBrower("TestCenter", 4);
		step01_CreateSession();
	}

	@Test(description = "Search Session")
	public void step03_SearchSession(){
		ce.WaitTime();
		ce.SelectSearchTestSessionRegion();
		ce.SelectSearchTestSessionExamProductType();
		ce.SelectSearchTestSessionExamFormat();
		ce.SelectSearchTestSessionTestDateYear();
		ce.SelectSearchTestSessionTestDateMonth();
		ce.SelectSearchTestSessionTestDate();
		ce.SelectSearchTestSessionTestCenter();
		ce.SearchOfTestSessionClick();
		Assert.assertEquals(ce.TestCenterOfSearchWarning(), ci.abbreviation);
	}

	@Test(description = "Modify Session")
	public void step04_ModifySession(){
		ce.ModifyTestSessionClick();
		ce.ModifySessionQuota(ci.modifySessionQuota);
		ce.ModifyFirstClick();

	}

	@Test(description = "Create last session in the current month")
	public void step05_CreateLastSession(){
		ce.CreateTestSessionClick();
		ce.CreateTestSeesionRegionClick();
		ce.CreateTestSesstionProductClick();
		ce.CreateTestSessionTestCenterClick();
		ce.CreateLastTestSessionFormatClick();
		ce.CreateTestSessionTimeTableClick();
		ce.CreateTestSessionStartTestYearClick();
		ce.CreateTestSessionStartTestMonthClick();
		ce.CreateTestSessionEndTestYearClick();
		ce.CreateTestSessionEndTestMonthClick();
		ce.CreateTestSessionEndSearchClick();
		ce.CreateLastTestSessionTestDate();
		ce.ModifyFirstClick();
		ce.ModifySecondClick();
	}

	@Test(description = "Search session in the current month")
	public void step06_SearchLastSession(){
		ce.WaitTime();
		ce.SelectSearchTestSessionRegion();
		ce.SelectSearchTestSessionExamProductType();
		ce.SelectSearchLastTestSessionExamFormat();
		ce.SelectSearchTestSessionTestDateYear();
		ce.SelectSearchTestSessionTestDateMonth();
		ce.SelectSearchLastTestSessionTestDate();
		ce.SelectSearchTestSessionTestCenter();
		ce.SearchOfTestSessionClick();
		Assert.assertEquals(ce.TestCenterOfSearchWarning(), ci.abbreviation);
	}

	
}
