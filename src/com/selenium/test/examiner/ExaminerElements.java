package com.selenium.test.examiner;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class ExaminerElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Availability Summary
	public String availabilitySummarySearchRegion = "SearchExaminerAvailabilitySummary_Region";
	
	public String availabilitySummarySearchYear = "SearchExaminerAvailabilitySummary_Year";
	
	public String availabilitySummarySearchMonth = "SearchExaminerAvailabilitySummary_Month";
	
	public String availabilitySummarySearchButton = "SearchExaminerAvailabilitySummary_Search";

	public String availabilitySummaryModifyLockButton = "SearchExaminerAvailabilitySummary_Create";
	
	public String modifyLockLockSPKdateText = "Jobs_LockEnd";
	
	public String availabilitySummarySearchText = ".//*[@id='ExaminerAvailabilitySummary_Guid']/div[2]/table/tbody/tr[1]/td[1]";
	
	public String availabilitySummaryModifyAvailabilityButton = ".//*[@id='Availability_Summary_Guid']/div[1]/div[2]/table/tbody/tr[1]/td[7]/input[1]";
	
	//Examiner
	public String examinerTaskCreateSpeakingTaskButton = "//input[@value='Speaking Task']";
	
	public String examinerTaskCreateSpeakingTaskRegion = "examinerTaskListSpeakingTaskRegion";
	
	public String examinerTaskCreateSpeakingTaskYear = "examinerTaskList-SpeakingTask-TestDateYear";
	
	public String examinerTaskCreateSpeakingTaskMonth = "examinerTaskList-SpeakingTask-TestDateMonth";
	
	public String examinerTaskCreateSpeakingTaskTestDate = "examinerTaskList-SpeakingTask-TestDate";
	
	public String examinerTaskCreateSpeakingTaskChooseDay = "//input[@value='"+FormatOfTestDayChoose()+"']";
	
	public String examinerTaskCreateSpeakingTaskExaminerDescription = "examinerTaskList-SpeakingTask-Description";
	
	public String examinerTaskCreateSpeakingTaskStaffRemark = "examinerTaskList-SpeakingTask-Remark";
	
	public String examinerTaskCreateSpeakingTaskSaveButton = "examinerTaskList-SpeakingTask-Save";
	
	public String examinerTaskSearchRegion = "selectofficeRegionSearch";
	
	public String examinerTaskSearchYear = "examinerstasklistYear-Search";
	
	public String examinerTaskSearchMonth = "examinerstasklistMonth-Search";
	
	public String examinerTaskSearchTestDate = "examinerstasklistDatetime";
	
	public String examinerTaskSearchTaskType = "examinertasktypelist";
	
	public String examinerTaskSearchButton = "examinerTaskList-btnsearch";
	
	public String listOfExaminerTaskSearchText = ".//*[@id='ExaminerTaskInfoGrid']/div[2]/table/tbody/tr[1]/td[1]";
	
	public String examinerTaskModifyButton = ".//*[@id='ExaminerTaskInfoGrid']/div[2]/table/tbody/tr[1]/td[8]/a[1]";
	
	public String examinerTaskViewButton = ".//*[@id='ExaminerTaskInfoGrid']/div[2]/table/tbody/tr[1]/td[8]/a[2]";
	
	public String examinerTaskViewDescriptionExaminerText = ".//*[@id='examinerTaskList-ShowTaskDetail']/label[3]";
	
	public String examinerTaskReportButton = ".//*[@id='ExaminerTaskInfoGrid']/div[2]/table/tbody/tr[1]/td[8]/a[4]";
	
	public String examinerTaskReportUpdateButton = ".//*[@id='examinerTaskList-report-grid']/div[2]/table/tbody/tr[1]/td[10]/input";
	
	public String examinerTaskReportUpdateAvailableButton = "radExaminerAvaYes";
	
	public String examinerTaskReportUpdateExaminerAvailableAllButton = "examinerAvaAll";
	
	public String examinerTaskReportUpdateTravelAvailableAllButton = "travelAvaAll";
	
	//SPK Deployment
	public String spkDeploymentSearchRegion = "examinerSpeakingArrangeoffice";
	
	public String spkDeploymentSearchYear = "examinerSpeakingArrangelistYear-Search";
	
	public String spkDeploymentSearchMonth = "examinerSpeakingArrangelistMonth-Search";
	
	public String spkDeploymentSearchTestDate = "examinerSpeakingArrangeTestDate";
	
	public String spkDeploymentSearchButton = ".//input[@value='Search']";
	
	public String spkDeploymentListOfCnText = ".//*[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr[1]/td[2]";
	
	public String spkDeploymentAssignButton = ".//*[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr[1]/td[10]/a[1]";
	
	public String spkDeploymentAssignSearchButton = ".//*[@id='div-datatable-SpeakingArrangement-ExaminerList']/div[1]/table[2]/tbody/tr/td[9]/input";
	
	public String spkDeploymentAssignSession = "spreadsheet-examinerSpeakingArrange-CheckBoxUnitsSelectAll";
	
	public String spkDeploymentUploadToPretest = ".//*[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr[1]/td[10]/a[4]";
	
	//SPK Deployment
	public void SpkDeploymentUploadToPretest() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkDeploymentUploadToPretest)).click();
	}
	
	public void SpkDeploymentAssignSession() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(spkDeploymentAssignSession)).click();
	}
	
	public void SpkDeploymentAssignSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkDeploymentAssignSearchButton)).click();
	}
	
	public void SpkDeploymentAssignClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkDeploymentAssignButton)).click();
	}
	
	public void SelectSPKTestDay() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function getTestDateLength() {\r\n" + 
				"  var testDayLength = document.getElementsByName('CanArrCheckedUnits').length\r\n" + 
				"  for (var i = 0; i < testDayLength; i++) {\r\n" + 
				"    document.getElementsByName('CanArrCheckedUnits').item(i).click()\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return getTestDateLength()");
	}
	
	
	public void WaitLongTime() {
		Wait(30000);
	}
	
	public String SpkDeploymentListOfCnWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(spkDeploymentListOfCnText)).getText();
	}
	
	public void SpkDeploymentSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(spkDeploymentSearchButton)).click();
	}
	
	public void SelectTestDate() {
		fc.SelectTestDate(driver, spkDeploymentSearchMonth, spkDeploymentSearchTestDate);
	}
	
	public void SpkDeploymentSearchYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkDeploymentSearchRegion)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SpkDeploymentSearchRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(spkDeploymentSearchRegion)));
		dropList.selectByValue("2");
	}
	
	//Examiner
	public void ExaminerTaskReportUpdateExaminerAvailableAllClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskReportUpdateExaminerAvailableAllButton)).click();
	}
	
	public void ExaminerTaskReportUpdateTravelAvailableAllClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskReportUpdateTravelAvailableAllButton)).click();
	}
	
	public void ExaminerTaskReportUpdateAvailableButton() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskReportUpdateAvailableButton)).click();
	}
	
	public void ExaminerTaskReportUpdateClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(examinerTaskReportUpdateButton)).click();
		Wait(6000);
	}
	
	public void ExaminerTaskReportClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(examinerTaskReportButton)).click();
	}
	
	public String ExaminerTaskViewDescriptionExaminerWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(examinerTaskViewDescriptionExaminerText)).getText();
	}
	
	
	public void ExaminerTaskViewClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(examinerTaskViewButton)).click();
	}
	
	public void WaitShotTime() {
		Wait(6000);
	}
	
	public void ExaminerTaskModifyClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(examinerTaskModifyButton)).click();
	}
	
	public String ListOfExaminerTaskSearchWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfExaminerTaskSearchText)).getText();
	}
	
	public void ExaminerTaskSearchClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskSearchButton)).click();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void ExaminerTaskSearchTaskType() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskSearchTaskType)));
		dropList.selectByValue("6");
	}
	
	public void ExaminerTaskSearchTestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskSearchTestDate)));
		dropList.selectByValue(dv.GetLastTestDateID());
	}
	
	public void ExaminerTaskSearchMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskSearchMonth)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentMonth())));
	}
	
	public void ExaminerTaskSearchYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskSearchYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void ExaminerTaskSearchRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskSearchRegion)));
		dropList.selectByValue("2");
	}
	
	public void ExaminerTaskSpeakingTaskSaveClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskSaveButton)).click();
		Wait(6000);
	}
	
	public void ExaminerTaskCreateSpeakingTaskStaffRemark(String elements) {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskStaffRemark)).clear();
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskStaffRemark)).sendKeys(elements);
	}
	
	public void ExaminerTaskCreateSpeakingTaskExaminerDescription(String elements) {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskExaminerDescription)).clear();
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskExaminerDescription)).sendKeys(elements);
	}
	
	public void ExaminerTaskCreateSpeakingTaskTestDayChoose() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(examinerTaskCreateSpeakingTaskChooseDay)).click();
	}
	
	public String FormatOfTestDayChoose(){
		String lastDate = StringUtils.substringBefore(dv.GetLastTestDate(), " ");
		String[] lastDateList = lastDate.split("-");
		String formatLastDate = lastDateList[2] + "/" + lastDateList[1] + "/" + lastDateList[0];
		return formatLastDate;
	}
	
	
	public void ExaminerTaskCreateSpeakingTaskTestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskTestDate)));
		dropList.selectByValue(dv.GetLastTestDateID());
	}
	
	public void ExaminerTaskCreateSpeakingTaskMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskMonth)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentMonth())));
	}
	
	public void ExaminerTaskCreateSpeakingTaskYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	public void ExaminerTaskCreateSpeakingTaskRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskRegion)));
		dropList.selectByValue("2");
		Wait(6000);
	}
	
	public void ExaminerTaskSpeakingTaskClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(examinerTaskCreateSpeakingTaskButton)).click();
		Wait(6000);
	}
	
	//Availability Summary
	public void ModifyAvailabilitySummary() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function inputTaskNo() {\r\n" + 
				"  var tbodyLength = document.getElementsByTagName('tbody').length\r\n" + 
				"  var trLength = document.getElementsByTagName('tbody').item(tbodyLength - 1).getElementsByTagName('tr').length\r\n" + 
				"  for (var i = 0; i < trLength; i++) {\r\n" + 
				"    var isDisplay = document.getElementsByTagName('tbody').item(tbodyLength - 1).getElementsByTagName('tr').item(i).getElementsByTagName('td').item(9).getElementsByTagName('div').item(0).getElementsByTagName('input').item(0).getAttribute('disabled')\r\n" + 
				"    if (isDisplay == null) {\r\n" + 
				"      document.getElementsByTagName('tbody').item(tbodyLength - 1).getElementsByTagName('tr').item(i).getElementsByTagName('td').item(9).getElementsByTagName('div').item(0).getElementsByTagName('input').item(0).value = 400\r\n" + 
				"      document.getElementsByTagName('tbody').item(tbodyLength - 1).getElementsByTagName('tr').item(i).getElementsByTagName('td').item(12).getElementsByTagName('div').item(0).getElementsByTagName('input').item(0).value = 'remarks'\r\n" + 
				"      break;\r\n" + 
				"    } else {\r\n" + 
				"      continue;\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"return inputTaskNo()");
	
	}
	
	public void AvailabilitySummaryModifyAvailabilityClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(availabilitySummaryModifyAvailabilityButton)).click();
		Wait(15000);
	}
	
	
	
	public String SearchAvailabilitySummaryWarning() {
		Wait(normalTime);
		return 	WaitElementVisible(driver, By.xpath(availabilitySummarySearchText)).getText();
	}
	
	public void WaitTime(){
		Wait(30000);
	}
	
	public void InputModifyLockLockSPKdate() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('Jobs_LockEnd').value = '"+dv.GetLastDayOfThisMonth()+"'");
	}
	
	public void ModifyLockAvailabilitySummaryClick() {
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		WaitElementVisible(driver, By.id(availabilitySummaryModifyLockButton)).click();
	}
	
	public void SearchAvailabilitySummaryRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(availabilitySummarySearchRegion)));
		dropList.selectByValue("2");
	}
	
	public void SearchAvailabilitySummaryYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(availabilitySummarySearchYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void SearchAvailabilitySummaryMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(availabilitySummarySearchMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) -1);
	}
	
	public void SearchAvailabilitySummaryClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(availabilitySummarySearchButton)).click();
	}

	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void ModifyOnceFirstClick() {
		Wait(normalTime);
		fc.ModifyOnceFirstClick(driver);
	}	
	
	public void ModifySecondClick() {
		Wait(normalTime);
		fc.ModifySecondClick(driver);
	}	
	
	public void ModifyInputSecondClick() {
		Wait(normalTime);
		fc.ModifyInputSecondClick(driver);
	}
	
	public void ModifyInputFirstClick() {
		Wait(normalTime);
		fc.ModifyInputFirstClick(driver);
	}
	
}
