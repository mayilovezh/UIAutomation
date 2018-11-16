package com.selenium.test.pretestplanning;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WrittenTemplatesList {
	PreTestPlanningElements pe = new PreTestPlanningElements();
	PreTestPlanningInputData pi = new PreTestPlanningInputData();
	
	@BeforeClass
	public void setUp(){
		pe.OpenBrower("PreTestPlanning", 1);
	}

	@AfterClass
	public void Close() {
		pe.Close();
	}

	@Test
	public void step01_AddTemplates(){
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.AddWrittenTemplatesClick();
		pe.SelectBuildingClick();
		pe.getRoomStatus();
		pe.AddWrittenTemplateSaveClick();
	}

	@Test
	public void step02_Search(){
		pe.WaitTime();
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.SearchAddWrittenTemplateClick();
		Assert.assertEquals(pe.listOftestCenterWarning(), pi.listOftestCenterText);
	}

	@Test
	public void step03_DeleteRoomStatus(){
		pe.ModifyClick();
		pe.DeleteRoomStatus();
		pe.WindowAlertConfirm();
		pe.ModifySaveClick();
	}

	@Test
	public void step04_DeleteRoomTemplates(){
		pe.WaitTime();
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.SearchAddWrittenTemplateClick();
		pe.DeleteClick();
		pe.WindowAlertConfirm();
		pe.ModifyFirstButtonClick();
	}
	
	@Test
	public void step05_RepeatAddTemplates(){
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.AddWrittenTemplatesClick();
		pe.SelectBuildingClick();
		pe.getRoomStatus();
		pe.AddWrittenTemplateSaveClick();
	}

}
