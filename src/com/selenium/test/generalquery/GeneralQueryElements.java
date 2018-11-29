package com.selenium.test.generalquery;

import com.selenium.test.utils.SqlReader;
import com.selenium.test.brower.Mis2Brower;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.openqa.selenium.*;

public class GeneralQueryElements extends Mis2Brower{

	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
    //Holiday Management
    public String HM_CREATE = "btnHolidayCreate";
    public String HM_CREATE_DATE = "HolidayDate";
    public String HM_CREATE_NAME = "Save_HolidayName";
    public String HM_NAME = "HolidayName";
    public String HM_SEARCH = "btnHolidaySearch";
    public String HM_SEARCH_NAME = "//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[2]";
    public String HM_MODIFY = ".//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[4]/a[1]";
    public String HM_LOG = ".//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[4]/a[3]";
    public String HM_LOG_NAME = "//*[@id='HolidayLog']/table/tbody/tr[2]/td[1]";
    public String HM_DELETE = ".//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[4]/a[2]";
    public String HM_SEARCHYEAR = ".//*[@id='select-Holiday-Year']/option[@value='"+getCurrentYear()+"']";
    
    
    //Holiday Management
	public void DeleteHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_DELETE)).click();
	}
    
	public String HolidayManagementLogDetailWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(HM_LOG_NAME)).getText();
	}
	
	public void LogHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_LOG)).click();
	}
    
	public void ModifyHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_MODIFY)).click();
	}
	
	public void SearchHolidayNameOfHolidayManagement(String elements) {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_NAME)).clear();
		WaitElementVisible(driver, By.id(HM_NAME)).sendKeys(elements);
	}
    
	public void SearchYearOfHolidayManagement() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(HM_SEARCHYEAR)).click();
	}
	
	public String HolidayManagementNameWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(HM_SEARCH_NAME)).getText();
	}
	
	public void HolidayManagementSearchClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_SEARCH)).click();
	}
	
	public void InputHolidayManagementSearchName(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_NAME)).click();
	}
	
	public void InputHolidayManagementCreateName(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_CREATE_NAME)).clear();
		WaitElementVisible(driver, By.id(HM_CREATE_NAME)).sendKeys(elements);
	}
	
	public void InputHolidayManagementCreateDate(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_CREATE_DATE)).clear();
		WaitElementVisible(driver, By.id(HM_CREATE_DATE)).sendKeys(elements);
	}
	
    
	public void HolidayManagementCreateClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(HM_CREATE)).click();
	}
    
    public void WindowAlertConfirm(){
    	Wait(normalTime);
    	driver.switchTo().alert().accept();
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
	    
	public void ModifyFirstClick() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("var divLength = document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').length\r\n" + 
				"document.getElementsByClassName('ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-dialog-buttons').item(divLength - 1).getElementsByClassName('ui-dialog-buttonpane ui-widget-content ui-helper-clearfix').item(0).getElementsByTagName('div').item(0).getElementsByTagName('button').item(0).click()\r\n" + 
				"");
	}
	
	public void WaitTime(){
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
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
