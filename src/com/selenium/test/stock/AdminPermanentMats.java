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

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class AdminPermanentMats {
	StockElements se = new StockElements();
	StockInputData si = new StockInputData();
	
	@BeforeClass
	public void setUp(){
		se.OpenBrower("Stock", 3);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}

	@Test(description = "Update Permanent Materials")
	public void step01_Update(){
		se.SearchPermanentMatsRegionClick();
		se.PermanentMatsUpdateClick();
		se.SelectUpdatePermanentMatsStorageTypeClick();
		se.InputUpdatePermanentMatsTotalPackage();
		se.InputUpdatePermanentMatsTotalNumber();
		se.InputUpdatePermanentMatsRemark();
		se.ModifyPackageSave();
		se.WaitTime();
	}

	@Test(description = "View Permanent Materials")
	public void step02_View(){
		se.SearchPermanentMatsRegionClick();
		se.PermanentMatsRemarkViewClick();
		Assert.assertEquals(se.PermanentMatsViewStorageTypeWarning(), si.PermanentMaterials_ViewStorageType);
		se.ModifyPackageSave();
		se.WaitTime();
	}

	@Test(description = "Save One Record Of Permanent Materials")
	public void step03_SaveOneRecord(){
		se.SearchPermanentMatsRegionClick();
		se.InputPermanentMatsOneOfStorageLocation();
		se.InputPermanentMatsOneOfRemark();
		se.PermanentMatsSaveClick();
		se.WaitTime();
	}	

	@Test(description = "Save All Permanent Materials")
	public void step04_SaveAll(){
		se.SearchPermanentMatsRegionClick();
		se.inputAllStorageLocation();
		se.inputAllRemark();
		se.PermanentMatsSaveAllClick();
	}	

}
