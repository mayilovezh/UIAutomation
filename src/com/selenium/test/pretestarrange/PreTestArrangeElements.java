package com.selenium.test.pretestarrange;

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

public class PreTestArrangeElements extends Mis2Brower{

	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Written Apportionment
	public String selectWrittenApportionmentRegionButton = "ddlRegion-Summary";
	
	public String selectWrittenApportionmentExamProductTypeButton = "selectSummaryExamProductTypeSearch";
	
	public String selectWrittenApportionmentExamFormatButton = "selectSummaryExamFormatSearch";
	
	public String selectWrittenApportionmentTestDateYearButton = "ddlYear-Summary";
	
	public String selectWrittenApportionmentTestDateMonthButton = "ddlMonth-Summary";
		
	public String selectWrittenApportionmentTestDateButton = ".//*[@id='ddlTestDate-Summary']//option[@value='"+GetTestDayId()+"']";
	
	public String selectWrittenApportionmentSearchButton = "btnQuery-Summary";
	
	public String writtenApportionmentAddButton = "//input[@value='Add']";
	
	public String writtenApportionmentApportionSelectedCandidatesButton = "btnAppSelect-ArrCdd";
	
	public String writtenApportionmentSaveButton = "btnSave-ArrCdd";
	
	//Written Apportionment
	
	public void WrittenApportionmentSaveClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenApportionmentSaveButton)).click();
	}
	
	public void ApportionSelectedCandidatesClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenApportionmentApportionSelectedCandidatesButton)).click();
	}
	
	public void SelectOneOfCandidate() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName(\"checkbox\").item(0).click()");
	}
	
	public void WrittenApportionmentAddClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(writtenApportionmentAddButton)).click();
	}
	
	
	public void WindowsAlertConfirm() {
		Wait(normalTime);
		driver.switchTo().alert().accept();
	}

	public String GetTemplateNameValue() {
		SqlReader sr = null;
		String WrittenTemplateId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from tblWrittenTemplates where TestCenterId in (select CenterId from tblTestCenter where CenterName like '%对外经济大学%')";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				WrittenTemplateId = rs.getString("WrittenTemplateId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return WrittenTemplateId;
	}
	
	public void SearchSelectWrittenApportionmentClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectWrittenApportionmentSearchButton)).click();
	}
	
	public void SearchSelectWrittenApportionmentTestDateYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentTestDateYearButton)));
		dropList.selectByValue(getCurrentYear());
	}
	
	public void SearchSelectWrittenApportionmentTestDateMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentTestDateMonthButton)));
		dropList.selectByIndex(Integer.parseInt(getCurrentMonth()) - 1);
	}
	
	public void SearchSelectWrittenApportionmentTestDateClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(selectWrittenApportionmentTestDateButton)).click();
	}
	
	public void SearchSelectWrittenApportionmentExamFormatClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentExamFormatButton)));
		dropList.selectByValue("1");
	}
	
	public void SearchSelectWrittenApportionmentExamProductTypeClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentExamProductTypeButton)));
		dropList.selectByValue("1");
	}
	
	public void SearchSelectWrittenApportionmentRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentRegionButton)));
		dropList.selectByValue("2");
	}
	
	public void ModifyFirstButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('button').item(0).click()");
	}
	
	public void WaitTime(){
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}

	public String GetTestDayId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from tblTestDateReal where TestDateId in (select top 1 ID from tblTestDate where DateDiff(mm,TestDate,getdate())=0) and ProductId = 1";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("Id");
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
	
	public String GetFirstValueOfBuilding() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from tblTestCenterBuilding where BuildingNameEn = 'B Seat'";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				centerId = rs.getString("BuildingId");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return centerId;
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
	
}
