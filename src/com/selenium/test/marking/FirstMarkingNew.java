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

public class FirstMarkingNew {

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
		action.selectByValue(By.id(ElementHelper.FIRSTMARKINGNEW_REGION), "2");
		action.selectByValue(By.id(ElementHelper.FIRSTMARKINGNEW_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.FIRSTMARKINGNEW_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.FIRSTMARKINGNEW_TESTDATE), "10208");
	}
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.FIRSTMARKINGNEW_REGION), "2");
		action.selectByValue(By.id(ElementHelper.FIRSTMARKINGNEW_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.FIRSTMARKINGNEW_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.FIRSTMARKINGNEW_TESTDATE), "10208");
		action.click(By.name(ElementHelper.FIRSTMARKINGNEW_SELECTONECENTER));
		try {
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			action.click(By.id(ElementHelper.FIRSTMARKINGNEW_SEARCH));
			Thread.sleep(ElementHelper.SHORT_TIME_A);
			String totalRegistration = action.getText(By.id(ElementHelper.FIRSTMARKINGNEW_TOTALREGISTRATION));
			action.assertText(By.id(ElementHelper.FIRSTMARKINGNEW_TOTALREGISTRATION), totalRegistration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.MARKING));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.FIRSTMARKINGNEW));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search First Marking New")
	public void step01_Search() {
		search();
	}

	@Test(description = "Calculate First Marking New")
	public void step02_Calculate() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.name(ElementHelper.FIRSTMARKINGNEW_EXAMINER));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_EXAMINERSEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		String ss = action.getText(By.id(ElementHelper.FIRSTMARKINGNEW_AVAILABLEEXAMINERNO));
		action.sendkeys(By.id(ElementHelper.FIRSTMARKINGNEW_INPUTSELECTEXAMINER), ss);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_CALCULATEBUTTON));
		Thread.sleep(ElementHelper.WAIT_TIME);
	}

	@Test(description = "Auto Allocation First Marking New")
	public void step03_AutoAllocation() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.name(ElementHelper.FIRSTMARKINGNEW_EXAMINER));
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_EXAMINERSEARCH));
		Thread.sleep(ElementHelper.WAIT_TIME);
		String ss = action.getText(By.id(ElementHelper.FIRSTMARKINGNEW_AVAILABLEEXAMINERNO));
		action.sendkeys(By.id(ElementHelper.FIRSTMARKINGNEW_INPUTSELECTEXAMINER), ss);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_CALCULATEBUTTON));
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_AUTOALLOCATION));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}

	@Test(description = "Clear Allocation By Test Center First Marking New")
	public void step04_ClearAllocationByTestCenter() throws InterruptedException {
		search1();
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_CLEARALLOCATIONBYTESTCENTER));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		action.click(By.xpath(ElementHelper.FIRSTMARKINGNEW_CATESTCENTER));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
		Thread.sleep(ElementHelper.WAIT_TIME);
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(1).getElementsByTagName('Button').item(0).click()");
	}

	@Test(description = "Auto allocation ignore speaking TC First Marking New")
	public void step05_AutoallocationignorespeakingTC() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_AUTOALLOCATIONIGNORESPEAKINGTC));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}
	
	@Test(description = "Clear Allocation First Marking New")
	public void step06_ClearAllocation() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.FIRSTMARKINGNEW_CLEARALLOCATION));
		Thread.sleep(ElementHelper.SHORT_TIME_A);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('Button').item(0).click()");
	}
	
}
