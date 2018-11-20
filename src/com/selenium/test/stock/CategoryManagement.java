package com.selenium.test.stock;

import java.util.List;

import org.openqa.selenium.By;
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

public class CategoryManagement {
	StockElements se = new StockElements();
	StockInputData si = new StockInputData();
	
	@BeforeClass
	public void setUp(){
		se.OpenBrower("Stock", 1);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}

	@Test(description = "Modify All of Category Management")
	public void step01_Modify(){
		se.SearchCategoryManagementStockTypeClick();
		se.CategoryManagementSearchClick();
		for(int i = 0; i<se.ModifyAllPackageNumberLength();) {
			se.ModifyClick(i);
			se.ModifyPackageNumber();
			se.ModifyPackageSave();
			se.WaitTime();
			i = i + 2;
		}
	}
	
}
