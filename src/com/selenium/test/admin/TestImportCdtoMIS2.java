package com.selenium.test.admin;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestImportCdtoMIS2 {
	AdminElements ae = new AdminElements();
	AdminInputData ai = new AdminInputData();
	
	@BeforeMethod
	public void setUp(){
		ae.OpenBrower("Admin", 7);
	}

	@AfterMethod
	public void Close() {
		ae.Close();
	}

	@Test(description = "Import Candidate To MIS2")
	public void step01_ImportCandidateToMIS2() throws InterruptedException {
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
		Thread.sleep(5000);

	}

}
