package com.selenium.test.stock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		se.OpenBrower("Stock", 2);
	}

	@AfterClass
	public void Close() {
		se.Close();
	}
	
	@Test(description = "Search Permanent Materials")
	public void step01_Search() {
		
	}

	@Test(description = "Update Permanent Materials")
	public void step02_Update() throws InterruptedException {
		
	}

	@Test(description = "Save Permanent Materials")
	public void step03_Save() throws InterruptedException {
		
	}

	@Test(description = "Save All Permanent Materials")
	public void step04_SaveAll() throws InterruptedException {
		
	}	
	
}
