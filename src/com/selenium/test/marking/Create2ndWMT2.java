package com.selenium.test.marking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class Create2ndWMT2 {

	static WebDriver driver;
	WebDriverAction action;
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void reset() {
		navigate();
		action.selectByValue(By.id(ElementHelper.CREATE2NDWMT2_REGION), "2");
		action.selectByValue(By.id(ElementHelper.CREATE2NDWMT2_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.CREATE2NDWMT2_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.CREATE2NDWMT2_TESTDATE), "10208");
		action.click(By.id(ElementHelper.CREATE2NDWMT2_RESET));
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.CREATE2NDWMT2_REGION), "2");
		action.selectByValue(By.id(ElementHelper.CREATE2NDWMT2_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.CREATE2NDWMT2_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.CREATE2NDWMT2_TESTDATE), "10208");
		action.click(By.id(ElementHelper.CREATE2NDWMT2_SEARCH));
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.MARKING));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.CREATE2NDWMT2));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Create2ndWMT2")
	public void step01_Search() {
		search();
	}
	
	@Test(description = "Reset Create2ndWMT2")
	public void step02_Reset() {
		reset();
	}

}
