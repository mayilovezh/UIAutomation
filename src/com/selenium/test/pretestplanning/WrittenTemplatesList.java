package com.selenium.test.pretestplanning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.testcenter.CenterElements;
import com.selenium.test.testcenter.CentertInputData;
import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class WrittenTemplatesList {
	PreTestPlanningElements pe = new PreTestPlanningElements();
	PreTestPlanningInputData pi = new PreTestPlanningInputData();
	
	@BeforeMethod
	public void setUp(){
		pe.OpenBrower("PreTestPlanning", 1);
	}

	@AfterMethod
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
	/*
	@Test
	public void step02_Search(){
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.SearchAddWrittenTemplateClick();
		Assert.assertEquals(pe.listOftestCenterWarning(), pi.listOftestCenterText);
	}

	@Test
	public void step03_DeleteRoomStatus(){
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.SearchAddWrittenTemplateClick();
		pe.ModifyClick();
		pe.DeleteRoomStatus();
		pe.WindowAlertConfirm();
		pe.ModifySaveClick();
	}

	@Test
	public void step04_DeleteRoomTemplates(){
		pe.SelectWrittenTemplatesListRegion();
		pe.SearchTestDateExamProductType();
		pe.SearchAddWrittenTemplateClick();
		pe.DeleteClick();
		pe.WindowAlertConfirm();
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
	*/
}
