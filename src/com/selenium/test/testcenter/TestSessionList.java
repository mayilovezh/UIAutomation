package com.selenium.test.testcenter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestSessionList {

	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeMethod
	public void setUp(){
		ce.OpenBrower("TestCenter", 4);
	}

	@AfterMethod
	public void Close() {
		ce.Close();
	}
	
//	@Test(description = "Log Out")
//	public void step01_LogOut(){
//		ce.LogOutClick();
//	}

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
			ce.SelectSearchTestSessionRegion();
			ce.SelectSearchTestSessionExamProductType();
			ce.SelectSearchTestSessionExamFormat();
			ce.SelectSearchTestSessionTestDateYear();
			ce.SelectSearchTestSessionTestDateMonth();
			ce.SelectSearchTestSessionTestDate();
			ce.SelectSearchTestSessionTestCenter();
			ce.SearchOfTestSessionClick();
			ce.ModifyTestSessionClick();
			ce.ModifySessionQuota(ci.modifySessionQuota);
			ce.ViewOfBuildingDetailsFirstClick();
			ce.ViewOfBuildingDetailsSecondClick();
		}catch(TimeoutException e) {
			System.out.println("3333");
		}

	}

	@Test(description = "Search TC session list for NEEA")
	public void step05_SearchTCSessionForNeea(){
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

}
