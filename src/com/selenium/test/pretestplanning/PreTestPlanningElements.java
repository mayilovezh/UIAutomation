package com.selenium.test.pretestplanning;

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

public class PreTestPlanningElements extends Mis2Brower{

	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Written Templates List
	public String selectWrittenTemplatesListRegionButton ="WrittenTemplatelistRegion";
	
	public String selectWrittenTemplatesListTestCenterButton = "WrittenTemplatelistTestCenterid";
	
	public String addWrittenTemplatesButton = "btnPreTestLinkToWrittenTemplateAdd";
	
	public String selectBuildingButton = "TestBuilding";
	
	public String writtenTemplateSaveButton = "submitTemplate";

	public String writtenTemplateSearchButton = "btnQu";

	public String listOftestCenterWarningText = ".//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr/td[2]";
	
	public String deleteRoomStatus = ".//*[@id='spreadsheet-WrittenTemplates-modify-table']/tbody/tr[1]/td[10]/span";
	
	public String modifyButton = ".//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr[1]/td[6]/a[1]";
	
	public String modifySaveButton = "btnDoModify";
	
	public String modifyAddRoomButton = "btnAddRoomModify";
	
	public String selectModifyBuildingRoomButton = "TestBuildingModifyWrittenTemp";
	
	public String deleteButton = ".//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr[1]/td[6]/a[2]";
	
	public void DeleteClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(deleteButton)).click();
	}
	
	public void ModifyFirstButtonClick(){
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
	
	public void selectModifyBuildingRoomClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectModifyBuildingRoomButton)));
		dropList.selectByValue(GetFirstValueOfBuilding());
	}
	
	public void ModifyAddRoomClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(modifyAddRoomButton)).click();
	}
	
	public void ModifySaveClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(modifySaveButton)).click();
	}
	
	public void WindowAlertConfirm() {
		Wait(normalTime);
		driver.switchTo().alert().accept();
	}
	
	public void ModifyClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyButton)).click();
	}
	
	public void DeleteRoomStatus() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(deleteRoomStatus)).click();
	}
	
	public String listOftestCenterWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOftestCenterWarningText)).getText();
	}
	
	public void SearchAddWrittenTemplateClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenTemplateSearchButton)).click();
	}
	
	public void AddWrittenTemplateSaveClick() {
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenTemplateSaveButton)).click();

	}
	
	public void getRoomStatus() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function getRoomStatus() {\r\n" + 
				"  var roomStatusLength = document.getElementsByName('checkbox').length\r\n" + 
				"  for (var i = 0; i < roomStatusLength; i++) {\r\n" + 
				"    document.getElementsByName('checkbox').item(i).click()\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return getRoomStatus()\r\n" + 
				"");
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
	
	public void SelectBuildingClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectBuildingButton)));
		dropList.selectByValue(GetFirstValueOfBuilding());
	}
	
	public void AddWrittenTemplatesClick() {
		WaitElementVisible(driver, By.id(addWrittenTemplatesButton)).click();
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
	
	public void SelectWrittenTemplatesListRegion() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenTemplatesListRegionButton)));
		dropList.selectByValue("2");
	}
	
	public void SearchTestDateExamProductType() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenTemplatesListTestCenterButton)));
		dropList.selectByValue(GetValueOfCenterId());
	}
	
}
