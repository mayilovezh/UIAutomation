package com.selenium.test.generalquery;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
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

	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
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
    public String HM_SEARCHYEAR = ".//*[@id='select-Holiday-Year']/option[@value='"+dv.getCurrentYear()+"']";
    
    
    //Holiday Management
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
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
	
	public void WaitTime(){
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
}
