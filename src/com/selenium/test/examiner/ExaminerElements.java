package com.selenium.test.examiner;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;

import java.util.List;

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
	
	
	//Examiner
	public void ExaminerTaskSpeakingTaskSaveClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskSaveButton)).click();
		Wait(6000);
	}
	
	public void ExaminerTaskCreateSpeakingTaskStaffRemark() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskStaffRemark)).clear();
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskStaffRemark)).sendKeys("Staff Remark");
	}
	
	public void ExaminerTaskCreateSpeakingTaskExaminerDescription() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskExaminerDescription)).clear();
		WaitElementVisible(driver, By.id(examinerTaskCreateSpeakingTaskExaminerDescription)).sendKeys("Examiner Description");
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
		dropList.selectByValue(dv.getCurrentMonth());
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
		Wait(25000);
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
		dropList.selectByValue(dv.getCurrentMonth());
	}
	
	public void SearchAvailabilitySummaryClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(availabilitySummarySearchButton)).click();
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
