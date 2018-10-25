package com.selenium.test.testcenter;

import org.testng.annotations.Test;

import com.selenium.test.brower.Mis2Brower;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
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
	
	public String SaveSuccessfulWarning(){
		Wait(normalTime);
		return driver.findElement(By.xpath(saveSuccessfulWarning)).getText();
	}
	
	public void CreateCenterSaveButton(){
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
