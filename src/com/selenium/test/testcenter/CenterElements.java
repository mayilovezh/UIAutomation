package com.selenium.test.testcenter;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CenterElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
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
	
	//Test Room List
	public String searchRoomOfRegion = "selectofficeRoomSearch";
	
	public String searchRoomOfCenter = "selectCenterRoomSearch";
	
	public String searchRoomOfBuilding = "selectbuildingRoomSearch";
	
	public String roomOfSearchButton = ".//*[@id='page-heading']/div/table/tbody/tr[2]/td[6]/input[1]";
	
	public String roomOfCreateButton = ".//*[@id='page-heading']/input[1]";
	
	public String createOfRoomNameText = "roomName";
	
	public String createOfPriorityButton = "selectPriorityAdd";
	
	public String createOfTableChairStatusButton = "selectTableCharStatus";
	
	public String createOfRoomTowardText = "Room_Toward";
	
	public String createRoomRemarkText = "Remark";
	
	public String createOfRoomDetailsFirstButton = "//div[@class='ui-dialog-buttonset']/button[1]";
	
	public String roomNameWarningText = ".//*[@id='spreadsheet-testroom']/div[2]/table/tbody/tr/td[1]";
	
	public String modifyOfRoomModifyButton = ".//*[@id='spreadsheet-testroom']/div[2]/table/tbody/tr[1]/td[11]/a[1]";
	
	public String modifyOfRoomViewButton = ".//*[@id='spreadsheet-testroom']/div[2]/table/tbody/tr/td[11]/a[2]";
	
	public String checkRoomNameButton = "checkModifyRoom";
	
	public String viewOfRoomDetailsWarningText = ".//*[@id='testRoomDetailsWindow']/table/tbody/tr[2]/td";
	
	public String roomOfCreateShareRoomButton = ".//*[@id='page-heading']/input[2]";
	
	public String selectShareRoomButton = "selectestroomshare-All";
	
	public String shareRoomOfDateFromText = "set_DateTime_RoomShareDateFrom";
	
	public String shareRoomOfDateToText = "set_DateTime_RoomShareDateTo";
	
	public String selectShareRoomTestDayButton = "selectestroomsharedate-All";
	
	public String createShareRoomOfSearchButton = "btntestshareroomdatelistSearch";
	
	public String roomOfModifyShareDayButton = ".//*[@id='spreadsheet-testroom']/div[2]/table/tbody/tr[1]/td[11]/a[4]";
	
	public String modifyShareRoomOfDateFromText = "set_DateTime_ModifyRoomShareDateFrom";
	
	public String modifyShareRoomOfDateToText = "set_DateTime_ModifyRoomShareDateTo";
	
	public String modifyShareRoomOfSearchButton = "btntestshareroomdatelistSearch-modify";
	
	//Test Session List
	public String createTestSessionButton = "testSessionListCreate";
	
	public String createTestSeesionRegion = "ddlRegion-testsessionAdd";
	
	public String createTestSesstionProduct = "selectTestSessionExamProductTypeAdd2";
	
	public String createTestSessionTestCenter = "//input[@value='"+dv.GetValueOfCenterId()+"']";
	
	public String createTestSessionFormatButton = "selectTestSessionExamFormatSearchAdd";
	
	public String createTestSessionTimeTableButton = "selectTestSessionTimeTableSearchAdd";
	
	public String createTestSessionStartTestYear = "ddlYear-testsessionAdd";
	
	public String createTestSessionStartTestMonth = "ddlMonth-testsessionAdd";
	
	public String createTestSessionEndTestYear = "ddlYear-endYear1";
	
	public String createTestSessionEndTestMonth = "ddlMonth-endMonth1";
	
	public String createTestSessionEndSearch = "btntestcenterlistSearch";
	
	public String createTestSessionTestDate = "//input[@value='"+dv.getFormatString()+"']";
	
	public String searchTestSessionRegion = "selectRegionSearch-testsession";
	
	public String searchTestSessionExamProductType = "selectTestSessionExamProductTypeSearch";
	
	public String searchTestSessionExamFormat = "selectTestSessionExamFormatSearch";
	
	public String searchTestSessionTestDateYear = "ddlYear-testsession";
	
	public String searchTestSessionTestDateMonth = "ddlMonth-testsession";
	
	public String searchTestSessionTestDate = ".//*[@id='selectTestDateSearch']//option[@value='"+dv.GetTestDayId()+"']";
	
	public String searchTestSessionButton = "btntestsessionlistSearch";
	
	public String testCenterOfSearchWarningText = ".//*[@id='spreadsheet_testsession_Grid']/div[2]/table/tbody/tr/td[6]";
	
	public String modifyTestSessionButton = ".//*[@id='spreadsheet_testsession_Grid']/div[2]/table/tbody/tr/td[12]/a[1]";
	
	public String modifySessionQuotaText = "quotaForUpdate";
	
	public String searchTcSessionRegion = "log_Region";
	
	public String searchTcSessionViewLogFrom = "log_Start";
	
	public String searchTcSessionViewLogTo = "log_End";
	
	public String testTcCenterOfSearchWarningText = ".//*[@id='log_Show_Grid']/div[2]/table/tbody/tr/td[6]";
	
	public String tcSessionSearchButton = "Log_Search";
	
	public String tcSessionResetButton = "Log_Reset";
		
	public String noDataWarningText = ".//*[@id='log_Show_Grid']/div[2]/table/tbody/tr/td";
	
	public String logOutButton = ".//*[@id='page-top-outer']/div[1]/div[1]/a[3]";
	
	//Test date
	public String searchTestDateYearButton = "selectTestYear";
	
	public String searchTestDateExamProductTypeButton = "testdate_search_examproducttype";
	
	public String searchTestDateExamFormatButton = "testdate_search_examformat";
	
	public String searchTestDateButton = "testdate_search";
	
	public String searchTestDateRealWarningText = ".//*[@id='testdate_guid']/div[2]/table/tbody/tr[1]/td[1]";
	
	//Test date
	
	public String searchTestDateRealWarning() {
		return WaitElementVisible(driver, By.xpath(searchTestDateRealWarningText)).getText();
	}
	
	public void searchTestDateYear() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestDateYearButton)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void searchTestDateExamProductTypeButton() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestDateExamProductTypeButton)));
		dropList.selectByValue("1");
	}
	
	public void searchTestDateExamFormatButton() {
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestDateExamFormatButton)));
		dropList.selectByValue("1");
	}
	
	public void searchTestDateButton() {
		WaitElementVisible(driver, By.id(searchTestDateButton)).click();
		Wait(normalTime);
	}
		
	//Test session
	public void LogOutClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(logOutButton)).click();
	}
	
	public String NoDataWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(noDataWarningText)).getText();
	}
	
	public void ResetTcSessionButton() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(tcSessionResetButton)).click();
	}
	
	public void SearchTcSessionButton() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(tcSessionSearchButton)).click();
	}
	
	public String TestTCCenterSessionOfSearchWarning() {
		return WaitElementVisible(driver, By.xpath(testTcCenterOfSearchWarningText)).getText();
	}
	
	public void SearchTcSessionRegion() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchTcSessionRegion)).click();
	}
	
	public void SearchTcSessionViewLogFrom() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('log_Start').value = '"+dv.getCurrentDate()+"'");
	}
	
	public void SearchTcSessionViewLogTo() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('log_End').value ='"+dv.getCurrentDate()+"'");
	}
	public void ModifySessionQuota(String elements) {
		WaitElementVisible(driver, By.id(modifySessionQuotaText)).clear();
		WaitElementVisible(driver, By.id(modifySessionQuotaText)).sendKeys(elements);
		Wait(normalTime);
	}
	
	public void ModifyTestSessionClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyTestSessionButton)).click();
		Wait(normalTime);
	}
	
	public String TestCenterOfSearchWarning() {
		return WaitElementVisible(driver, By.xpath(testCenterOfSearchWarningText)).getText();
	}
	
	public void SearchOfTestSessionClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchTestSessionButton)).click();
	}
		
	public void SelectSearchTestSessionRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestSessionRegion)));
		dropList.selectByValue("2");
	}
	
	public void SelectSearchTestSessionExamProductType() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestSessionExamProductType)));
		dropList.selectByValue("1");
	}
	
	public void SelectSearchTestSessionExamFormat() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestSessionExamFormat)));
		dropList.selectByValue("1");
	}
	
	public void SelectSearchTestSessionTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestSessionTestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SelectSearchTestSessionTestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchTestSessionTestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()));
	}
	
	public void SelectSearchTestSessionTestDate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(searchTestSessionTestDate)).click();
	}
	
	public void SelectSearchTestSessionTestCenter() {
		Wait(normalTime);
		//WaitElementVisible(driver, By.xpath(searchTestSessionTestCenter)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#ddltestcenter-testsession').find(\"option[value='"+dv.GetValueOfCenterId()+"']\").attr(\"selected\", true)");
	}
		
	public void CreateTestSessionTestDate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createTestSessionTestDate)).click();
	}
	
	public void CreateTestSessionEndSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTestSessionEndSearch)).click();
	}
	
	public void CreateTestSessionStartTestYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSessionStartTestYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void CreateTestSessionStartTestMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSessionStartTestMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	}
	
	public void CreateTestSessionEndTestYearClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSessionEndTestYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void CreateTestSessionEndTestMonthClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSessionEndTestMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	}
		
	public void CreateTestSessionTimeTableClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSessionTimeTableButton)));
		dropList.selectByValue("1");
	}
	
	public void CreateTestSessionFormatClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSessionFormatButton)));
		dropList.selectByValue("1");
	}
	
	public void CreateTestSessionTestCenterClick() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('selectestcenter-"+dv.GetValueOfCenterId()+"').click()");
	}
	
	public void CreateTestSesstionProductClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSesstionProduct)));
		dropList.selectByValue("1");
		Wait(normalTime);
	}
	
	public void CreateTestSeesionRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTestSeesionRegion)));
		dropList.selectByValue("2");
	}
	
	public void CreateTestSessionClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTestSessionButton)).click();
		Wait(normalTime);
	}
	
	//Test Room List
	public void CreateThirdRoomSaveClick(){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(3).getElementsByTagName('button').item(0).click()");
	}
	
	public void CreateSechondRoomSaveClick(){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(2).getElementsByTagName('button').item(0).click()");
	}
	
	public void RoomeOfViewSaveClick(){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(1).getElementsByTagName('button').item(0).click()");
	}
	
	public void InputModifyShareRoomOfSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(modifyShareRoomOfSearchButton)).click();
	}
	
	public void InputModifyShareRoomOfDateFrom() {
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.id(modifyShareRoomOfDateFromText)).clear();
		WaitElementVisible(driver, By.id(modifyShareRoomOfDateFromText)).sendKeys(dv.getCurrentDate());
	}
	
	public void InputModifyShareRoomOfDateTo() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(modifyShareRoomOfDateToText)).clear();
		WaitElementVisible(driver, By.id(modifyShareRoomOfDateToText)).sendKeys(dv.getLastDate());
	}
	
	public void RoomOfModifyShareDayButton() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(roomOfModifyShareDayButton)).click();
		Wait(normalTime);
	}
	
	public void CreateShareRoomOfSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createShareRoomOfSearchButton)).click();
	}
	
	public void SelectShareRoomTestDayClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectShareRoomTestDayButton)).click();
	}
	
	public void InputShareRoomOfDateFrom() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(shareRoomOfDateFromText)).clear();
		WaitElementVisible(driver, By.id(shareRoomOfDateFromText)).sendKeys(dv.getCurrentDate());
	}
	
	public void InputShareRoomOfDateTo() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(shareRoomOfDateToText)).clear();
		WaitElementVisible(driver, By.id(shareRoomOfDateToText)).sendKeys(dv.getCurrentDate());
	}
	
	public void SelectShareRoomClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectShareRoomButton)).click();
	}
	
	public void RoomOfCreateShareRoomClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(roomOfCreateShareRoomButton)).click();
	}
	
	public String ViewOfRoomDetailsWarning() {
		return WaitElementVisible(driver, By.xpath(viewOfRoomDetailsWarningText)).getText();
	}
	
	public void CheckRoomNameClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(checkRoomNameButton)).click();
	}
	
	public void ModifyOfRoomModifyClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfRoomModifyButton)).click();
	}
	
	public void ModifyOfRoomViewClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfRoomViewButton)).click();
	}
	
	public String RoomNameWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(roomNameWarningText)).getText();
	}
	
	public void CreateOfRoomSaveButton() {
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createOfRoomDetailsFirstButton)).click();
	}
	
	public void CreateRoomRemark(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createRoomRemarkText)).clear();
		WaitElementVisible(driver, By.id(createRoomRemarkText)).sendKeys(elements);
	}
	
	
	public void InputCreateOfRoomToward(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createOfRoomTowardText)).clear();
		WaitElementVisible(driver, By.id(createOfRoomTowardText)).sendKeys(elements);
	}
	
	public void SelectCreateOfTableChairStatus(){
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createOfTableChairStatusButton)));
		dropList.selectByValue("28");
	}
	
	public void SelectCreateOfPriority(){
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createOfPriorityButton)));
		dropList.selectByValue("250");
	}
	
	public void InputCreateOfFloor(String elements){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#Floor').data('kendoNumericTextBox').value('2');");
	}
		
	public void GetRoomProductType() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function getRoomProductType() {\r\n" + 
				"  var roomProductTypeLength = document.getElementsByName('checkRoomProductType').length\r\n" + 
				"  for (var i = 0; i < roomProductTypeLength; i++) {\r\n" + 
				"    document.getElementsByName('checkRoomProductType').item(i).click()\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return getRoomProductType()\r\n" + 
				"");
	}
	
	
	public void GetRoomType() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function getRoomType() {\r\n" + 
				"  var roomTypeLength = document.getElementsByName('checkRoomType').length\r\n" + 
				"  for (var i = 0; i < roomTypeLength; i++) {\r\n" + 
				"    document.getElementsByName('checkRoomType').item(i).click()\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return getRoomType()");
	}
	
	
	public void InputCreateOfRoomQuota(String elements){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#RoomQuota').data('kendoNumericTextBox').value('100')");
	}
	
	public void InputCreateOfRoomOptimalQuota(String elements){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("$('#OptimalQuota').data('kendoNumericTextBox').value('100')");
	}
	
	public void InputRoomName(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createOfRoomNameText)).clear();
		WaitElementVisible(driver, By.id(createOfRoomNameText)).sendKeys(elements);
	}
	
	public void RoomOfCreateClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(roomOfCreateButton)).click();
	}
	
	public void RoomOfSearchClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(roomOfSearchButton)).click();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void SelectSearchRoomOfRegion(){
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchRoomOfRegion)));
		dropList.selectByValue("2");
	}
	
	public void SelectSearchRoomOfCenter(){
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchRoomOfCenter)));
		dropList.selectByValue(dv.GetValueOfCenterId());
	}
	
	public void SearchRoomOfBuilding(){
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchRoomOfBuilding)));
		dropList.selectByValue(dv.GetFirstValueOfBuilding());
	}
	
	//Test Building List	
	public void LendBuildingSaveClick(){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(1).getElementsByTagName('button').item(0).click()");
	}
	
	public void ViewOfBuildingDetailsSecondClick(){
		Wait(normalTime);
		//WaitElementVisible(driver, By.xpath(viewOfBuildingDetailsSecondButton)).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('button').item(1).click()");
	}
	
	public void ModifyOfBuildingLendBuildingClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfBuildingLendBuildingButton)).click();
	}
	
	public void SelectLendBuildingOfCZCZUTestCenterClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath("//input[@value='"+dv.GetCZCZUValueOfCenterId()+"']")).click();
		Wait(normalTime);
	} 	
		
	public void ModifyOfBuildingViewClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyOfBuildingViewButton)).click();
	}
	
	public void ViewOfBuildingDetailsFirstClick(){
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('ui-dialog-buttonset').item(0).getElementsByTagName('button').item(0).click()");
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
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchBuildingOfBuildingAvailable)));
		dropList.selectByValue("1");
	} 	
	
	public void SearchSelectBuildingOfRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchBuildingOfRegion)));
		dropList.selectByValue("2");
	} 	
	
	public void SearchSelectBuildingOfTestCenterClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchBuildingOfTestCenter)));
		dropList.selectByValue(dv.GetValueOfCenterId());
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
	}
	
	public String listOfCenterNameCnWarning(){
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfCenterNameCnText)).getText();
	}
	
	public void SearchClick(){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchButton)).click();
	}
	
	public void SearchCenterNameCn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchCenterNameCnText)).clear();
		WaitElementVisible(driver, By.id(searchCenterNameCnText)).sendKeys(elements);
	}
	
	public void SearchSelectCenterRegionClick() {
		Wait(normalTime);
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
		
	public void InputCreateCenterPostCode(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCreateCenterPostCodeText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterPostCodeText)).sendKeys(elements);
	}
	
	public void InputCreateCenterSuperPhone(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCreateCenterSuperPhoneText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterSuperPhoneText)).sendKeys(elements);
	}
	
	public void InputCreateCenterTelephone(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCreateCenterTelephoneText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterTelephoneText)).sendKeys(elements);
	}
	
	public void InputCreateCenterTrafficInfoEn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoEnText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoEnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterTrafficInfoCn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoCnText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterTrafficInfoCnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterCenterDescription(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCreateCenterCenterDescriptionText)).clear();
		WaitElementVisible(driver, By.id(inputCreateCenterCenterDescriptionText)).sendKeys(elements);
	}
	
	public void SelectCreateCenterRegionZone() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterRegionZoneButton)));
		dropList.selectByValue("2");
	} 	
	
	public void InputCreateCenterAddressEn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCenterAddressEnText)).clear();
		WaitElementVisible(driver, By.id(createCenterAddressEnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterAddressCn(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCenterAddressCnText)).clear();
		WaitElementVisible(driver, By.id(createCenterAddressCnText)).sendKeys(elements);
	}
	
	public void InputCreateCenterAbbreviation(String elements){
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCenterAbbreviationText)).clear();
		WaitElementVisible(driver, By.id(createCenterAbbreviationText)).sendKeys(elements);
	}
	
	public void CreateCenterClick(){
		WaitElementVisible(driver, By.xpath(createCenterButton)).click();
		Wait(normalTime);
	}
	
	public void SelectCreateCenterRegionClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterRegionButton)));
		dropList.selectByValue("2");
	} 	
	
	public void SelectCreateCenterExamProductTypeClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterExamProductTypeButton)));
		dropList.selectByValue("1");
	} 	
	
	public void SelectCreateCenterProvinceClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterProvinceButton)));
		dropList.selectByValue("31");
	} 	
	
	public void SelectCreateCenterCityClick() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCenterCityButton)));
		dropList.selectByValue("310100");
	} 	
	
	public void InputCreateCenterCenterNameCn(String elements) {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCenterCenterNameCnText)).clear();
		WaitElementVisible(driver, By.id(createCenterCenterNameCnText)).sendKeys(elements);
	} 	
	
	public void InputCreateCenterCenterNameEn(String elements) {
		Wait(normalTime);
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
	
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void ModifySecondClick() {
		Wait(normalTime);
		fc.ModifySecondClick(driver);
	}	
	
}
