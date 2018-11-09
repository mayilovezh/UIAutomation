package com.selenium.test.pretestarrange;

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
	public void step01_AddCandidatesAllocationOneCandidate() throws InterruptedException{
		pae.SearchSelectWrittenApportionmentRegionClick();
		pae.SearchSelectWrittenApportionmentExamProductTypeClick();
		pae.SearchSelectWrittenApportionmentExamFormatClick();
		pae.SearchSelectWrittenApportionmentTestDateYearClick();
		pae.SearchSelectWrittenApportionmentTestDateMonthClick();
		pae.SearchSelectWrittenApportionmentTestDateClick();
		pae.SearchSelectWrittenApportionmentClick();
		pae.WrittenApportionmentAddClick();
		pae.SelectOneOfCandidate();
		pae.ApportionSelectedCandidatesClick();
		pae.WrittenApportionmentSaveClick();
		pae.ModifyFirstButtonClick();
		Thread.sleep(5000);
	}
	
}
