package com.selenium.test.admin;

import org.testng.annotations.Test;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.SqlReader;
import com.selenium.test.brower.Mis2Brower;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminElements extends Mis2Brower{

	DynamicVariables dv = new DynamicVariables();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	public String importCandidateRegionButton ="ImportCandidateToMIS2listRegion";
	
	public String importCandidateExamProductTypeButton ="ImportCandidateToMIS2listRegion";
	
	public String importCandidateExamFormat = "selectImportCandidateToMIS2ExamFormatSearch";
	
	public String importCandidateTestDateYear = "ImportCandidateToMIS2-Select-Year-Search";
	
	public String importCandidateTestDateMonth = "ImportCandidateToMIS2-Select-Month-Search";
	
	public String importCandidateTestDate = ".//select[@id='ImportCandidateToMIS2Datetime']//option[@value='"+dv.GetTestDayId()+"']";
	
	public String importCandidateTestCenter = "ImportCandidateToMIS2listCenterId";
	
	public String importCandidateButton = "btnImportCandidateToMIS2Import";
	
	public String importChooseButton = ".//*[@id='ImportCandidateToMIS2ImportWindow']/div/div/div/input";
	
	public String uploadButton = ".//*[@id='ImportCandidateToMIS2ImportWindow']/div/button[2]";
	
	public void importSaveClick() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('k-dialog-buttons').item(0).getElementsByTagName('div').item(0).getElementsByTagName('button').item(0).click()");
	}
	
	public void importUploadClick() {
		Wait(normalTime);
		driver.findElement(By.xpath(uploadButton)).click();
	}
	
	public void importChooseClick(String elements){
		Wait(normalTime);
		try {
			File file = new File(elements);
			driver.findElement(By.id("ImportCandidateToMIS2Import")).sendKeys(file.getCanonicalPath());
		}catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
	
	public void importCandidateClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(importCandidateButton)).click();
	}
	
	public void SearchImportCandidateTestCenterClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateTestCenter)));
		dropList.selectByValue(dv.GetValueOfCenterId());
	}
	
	public void SearchImportCandidateTestDateClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(importCandidateTestDate)).click();
	}
	
	public void SearchImportCandidateTestDateMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateTestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	}
	
	public void SearchImportCandidateTestDateYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateTestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SearchImportCandidateExamFormatClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateExamProductTypeButton)));
		dropList.selectByValue("2");
	}
	
	public void SearchImportCandidateExamProductTypeClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateExamProductTypeButton)));
		dropList.selectByValue("2");
	}
	
	public void SearchImportCandidateRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateRegionButton)));
		dropList.selectByValue("2");
	}
	
}
