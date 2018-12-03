package com.selenium.test.stock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.testcenter.CenterElements;
import com.selenium.test.testcenter.CentertInputData;
import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class AdminTestLiveMats {
	StockElements se = new StockElements();
	StockInputData si = new StockInputData();
	DynamicVariables dv = new DynamicVariables();
	
	@BeforeClass
	public void setUp(){
		se.OpenBrower("Stock", 2);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}

	@Test(description = "Search Live Test Materials")
	public void step01_Search(){
		se.SearchLiveTestMaterialsRegionClick();
		se.SearchLiveTestMaterialsYearClick();
		se.SearchLiveTestMaterialsMonthClick();
		se.SearchLiveTestMaterialsTestDateClick();
		se.SearchImportCandidateStockTypeClick();
		se.SearchImportCandidateSearchClick();
		Assert.assertEquals(se.LISTOFCATEGORYNAMEWarning(), dv.GetLiveMaterialsCategoryName());
	}
	
	@Test(description = "Update Live Test Materials")
	public void step02_Update(){
		se.LiveTestMaterialsUpdateClick();
		se.SelectLiveTestMaterialsUpdateStorageTypeClick();
		se.InputLiveTestMaterialsTotalPackage();
		se.InputLiveTestMaterialsTotalNumber();
		se.InputLiveTestMaterialsRemark();
		se.InputLiveTestMaterialsExpireDay();
		se.ModifyFirstClick();
	}
	
	@Test(description = "Save Live Test Materials")
	public void step03_Save(){
		se.WaitTime();
		se.inputAllStorageLocation();
		se.inputAllRemark();
		se.LiveTestMaterialsSaveClick();
	}

}
