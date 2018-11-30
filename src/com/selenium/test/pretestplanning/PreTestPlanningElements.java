package com.selenium.test.pretestplanning;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import com.selenium.test.brower.Mis2Brower;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PreTestPlanningElements extends Mis2Brower{
	
	DynamicVariables dv = new DynamicVariables();
	
	FirstClick fc = new FirstClick();
	
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
	
	//Written Room Arrange
	public String selectWrittenRoomArrangeRegionButton = "ddlRegion-Search";
	
	public String selectWrittenRoomArrangeExamProductTypeButton = "selectWrittenRoomArrangeExamProductTypeSearch";
	
	public String selectWrittenRoomArrangeExamFormatButton = "selectWrittenRoomArrangeExamFormatSearch";
	
	public String selectWrittenRoomArrangeTestDateYearButton = "ddlYear-Search";
	
	public String selectWrittenRoomArrangeTestDateMonthButton = "ddlMonth-Search";
		
	public String selectWrittenRoomArrangeTestDateButton = ".//*[@id='ddlTestDate-Search']//option[@value='"+dv.GetTestDayId()+"']";
	
	public String selectWrittenRoomArrangeSearchButton = "btnQuery";
	
	public String AddWrittenTestRoomArrangementButton = ".//*[@id='spreadsheet-WrittenArrangement-table']/tbody/tr/td[7]/a";
	
	public String AddWrittenTestRoomArrangementSearchButton = "btnQuery1";
	
	public String AddWrittenTestRoomArrangementAutoArrangeButton = "btnArrange";
	
	public String AddWrittenTestRoomArrangementSaveUploadButton = "btnSave-Upload-WArr";
	
	public String AddWrittenTestRoomArrangementListOfDeleteButton = ".//*[@id='spreadsheet-WrittenArrangementDetail-table_wrapper']/table/tbody/tr[2]/td[14]/a";
	
	public String AddWrittenTestRoomArrangementListOfAddExtraButton = "btnAddRoom";
	
	public String AddWrittenTestRoomArrangementListOfAddBuilding = "TestBuilding-add";
	
	public String AddWrittenTestRoomArrangementDeleteButton = "BatchDeleteRoom";
	
	public String ss = "//div[@class='ui-dialog-buttonset'][1]/button[1]";
		
	public void ModifyNineButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(9).getElementsByTagName('button').item(0).click()");
	}
		
	public void ModifyEighthButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(8).getElementsByTagName('button').item(0).click()");
	}
	
	public void ModifySixthButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(5).getElementsByTagName('button').item(0).click()");
	}
	
	public void ModifyFivthButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(4).getElementsByTagName('button').item(0).click()");
	}
	
	public void ModifyForthButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(3).getElementsByTagName('button').item(0).click()");
	}
	
	public void ModifyThirdButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(2).getElementsByTagName('button').item(0).click()");
	}
	
	public void AddWrittenTestRoomArrangementDeleteClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(AddWrittenTestRoomArrangementDeleteButton)).click();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void AddWrittenTestRoomArrangementListOfAddBuildingClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(AddWrittenTestRoomArrangementListOfAddBuilding)));
		dropList.selectByValue(dv.GetFirstValueOfBuilding());
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void AddWrittenTestRoomArrangementListOfAddExtraClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(AddWrittenTestRoomArrangementListOfAddExtraButton)).click();
	}
	
	public void WindowsAlertConfirm() {
		Wait(normalTime);
		driver.switchTo().alert().accept();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void AddWrittenTestRoomArrangementListOfDeleteClick() {
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(AddWrittenTestRoomArrangementListOfDeleteButton)).click();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void ModifySecondButtonClick(){
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(1).getElementsByTagName('button').item(0).click()");
	}
	
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public void AddWrittenTestRoomArrangementSaveUploadClick() {
		for(int i=0; i<60; i++) {
			if(isElementPresent(By.id(AddWrittenTestRoomArrangementSaveUploadButton))) {
				WaitElementVisible(driver, By.id(AddWrittenTestRoomArrangementSaveUploadButton)).click();
				break;
			}
		}
	}
	
	public void GetWARoomStatus() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function getRoomStatus() {\r\n" + 
				"  var roomStatusLength = document.getElementsByName('batch_DeleteRoom').length\r\n" + 
				"  for (var i = 0; i < roomStatusLength; i++) {\r\n" + 
				"    document.getElementsByName('batch_DeleteRoom').item(i).click()\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return getRoomStatus()");
	}
	
	public void AddWrittenTestRoomArrangementAutoArrangeClick() {
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.id(AddWrittenTestRoomArrangementAutoArrangeButton)).click();
	}
	
	public void AddWrittenTestRoomArrangementSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(AddWrittenTestRoomArrangementSearchButton)).click();
	}
	
	public void SelectAddWrittenRoomTempName() {
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#ddlTempName-mod').find(\"option[value='"+dv.GetTemplateNameValue()+"']\").attr(\"selected\", true)");
	}
		
	public void AddwrittentestroomarrangementClick() {
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(AddWrittenTestRoomArrangementButton)).click();
	}
	
	public void SearchSelectWrittenRoomArrangeClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectWrittenRoomArrangeSearchButton)).click();
	}
	
	public void SearchSelectWrittenRoomArrangeTestDateYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenRoomArrangeTestDateYearButton)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SearchSelectWrittenRoomArrangeTestDateMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenRoomArrangeTestDateMonthButton)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	}
	
	public void SearchSelectWrittenRoomArrangeTestDateClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(selectWrittenRoomArrangeTestDateButton)).click();
	}
	
	public void SearchSelectWrittenRoomArrangeExamFormatClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenRoomArrangeExamFormatButton)));
		dropList.selectByValue("1");
	}
	
	public void SearchSelectWrittenRoomArrangeExamProductTypeClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenRoomArrangeExamProductTypeButton)));
		dropList.selectByValue("1");
	}
	
	public void SearchSelectWrittenRoomArrangeRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenRoomArrangeRegionButton)));
		dropList.selectByValue("2");
	}
	
	//Written Templates List
	public void DeleteClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(deleteButton)).click();
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
		dropList.selectByValue(dv.GetFirstValueOfBuilding());
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
	
	public void SelectBuildingClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectBuildingButton)));
		dropList.selectByValue(dv.GetFirstValueOfBuilding());
	}
	
	public void AddWrittenTemplatesClick() {
		WaitElementVisible(driver, By.id(addWrittenTemplatesButton)).click();
		Wait(normalTime);
	}
	
	public void SelectWrittenTemplatesListRegion() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenTemplatesListRegionButton)));
		dropList.selectByValue("2");
	}
	
	public void SearchTestDateExamProductType() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectWrittenTemplatesListTestCenterButton)));
		dropList.selectByValue(dv.GetValueOfCenterId());
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
