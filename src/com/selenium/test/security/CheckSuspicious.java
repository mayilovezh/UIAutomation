package com.selenium.test.security;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckSuspicious {
	SecurityElements se = new SecurityElements();
	
	@BeforeClass
	public void setUp(){
		se.OpenBrower("Security", 1);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}
		
	@Test
	public void step01_Search(){
		se.SearchCheckSuspiciousRegion();
		se.SearchCheckSuspiciousProductType();
		se.SearchCheckSuspiciousExamFormat();
		se.SearchCheckSuspiciousTestCenter();
		se.SearchCheckSuspicious();
		se.WaitTime();2
		se.WaitShotTime();
		Assert.assertEquals(se.ListOfCheckSuspiciousWarning(), se.ListOfCheckSuspiciousWarning());
	}

	@Test
	public void step02_Reset(){
		se.SearchCheckSuspiciousRegion();
		se.SearchCheckSuspiciousProductType();
		se.SearchCheckSuspiciousExamFormat();
		se.SearchCheckSuspiciousTestCenter();
		se.ResetCheckSuspicious();
		Assert.assertEquals(se.ListOfCheckSuspiciousWarning(), se.ListOfCheckSuspiciousWarning());
	}

	@Test
	public void step03_View(){
		se.ViewCheckSuspicious();
		se.WaitShotTime();
		Assert.assertEquals(se.ViewCheckSuspiciousWarning(), se.ViewCheckSuspiciousWarning());
		se.ModifySaveClick();
	}

	@Test
	public void step04_Add(){
		se.AddCheckSuspicious();
		se.SelectCheckSuspiciousAddSecurityLevel();
		se.SelectCheckSuspiciousAddSuspiciousReason();
		se.InputCheckSuspiciousAddRemark();
		se.ModifySaveClick();
		se.WaitShotTime();
	}
	
	
}
