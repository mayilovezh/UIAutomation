package com.selenium.test.clericalmarker;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstMarkingAllocation{
	ClericalMarkerElements cme = new ClericalMarkerElements();
	
	@BeforeClass
	public void setUp(){
		cme.OpenBrower("ClericalMarker", 3);
	}

	@AfterClass
	public void Close() {
		cme.Close();
	}

	@Test
	public void step01_Calculate(){
		cme.SearchMarkingAllocation1Region();
		cme.SearchMarkingAllocation1TestDateYear();
		cme.SearchMarkingAllocation1TestDateMonth();
		cme.SearchMarkingAllocation1TestDate();
		cme.Selectall1stMATC();
		cme.SearchMarkingAllocation1();
		cme.ShortWaitTime();
		cme.inputMarkingAllocation1SelectMarker();
		cme.MarkingAllocation1Calculate();
		cme.WaitTime();
		Assert.assertEquals(cme.ListOfMarkerNoWarning(), cme.ListOfMarkerNoWarning());
	}
	
	@Test
	public void step02_SetCapacity(){
		cme.MarkingAllocation1SetCapacity();
		cme.InputMarkingAllocation1NewSetCapacity();
		cme.ModifyFirstClick();
		cme.ShortWaitTime();
	}
	
}
