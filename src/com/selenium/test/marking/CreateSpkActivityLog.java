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

public class CreateSpkActivityLog {

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
		action.selectByValue(By.id(ElementHelper.CREATESPKACTIVITYLOG_REGION), "2");
		action.selectByValue(By.id(ElementHelper.CREATESPKACTIVITYLOG_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.CREATESPKACTIVITYLOG_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.CREATESPKACTIVITYLOG_TESTDATE), "10208");
		action.click(By.id(ElementHelper.CREATESPKACTIVITYLOG_RESET));
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.CREATESPKACTIVITYLOG_REGION), "2");
		action.selectByValue(By.id(ElementHelper.CREATESPKACTIVITYLOG_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.CREATESPKACTIVITYLOG_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.CREATESPKACTIVITYLOG_TESTDATE), "10208");
		action.click(By.id(ElementHelper.CREATESPKACTIVITYLOG_SEARCH));
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.MARKING));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.CREATESPKACTIVITYLOG));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search CreateSpkActivityLog")
	public void step01_Search() {
		search();
	}
	
	@Test(description = "Search CreateSpkActivityLog")
	public void step02_Reset() {
		reset();
	}

	@Test(description = "Add New Examiner CreateSpkActivityLog")
	public void step03_AddNewExaminer() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.CREATESPKACTIVITYLOG_ADDNEWEXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CREATESPKACTIVITYLOG_EXAMINERINITIAL));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.xpath(ElementHelper.CREATESPKACTIVITYLOG_EXAMINERINITIAL), "AB");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txtSpkInputExaminer_listbox').getElementsByTagName('li').item(1).click()");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.CREATESPKACTIVITYLOG_ADDNEWEXAMINER_SAVEBUTTON));
	}

}
