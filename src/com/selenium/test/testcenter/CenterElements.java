package com.selenium.test.testcenter;

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

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CenterElements extends Mis2Brower{

	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Test Center List
	public String createCenterButton =".//*[@id='div-datatable-testcenter']/p/input";
	
	public String createCenterRegionButton = "selectofficeTCAdd";
	
	public String createCenterExamProductTypeButton = "selExamProductTypeTCAdd";
	
	public String createCenterProvinceButton = "selectProvinceTc";
	
	public String createCenterCityButton = "selectCityTc";
	
	public String createCenterCenterNameCnText = "centerNameAdd";
	
	public String createCenterCenterNameEnText = "centerNameEnAdd";
	
	public String createCenterTCQuotaText = ".//*[@id='displayCenterWindow']/table/tbody/tr[8]/td/span[1]/span/input[1]";
	
	public String createCenterAbbreviationText = "abbreviationAdd";
	
	public String createCenterAddressCnText = "CenterAddress";
	
	public String createCenterAddressEnText = "CenterAddressEn";
	
	public String createCenterRegionZoneButton = "selectRegionZoneTc";
	
	public String inputCreateCenterCenterDescriptionText = "CenterDesc";
	
	public String inputCreateCenterTrafficInfoCnText = "txtTrafficInfo";
	
	public String inputCreateCenterTrafficInfoEnText = "txtTrafficInfoEn";
	
	public String inputCreateCenterTelephoneText = "txtTelephone";
	
	public String inputCreateCenterSuperPhoneText = "txtSuperPhone";
	
	public String inputCreateCenterPostCodeText = "txtPostCode";
	
	public String createCenterSaveButton = "//button[@role='button'][1]";
	
	public String saveSuccessfulWarning = "//div[@role='dialog'][2]/div[2]";
	
	public String centerListDetailsButton = ".//*[@id='SpreadSheetTestCenterGrid']/div[2]/table/tbody/tr[1]/td[10]/a[1]";
	
	public String searchCenterRegionButton = "selectofficeTCSearch";
	
	public String searchCenterNameCnText = "txtCenterName";
	
	public String searchButton = "BtnCenterSearch";
	
	public String listOfCenterNameCnText = ".//*[@id='SpreadSheetTestCenterGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String centerListViewButton = ".//*[@id='SpreadSheetTestCenterGrid']/div[2]/table/tbody/tr[1]/td[10]/a[2]";
	
	public String viewCenterNameCnText = ".//*[@id='testCenterDetailsWindow']/table/tbody/tr[5]/td";
	
	//Test Building List
	public String searchBuildingOfRegion = "selectofficeSearchBuilding";
	
	public String searchBuildingOfTestCenter = "selectTCSearchBuilding";
	
	public String searchBuildingOfBuildingAvailable = "selectBuildingAvailable";
	
	public String buildingOfSearchButton = ".//*[@id='page-heading']/div/table/tbody/tr/td[7]/input[1]";
	
	public String buildingOfCreateButton = ".//*[@id='page-heading']/input";
	
	public String createBuildingOfBuildingNameCnText = "buildingNameAdd";
	
	public String createBuildingOfBuildingNameEnText = "buildingNameEnAdd";
	
	public String createBuildingOfFloorDescriptionText = "FloorDesc";
	
	public String createBuildingAddressCnText = "BuildingAddress";
	
	public String createBuildingAddressEnText = "BuildingAddressEn";
	
	public String createBuildingRemarkText = "RemarkBuilding";
	
	public String createBuildingSaveButton = "//div[@class='k-dialog-buttons']/div/button[1]";
	
	public String buildingNameEnWarningText = ".//*[@id='spreadsheet-testbuilding']/div[2]/table/tbody/tr/td[2]";
	
	public String modifyOfBuildingModifyButton = ".//*[@id='spreadsheet-testbuilding']/div[2]/table/tbody/tr/td[6]/a[1]";
	
	public String modifyOfBuildingViewButton = ".//*[@id='spreadsheet-testbuilding']/div[2]/table/tbody/tr/td[6]/a[2]";
	
	public String viewOfBuildingDetailsWarningText = ".//*[@id='testBuildingDetailsWindow']/table/tbody/tr[3]/td";
	
	public String viewOfBuildingDetailsFirstButton = "//div[@class='ui-dialog-buttonset']/button[1]";
	
	public String modifyOfBuildingLendBuildingButton = ".//*[@id='spreadsheet-testbuilding']/div[2]/table/tbody/tr/td[6]/a[3]";
	
	public String viewOfBuildingDetailsSecondButton = "//div[@class='ui-dialog-buttonset']/button[2]";
	
	public void ViewOfBuildingDetailsSecondClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(viewOfBuildingDetailsSecondButton)).click();
	}
	
	public void ModifyOfBuildingLendBuildingClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfBuildingLendBuildingButton)).click();
	}
	
	public void SelectLendBuildingOfCZCZUTestCenterClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath("//input[@value='"+GetCZCZUValueOfCenterId()+"']")).click();
	} 	
	
	public String GetCZCZUValueOfCenterId() {
		SqlReader sr = null;
		String centerId = null;
		try {
			sr = new SqlReader();
			String sql = "select * from tblTestCenter where CenterName = '常州大学'";
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
	
	public void ModifyOfBuildingViewClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfBuildingViewButton)).click();
	}
	
	public void ViewOfBuildingDetailsFirstClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(viewOfBuildingDetailsFirstButton)).click();
	}
	
	public String ViewOfBuildingDetailsWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(viewOfBuildingDetailsWarningText)).getText();
	}
	
	public void ModifyOfBuildingModifyClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfBuildingModifyButton)).click();
	}
	
	public String BuildingNameEnWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(buildingNameEnWarningText)).getText();
	}
	
	public void CreateBuildingSaveClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createBuildingSaveButton)).click();
	}
	
	public void CreateBuildingRemark(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createBuildingRemarkText)).clear();
		WaitElementVisible(driver, By.id(createBuildingRemarkText)).sendKeys(elements);
	}
	
	public void SelectAvailableClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('AvailableBuilding').item(0).click()");
	}
	
	public void CreateBuildingAddressEn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createBuildingAddressEnText)).clear();
		WaitElementVisible(driver, By.id(createBuildingAddressEnText)).sendKeys(elements);
	}
	
	public void CreateBuildingAddressCn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createBuildingAddressCnText)).clear();
		WaitElementVisible(driver, By.id(createBuildingAddressCnText)).sendKeys(elements);
	}
	
	public void CreateBuildingOfFloorDescription(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createBuildingOfFloorDescriptionText)).clear();
		WaitElementVisible(driver, By.id(createBuildingOfFloorDescriptionText)).sendKeys(elements);
	}
	
	public void SelectBuildingTypeToClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function getBuildingType() {\r\n" + 
				"  var typeLength = document.getElementsByName('checkBuildingType').length\r\n" + 
				"  for (var i = 0; i < typeLength - 1; i++) {\r\n" + 
				"    document.getElementsByName('checkBuildingType').item(i).click()\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return getBuildingType()");
	}
	
	public void CreateBuildingOfBuildingNameEn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createBuildingOfBuildingNameEnText)).clear();
		WaitElementVisible(driver, By.id(createBuildingOfBuildingNameEnText)).sendKeys(elements);
	}
	
	public void CreateBuildingOfBuildingNameCn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createBuildingOfBuildingNameCnText)).clear();
		WaitElementVisible(driver, By.id(createBuildingOfBuildingNameCnText)).sendKeys(elements);
	}
	
	public void BuildingOfCreateClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(buildingOfCreateButton)).click();
	}
	
	public void BuildingOfSearchClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(buildingOfSearchButton)).click();
	}
	
	public void SearchSelectBuildingOfBuildingAvailableClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchBuildingOfBuildingAvailable)));
		dropList.selectByValue("1");
	} 	
	
	public void SearchSelectBuildingOfRegionClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchBuildingOfRegion)));
		dropList.selectByValue("2");
	} 	
	
	public void SearchSelectBuildingOfTestCenterClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchBuildingOfTestCenter)));
		dropList.selectByValue(GetValueOfCenterId());
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
	
	//Test Center List
	public String ViewCenterNameCnWarning(){
		Wait(normalTime);
		return driver.findElement(By.xpath(viewCenterNameCnText)).getText();
	}
	
	public void CenterListViewClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(centerListViewButton)).click();
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
	
	public String listOfCenterNameCnWarning(){
		return WaitElementVisible(driver, By.xpath(listOfCenterNameCnText)).getText();
	}
	
	public void SearchClick(){
		WaitElementVisible(driver, By.id(searchButton)).click();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void SearchCenterNameCn(String elements){
		WaitElementVisible(driver, By.id(searchCenterNameCnText)).clear();
		WaitElementVisible(driver, By.id(searchCenterNameCnText)).sendKeys(elements);
	}
	
	public void SearchSelectCenterRegionClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCenterRegionButton)));
		dropList.selectByValue("2");
	} 	
	
	public void CenterListDetailsClick(){
		Wait(normalTime);
		driver.findElement(By.xpath(centerListDetailsButton)).click();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public String SaveSuccessfulWarning(){
		Wait(normalTime);
		return driver.findElement(By.xpath(saveSuccessfulWarning)).getText();
	}
	
	public void CreateCenterSaveButton(){
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCenterSaveButton)).click();
	}
	
	public void InputCreateCenterPostCode(String elements){
		WaitElementVisible(driver, By.id(inputCreateCenterPostCodeText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterPostCodeText)).sendKeys(elements);
	}
	
	public void InputCreateCenterSuperPhone(String elements){
		WaitElementVisible(driver, By.id(inputCreateCenterSuperPhoneText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterSuperPhoneText)).sendKeys(elements);
	}
	
	public void InputCreateCenterTelephone(String elements){
		WaitElementVisible(driver, By.id(inputCreateCenterTelephoneText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterTelephoneText)).sendKeys(elements);
	}
	
	public void InputCreateCenterTrafficInfoEn(String elements){
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoEnText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoEnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterTrafficInfoCn(String elements){
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoCnText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoCnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterCenterDescription(String elements){
		WaitElementVisible(driver, By.id(inputCreateCenterCenterDescriptionText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterCenterDescriptionText)).sendKeys(elements);
	}
	
	public void SelectCreateCenterRegionZone() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterRegionZoneButton)));
		dropList.selectByValue("2");
	} 	
	
	public void InputCreateCenterAddressEn(String elements){
		WaitElementVisible(driver, By.id(createCenterAddressEnText)).clear();
		WaitElementVisible(driver, By.id(createCenterAddressEnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterAddressCn(String elements){
		WaitElementVisible(driver, By.id(createCenterAddressCnText)).clear();
		WaitElementVisible(driver, By.id(createCenterAddressCnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterAbbreviation(String elements){
		WaitElementVisible(driver, By.id(createCenterAbbreviationText)).clear();
		WaitElementVisible(driver, By.id(createCenterAbbreviationText)).sendKeys(elements);
	}
	
	public void CreateCenterClick(){
		WaitElementVisible(driver, By.xpath(createCenterButton)).click();
		Wait(normalTime);
	}
	
	public void SelectCreateCenterRegionClick() {
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterRegionButton)));
		dropList.selectByValue("2");
	} 	
	
	public void SelectCreateCenterExamProductTypeClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterExamProductTypeButton)));
		dropList.selectByValue("1");
	} 	
	
	public void SelectCreateCenterProvinceClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterProvinceButton)));
		dropList.selectByValue("34");
	} 	
	
	public void SelectCreateCenterCityClick() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterCityButton)));
		dropList.selectByValue("340800");
	} 	
	
	public void InputCreateCenterCenterNameCn(String elements) {
		WaitElementVisible(driver, By.id(createCenterCenterNameCnText)).clear();
		WaitElementVisible(driver, By.id(createCenterCenterNameCnText)).sendKeys(elements);
	} 	
	
	public void InputCreateCenterCenterNameEn(String elements) {
		WaitElementVisible(driver, By.id(createCenterCenterNameEnText)).clear();
		WaitElementVisible(driver, By.id(createCenterCenterNameEnText)).sendKeys(elements);
	} 	
	
	public void InputCreateCenterTCQuota() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#TcQuota').data('kendoNumericTextBox').value('500')");
	} 	
	
	public void InputCreateCenterTCOptimalQuota() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#TcOptimalQuota').data('kendoNumericTextBox').value('500')");
	} 	
//	public String resultPaymentSearchVendorWarning() {
//		return waitElementVisible(driver, By.xpath(resultPaymentSearchVendorText)).getAttribute("tooltip-template");
//	}
//	
	
}
