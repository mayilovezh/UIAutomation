package com.selenium.test.pretestarrange;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SpkArrangement {
	PreTestArrangeElements pae = new PreTestArrangeElements();
	PreTestArrangeInputData pai = new PreTestArrangeInputData();
	
	@BeforeClass
	public void setUp(){
		pae.OpenBrower("PreTestArrange", 2);
	}

	@AfterClass
	public void Close() {
		pae.Close();
	}

	@Test
	public void step01_Search(){
		pae.SearchSpkArrangementRegionClick();
		pae.SearchSpkArrangementProductTypeClick();
		pae.SearchSpkArrangementExamFormatClick();
		pae.SearchSpkArrangementTestDateYearClick();
		pae.SearchSpkArrangementTestDateMonthClick();
		pae.SearchSpkArrangementTestDateClick();
		pae.SearchSpkArrangementClick();
		Assert.assertEquals(pae.SpkArrangementSearchTcWarning(), pae.SpkArrangementSearchTcWarning());
	}	

	@Test
	public void step02_AmendChangeOfSave(){
		pae.SpkArrangementAmendChange();
		pae.WaitTime();
		pae.SpkArrangementAmendChangeOfSave();
		pae.WaitTime();
	}	

	@Test
	public void step03_AmendChangeOfBack(){
		pae.SpkArrangementAmendChange();
		pae.WaitTime();
		pae.SpkArrangementAmendChangeOfBack();
	}	

	@Test
	public void step04_ArrangeTimeSlotOfSaveTheAboveSetting(){
		pae.SpkArrangementTimeSlotOfAdd();
		pae.WaitTime();
		pae.SpkArrangementTimeSlotOfAddSaveTheAboveSetting();
		pae.ModifyFirstButtonClick();
	}	
	
	@Test
	public void step05_ArrangeTimeSlotOfBack(){
		pae.WaitTime();
		pae.SpkArrangementTimeSlotOfAddBack();
	}	

	@Test
	public void step06_CandidatesApportionmentOfAutoArrangeSpeakingTest(){
		pae.WaitTime();
		pae.SpkArrangementCandidatesApportionmentOfAdd();
		pae.SpkArrangementCandidatesApportionmentOfAutoArrangeSpeakingTest();
		pae.WaitTime();
	}	
	
}
