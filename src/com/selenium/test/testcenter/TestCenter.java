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
		String saveWarning = ce.SaveSuccessfulWarning();
		Assert.assertEquals(saveWarning, ci.saveSuccessfulMessage);
		
	}
}
