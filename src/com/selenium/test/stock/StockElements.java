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
    //Category Management
	public String CategoryManagementSearchStockType = "selectStockCategoryTypeSearch";
	
	public String CategoryManagementSearchButton = "btnQueryStockCategory";
	
	
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
    public String PERMANENTMATERIALS_UPDATEBUTTON = "//div[@id='spreadsheet-WrittenArrangement-table_wrapper']/table/tbody/tr[1]/td[9]/input[1]";
    public String PERMANENTMATERIALS_VIEWBUTTON = "//div[@id='spreadsheet-WrittenArrangement-table_wrapper']/table/tbody/tr[1]/td[10]/input[1]";
    public String PERMANENTMATERIALS_VIEWSTORAGETYPEText = ".//*[@id='ShowDetail-table-Permanent']/tbody/tr[1]/td[2]";
    public String PERMANENTMATERIALS_UPDATE_STORAGETYPE = "ddlstoragetype-Permanent";
    public String PERMANENTMATERIALS_UPDATE_TOTALPACKAGES = "txtpackage-Permanent";
    public String PERMANENTMATERIALS_UPDATE_TOTALNUMBER = "txttotal-Permanent";
    public String PERMANENTMATERIALS_UPDATE_REMARK = "txtremark-Permanent";
    public String PERMANENTMATERIALS_UPDATE_SAVEBUTTON= "btnSave-Permanent";
    public String PERMANENTMATERIALS_STORAGELOCATION = "StorageLocation21";
    public String PERMANENTMATERIALS_REMARK= "Remark21";
    public String PERMANENTMATERIALS_CHECKALL= "SelectAll-Permanent";
    public String PERMANENTMATERIALS_SAVESALLELECT= "btnSaveSelect-Permanent";
    
    //Test Day Allocation
    public String TESTDAYALLOCATION_REGION = "selectStockWrittenArrangementRegion";
    public String TESTDAYALLOCATION_TESTDATEYEAR = "StockWrittenArrangement-Select-Year-Search";
    public String TESTDAYALLOCATION_TESTDATEMONTH = "StockWrittenArrangement-Select-Month-Search";
    public String TESTDAYALLOCATION_TESTDATE = ".//select[@id='selectStockWrittenArrangementTestDate']//option[@value='"+GetTestDate()+"']";
    public String TESTDAYALLOCATION_TestCENTER = "selectStockWrittenArrangementTestCenter";
    public String TESTDAYALLOCATION_SEARCH = "btnStockArrangementSearch";
    public String TESTDAYALLOCATION_AUTOARRAGECURRENTCENTRE = "btnStockAutoArrange";
    public String TESTDAYALLOCATION_CLEARARRANGEOFCURRENTCENTRE = "btnStockArrangeClearWrittenArrange";
    public String TESTDAYALLOCATION_SAVE = "btnStockArrangeSave";  
    public String TESTDAYALLOCATION_MESSAGEYES = "html/body/div[11]/div[3]/div/button";
    
    //Test Day Allocation
    public void WindowAlertConfirm() {
    	Wait(normalTime);
    	driver.switchTo().alert().accept();
    }
    
	public void TestDayAllocationSaveClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(TESTDAYALLOCATION_SAVE)).click();
	}
	
	public void TestDayAllocationAutoArrangeForCurrentCentre() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(TESTDAYALLOCATION_AUTOARRAGECURRENTCENTRE)).click();
	}
	
	public void TestDayAllocationClearArrangeOfCurrentCentre() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(TESTDAYALLOCATION_CLEARARRANGEOFCURRENTCENTRE)).click();
	}
    
	public void SelectTestDayAllocationRegion() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(TESTDAYALLOCATION_REGION)));
		dropList.selectByValue("2");
	}
	
	public void SelectTestDayAllocationTestDateYear() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(TESTDAYALLOCATION_TESTDATEYEAR)));
		dropList.selectByValue(getCurrentYear());
	}
	
	public void SelectTestDayAllocationTestDateMonth() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(TESTDAYALLOCATION_TESTDATEMONTH)));
		dropList.selectByIndex(Integer.parseInt(getCurrentMonth()) - 1);
	}
	
	public void SelectTestDayAllocationTestDate() {
		WaitElementVisible(driver, By.xpath(TESTDAYALLOCATION_TESTDATE)).click();
	}
	
	public void SelectTestDayAllocationTestCenter() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(TESTDAYALLOCATION_TestCENTER)));
		dropList.selectByValue(GetValueOfCenterId());
	}
	public void TestDayAllocationSearchClick() {
		WaitElementVisible(driver, By.id(TESTDAYALLOCATION_SEARCH)).click();
	}
   
    
    //Admin Permanent Mats
	public void PermanentMatsSaveAllClick() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_SAVESALLELECT)).click();
	}
    
	public void PermanentMatsSaveClick() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_SAVEBUTTON)).click();
	}
    
	public void InputPermanentMatsOneOfStorageLocation() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_STORAGELOCATION)).clear();
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_STORAGELOCATION)).sendKeys("20");
	}
    
	public void InputPermanentMatsOneOfRemark() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_REMARK)).clear();
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_REMARK)).sendKeys("20");
	}
    
	public String PermanentMatsViewStorageTypeWarning() {
		return WaitElementVisible(driver, By.xpath(PERMANENTMATERIALS_VIEWSTORAGETYPEText)).getText();
	}
    
	public void PermanentMatsRemarkViewClick() {
		WaitElementVisible(driver, By.xpath(PERMANENTMATERIALS_VIEWBUTTON)).click();
	}
    
	public void InputUpdatePermanentMatsRemark() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_REMARK )).clear();
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_REMARK )).sendKeys("RemarkRemarkRemarkRemarkRemarkRemarkRemarkRemarkRemarkRemark");
	}
	
	public void InputUpdatePermanentMatsTotalPackage() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_TOTALPACKAGES)).clear();
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_TOTALPACKAGES)).sendKeys("1");
	}
	
	public void InputUpdatePermanentMatsTotalNumber() {
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_TOTALNUMBER)).clear();
		WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_TOTALNUMBER)).sendKeys("100");
	}
    
	public void SelectUpdatePermanentMatsStorageTypeClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(PERMANENTMATERIALS_UPDATE_STORAGETYPE)));
		dropList.selectByValue(GetPMUpdateStockType());
	}
    
	public String GetPMUpdateStockType() {
		SqlReader sr = null;
		String StockTypeId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from TB_Dictionary where Table_mark = 'StockStorageType' and [Values] = 'Paper Transfer In'";
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
	
	public void SearchPermanentMatsRegionClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(PERMANENTMATERIALS_REGION)));
		dropList.selectByValue("2");
	}
    
	public void PermanentMatsUpdateClick() {
		WaitElementVisible(driver, By.xpath(PERMANENTMATERIALS_UPDATEBUTTON)).click();
	}
	
    
    //Category Management
	public void CategoryManagementSearchClick() {
		WaitElementVisible(driver, By.id(CategoryManagementSearchButton)).click();
	}
    
    
	public void SearchCategoryManagementStockTypeClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(CategoryManagementSearchStockType)));
		dropList.selectByValue(GetSearchStockType());
	}
	
	public void ModifyPackageSave() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function ClickSave() {\r\n" + 
				"  var divLength = document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').length\r\n" + 
				"  document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').item(divLength - 1).getElementsByClassName('ui-dialog-buttonpane ui-widget-content ui-helper-clearfix').item(0).getElementsByTagName('div').item(0).getElementsByTagName('button').item(0).click()\r\n" + 
				"}\r\n" + 
				"return ClickSave()");
	}
	
	public void ModifyPackageNumber() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('txtEveryPackageNumber').value = 100");
	}
	
	public void ModifyClick(int buttonLocation) {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('spreadsheet-CategoryList-table').getElementsByTagName('input').item("+buttonLocation+").click()");
	}
	
	public int ModifyAllPackageNumberLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long i = (Long)js.executeScript("function ModifyPackageNumberLength() {\r\n" + 
				"  var packageNumberTotalLength = document.getElementById('spreadsheet-CategoryList-table').getElementsByTagName('input').length\r\n" + 
				"  return packageNumberTotalLength\r\n" + 
				"}\r\n" + 
				"return ModifyPackageNumberLength()\r\n" + 
				"");
		Integer packageNumberTotalLength= new Integer(String.valueOf(i));
		return packageNumberTotalLength;
	}
    //Admin Permanent Mats

	
	
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
				"   document.getElementsByName('StorageLocation').item(i).value = '10'\r\n" + 
				"  }\r\n" + 
				"};return inputAllStorageLocation()");
	}
	
	public void inputAllRemark() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputAllRemark(){\r\n" + 
				"  var RemarkLength = document.getElementsByName('Remark').length\r\n" + 
				"  for(var i =0; i<RemarkLength; i++){\r\n" + 
				"   document.getElementsByName('Remark').item(i).value = 'remark'\r\n" + 
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
