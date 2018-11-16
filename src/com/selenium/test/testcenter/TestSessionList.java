package com.selenium.test.testcenter;

import org.openqa.selenium.TimeoutException;
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
	public void step02_CreateSession(){
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
		ce.ViewOfBuildingDetailsFirstClick();
		ce.WaitTime();
		ce.WaitTime();
		ce.ViewOfBuildingDetailsSecondClick();
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
	public void step04_ModifySession() throws InterruptedException{
		try {
			ce.ModifyTestSessionClick();
			ce.ModifySessionQuota(ci.modifySessionQuota);
			ce.ViewOfBuildingDetailsFirstClick();
			ce.ViewOfBuildingDetailsSecondClick();
		}catch(TimeoutException e) {
			System.out.println("3333");
		}

	}
	/*
	@Test(description = "Search TC session list for NEEA")
	public void step05_SearchTCSessionForNeea(){
		ce.WaitTime();
		ce.SelectSearchTestSessionRegion();
		ce.SearchTcSessionViewLogFrom();
		ce.SearchTcSessionViewLogTo();
		ce.SearchTcSessionButton();
		Assert.assertEquals(ce.TestTCCenterSessionOfSearchWarning(), ci.abbreviation);
	}

	@Test(description = "Reset TC session list for NEEA")
	public void step06_ResetTCSessionForNeea(){
		ce.ResetTcSessionButton();
		Assert.assertEquals(ce.NoDataWarning(), ci.noDataWarning);
	}
	*/
}
