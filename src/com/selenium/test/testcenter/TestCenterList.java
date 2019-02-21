package com.selenium.test.testcenter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestCenterList {
	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 1);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Search")
	public void step02_Search() {
		ce.SearchSelectCenterRegionClick();
		
	}


}
