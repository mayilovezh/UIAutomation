package com.selenium.test.testcenter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpkRoomAvailability {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 7);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Reset Spk Room Availability")
	public void step01_Reset(){
		ce.SearchRegionSpkRoomAvailability();
		ce.SearchProductSpkRoomAvailability();
		ce.SearchFormatSpkRoomAvailability();
		ce.SearchTestDateStartSpkRoomAvailability();
		ce.SearchTestDateEndSpkRoomAvailability();
		ce.ResetSpkRoomAvailability();
		Assert.assertEquals(ce.ResetListOfTestCenterSpkRoomAvailabilityWarning(), ci.noDataWarning);
	}

	@Test(description = "Search Spk Room Availability")
	public void step02_Search(){
		ce.SearchRegionSpkRoomAvailability();
		ce.SearchProductSpkRoomAvailability();
		ce.SearchFormatSpkRoomAvailability();
		ce.SearchTestDateStartSpkRoomAvailability();
		ce.SearchTestDateEndSpkRoomAvailability();
		ce.SearchSpkRoomAvailability();
		Assert.assertEquals(ce.SpkRoomAvailabilityListOfTestCenterWarning(), ce.SpkRoomAvailabilityListOfTestCenterWarning());
	}

	@Test(description = "View Spk Room Availability")
	public void step03_View(){
		ce.ViewSpkRoomAvailability();
		Assert.assertEquals(ce.ListOfTCWarning(), ce.ListOfTCWarning());
		ce.ModifyFirstClick();
	}

	@Test(description = "Delete Spk Room Availability")
	public void step04_Delete() throws InterruptedException{
		ce.DeleteSpkRoomAvailability();
		ce.ModifyFirstClick();
		ce.ShortWaitTime();
		ce.ModifyFirstClick();
		ce.ShortWaitTime();
	}
}
