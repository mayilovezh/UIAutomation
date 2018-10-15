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

public class Create2ndSpkActivityLog {

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
		action.selectByValue(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_REGION), "2");
		action.selectByValue(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_TESTDATE), "10208");
		action.click(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_RESET));
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_REGION), "2");
		action.selectByValue(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_TESTDATE), "10208");
		action.click(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_SEARCH));
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.MARKING));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Create2ndSpkActivityLog")
	public void step01_Search() {
		search();
	}
	
	@Test(description = "Search Create2ndSpkActivityLog")
	public void step02_Reset() {
		reset();
	}

	@Test(description = "Add New Examiner Create2ndSpkActivityLog")
	public void step03_AddNewExaminer() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_ADDNEWEXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG_EXAMINERINITIAL));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG_EXAMINERINITIAL), "AB");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txt2ndSpkInputExaminer_listbox').getElementsByTagName('li').item(1).click()");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG_ADDNEWEXAMINER_SAVEBUTTON));
	}

	@Test(description = "Batch Save Create2ndSpkActivityLog")
	public void step04_BatchSave() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_ADDNEWEXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG_EXAMINERINITIAL));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG_EXAMINERINITIAL), "AB");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txt2ndSpkInputExaminer_listbox').getElementsByTagName('li').item(1).click()");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CREATE2NDSPKACTIVITYLOG_ADDNEWEXAMINER_SAVEBUTTON));
		Thread.sleep(ElementHelper.SHORT_TIME_B);		
		action.click(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_BATCHSAVE));
	}
	
	@Test(description = "Clear Create2ndSpkActivityLog")
	public void step05_Clear() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME_B);		
		action.click(By.id(ElementHelper.CREATE2NDSPKACTIVITYLOG_CLEAR));
	}

}
