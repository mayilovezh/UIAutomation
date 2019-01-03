package com.selenium.test.marking;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class MarkingElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	MarkingInputData mi = new MarkingInputData();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}

	//First Marking New
	public String getMonthLength = "function getMonthLength() {\r\n" + 
			"  var monthLength = document.getElementById('FirstMarking-Select-Month-Search_New').children.length\r\n" + 
			"  return monthLength\r\n" + 
			"}\r\n" + 
			"return getMonthLength()\r\n" + 
			"";
	
	public String getTestDateRedOptionList = "function getOptionList() {\r\n" + 
			"  var string = '';\r\n" + 
			"  $('#ddlTestDate-firstMarking_New option').each(function () {\r\n" + 
			"    var value = $(this).val(); \r\n" + 
			"    if ($(this).attr('style') == 'color:red')\r\n" + 
			"    string += value + ';';\r\n" + 
			"  });\r\n" + 
			"  return string.substring(0, string.length);\r\n" + 
			"}\r\n" + 
			"return getOptionList();";
	
	public String searchFirstMarkingNewMonth = "FirstMarking-Select-Month-Search_New";
	
	public String searchFirstMarkingNewTestDate = "ddlTestDate-firstMarking_New";
	
	public String getSearchAllTestCenter = ".//*[@id='SearchSpanTestCenterfirstMarking_New']/label";
	
	public String searchFirstMarkingNewYear = "FirstMarking-Select-Year-Search_New";

	public String searchFirstMarkingNew = "btnQuery-firstMarking_New";
	
	public String searchFirstMarkingNewExaminerAll = "SearchSpanExaminerRegionfirstMarkingSelectAll_New";
	
	public String listOfFirstMarkingNewText = ".//*[@id='firstMaringExaminerListGrid_New']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String firstMarkingNewSetCapacityButton = ".//*[@id='firstMaringExaminerListGrid_New']/div[2]/table/tbody/tr[1]/td[23]/a";
	
	public String firstMarkingNewNewCapacityNumberText = "txtFirstMarking-newCapacity_New";
	
	public String firstMarkingNewExaminerSearch = "btnCalculate-firstMarking_New";
	
	public String firstMarkingNewClearAllocation = "btnClearAllocation-firstMarking_New";
	
	public String firstMarkingNewTestCenter = "SearchSpanTestCenterfirstMarkingSelectAll_New";
	
	public String firstMarkingNewAutoAllocation = "btnAutoAllocation-firstMarking_New";
	
	//First Marking New
	public void AutoAllocationFirstMarkingNew() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(firstMarkingNewAutoAllocation)).click();
	}
	
	public boolean IsSelectFirstMarkingNewExaminer() {
		Wait(normalTime);
		boolean isTrue = WaitElementVisible(driver, By.id(searchFirstMarkingNewExaminerAll)).isSelected();
		return isTrue;
	}
	
	public boolean IsSelectFirstMarkingNewTestCenter() {
		Wait(normalTime);
		boolean isTrue = WaitElementVisible(driver, By.id(firstMarkingNewTestCenter)).isSelected();
		return isTrue;
	}
	
	public void FirstMarkingNewTestCenter() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(firstMarkingNewTestCenter)).click();
	}
	
	public void ClearAllocationFirstMarkingNew() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(firstMarkingNewClearAllocation)).click();
	}
	
	public void SearchFirstMarkingNewExaminer() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(firstMarkingNewExaminerSearch)).click();
	}
	
	public void inputFirstMarkingNewNewCapacityNumber() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(firstMarkingNewNewCapacityNumberText)).clear();
		WaitElementVisible(driver, By.id(firstMarkingNewNewCapacityNumberText)).sendKeys(mi.newCapacityNumber);
	}
	
	public void FirstMarkingNewSetCapacityClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(firstMarkingNewSetCapacityButton)).click();
	}
	
	public String ListOfFirstMarkingNewWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfFirstMarkingNewText)).getText();
	}
	
	public void SearchFirstMarkingNewExaminerAll() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchFirstMarkingNewExaminerAll)).click();
	}
	
	public void ShortWaitTime(){
		Wait(10000);
	}
	
	public void WaitTime(){
		Wait(25000);
	}
	
	public void SearchFirstMarkingNew() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchFirstMarkingNew)).click();
	}
	
	public void SearchFirstMarkingNewYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchFirstMarkingNewYear)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentYear()) - 1));//dv.getCurrentYear()
	}
	
	public int GetMonthLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getFMNMonthLength = (Long)js.executeScript(getMonthLength);
		Integer monthLength= new Integer(String.valueOf(getFMNMonthLength));
		return monthLength;
	}
	
	public String[] GetTestDateList() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getTestDateList = (String)js.executeScript(getTestDateRedOptionList);
		String[] testDateOptionList = getTestDateList.split(";");
		return testDateOptionList;
	}
	
	public void initTestSession() {
		OUT:
		for(int i = 0; i<GetMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchFirstMarkingNewMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetTestDateList().length; j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchFirstMarkingNewTestDate)));
				dropTestDateList.selectByValue(GetTestDateList()[j]);
				Wait(normalTime);
				int tcLength =  driver.findElements(By.xpath(getSearchAllTestCenter)).size();
				for(int k = 0; k<tcLength; k++) {
					String tcStyle = driver.findElement(By.xpath(".//*[@id='SearchSpanTestCenterfirstMarking_New']/label["+(k+1)+"]")).getAttribute("style");
					if(tcStyle.equals("color: red;")) {
						WaitElementVisible(driver, By.id(firstMarkingNewClearAllocation)).click();
						ModifyFirstClick();
						ShortWaitTime();
						break OUT;
					}else {
						continue;
					}
				}
			}
		}
	}
	
	
	public void GetGreenTestCenter() {
		String allTcLocation = null;
		OUT:
		for(int i = 0; i<GetMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchFirstMarkingNewMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetTestDateList().length; j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchFirstMarkingNewTestDate)));
				dropTestDateList.selectByValue(GetTestDateList()[j]);
				Wait(normalTime);
				int tcLength =  driver.findElements(By.xpath(getSearchAllTestCenter)).size();
				for(int k = 0; k<tcLength; k++) {
					String tcStyle = driver.findElement(By.xpath(".//*[@id='SearchSpanTestCenterfirstMarking_New']/label["+(k+1)+"]")).getAttribute("style");
					if(tcStyle.equals("color: green;")) {
						//tcLocation =  ".//*[@id='SearchSpanTestCenterfirstMarking_New']/label["+(k+1)+"]";
						allTcLocation = "SearchSpanTestCenterfirstMarkingSelectAll_New";
						driver.findElement(By.id(allTcLocation)).click();
						break OUT;
					}else {
						continue;
					}
				}
			}
		}
	}

	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void ModifySecondClick() {
		Wait(normalTime);
		fc.ModifySecondClick(driver);
	}	
	/*
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
