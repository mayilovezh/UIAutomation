package com.selenium.test.testcenter;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCenter {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeMethod
	public void setUp(){
		ce.OpenBrower("TestCenter", 1);
	}

	@AfterMethod
	public void Close() {
		ce.Close();
	}

	@Test(description = "Create the TestCenter of UIBE")
	public void step01_Create() {
		ce.CreateCenterClick();
		ce.SelectCreateCenterRegionClick();
		ce.SelectCreateCenterProvinceClick();
		ce.SelectCreateCenterCityClick();
		ce.InputCreateCenterCenterNameCn(ci.tcName);
		ce.InputCreateCenterCenterNameEn(ci.tcEName);
		ce.InputCreateCenterTCQuota();
		ce.InputCreateCenterTCOptimalQuota();
		ce.InputCreateCenterAbbreviation(ci.abbreviation);
		ce.InputCreateCenterAddressCn(ci.address);
		ce.InputCreateCenterAddressEn(ci.addressE);
		ce.SelectCreateCenterRegionZone();
		ce.InputCreateCenterCenterDescription(ci.centerDescription);
		ce.InputCreateCenterTrafficInfoCn(ci.trafficInfoCn);
		ce.InputCreateCenterTrafficInfoEn(ci.trafficInfoEn);
		ce.InputCreateCenterTelephone(ci.telephone);
		ce.InputCreateCenterSuperPhone(ci.superPhone);
		ce.InputCreateCenterPostCode(ci.postCode);
		ce.CreateCenterSaveButton();
//		String saveWarning = ce.SaveSuccessfulWarning();
//		Assert.assertEquals(saveWarning, ci.saveSuccessfulMessage);
	}

	@Test(description = "Search the TestCenter of UIBE")
	public void step02_Search() {
		ce.SearchSelectCenterRegionClick();
		ce.SearchCenterNameCn(ci.tcName);
		ce.SearchClick();
		String listOfCenterNameCn = ce.listOfCenterNameCnWarning();
		Assert.assertEquals(listOfCenterNameCn, ci.tcName);
	}

	@Test(description = "Modify the TestCenter of UIBE")
	public void step03_Modify() {
		ce.SearchSelectCenterRegionClick();
		ce.SearchCenterNameCn(ci.tcName);
		ce.SearchClick();
		ce.CenterListDetailsClick();
		ce.InputCreateCenterCenterNameCn(ci.mtcName);
		ce.CreateCenterSaveButton();
		ce.WaitTime();
		ce.SearchSelectCenterRegionClick();
		ce.SearchCenterNameCn(ci.mtcName);
		ce.SearchClick();
		String listOfCenterNameCn = ce.listOfCenterNameCnWarning();
		Assert.assertEquals(listOfCenterNameCn, ci.mtcName);
	}

	@Test(description = "View the TestCenter of UIBE")
	public void step05_View() {
		ce.SearchSelectCenterRegionClick();
		ce.SearchCenterNameCn(ci.mtcName);
		ce.SearchClick();
		String listOfCenterNameCn = ce.listOfCenterNameCnWarning();
		ce.CenterListViewClick();
		String viewCenterNameCnWarning = ce.ViewCenterNameCnWarning();
		Assert.assertEquals(viewCenterNameCnWarning, listOfCenterNameCn);

	}	
}
