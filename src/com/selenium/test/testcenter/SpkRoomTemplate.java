package com.selenium.test.testcenter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpkRoomTemplate {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 6);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Add Speaking Room Template")
	public void step01_AddSpeakingRoomTemplate(){
		ce.SpkTemplateRegion();
		ce.SpkTemplateTestCenter();
		ce.SpkTemplateAddSpeakingRoomTemplate();
		ce.SpkTemplateSelectBuilding();
		ce.SpkTemplateAddTemplateSearch();
		ce.SpkTemplateSelectBuildingTestDay();
		ce.SpkTemplateAddTemplateSave();
		ce.WaitTime();
		ce.WaitTime();
	}

	@Test(description = "Search Speaking Room Template")
	public void step02_Search(){
		ce.SpkTemplateRegion();
		ce.SpkTemplateTestCenter();
		ce.SpkTemplateSearch();
		Assert.assertEquals(ce.ListOfSpkTemplateTestCenterWarning(), ce.ListOfSpkTemplateTestCenterWarning());
	}

	@Test(description = "Modify Speaking Room Template")
	public void step03_Modify(){
		ce.SpkTemplateModify();
		ce.SpkTemplateModifyTemplateName(ci.modifyTemplateName);
		ce.SpkTemplateModifyTemplateSave();
		ce.WaitTime();
		ce.WaitTime();
	}

	@Test(description = "View Speaking Room Template")
	public void step04_View(){
		ce.SpkTemplateView();
		ce.WaitTime();
		Assert.assertEquals(ce.ViewTemplateNameOfSpkTemplateWarning(), ce.ViewTemplateNameOfSpkTemplateWarning());
		ce.SpkTemplateGoToTemplateList();
		ce.WaitTime();
	}
	
	@Test(description = "Delete Speaking Room Template")
	public void step05_Delete(){
		ce.SpkTemplateDelete();
		ce.ModifyFirstClick();
		ce.ModifyFirstClick();
		ce.WaitTime();
	}

	@Test(description = "Repeat Add Speaking Room Template")
	public void step06_RepeatAddSpeakingRoomTemplate(){
		ce.SpkTemplateRegion();
		ce.SpkTemplateTestCenter();
		ce.SpkTemplateAddSpeakingRoomTemplate();
		ce.SpkTemplateSelectBuilding();
		ce.SpkTemplateAddTemplateSearch();
		ce.WaitTime();
		ce.SpkTemplateSelectBuildingTestDay();
		ce.SpkTemplateAddTemplateSave();
		ce.WaitTime();
	}

}
