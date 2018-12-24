package com.selenium.test.generalquery;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.test.utils.DynamicVariables;

public class KeyDates {
	GeneralQueryElements gqe = new GeneralQueryElements();
	GeneralQueryInputData gqi = new GeneralQueryInputData();
	DynamicVariables dv = new DynamicVariables();
	
	@BeforeClass
	public void setUp(){
		gqe.OpenBrower("GeneralQuery", 5);
	}

	@AfterClass
	public void Close(){
		gqe.Close();
	}

	@Test
	public void step01_Search(){
		gqe.SearchProductKeyDates();
		gqe.SearchExamsFormatKeyDates();
		gqe.SearchYearKeyDates();
		gqe.SearchStartMonthKeyDates();
		gqe.SearchEndMonthKeyDates();
		gqe.SearchKeyDatesClick();
		Assert.assertEquals(gqe.ListOfKeyDatesWarning(), gqe.ListOfKeyDatesWarning());
	}

	@Test
	public void step02_EditKeydates(){
		gqe.EditKeyDatesClick();
		gqe.inputEditKeyDates();
		gqe.ModifyFirstClick();
	}

	@Test
	public void step03_ShowOnViewPages(){
		gqe.ViewPageKeyDates();
	}
}
