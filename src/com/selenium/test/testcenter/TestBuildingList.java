package com.selenium.test.testcenter;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBuildingList {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 2);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Create for the testbuilding of UIBE")
	public void step01_Create() throws InterruptedException{
		ce.SearchSelectBuildingOfRegionClick();
		ce.SearchSelectBuildingOfTestCenterClick();
		ce.SearchSelectBuildingOfBuildingAvailableClick();
		ce.BuildingOfSearchClick();
		ce.BuildingOfCreateClick();
		ce.CreateBuildingOfBuildingNameCn(ci.tbName_Cn);
		ce.CreateBuildingOfBuildingNameEn(ci.tbName_En);
		ce.SelectBuildingTypeToClick();
		ce.CreateBuildingOfFloorDescription(ci.floor);
		ce.CreateBuildingAddressCn(ci.tbAddress_Cn);
		ce.CreateBuildingAddressEn(ci.tbAddress_En);
		ce.SelectAvailableClick();
		ce.CreateBuildingRemark(ci.buildingRemark);
		ce.CreateBuildingSaveClick();
	}

	@Test(description = "Search for the testbuilding of UIBE")
	public void step02_Search(){
		ce.WaitTime();
		Assert.assertEquals(ce.BuildingNameEnWarning(), ci.tbName_En);
	}

	@Test(description = "Modify the testbuilding of UIBE")
	public void step03_Modify(){
		ce.ModifyOfBuildingModifyClick();
		ce.CreateBuildingOfBuildingNameCn(ci.mTbName_Cn);
		ce.CreateBuildingOfBuildingNameEn(ci.mTbName_En);
		ce.CreateBuildingSaveClick();
		ce.WaitTime();
		ce.SearchSelectBuildingOfRegionClick();
		ce.SearchSelectBuildingOfTestCenterClick();
		ce.SearchSelectBuildingOfBuildingAvailableClick();
		ce.BuildingOfSearchClick();
		Assert.assertEquals(ce.BuildingNameEnWarning(), ci.mTbName_En);
	}

	@Test(description = "View the testbuilding's detail of UIBE")
	public void step04_View(){
		ce.ModifyOfBuildingViewClick();
		Assert.assertEquals(ce.ViewOfBuildingDetailsWarning(), ci.mTbName_En);
		ce.ViewOfBuildingDetailsFirstClick();
	}

	@Test(description = "Lend testbuilding from other testcenter")
	public void step05_LendBuilding(){
		ce.ModifyOfBuildingLendBuildingClick();
		ce.SelectLendBuildingOfCZCZUTestCenterClick();
		ce.LendBuildingSaveClick();
	}

	@Test(description = "Create for the testbuilding of UIBE")
	public void step06_Create2Building(){
		ce.WaitTime();
		ce.BuildingOfCreateClick();
		ce.CreateBuildingOfBuildingNameCn(ci.tbName_Cn);
		ce.CreateBuildingOfBuildingNameEn(ci.tbAddress_En);
		ce.SelectBuildingTypeToClick();
		ce.CreateBuildingOfFloorDescription(ci.floor);
		ce.CreateBuildingAddressCn(ci.tbAddress_Cn);
		ce.CreateBuildingAddressEn(ci.tbAddress_En);
		ce.SelectAvailableClick();
		ce.CreateBuildingRemark(ci.buildingRemark);
		ce.CreateBuildingSaveClick();
	}

}
