package com.selenium.test.tdol;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class TdolElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	TdolInput ti = new TdolInput();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}

	//TDP Task
	public String createTDPTaskButton = "TaskListBtnAdd";
	
	public String createTDPTaskRegion = "CreateTdpTask-Region";
	
	public String createTDPTaskTestDateYear = "CreateTdpTask-TestDateYear";
	
	public String createTDPTaskTestDateMonth = "CreateTdpTask-TestDateMonth";
	
	public String createTDPTaskTestDate = "CreateTdpTask-TestDate";

	public String createTDPTaskOpenIntervalStartDate = "CreateTdpTask-OpenIntervalStart";
	
	public String createTDPTaskOpenIntervalEndDate = "CreateTdpTask-OpenIntervalEnd";
	
	public String createTDPTaskTestDayRemarksForStaff = "CreateTdpTask-Remarks";
	
	public String createTDPTaskTestDayDescriptionForTDP = "CreateTdpTask-Description";
	
	public String searchTDPTaskRegion = "selectofficeTaskListSearch";
	
	public String searchTDPTaskTestDateStart = "testdate";
	
	public String searchTDPTaskTestDateEnd = "testdate1";
	
	public String searchTDPTaskButton = "TaskListBtnSearch";
	
	public String resetTDPTaskButton = "TaskListBtnReset";
	
	public String listOfRegionNameText = ".//*[@id='div-datatable-TaskList1']/div[2]/table/tbody/tr[1]/td[2]";
	
	public String modifyTDPTaskButton = ".//*[@id='div-datatable-TaskList1']/div[2]/table/tbody/tr[1]/td[7]/a[3]";
	
	public String getCreateTDPTaskTestDateLengthJS = "function getTestDateLength() {\r\n" + 
			"  var testDateLength = document.getElementById('CreateTdpTask-TestDate').length\r\n" + 
			"  return testDateLength\r\n" + 
			"}\r\n" + 
			"return getTestDateLength()\r\n" + 
			"";
	
	public void ModifyTDPTaskTestDayRemarksForStaff() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTDPTaskTestDayRemarksForStaff)).clear();
		WaitElementVisible(driver, By.id(createTDPTaskTestDayRemarksForStaff)).sendKeys(ti.ModifyRemarks);
	}
	
	public void ModifyTDPTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyTDPTaskButton)).click();
	}
	
	public String ListOfRegionNameWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfRegionNameText)).getText();
	}
	
	public void SearchTDPTaskRegion() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchTDPTaskRegion)).click();
	}
	
	public void SearchTDPTaskTestDateStart() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchTDPTaskTestDateStart)).clear();
		WaitElementVisible(driver, By.id(searchTDPTaskTestDateStart)).sendKeys(dv.GetFormatFirstDayOfThisMonth());
	}
	
	public void SearchTDPTaskTestDateEnd() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchTDPTaskTestDateEnd)).clear();
		WaitElementVisible(driver, By.id(searchTDPTaskTestDateEnd)).sendKeys(dv.GetFormatLastDayOfThisMonth());
	}
	
	public void SearchTDPTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchTDPTaskButton)).click();
	}
	
	public void ResetTDPTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(resetTDPTaskButton)).click();
	}
	
	public void CreateTDPTaskTestDayRemarksForStaff() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTDPTaskTestDayRemarksForStaff)).clear();
		WaitElementVisible(driver, By.id(createTDPTaskTestDayRemarksForStaff)).sendKeys(ti.CreateRemarks);
	}

	
	public void CreateTDPTaskTestDayDescriptionForTDP() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTDPTaskTestDayDescriptionForTDP)).clear();
		WaitElementVisible(driver, By.id(createTDPTaskTestDayDescriptionForTDP)).sendKeys(ti.CreateDescription);
	}
		
	public String GetTDPTaskTestDate() {
		Wait(normalTime);
		String selectedSale = new Select(driver.findElement(By.id(createTDPTaskTestDate))).getFirstSelectedOption().getText();  
		String subTestDate = StringUtils.substringBefore(selectedSale, " ");
		String[] subTestDateString = selectedSale.split("-");
		String[] numStringList = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		String formatString = null;
		for (int i =0; i<subTestDateString.length;) {
			if(Arrays.asList(numStringList).contains(subTestDateString[1])) {
				int subToInt = Integer.valueOf(subTestDateString[1]);
				String subToString = String.valueOf(subToInt);
				int subMonthToInt = Integer.valueOf(subTestDateString[2]);
				String subMonthToString = String.valueOf(subMonthToInt);
				formatString = subMonthToString + "/" + subToString + "/" + subTestDateString[0] ;
				break;
			}else {
				return subTestDate;
			}
		}
		return formatString;
	}
	
	public void CreateTDPTaskTestDayChoose() {
		Wait(normalTime);		
		WaitElementVisible(driver, By.xpath("//input[@value='"+GetTDPTaskTestDate()+"']")).click();
	}
	
	public String GetSearchTDPTaskTestDate() {
		Wait(normalTime);
		String selectedSale=new Select(driver.findElement(By.id(createTDPTaskTestDate))).getFirstSelectedOption().getText();  
		String[] testDateList = selectedSale.split("-");
		String newSelectedSale = testDateList[2] +"/"+ testDateList[1] +"/"+ testDateList[0];
		return newSelectedSale;
	}
	
	public String GetTDPTaskTestDateEnd() {
		Wait(normalTime);
		String selectedSale=new Select(driver.findElement(By.id(createTDPTaskTestDate))).getFirstSelectedOption().getText();  
		String[] testDateList = selectedSale.split("-");
		String newSelectedSale = String.valueOf(Integer.parseInt(testDateList[2]) -1) +"/"+ testDateList[1] +"/"+ testDateList[0];
		return newSelectedSale;
	}
	
	public String GetTDPTaskTestDateStart() {
		Wait(normalTime);
		String selectedSale=new Select(driver.findElement(By.id(createTDPTaskTestDate))).getFirstSelectedOption().getText();  
		String[] testDateList = selectedSale.split("-");
		String newSelectedSale = String.valueOf(Integer.parseInt(testDateList[2]) -2) +"/"+ testDateList[1] +"/"+ testDateList[0];
		return newSelectedSale;
	}
	
	public void InputTDPTaskOpenIntervalEndDate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTDPTaskOpenIntervalEndDate)).clear();
		WaitElementVisible(driver, By.id(createTDPTaskOpenIntervalEndDate)).sendKeys(GetTDPTaskTestDateEnd());
	}
	
	public void InputTDPTaskOpenIntervalStartDate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTDPTaskOpenIntervalStartDate)).clear();
		WaitElementVisible(driver, By.id(createTDPTaskOpenIntervalStartDate)).sendKeys(GetTDPTaskTestDateStart());
	}
	

	public int GetCreateTDPTaskTestDateLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getFMNMonthLength = (Long)js.executeScript(getCreateTDPTaskTestDateLengthJS);
		Integer monthLength= new Integer(String.valueOf(getFMNMonthLength));
		return monthLength;
	}
	
	public void CreateTDPTaskTestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTDPTaskTestDate)));
		dropList.selectByIndex(GetCreateTDPTaskTestDateLength() - 1 );
	}
	
	public void CreateTDPTaskTestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTDPTaskTestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	}
	
	public void CreateTDPTaskTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTDPTaskTestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	}
	
	public void CreateTDPTaskRegion() {
		Wait(normalTime);
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createTDPTaskRegion)));
		dropList.selectByValue("2");
	}
    
	public void CreateTDPTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createTDPTaskButton)).click();
	}
	
	public void WaitTime(){
		Wait(25000);
	}
	
	public void ShortWaitTime(){
		Wait(10000);
	}
	
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void ModifySaveClick() {
		Wait(normalTime);
		fc.MessageSaveClick(driver);
	}
	/*	
	public void ModifySecondClick() {
		Wait(normalTime);
		fc.ModifySecondClick(driver);
	}	

	public void ModifyOnceFirstClick() {
		Wait(normalTime);
		fc.ModifyOnceFirstClick(driver);
	}	

	public void ModifyInputSecondClick() {
		Wait(normalTime);
		fc.ModifyInputSecondClick(driver);
	}
	
	public void ModifyInputFirstClick() {
		Wait(normalTime);
		fc.ModifyInputFirstClick(driver);
	}
	 */
}
