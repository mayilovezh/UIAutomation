package com.selenium.test.clericalmarker;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClericalMarkerTask{
	ClericalMarkerElements cme = new ClericalMarkerElements();
	
	@BeforeClass
	public void setUp(){
		cme.OpenBrower("ClericalMarker", 2);
	}

	@AfterClass
	public void Close() {
		cme.Close();
	}

	@Test
	public void step01_Create1stMarkingTask(){
		cme.CreateCMTask1();
		cme.CreateCMTask1SelectTestDateYear();
		cme.CreateCMTask1SelectTestDateMonth();
		cme.CreateCMTask1SelectTestDate();
		cme.CreateCMTask1OpenIntervalStart();
		cme.CreateCMTask1OpenIntervalEnd();
		cme.CreateCMTask1ChooseDay();
		cme.CreateCMTask1ChooseVenue();
		cme.CreateCMTask1DescriptionForCM();
		cme.CreateCMTask1RemarkForStaff();
		cme.ModifyFirstClick();
		cme.WaitTime();
	}

	@Test
	public void step02_Search1stMarkingTask(){
		cme.SearchCMTaskSelectRegion();
		cme.SearchCMTaskSelectTestDateYear();
		cme.SearchCMTaskSelectTestDateMonth();
		cme.SearchCMTaskSelectTestDate();
		cme.SearchCMTask1SelectTaskType();
		cme.SearchCMTask();
		Assert.assertEquals(cme.ListOfCMTask(), cme.ListOfCMTask());
	}

	@Test
	public void step03_Modify1stMarkingTask(){
		cme.ModifyCMTask();
		cme.ModifyCMTask1ChooseVenue();
		cme.ModifyFirstClick();
		cme.ShortWaitTime();
	}

	@Test
	public void step04_View1stMarkingTask(){
		cme.ViewCMTask();
		Assert.assertEquals(cme.ResultOfViewCMTaskText(), cme.ResultOfViewCMTaskText());
		cme.ModifyFirstClick();
		cme.ShortWaitTime();
	}
	
	@Test
	public void step05_Create2ndMarkingTask(){
		cme.CreateCMTask2();
		cme.CreateCMTask2SelectTestDateYear();
		cme.CreateCMTask2SelectTestDateMonth();
		cme.CreateCMTask2SelectTestDate();
		cme.CreateCMTask1OpenIntervalStart();
		cme.CreateCMTask1OpenIntervalEnd();
		cme.CreateCMTask1ChooseDay();
		cme.CreateCMTask1ChooseVenue();
		cme.CreateCMTask1DescriptionForCM();
		cme.CreateCMTask1RemarkForStaff();
		cme.ModifyFirstClick();
		cme.WaitTime();
	}

	@Test
	public void step06_Search2ndMarkingTask(){
		cme.SearchCMTaskSelectRegion();
		cme.SearchCMTaskSelectTestDateYear();
		cme.SearchCMTaskSelectTestDateMonth();
		cme.SearchCMTaskSelectTestDate();
		cme.SearchCMTask2SelectTaskType();
		cme.SearchCMTask();
		Assert.assertEquals(cme.ListOfCMTask(), cme.ListOfCMTask());
	}

	
	
	
	
	
	
}
