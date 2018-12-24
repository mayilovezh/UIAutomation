package com.selenium.test.clericalmarker;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClericalMarkerProfile{
	ClericalMarkerElements cme = new ClericalMarkerElements();
	ClericalMarkerInputData cmi = new ClericalMarkerInputData();
	
	@BeforeClass
	public void setUp(){
		cme.OpenBrower("ClericalMarker", 1);
	}

	@AfterClass
	public void Close() {
		cme.Close();
	}

	@Test
	public void step01_Create(){
		
	}
		
}
