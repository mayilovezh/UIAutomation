package com.selenium.test.stock;

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

public class StockElements extends Mis2Brower{

	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
    //Admin Test Live Mats
    public String LIVE_MATERIALS_REGION = "ddlRegion-testmaterials";
    public String LIVE_MATERIALS_TESTDATE_YEAR = "testmaterials-Select-Year-Search";
    public String LIVE_MATERIALS_TESTDATE_MONTH = "testmaterials-Select-Month-Search";
    public String LIVE_MATERIALS_TESTDATE = ".//*[@id='ddlTestDate-testmaterials']//option[@value='"+GetTestDate()+"']";
    public String LIVE_MATERIALS_STOCKTYPE = "ddlStockType-testmaterials";
    public String LIVE_MATERIALS_SEARCH = "btnQuery-testmaterials";
    public String LIVE_MATERIALS_LISTOFCATEGORYNAME = ".//*[@id='spreadsheet-TestMaterials-table']/tbody/tr[1]/td[2]";
    public String LIVE_MATERIALS_UPDATEBUTTON = ".//*[@id='spreadsheet-TestMaterials-table']/tbody/tr[1]/td[11]/input";
    public String LIVE_MATERIALS_UPDATE_STORAGETYPE = "ddlstoragetype-testmaterials";
    public String LIVE_MATERIALS_UPDATE_TOTALPACKAGES = "txtpackage-testmaterials";
    public String LIVE_MATERIALS_UPDATE_TOTALNUMBER = "txttotal-testmaterials";
    public String LIVE_MATERIALS_UPDATE_EXPIREDAY = "txtexpire-testmaterials";
    public String LIVE_MATERIALS_UPDATE_REMARK = "txtremark-testmaterials";
    public String LIVE_MATERIALS_SAVEBUTTON= "btnSave-testmaterials";
	
    
    
    //Admin Permanent Mats
    public String PERMANENTMATERIALS_REGION = "ddlRegion-Permanent";
    public String PERMANENTMATERIALS_UPDATEBUTTON = ".//*[@id='tr21']/td[9]/input";
    public String PERMANENTMATERIALS_UPDATE_STORAGETYPE = "ddlstoragetype-Permanent";
    public String PERMANENTMATERIALS_UPDATE_TESTDATEYEAR = "Permanent-Select-Year";
    public String PERMANENTMATERIALS_UPDATE_TESTDATEMONTH = "Permanent-Select-Month";
    public String PERMANENTMATERIALS_UPDATE_TESTDATE = "ddlTestDate-Permanent";
    public String PERMANENTMATERIALS_UPDATE_TestCENTER = "ddlPermanent-testcenter";
    public String PERMANENTMATERIALS_UPDATE_TOTALPACKAGES = "txtpackage-Permanent";
    public String PERMANENTMATERIALS_UPDATE_TOTALNUMBER = "txttotal-Permanent";
    public String PERMANENTMATERIALS_UPDATE_REMARK = "txtremark-Permanent";
    public String PERMANENTMATERIALS_UPDATE_SAVEBUTTON= "btnSave-Permanent";
    public String PERMANENTMATERIALS_STORAGELOCATION = "StorageLocation21";
    public String PERMANENTMATERIALS_REMARK= "Remark21";
    public String PERMANENTMATERIALS_CHECKALL= "SelectAll-Permanent";
    public String PERMANENTMATERIALS_SAVESELECT= "btnSaveSelect-Permanent";
    
    //Test Day Allocation
    public String TESTDAYALLOCATION_REGION = "selectStockWrittenArrangementRegion";
    public String TESTDAYALLOCATION_TESTDATEYEAR = "StockWrittenArrangement-Select-Year-Search";
    public String TESTDAYALLOCATION_TESTDATEMONTH = "StockWrittenArrangement-Select-Month-Search";
    public String TESTDAYALLOCATION_TESTDATE = "selectStockWrittenArrangementTestDate";
    public String TESTDAYALLOCATION_TestCENTER = "selectStockWrittenArrangementTestCenter";
    public String TESTDAYALLOCATION_SEARCH = "btnStockArrangementSearch";
    public String TESTDAYALLOCATION_AUTOARRAGECURRENTCENTRE = "btnStockAutoArrange";
    public String TESTDAYALLOCATION_CLEARARRANGEOFCURRENTCENTRE = "btnStockArrangeClearWrittenArrange";
    public String TESTDAYALLOCATION_SAVE = "btnStockArrangeSave";  
    public String TESTDAYALLOCATION_MESSAGEYES = "html/body/div[11]/div[3]/div/button";
	
    //Admin Test Live Mats
	public void WaitTime(){
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void LiveTestMaterialsSaveClick() {
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_SAVEBUTTON)).click();
	}
    
	public void LiveTestMaterialsUpdateClick() {
		WaitElementVisible(driver, By.xpath(LIVE_MATERIALS_UPDATEBUTTON)).click();
	}
	
	public void SelectLiveTestMaterialsUpdateStorageTypeClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_STORAGETYPE)));
		dropList.selectByValue(GetUpdateStockType());
	}
	
	public void InputLiveTestMaterialsTotalPackage() {
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_TOTALPACKAGES )).clear();
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_TOTALPACKAGES )).sendKeys("100");
	}
	
	public void InputLiveTestMaterialsTotalNumber() {
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_TOTALNUMBER )).clear();
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_TOTALNUMBER )).sendKeys("100");
	}
	
	public void InputLiveTestMaterialsRemark() {
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_REMARK )).clear();
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_REMARK )).sendKeys("RemarkRemarkRemarkRemarkRemarkRemarkRemarkRemark");
	}
	
	public void InputLiveTestMaterialsExpireDay() {
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_EXPIREDAY)).clear();
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_UPDATE_EXPIREDAY)).sendKeys("10");
	}
	
	public void ModifyFirstClick() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var divLength = document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').length\r\n" + 
				"document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').item(divLength - 1).getElementsByClassName('ui-dialog-buttonpane ui-widget-content ui-helper-clearfix').item(0).getElementsByTagName('div').item(0).getElementsByTagName('button').item(0).click()\r\n" + 
				"");
	}
    
	public String LISTOFCATEGORYNAMEWarning() {
		return WaitElementVisible(driver, By.xpath(LIVE_MATERIALS_LISTOFCATEGORYNAME)).getText();
	}
    
	public void inputAllStorageLocation() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputAllStorageLocation(){\r\n" + 
				"  var StorageLocationLength = document.getElementsByName('StorageLocation').length\r\n" + 
				"  for(var i =0; i<StorageLocationLength; i++){\r\n" + 
				"   document.getElementsByName('StorageLocation').item(i).value = '12313'\r\n" + 
				"  }\r\n" + 
				"};return inputAllStorageLocation()");
	}
	
	public void inputAllRemark() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputAllRemark(){\r\n" + 
				"  var RemarkLength = document.getElementsByName('Remark').length\r\n" + 
				"  for(var i =0; i<RemarkLength; i++){\r\n" + 
				"   document.getElementsByName('Remark').item(i).value = '33333'\r\n" + 
				"  }\r\n" + 
				"};return inputAllRemark()");
	}

	public void SearchLiveTestMaterialsRegionClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(LIVE_MATERIALS_REGION)));
		dropList.selectByValue("2");
	}
	
	public void SearchLiveTestMaterialsYearClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(LIVE_MATERIALS_TESTDATE_YEAR)));
		dropList.selectByValue(getCurrentYear());
	}
	
	public void SearchLiveTestMaterialsMonthClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(LIVE_MATERIALS_TESTDATE_MONTH)));
		dropList.selectByIndex(Integer.parseInt(getCurrentMonth()) - 1);
	}
	
	public void SearchLiveTestMaterialsTestDateClick() {
		WaitElementVisible(driver, By.xpath(LIVE_MATERIALS_TESTDATE)).click();
	}

	public void SearchImportCandidateStockTypeClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(LIVE_MATERIALS_STOCKTYPE)));
		dropList.selectByValue(GetSearchStockType());
	}
	
	public void SearchImportCandidateSearchClick() {
		WaitElementVisible(driver, By.id(LIVE_MATERIALS_SEARCH)).click();
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
				centerId = rs.getString("ID");
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

	public String GetSearchStockType() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = "select top 1 * from TB_Dictionary where [Values] = 'Paper Test Materials (L/R/W)'";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
	
	public String GetUpdateStockType() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = "select top 1 * from TB_Dictionary where [Values] = 'Wasted'";
			ResultSet rs = sr.getResultSet(sql);
			while(rs.next()) {
				StockTypeId = rs.getString("Id");
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			sr.getCloseConnection();
		}
		return StockTypeId;
	}
}
