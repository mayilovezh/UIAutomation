package com.selenium.test.admin;

import org.testng.annotations.Test;

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

	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	public String importCandidateRegionButton ="ImportCandidateToMIS2listRegion";
	
	public String importCandidateExamProductTypeButton ="ImportCandidateToMIS2listRegion";
	
	public String importCandidateExamFormat = "selectImportCandidateToMIS2ExamFormatSearch";
	
	public String importCandidateTestDateYear = "ImportCandidateToMIS2-Select-Year-Search";
	
	public String importCandidateTestDateMonth = "ImportCandidateToMIS2-Select-Month-Search";
	
	public String importCandidateTestDate = ".//select[@id='ImportCandidateToMIS2Datetime']//option[@value='"+GetTestDayId()+"']";
	
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
		WaitElementVisible(driver, By.id(importCandidateButton)).click();
	}
	
	public void SearchImportCandidateTestCenterClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateTestCenter)));
		dropList.selectByValue(GetValueOfCenterId());
	}
	
	public void SearchImportCandidateTestDateClick() {
		WaitElementVisible(driver, By.xpath(importCandidateTestDate)).click();
	}
	
	public void SearchImportCandidateTestDateMonthClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateTestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(getCurrentMonth()) - 1);
	}
	
	public void SearchImportCandidateTestDateYearClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateTestDateYear)));
		dropList.selectByValue(getCurrentYear());
	}
	
	public void SearchImportCandidateExamFormatClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateExamProductTypeButton)));
		dropList.selectByValue("2");
	}
	
	public void SearchImportCandidateExamProductTypeClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateExamProductTypeButton)));
		dropList.selectByValue("2");
	}
	
	public void SearchImportCandidateRegionClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(importCandidateRegionButton)));
		dropList.selectByValue("2");
	}
	
	public String GetValueOfCenterId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from tblTestCenter where CenterName = '对外经济大学'";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("CenterId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String GetTestDate() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = "select top 1* from tblTestDate where DateDiff(mm,TestDate,getdate())=0";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("TestDate");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
	}
	
	public String getCurrentYear() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.YEAR,0);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getCurrentMonth() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.MONTH, 0);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("MM");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String GetTestDayId() {
		SqlReader sr = null;
		String testDayId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from tblTestDateReal where TestDateId in (select top 1 ID from tblTestDate where DateDiff(mm,TestDate,getdate())=0) and ProductId = 1";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				testDayId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return testDayId;
	}
}
