package com.selenium.test.postest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.ExcelReader;
import com.selenium.test.utils.WebDriverAction;

public class ScoreCheck {
	static WebDriver driver;
	WebDriverAction action;
	ExcelReader reader = new ExcelReader(".\\resource\\posttest\\ScoreCheck.xlsx");

	@BeforeMethod
	public void setUp() throws Exception {
		driver = new DriverInstance().loginEast(driver);
		action = new WebDriverAction(driver);
	}

	@AfterMethod
	public void close() {
		new DriverInstance().teardown(driver);
	}

	public void navigate() {
		try {
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.POST_TEST));
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.xpath(ElementHelper.SCORE_CHECK));
			Thread.sleep(ElementHelper.WAIT_TIME);
			action.selectByValue(By.id(ElementHelper.SCORE_CHECK_YEAR), "2018");
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByIndex(By.id(ElementHelper.SCORE_CHECK_MONTH), 0);
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SCORE_CHECK_DATE), "10334");
			Thread.sleep(ElementHelper.SHORT_TIME_B);
			action.selectByValue(By.id(ElementHelper.SCORE_CHECK_TC), "100084");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Check candidate scores of firstmarking")
	public void step01_Scorecheckfirstmarking() {
		try {
			navigate();
			action.selectByValue(By.id(ElementHelper.SCORE_CHECK_TYPE), "192");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_CHECK_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			try {
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SEARCH_CADD_NO)),
						reader.getCellValue("Sheet1", 1, 0));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SEARCH_NAME)),
						reader.getCellValue("Sheet1", 1, 6));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SERACH_R)),
						reader.getCellValue("Sheet1", 1, 10));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SERACH_W)),
						reader.getCellValue("Sheet1", 1, 11));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SERACH_S)),
						reader.getCellValue("Sheet1", 1, 12));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	@Test(description = "Check candidate scores of firstrelease")
	public void step02_Scorecheckfirstrelease() {
		try {
			navigate();
			action.selectByValue(By.id(ElementHelper.SCORE_CHECK_TYPE), "195");
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.SCORE_CHECK_SEARCH));
			Thread.sleep(ElementHelper.WAIT_TIME);
			try {
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SEARCH_CADD_NO)),
						reader.getCellValue("Sheet1", 1, 0));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SEARCH_NAME)),
						reader.getCellValue("Sheet1", 1, 6));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SERACH_R)),
						reader.getCellValue("Sheet1", 1, 10));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SERACH_W)),
						reader.getCellValue("Sheet1", 1, 11));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
				Assert.assertEquals(action.getText(By.xpath(ElementHelper.SCORE_CHECK_SERACH_S)),
						reader.getCellValue("Sheet1", 1, 12));
				Thread.sleep(ElementHelper.SHORT_TIME_A);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
