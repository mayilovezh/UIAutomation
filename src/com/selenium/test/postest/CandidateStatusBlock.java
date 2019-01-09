package com.selenium.test.postest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CandidateStatusBlock{
	PostTestElements pte = new PostTestElements();
	PostTestInput pti = new PostTestInput();
	
	@BeforeClass
	public void setUp(){
		pte.OpenBrower("PostTest", 1);
	}

	@AfterClass
	public void Close() {
		pte.Close();
	}

	@Test
	public void step01_Reset(){
		pte.ResetCandidateStatusBlock();
		Assert.assertEquals(pte.ListOfNotDataWarning(), pte.ListOfNotDataWarning());
	}

	@Test
	public void step02_Search(){
		pte.SearchCandidateStatusBlockTestDateYear();
		pte.GetListOfContent();
		Assert.assertEquals(pte.ListOfDataWarning(), pte.ListOfDataWarning());
	}

	@Test
	public void step03_SaveAll(){
		pte.SelectCandidateStatusBlockTestStatus();
		pte.SelectCandidateStatusBlockScoreStatus();
		pte.SelectCandidateStatusBlockReason();
		pte.CandidateStatusBlockSaveAll();
		pte.WaitTime();
		pte.ModifySaveClick();
		pte.ShortWaitTime();
	}

	@Test
	public void step04_Modify(){
		pte.CandidateStatusBlockModify();
		pte.inputCandidateStatusBlock();
		pte.ModifySaveClick();
		pte.ShortWaitTime();
	}

	@Test
	public void step05_SaveSelected(){
		pte.CandidateStatusBlockSelectedRecord();
		pte.CandidateStatusBlockSaveSelected();
		pte.ModifySaveClick();
		pte.ShortWaitTime();
	}
	
	
	
}
