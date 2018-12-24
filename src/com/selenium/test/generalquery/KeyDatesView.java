package com.selenium.test.generalquery;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.test.utils.DynamicVariables;

public class KeyDatesView {
	GeneralQueryElements gqe = new GeneralQueryElements();
	GeneralQueryInputData gqi = new GeneralQueryInputData();
	DynamicVariables dv = new DynamicVariables();
	
	@BeforeClass
	public void setUp(){
		gqe.OpenBrower("GeneralQuery", 6);
	}

	@AfterClass
	public void Close(){
		gqe.Close();
	}

	@Test
	public void step01_Search(){
		gqe.SearchProductKeyDatesView();
		gqe.SearchExamsFormatKeyDatesView();
		gqe.SearchYearKeyDatesView();
		gqe.SearchStartMonthKeyDatesView();
		gqe.SearchEndMonthKeyDatesView();
		gqe.SearchKeyDatesViewClick();
		Assert.assertEquals(gqe.ListOfKeyDatesViewsWarning(), gqe.ListOfKeyDatesViewsWarning());
	}
}
