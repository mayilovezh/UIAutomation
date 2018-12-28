package com.selenium.test.clericalmarker;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondMarkingAllocation{
	ClericalMarkerElements cme = new ClericalMarkerElements();
	
	@BeforeClass
	public void setUp(){
		cme.OpenBrower("ClericalMarker", 5);
	}

	@AfterClass
	public void Close() {
		cme.Close();
	}

	@Test
	public void step01_Calculate(){
		cme.SearchMarkingAllocation2Region();
		cme.SearchMarkingAllocation2TestDateYear();
		cme.SearchMarkingAllocation2TestDateMonth();
		cme.SearchMarkingAllocation2TestDate();
		cme.SearchMarkingAllocation2();
		cme.ShortWaitTime();
		cme.Selectall2ndMATC();
		cme.MarkingAllocation2Calculate();
		cme.ShortWaitTime();
		Assert.assertEquals(cme.ListOf2ndMarkerNoWarning(), cme.ListOf2ndMarkerNoWarning());
	}

	@Test
	public void step02_SetCapacity(){	
		cme.MarkingAllocation2SetCapacity();
		cme.inputMarkingAllocation2SelectMarker();
		cme.ModifyFirstClick();

	}	
	
}
