package com.selenium.test.pretestplanning;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WrittenRoomArrange {
	PreTestPlanningElements pe = new PreTestPlanningElements();
	PreTestPlanningInputData pi = new PreTestPlanningInputData();
	
	@BeforeMethod
	public void setUp(){
		pe.OpenBrower("PreTestPlanning", 2);
	}

	@AfterMethod
	public void Close() {
		pe.Close();
	}

	@Test
	public void step01_AmendWrittenAutoArrange(){
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
		pe.ModifyFirstButtonClick();
		pe.ModifySecondFirstButtonClick();
	}

	@Test
	public void step02_AmendWrittenDelete(){
		pe.SearchSelectWrittenRoomArrangeRegionClick();
		pe.SearchSelectWrittenRoomArrangeExamProductTypeClick();
		pe.SearchSelectWrittenRoomArrangeExamFormatClick();
		pe.SearchSelectWrittenRoomArrangeTestDateYearClick();
		pe.SearchSelectWrittenRoomArrangeTestDateMonthClick();
		pe.SearchSelectWrittenRoomArrangeTestDateClick();
		pe.SearchSelectWrittenRoomArrangeClick();
		pe.AddwrittentestroomarrangementClick();
		pe.SelectAddWrittenRoomTempName();
		pe.AddWrittenTestRoomArrangementListOfDeleteClick();
		pe.WindowsAlertConfirm();
		pe.AddWrittenTestRoomArrangementSaveUploadClick();
		pe.ModifyFirstButtonClick();
		pe.ModifySecondFirstButtonClick();
	}

	@Test
	public void step03_AmendWrittenAddExtraRoom(){
		pe.SearchSelectWrittenRoomArrangeRegionClick();
		pe.SearchSelectWrittenRoomArrangeExamProductTypeClick();
		pe.SearchSelectWrittenRoomArrangeExamFormatClick();
		pe.SearchSelectWrittenRoomArrangeTestDateYearClick();
		pe.SearchSelectWrittenRoomArrangeTestDateMonthClick();
		pe.SearchSelectWrittenRoomArrangeTestDateClick();
		pe.SearchSelectWrittenRoomArrangeClick();
		pe.AddwrittentestroomarrangementClick();
		pe.SelectAddWrittenRoomTempName();
		pe.AddWrittenTestRoomArrangementListOfAddExtraClick();
		pe.AddWrittenTestRoomArrangementListOfAddBuildingClick();
		pe.ModifyFirstButtonClick();
		pe.AddWrittenTestRoomArrangementSaveUploadClick();
		pe.ModifySecondFirstButtonClick();
		pe.ModifyFirstButtonClick();
	}

	@Test
	public void step04_AmendWrittenDelete(){
		pe.SearchSelectWrittenRoomArrangeRegionClick();
		pe.SearchSelectWrittenRoomArrangeExamProductTypeClick();
		pe.SearchSelectWrittenRoomArrangeExamFormatClick();
		pe.SearchSelectWrittenRoomArrangeTestDateYearClick();
		pe.SearchSelectWrittenRoomArrangeTestDateMonthClick();
		pe.SearchSelectWrittenRoomArrangeTestDateClick();
		pe.SearchSelectWrittenRoomArrangeClick();
		pe.AddwrittentestroomarrangementClick();
		pe.GetWARoomStatus();
		pe.AddWrittenTestRoomArrangementDeleteClick();
		pe.WindowsAlertConfirm();
		pe.ModifyFirstButtonClick();
	}
	
	@Test
	public void step05_AmendWrittenRepeatAutoArrange(){
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
		pe.ModifyFirstButtonClick();
		pe.ModifySecondFirstButtonClick();
	}
	
}
