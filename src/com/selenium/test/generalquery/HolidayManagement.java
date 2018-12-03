package com.selenium.test.generalquery;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.test.utils.DynamicVariables;

public class HolidayManagement {
	GeneralQueryElements gqe = new GeneralQueryElements();
	GeneralQueryInputData gqi = new GeneralQueryInputData();
	DynamicVariables dv = new DynamicVariables();
	
	@BeforeClass
	public void setUp(){
		gqe.OpenBrower("GeneralQuery", 4);
	}

	@AfterClass
	public void Close() {
		gqe.Close();
	}

	@Test
	public void step01_CreateHoliday(){
		gqe.HolidayManagementCreateClick();
		gqe.InputHolidayManagementCreateDate("10/20/" + dv.getCurrentYear());
		gqe.InputHolidayManagementCreateName(gqi.HolidayName);
		gqe.ModifyFirstClick();
		gqe.WaitTime();
		gqe.WaitTime();
	}

	@Test
	public void step02_SearchHoliday(){
		gqe.SearchYearOfHolidayManagement();
		gqe.SearchHolidayNameOfHolidayManagement(gqi.HolidayName);
		gqe.HolidayManagementSearchClick();
		Assert.assertEquals(gqe.HolidayManagementNameWarning(), gqi.HolidayName);
		gqe.WaitTime();
		gqe.WaitTime();
	}

	@Test
	public void step03_ModifyHoliday(){
		gqe.ModifyHolidayManagement();
		gqe.InputHolidayManagementCreateDate("10/24/" + dv.getCurrentYear());
		gqe.ModifyFirstClick();
		gqe.WaitTime();
		gqe.WaitTime();
	}

	@Test
	public void step04_Log(){
		gqe.LogHolidayManagement();
		Assert.assertEquals(gqe.HolidayManagementLogDetailWarning(), gqi.HolidayLogName);
		gqe.ModifyFirstClick();
		gqe.WaitTime();
		gqe.WaitTime();
	}

	@Test
	public void step05_Delete(){
		gqe.DeleteHolidayManagement();
		gqe.ModifyFirstClick();
		gqe.WaitTime();
		gqe.WaitTime();
	}


}
