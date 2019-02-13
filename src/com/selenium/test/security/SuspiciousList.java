package com.selenium.test.security;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuspiciousList {
	SecurityElements se = new SecurityElements();
	
	@BeforeClass
	public void setUp(){
		se.OpenBrower("Security", 2);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}

	@Test
	public void step01_Reset(){
		se.ResetSuspiciousList();
		Assert.assertEquals(se.ResetListOfSuspiciousListWarning(), se.ResetListOfSuspiciousListWarning());
	}

	@Test
	public void step02_Search(){
		se.SearchSuspiciousList();
		se.WaitTime();
		Assert.assertEquals(se.ListOfSuspiciousListWarning(), se.ListOfSuspiciousListWarning());
	}
	
	@Test
	public void step03_View(){
		se.WaitTime();
		se.ViewSuspiciousList();
		Assert.assertEquals(se.SuspiciousListViewWarning(), se.SuspiciousListViewWarning());
		se.ModifySaveClick();
		se.WaitShotTime();
	}

	@Test
	public void step04_UpdateView(){
		se.WaitTime();
		se.InitSuspiciousListSelect();
		se.SelectSuspiciousListUpdateView();
	}

}
