package com.selenium.test.postest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class FESEComparison {
	static WebDriver driver;
	WebDriverAction action;
	String r_score = "13";
	String s_LR_score = "2";
	ExcelReader reader = new ExcelReader(".\\resource\\posttest\\2018-01-06 FE&SE of 1st Marking.xlsx");

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().login(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() {
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.POST_TEST));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FE_SE_COMPARISON));
			Thread.sleep(ElementHelper.WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(ElementHelper.FE_SE_REGION))));
			action.selectByValue(By.id(ElementHelper.FE_SE_REGION), ElementHelper.REGION_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FE_SE_YEAR),ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.FE_SE_MONTH), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.FE_SE_DATE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FE_SE_TC), ElementHelper.TC_BFSU);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check FE&SE of 1st Marking and 2nd Marking for 'East' region")
	public void step01_FirstAndSecondMarkingCheck() {
		try {
			boolean isTextPrest;
			WebDriverWait wait = new WebDriverWait(driver,10);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.POST_TEST));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.FE_SE_COMPARISON));
			Thread.sleep(ElementHelper.WAIT_TIME);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(ElementHelper.FE_SE_REGION))));
			action.selectByValue(By.id(ElementHelper.FE_SE_REGION), "2");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FE_SE_YEAR),ElementHelper.YEAR_VALUE);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.FE_SE_MONTH), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByIndex(By.id(ElementHelper.FE_SE_DATE), 1);
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.selectByValue(By.id(ElementHelper.FE_SE_TC), "100084");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.FE_SE_1STMARKING));
			Thread.sleep(ElementHelper.SHORT_TIME);
			isTextPrest = driver.findElement(By.id(ElementHelper.FE_SE_DIALOG_MESSAGE)).getText().contains("FE and SE data is the same.");
			Assert.assertTrue(isTextPrest);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check FE&SE of 1st Marking for 'BFSU'")
	public void step02_FirstMarkingCheck() {
		navigate();
		action.click(By.id(ElementHelper.FE_SE_1STMARKING));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_R1)),
					reader.getCellValue("Sheet1", 1, 7));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_R2)),
					reader.getCellValue("Sheet1", 2, 7));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_TR1)),
					reader.getCellValue("Sheet1", 3, 12));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_CC1)),
					reader.getCellValue("Sheet1", 3, 13));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_LR1)),
					reader.getCellValue("Sheet1", 3, 14));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_GRA1)),
					reader.getCellValue("Sheet1", 3, 15));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_TR2)),
					reader.getCellValue("Sheet1", 4, 12));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_CC2)),
					reader.getCellValue("Sheet1", 4, 13));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_LR2)),
					reader.getCellValue("Sheet1", 4, 14));
			Assert.assertEquals(action.getText(By.xpath(ElementHelper.FE_SE_SEARCH_FIRSTMARKING_GRA2)),
					reader.getCellValue("Sheet1", 4, 15));
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check FE&SE of 2nd Marking for 'BFSU'")
	public void step02_SecondMarkingCheck() {
		try {
			navigate();
			boolean isTextPrest;
			action.click(By.id(ElementHelper.FE_SE_2NDMARKING));
			Thread.sleep(ElementHelper.SHORT_TIME);
			isTextPrest = driver.findElement(By.id(ElementHelper.FE_SE_DIALOG_MESSAGE)).getText().contains("FE and SE data is the same.");
			Assert.assertTrue(isTextPrest);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Export FE&SE of 1st Marking for 'BFSU'")
	public void step03_Export() {
		try {
			navigate();
			action.click(By.id(ElementHelper.FE_SE_1STMARKING));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.click(By.id(ElementHelper.FE_SE_EXPORT));
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
