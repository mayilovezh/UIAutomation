package com.selenium.test.pretestplanning;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResourcePlanning {
	PreTestPlanningElements pe = new PreTestPlanningElements();
	PreTestPlanningInputData pi = new PreTestPlanningInputData();
	
	@BeforeClass
	public void setUp(){
		pe.OpenBrower("PreTestPlanning", 3);
	}

	@AfterClass
	public void Close() {
		pe.Close();
	}
	
	@Test
	public void step01_Search(){
		pe.ResourcePlanningSearchRegion();
		pe.ResourcePlanningSearchYear();
		pe.ResourcePlanningSearchMonth();
		pe.ResourcePlanningSearchTestDate();
		pe.ResourcePlanningSearchClick();
		Assert.assertEquals(pe.ResourcePlanningListOfTotal(), pe.ResourcePlanningListOfTotal());
		pe.ShortWaitTime();
	
	}
	
	@Test
	public void step02_SelectSlots() throws InterruptedException{
		pe.ClickTestDay();
		pe.inputAllSlot();
		pe.ResourcePlanningSaveUpload();
	}

}
