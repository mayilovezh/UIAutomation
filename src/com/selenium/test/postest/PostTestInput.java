package com.selenium.test.postest;

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

public class PostTestInput {

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
	
	public void search() {
		navigate();
		action.selectByValue(By.id(ElementHelper.MARKINGINPUT_REGION), "2");
		action.selectByValue(By.id(ElementHelper.MARKINGINPUT_TESTDATE_YEAR), "2018");
		action.selectByIndex(By.id(ElementHelper.MARKINGINPUT_TESTDATE_MONTH), 2);
		action.selectByValue(By.id(ElementHelper.MARKINGINPUT_TESTDATE), "10208");
		action.click(By.id(ElementHelper.MARKINGINPUT_SEARCH));
	}
	
	public void navigate() {
		action.waitElementVisibleToClick(By.id(ElementHelper.MARKING));
		action.waitElementVisibleToClick(By.xpath(ElementHelper.MARKINGINPUT));
		try {
			Thread.sleep(ElementHelper.WAIT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	@Test(description = "Search Marking Input")
	public void step01_Search() {
		search();
	}

	@Test(description = "Add New Examiner Marking Input")
	public void step02_AddNewExaminer() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.MARKINGINPUT_ADDNEWEXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.MARKINGINPUT_EXAMINERINITIAL));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.xpath(ElementHelper.MARKINGINPUT_EXAMINERINITIAL), "AB");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txtfirstMarkingInputExaminer_listbox').getElementsByTagName('li').item(1).click()");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.MARKINGINPUT_ADDNEWEXAMINER_SAVEBUTTON));
	}

	@Test(description = "Save Changes Marking Input")
	public void step02_SaveChanges() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.WAIT_TIME);
		action.click(By.id(ElementHelper.MARKINGINPUT_ADDNEWEXAMINER));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.MARKINGINPUT_EXAMINERINITIAL));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.sendkeys(By.xpath(ElementHelper.MARKINGINPUT_EXAMINERINITIAL), "AB");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txtfirstMarkingInputExaminer_listbox').getElementsByTagName('li').item(1).click()");
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.xpath(ElementHelper.MARKINGINPUT_ADDNEWEXAMINER_SAVEBUTTON));
		Thread.sleep(ElementHelper.SHORT_TIME_B);
		action.click(By.id(ElementHelper.MARKINGINPUT_SAVECHANGES));
	}

	@Test(description = "Clear Marking Input Marking Input")
	public void step02_ClearMarkingInput() throws InterruptedException {
		search();
		Thread.sleep(ElementHelper.LONG_TIME);
		action.click(By.id(ElementHelper.MARKINGINPUT_CLEARMARKINGINPUT));
	}

}
