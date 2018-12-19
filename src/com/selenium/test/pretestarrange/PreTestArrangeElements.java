package com.selenium.test.pretestarrange;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import com.selenium.test.brower.Mis2Brower;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PreTestArrangeElements extends Mis2Brower{

	DynamicVariables dv = new DynamicVariables();
	
	FirstClick fc = new FirstClick();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Written Apportionment
	public String selectWrittenApportionmentRegionButton = "ddlRegion-Summary";
	
	public String selectWrittenApportionmentExamProductTypeButton = "selectSummaryExamProductTypeSearch";
	
	public String selectWrittenApportionmentExamFormatButton = "selectSummaryExamFormatSearch";
	
	public String selectWrittenApportionmentTestDateYearButton = "ddlYear-Summary";
	
	public String selectWrittenApportionmentTestDateMonthButton = "ddlMonth-Summary";
		
	public String selectWrittenApportionmentTestDateButton = ".//*[@id='ddlTestDate-Summary']//option[@value='"+dv.GetTestDayId()+"']";
	
	public String selectWrittenApportionmentSearchButton = "btnQuery-Summary";
	
	public String writtenApportionmentAddButton = "//input[@value='Add']";
	
	public String writtenApportionmentApportionSelectedCandidatesButton = "btnAppSelect-ArrCdd";
	
	public String writtenApportionmentSaveButton = "btnSave-ArrCdd";
	
	public String writtenApportionmentAutoApportionAllButton = "btnAutoArr-ArrCdd";
	
	public String listOfWrittenApportionmentTestCenterText = ".//*[@id='spreadsheet-ArrangementSummary-table']/tbody/tr/td[1]";
	
	public String writtenApportionmentUnappAllButton = "unapp-ArrCdd";
	
	public String writtenApportionmentAmendChangeButton = ".//*[@id='spreadsheet-ArrangementSummary-table']/tbody/tr/td[6]/input";
	
	public String writtenApportionmentDeleteCurrentCenterArrangementButton = "delete-SpkArrCdd-w";
	
	//Spk Arrangement
	public String spkArrangementRegion = "SpkTestArrangementlistRegion";
	
	public String spkArrangementProductType = "selectSpkTestArrangementExamProductTypeSearch";
	
	public String spkArrangementExamFormat = "selectSpkTestArrangementExamFormatSearch";
	
	public String spkArrangementTestDateYear = "SpkTestArrangementlistDdlYear-Search";
	
	public String spkArrangementTestDateMonth = "SpkTestArrangementlistDdlMonth-Search";
	
	public String spkArrangementTestDate = "SpkTestArrangementlistDateTime";
	
	public String spkArrangementSearchButton = "btnSpkArrangement";
	
	public String spkArrangementSearchTcText = ".//*[@id='spreadsheet-SpkTestArrangementlist-table']/tbody/tr/td[1]";
	
	public String spkArrangementAmendChange = "//input[@value='Amend/Change']";
	
	public String spkArrangementAmendChangeOfSave = "roomarrange-submit-Arr";
	
	public String spkArrangementAmendChangeOfBack = ".//*[@id='div-datatable-list-SpkRoomArrangement-Arr']/p/input[2]";
	
	public String spkArrangementTimeSlotOfAdd = ".//*[@id='spreadsheet-SpkTestArrangementlist-table']/tbody/tr/td[5]/input";
	
	public String spkArrangementTimeSlotOfAddSaveTheAboveSetting = "saveTimeSlotInfo";
	
	public String spkArrangementTimeSlotOfAddBack = ".//*[@id='page-heading']/p[2]/input[1]";
	
	public String spkArrangementCandidatesApportionmentOfAdd = ".//*[@id='spreadsheet-SpkTestArrangementlist-table']/tbody/tr/td[6]/input";
	
	public String spkArrangementCandidatesApportionmentOfAutoArrangeSpeakingTest = "btnAutoArr-SpkArrCdd";
	
	//Spk Arrangement
	public void SpkArrangementCandidatesApportionmentOfAutoArrangeSpeakingTest() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(spkArrangementCandidatesApportionmentOfAutoArrangeSpeakingTest)).click();
	}
	
	public void SpkArrangementCandidatesApportionmentOfAdd() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkArrangementCandidatesApportionmentOfAdd)).click();
	}
	
	public void SpkArrangementTimeSlotOfAddBack() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkArrangementTimeSlotOfAddBack)).click();
	}
	
	public void SpkArrangementTimeSlotOfAddSaveTheAboveSetting() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(spkArrangementTimeSlotOfAddSaveTheAboveSetting)).click();
	}
	
	public void SpkArrangementTimeSlotOfAdd() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkArrangementTimeSlotOfAdd)).click();
	}
	
	public void SpkArrangementAmendChangeOfBack() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkArrangementAmendChangeOfBack)).click();
	}
	
	public void SpkArrangementAmendChangeOfSave() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(spkArrangementAmendChangeOfSave)).click();
	}
	
	public void SpkArrangementAmendChange() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkArrangementAmendChange)).click();
	}
	
	public String SpkArrangementSearchTcWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(spkArrangementSearchTcText)).getText();
	}
	
	public void SearchSpkArrangementClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(spkArrangementSearchButton)).click();
	}
	
	public void SearchSpkArrangementTestDateClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkArrangementTestDate)));
		dropList.selectByValue(dv.GetLastTestDayId());
	}
	
	public void SearchSpkArrangementTestDateMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkArrangementTestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	}
	
	public void SearchSpkArrangementTestDateYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkArrangementTestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SearchSpkArrangementExamFormatClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkArrangementExamFormat)));
		dropList.selectByValue("3");
	}
	
	public void SearchSpkArrangementProductTypeClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkArrangementProductType)));
		dropList.selectByValue("1");
	}
	
	public void SearchSpkArrangementRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkArrangementRegion)));
		dropList.selectByValue("2");
	}
	
	
	//Written Apportionment	
	public void WrittenApportionmentDeleteCurrentCenterArrangementClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenApportionmentDeleteCurrentCenterArrangementButton)).click();
	}
	
	public void WrittenApportionmentAmendChangeClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(writtenApportionmentAmendChangeButton)).click();
	}
	
	public void WrittenApportionmentUnappAllClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenApportionmentUnappAllButton)).click();
	}
	
	public String ListOfWrittenApportionmentTestCenterWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfWrittenApportionmentTestCenterText)).getText();
	}
	
	public void WrittenApportionmentAutoApportionAllClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenApportionmentAutoApportionAllButton)).click();
	}
	
	public void WrittenApportionmentSaveClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(writtenApportionmentSaveButton)).click();
	}
	
	public void WrittenApportionmentAddClick() {
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(writtenApportionmentAddButton)).click();
	}
	
	
	public void WindowsAlertConfirm() {
		Wait(normalTime);
		driver.switchTo().alert().accept();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void SearchSelectWrittenApportionmentClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectWrittenApportionmentSearchButton)).click();
	}
	
	public void SearchSelectWrittenApportionmentTestDateYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentTestDateYearButton)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SearchSelectWrittenApportionmentTestDateMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenApportionmentTestDateMonthButton)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
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
	
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void ModifySecondClick() {
		Wait(normalTime);
		fc.ModifySecondClick(driver);
	}	
	
}
