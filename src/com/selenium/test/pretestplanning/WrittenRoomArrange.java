package com.selenium.test.pretestplanning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WrittenRoomArrange {
	PreTestPlanningElements pe = new PreTestPlanningElements();
	PreTestPlanningInputData pi = new PreTestPlanningInputData();
	
	@BeforeClass
	public void setUp(){
		pe.OpenBrower("PreTestPlanning", 2);
	}

	@AfterClass
	public void Close() {
		pe.Close();
	}

	@Test
	public void step01_AmendWrittenAutoArrange() throws InterruptedException{
		pe.SearchSelectWrittenRoomArrangeRegionClick();
		pe.SearchSelectWrittenRoomArrangeExamProductTypeClick();
		pe.SearchSelectWrittenRoomArrangeExamFormatClick();
		pe.SearchSelectWrittenRoomArrangeTestDateYearClick();
		pe.SearchSelectWrittenRoomArrangeTestDateMonthClick();
		pe.SearchSelectWrittenRoomArrangeTestDateClick();
		pe.SearchSelectWrittenRoomArrangeClick();
		pe.AddwrittentestroomarrangementClick();
		pe.SelectAddWrittenRoomTempName();
		pe.AddWrittenTestRoomArrangementSearchClick();
		pe.AddWrittenTestRoomArrangementAutoArrangeClick();
		pe.GetWARoomStatus();
		pe.AddWrittenTestRoomArrangementSaveUploadClick();
		pe.ModifyFirstClick();
	}

	@Test
	public void step02_AmendWrittenListOfDelete(){
		pe.AddwrittentestroomarrangementClick();
		pe.SelectAddWrittenRoomTempName();
		pe.AddWrittenTestRoomArrangementListOfDeleteClick();
		pe.WindowsAlertConfirm();
		pe.AddWrittenTestRoomArrangementSaveUploadClick();
		pe.ModifyFirstClick();
	}

	@Test
	public void step03_AmendWrittenAddExtraRoom() throws InterruptedException{
		pe.AddwrittentestroomarrangementClick();
		pe.SelectAddWrittenRoomTempName();
		pe.AddWrittenTestRoomArrangementListOfAddExtraClick();
		pe.AddWrittenTestRoomArrangementListOfAddBuildingClick();
		pe.ModifySecondClick();
		pe.AddWrittenTestRoomArrangementSaveUploadClick();
		pe.ModifyFirstClick();
	}

	@Test
	public void step04_AmendWrittenDelete(){
		pe.AddwrittentestroomarrangementClick();
		pe.GetWARoomStatus();
		pe.AddWrittenTestRoomArrangementDeleteClick();
		pe.WindowsAlertConfirm();
		pe.ModifyFirstClick();
	}
	
	@Test
	public void step05_AmendWrittenRepeatAutoArrange(){
		pe.AddwrittentestroomarrangementClick();
		pe.SelectAddWrittenRoomTempName();
		pe.AddWrittenTestRoomArrangementSearchClick();
		pe.AddWrittenTestRoomArrangementAutoArrangeClick();
		pe.GetWARoomStatus();
		pe.AddWrittenTestRoomArrangementSaveUploadClick();
		pe.ModifyFirstClick();
	}

}
