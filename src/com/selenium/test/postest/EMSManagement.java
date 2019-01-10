package com.selenium.test.postest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EMSManagement{
	PostTestElements pte = new PostTestElements();
	PostTestInput pti = new PostTestInput();
	
	@BeforeClass
	public void setUp(){
		pte.OpenBrower("PostTest", 2);
	}

	@AfterClass
	public void Close() {
		pte.Close();
	}

	@Test
	public void step01_Reset(){
		pte.ResetEMSManagement();
		Assert.assertEquals(pte.ListOfEMSNotDataWarning(), pte.ListOfEMSNotDataWarning());
	}

	@Test
	public void step02_Search(){
		pte.EMSManagementTestDateYear();
		pte.InitSelectTRFReturnCompleted();
		pte.GetEMSListOfContent();
		Assert.assertEquals(pte.ListOfEMSDataWarning(), pte.ListOfEMSDataWarning());
	}

	@Test
	public void step03_View(){
		pte.ListOfEMSManagementDetails();
		Assert.assertEquals(pte.ViewOfFamilyNameWarning(), pte.ViewOfFamilyNameWarning());
		pte.ModifySaveClick();
		pte.ShortWaitTime();
	}

	@Test
	public void step04_Modify(){
		pte.ListOfEMSManagementModify();
		pte.inputEMSManagementEMSNO();
		pte.ModifySaveClick();
		pte.ShortWaitTime();
	}
	
	
	
}
