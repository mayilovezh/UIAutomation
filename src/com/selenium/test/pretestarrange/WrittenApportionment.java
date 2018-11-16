package com.selenium.test.pretestarrange;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class WrittenApportionment {
	PreTestArrangeElements pae = new PreTestArrangeElements();
	PreTestArrangeInputData pai = new PreTestArrangeInputData();
	
	@BeforeClass
	public void setUp(){
		pae.OpenBrower("PreTestArrange", 1);
	}

	@AfterClass
	public void Close() {
		pae.Close();
	}

	@Test
	public void step01_Search(){
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
	public void step02_DeleteCurrentCenterArrangement(){
		pae.WrittenApportionmentAmendChangeClick();
		pae.WrittenApportionmentDeleteCurrentCenterArrangementClick();
		pae.WindowsAlertConfirm();
		pae.ModifyFirstClick();
	}	
	
	@Test
	public void step03_AutoApportionAll(){
		pae.WrittenApportionmentAutoApportionAllClick();
		pae.WrittenApportionmentSaveClick();
		pae.WindowsAlertConfirm();
		pae.ModifyFirstClick();
	}	

	@Test
	public void step04_UnappAll(){
		pae.WrittenApportionmentAmendChangeClick();
		pae.WrittenApportionmentUnappAllClick();
		pae.WindowsAlertConfirm();
	}	

	@Test
	public void step05_DeleteCurrentCenterArrangement(){
		pae.WrittenApportionmentDeleteCurrentCenterArrangementClick();
		pae.WindowsAlertConfirm();
		pae.ModifyFirstClick();
	}	
	
	@Test
	public void step06_RepeatAutoApportionAll(){
		pae.WrittenApportionmentAutoApportionAllClick();
		pae.WrittenApportionmentSaveClick();
		pae.WindowsAlertConfirm();
		pae.ModifyFirstClick();
	}	
}
