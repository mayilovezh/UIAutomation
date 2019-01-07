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

public class DoubleMarking_Old {

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
	
	public void search1() {
		navigate();
		action.selectByValue(By.id(ElementHelper.DOUBLEMARKING_REGION), "2");
		action.selectByValue(By.id(ElementHelper.DOUBLEMARKING_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.DOUBLEMARKING_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.DOUBLEMARKING_TESTDATE), "10208");
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.DOUBLEMARKING_REGION), "2");
		action.selectByValue(By.id(ElementHelper.DOUBLEMARKING_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.DOUBLEMARKING_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.DOUBLEMARKING_TESTDATE), "10208");
		action.click(By.name(ElementHelper.DOUBLEMARKING_SELECTONECENTER));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.DOUBLEMARKING_SEARCH));
			Thread.sleep(ElementHelper.LONG_TIME);
			String availableExaminer = action.getText(By.id(ElementHelper.DOUBLEMARKING_AVAILABLEEXAMINER));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.sendkeys(By.id(ElementHelper.DOUBLEMARKING_INPUTSELECTEXAMINER),availableExaminer);
			Thread.sleep(ElementHelper.SHORT_TIME);
			action.click(By.id(ElementHelper.DOUBLEMARKING_CALCULATEBUTTON));
			Thread.sleep(ElementHelper.LONG_TIME);
			String examinerNo = action.getText(By.xpath(ElementHelper.DOUBLEMARKING_LISTOFEXAMINERNO));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.assertText(By.xpath(ElementHelper.DOUBLEMARKING_LISTOFEXAMINERNO), examinerNo);
			Thread.sleep(ElementHelper.SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.MARKING));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.DOUBLEMARKING));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Double Marking")
	public void step01_Search() {
		search();
	}

	@Test(description = "Auto Allocation Double Marking")
	public void step02_AutoAllocation() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.DOUBLEMARKING_AUTOALLOCATION));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}

	@Test(description = "Clear Allocation Double Marking")
	public void step03_ClearAllocation() throws InterruptedException {
		search1();
		action.click(By.id(ElementHelper.DOUBLEMARKING_CLEARALLOCATION));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}

	@Test(description = "Set Capacity Double Marking")
	public void step04_SetCapacity() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.DOUBLEMARKING_SETCAPACITY));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys((By.id(ElementHelper.DOUBLEMARKING_NEWCAPACITYNUMBER)), "10");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}

	@Test(description = "Manual Allocation Check Double Marking")
	public void step04_ManualAllocationCheck() throws InterruptedException {
		search();;
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click((By.xpath(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_EXAMINER)));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click((By.xpath(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_EXAMINERLIST)));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.clear(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_SPEAKINGCANDIDATE));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_SPEAKINGCANDIDATE), "Speaking Candidate");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.clear(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_WRITTENTASK1));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_WRITTENTASK1), "Written Task1 Candidate");
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.clear(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_WRITTENTASK2));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.sendkeys(By.id(ElementHelper.DOUBLEMARKING_MANUALALLOCATIONCHECK_WRITTENTASK2), "Written Task2 Candidate");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}
}
