package com.selenium.test.eorindia;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class IndiaUnProcessingList {
	static WebDriver driver;
	WebDriverAction action;
	String tc = "KOCHI";
	String testdate = "2018-01-06";
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}
	
	public void navigate() throws Exception {
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.id(ElementHelper.EOR_INDIA));
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.xpath(ElementHelper.EOR_INDIA_UNPROCESSING_LIST));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step01_ImportApplication() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_IMPORT));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		upload("\\resource\\eor-india\\India_EOR_Import_revised_TestDate.xlsx");
		Thread.sleep(ElementHelper.SHORT_TIME);
		action.click(By.cssSelector(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_UPLOAD));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}
	
	@Test
	public void step02_ImportCheck() throws Exception {
		navigate();
		action.selectByValue(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_REGION), ElementHelper.REGION_VALUE);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_YEAR), 1);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByIndex(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_MONTH), 0);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.selectByValue(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_DATE), "10197");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_SEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_CHECK_TEST_CENTER)), tc);
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		Assert.assertEquals(action.getText(By.xpath(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_CHECK_TEST_DATE)), testdate);
		Thread.sleep(ElementHelper.SHORT_TIME_B);
	}
	
	@Test
	public void step03_ExportForm() throws Exception {
		navigate();
		action.click(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_EXPORT));
		Thread.sleep(ElementHelper.SHORT_TIME);
	}
	
	public void upload(String filePath) {
		String path = System.getProperty("user.dir") + filePath;
		File file = new File(path);
		if(file.exists()) {
			driver.findElement(By.id(ElementHelper.EOR_INDIA_UNPROCESSING_LIST_CHOOSEFILE)).sendKeys(file.getPath());
		}
	}
}
