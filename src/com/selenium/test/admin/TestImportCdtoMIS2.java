package com.selenium.test.admin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestImportCdtoMIS2 {
	AdminElements ae = new AdminElements();
	AdminInputData ai = new AdminInputData();
	
	@BeforeClass
	public void setUp(){
		ae.OpenBrower("Admin", 7);
	}

	@AfterClass
	public void Close() {
		ae.Close();
	}

	@Test(description = "Import Candidate To MIS2")
	public void step01_ImportCandidateToMIS2(){
		ae.SearchImportCandidateRegionClick();
		ae.SearchImportCandidateExamProductTypeClick();
		ae.SearchImportCandidateExamFormatClick();
		ae.SearchImportCandidateTestDateYearClick();
		ae.SearchImportCandidateTestDateMonthClick();
		ae.SearchImportCandidateTestDateClick();
		ae.SearchImportCandidateTestCenterClick();
		ae.importCandidateClick();
		ae.importChooseClick(ai.uploadCandidateFile);
		ae.importUploadClick();
		ae.importSaveClick();
	}

}
