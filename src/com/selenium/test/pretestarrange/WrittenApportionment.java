package com.selenium.test.pretestarrange;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.pretestplanning.PreTestPlanningElements;
import com.selenium.test.pretestplanning.PreTestPlanningInputData;

public class WrittenApportionment {
	PreTestArrangeElements pae = new PreTestArrangeElements();
	PreTestArrangeInputData pai = new PreTestArrangeInputData();
	
	@BeforeMethod
	public void setUp(){
		pae.OpenBrower("PreTestArrange", 1);
	}

	@AfterMethod
	public void Close() {
		pae.Close();
	}

	@Test
	public void step01_AutoApportionAll(){
		pae.SearchSelectWrittenApportionmentRegionClick();
		pae.SearchSelectWrittenApportionmentExamProductTypeClick();
		pae.SearchSelectWrittenApportionmentExamFormatClick();
		pae.SearchSelectWrittenApportionmentTestDateYearClick();
		pae.SearchSelectWrittenApportionmentTestDateMonthClick();
		pae.SearchSelectWrittenApportionmentTestDateClick();
		pae.SearchSelectWrittenApportionmentClick();
		Assert.assertEquals(pae.ListOfWrittenApportionmentTestCenterWarning(), pai.listOftestCenterText);
	}	
	
	@Test
	public void step02_AutoApportionAll(){
		pae.SearchSelectWrittenApportionmentRegionClick();
		pae.SearchSelectWrittenApportionmentExamProductTypeClick();
		pae.SearchSelectWrittenApportionmentExamFormatClick();
		pae.SearchSelectWrittenApportionmentTestDateYearClick();
		pae.SearchSelectWrittenApportionmentTestDateMonthClick();
		pae.SearchSelectWrittenApportionmentTestDateClick();
		pae.SearchSelectWrittenApportionmentClick();
		pae.WrittenApportionmentAddClick();
		pae.WrittenApportionmentAutoApportionAllClick();
		pae.WrittenApportionmentSaveClick();
		pae.WindowsAlertConfirm();
		pae.ModifyFirstButtonClick();
	}	

	@Test
	public void step03_UnappAll(){
		pae.SearchSelectWrittenApportionmentRegionClick();
		pae.SearchSelectWrittenApportionmentExamProductTypeClick();
		pae.SearchSelectWrittenApportionmentExamFormatClick();
		pae.SearchSelectWrittenApportionmentTestDateYearClick();
		pae.SearchSelectWrittenApportionmentTestDateMonthClick();
		pae.SearchSelectWrittenApportionmentTestDateClick();
		pae.SearchSelectWrittenApportionmentClick();
		pae.WrittenApportionmentAmendChangeClick();
		pae.WrittenApportionmentUnappAllClick();
		pae.WindowsAlertConfirm();
	}	

	@Test
	public void step04_DeleteCurrentCenterArrangement(){
		pae.SearchSelectWrittenApportionmentRegionClick();
		pae.SearchSelectWrittenApportionmentExamProductTypeClick();
		pae.SearchSelectWrittenApportionmentExamFormatClick();
		pae.SearchSelectWrittenApportionmentTestDateYearClick();
		pae.SearchSelectWrittenApportionmentTestDateMonthClick();
		pae.SearchSelectWrittenApportionmentTestDateClick();
		pae.SearchSelectWrittenApportionmentClick();
		pae.WrittenApportionmentAmendChangeClick();
		pae.WrittenApportionmentDeleteCurrentCenterArrangementClick();
		pae.WindowsAlertConfirm();
		pae.ModifyFirstButtonClick();
	}	
}
