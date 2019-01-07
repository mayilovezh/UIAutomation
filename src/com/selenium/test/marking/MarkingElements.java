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
	
	//Double Marking
	public String searchDoubleMarkingTestDateYear = "ddlYear-db";
	
	public String searchDoubleMarkingTestDateMonth = "ddlMonth-db";
	
	public String searchDoubleMarkingTestDate = "ddlTestDate-db";
	
	public String getSearchAllDoubleMarkingTestCenter = ".//*[@id='SearchSpanTestCenterDoubleMarking']/label";
	
	public String doubleMarkingClearAllocation = "btnClearAllocation-db";
	
	public String searchDoubleMarking = "btnQuery-db";
	
	public String getDoubleMarkingAvailableExaminerText = "spanAvailableExaminer-db";
	
	public String inputDoubleMarkingSelectExaminerNumText = "txtSelectExaminerNum-db";
	
	public String doubleMarkingCalculateButton = "btnCalculate-db";
	
	public String listOfDoubleMarkingText = ".//*[@id='dbMaringExaminerListGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String doubleMarkingSetCapacityButton = ".//*[@id='dbMaringExaminerListGrid']/div[2]/table/tbody/tr[1]/td[19]/a";
	
	public String doubleMarkingNewCapacityNumberText = "txtnewcapacity-db";

	public String doubleMarkingTestCenter = "SearchSpanTestCenterDoubleMarkingSelectAll";
	
	public String doubleMarkingAutoAllocation = "btnAutoAllocation-db";
	
	//Double Marking OSM
	public String searchDoubleMarkingOSMTestDateYear = "ddlYear_DoubleMarkingNew";
	
	public String searchDoubleMarkingOSMTestDateMonth = "ddlMonth_DoubleMarkingNew";
	
	public String searchDoubleMarkingOSMTestDate = "ddlTestDate_DoubleMarkingNew";
	
	public String getSearchAllDoubleMarkingOSMTestCenter = ".//*[@id='spanTestCenter_DoubleMarkingNew']/label";
	
	public String doubleMarkingOSMClearAllocation = "btnClearAllocation_DoubleMarkingNew";
	
	public String searchDoubleMarkingOSM = "btnQuery_DoubleMarkingNew";
	
	public String getDoubleMarkingOSMAvailableExaminerText = "spanAvailableExaminer_DoubleMarkingNew";
	
	public String inputDoubleMarkingOSMSelectExaminerNumText = "txtSelectExaminerNum_DoubleMarkingNew";
	
	public String doubleMarkingOSMCalculateButton = "btnCalculate_DoubleMarkingNew";
	
	public String listOfDoubleMarkingOSMText = ".//*[@id='DoubleMarkingNewExaminerListGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String doubleMarkingOSMSetCapacityButton = ".//*[@id='DoubleMarkingNewExaminerListGrid']/div[2]/table/tbody/tr[1]/td[16]/a";
	
	public String doubleMarkingOSMNewCapacityNumberText = "txtnewcapacity_DoubleMarkingNew";

	public String doubleMarkingOSMTestCenter = "chkTestCenterAll_DoubleMarkingNew";
	
	public String doubleMarkingOSMAutoAllocation = "btnAutoAllocation_DoubleMarkingNew";
	
	//Double Marking OSM
	public void AutoAllocationDoubleMarkingOSM() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingOSMAutoAllocation)).click();
	}
	
	public void DoubleMarkingOSMTestCenter() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingOSMTestCenter)).click();
	}
	
	public boolean IsSelectDoubleMarkingOSMTestCenter() {
		Wait(normalTime);
		boolean isTrue = WaitElementVisible(driver, By.id(doubleMarkingOSMTestCenter)).isSelected();
		return isTrue;
	}
	
	public void ClearAllocationDoubleMarkingOSM() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingOSMClearAllocation)).click();
	}
	
	public void inputDoubleMarkingOSMNewCapacityNumber() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingOSMNewCapacityNumberText)).clear();
		WaitElementVisible(driver, By.id(doubleMarkingOSMNewCapacityNumberText)).sendKeys(mi.doubleMarkingNewCapacityNumber);
	}
	
	public void DoubleMarkingOSMSetCapacityClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(doubleMarkingOSMSetCapacityButton)).click();
	}
	
	public String ListOfDoubleMarkingOSMWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfDoubleMarkingOSMText)).getText();
	}
	
	public void DoubleMarkingOSMCalculate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingOSMCalculateButton)).click();
	}
	
	public String GetDoubleMarkingOSMAvailableExaminerText() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.id(getDoubleMarkingOSMAvailableExaminerText)).getText();
	}
	
	public void InputDoubleMarkingOSMSelectExaminerNum() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputDoubleMarkingOSMSelectExaminerNumText)).clear();
		WaitElementVisible(driver, By.id(inputDoubleMarkingOSMSelectExaminerNumText)).sendKeys(GetDoubleMarkingOSMAvailableExaminerText());
	}
	
	public void SearchDoubleMarkingOSM() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchDoubleMarkingOSM)).click();
	}
		
	public void GetDoubleMarkingOSMGreenTestCenter() {
		String allTcLocation = null;
		OUT:
		for(int i = 0; i<GetDoubleMarkingOSMMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingOSMTestDateMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetDoubleMarkingOSMTestDateList().length; j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingOSMTestDate)));
				dropTestDateList.selectByValue(GetDoubleMarkingOSMTestDateList()[j]);
				Wait(normalTime);
				int tcLength =  driver.findElements(By.xpath(getSearchAllDoubleMarkingOSMTestCenter)).size();
				for(int k = 0; k<tcLength; k++) {
					String tcStyle = driver.findElement(By.xpath(".//*[@id='spanTestCenter_DoubleMarkingNew']/label["+(k+1)+"]")).getAttribute("style");
					if(tcStyle.equals("color: green;")) {
						allTcLocation = "chkTestCenterAll_DoubleMarkingNew";
						driver.findElement(By.id(allTcLocation)).click();
						break OUT;
					}else {
						continue;
					}
				}
			}
		}
	}
	public String getDoubleMarkingOSMTestDateRedOptionList = "function getOptionList() {\r\n" + 
			"  var string = '';\r\n" + 
			"  $('#ddlTestDate_DoubleMarkingNew option').each(function () {\r\n" + 
			"    var value = $(this).val(); \r\n" + 
			"    if ($(this).attr('style') == 'color:red')\r\n" + 
			"    string += value + ';';\r\n" + 
			"  });\r\n" + 
			"  return string.substring(0, string.length);\r\n" + 
			"}\r\n" + 
			"return getOptionList();";
	
	public String getDoubleMarkingOSMMonthLength = "function getMonthLength() {\r\n" + 
			"  var monthLength = document.getElementById('ddlMonth_DoubleMarkingNew').children.length\r\n" + 
			"  return monthLength\r\n" + 
			"}\r\n" + 
			"return getMonthLength()\r\n" + 
			"";
	
	public String[] GetDoubleMarkingOSMTestDateList() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getTestDateList = (String)js.executeScript(getDoubleMarkingOSMTestDateRedOptionList);
		String[] testDateOptionList = getTestDateList.split(";");
		return testDateOptionList;
	}
	
	public void SearchDoubleMarkingOSMYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingOSMTestDateYear)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentYear()) - 1));//dv.getCurrentYear()
	}
	
	public int GetDoubleMarkingOSMMonthLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getFMNMonthLength = (Long)js.executeScript(getDoubleMarkingOSMMonthLength);
		Integer monthLength= new Integer(String.valueOf(getFMNMonthLength));
		return monthLength;
	}
	
	//Double Marking
	public void AutoAllocationDoubleMarking() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingAutoAllocation)).click();
	}
	
	public void DoubleMarkingTestCenter() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingTestCenter)).click();
	}
	
	public boolean IsSelectDoubleMarkingTestCenter() {
		Wait(normalTime);
		boolean isTrue = WaitElementVisible(driver, By.id(doubleMarkingTestCenter)).isSelected();
		return isTrue;
	}
	
	public void ClearAllocationDoubleMarking() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingClearAllocation)).click();
	}
	
	public void inputDoubleMarkingNewCapacityNumber() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingNewCapacityNumberText)).clear();
		WaitElementVisible(driver, By.id(doubleMarkingNewCapacityNumberText)).sendKeys(mi.doubleMarkingNewCapacityNumber);
	}
	
	public void DoubleMarkingSetCapacityClick() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(doubleMarkingSetCapacityButton)).click();
	}
	
	public String ListOfDoubleMarkingWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfDoubleMarkingText)).getText();
	}
	
	public void DoubleMarkingCalculate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(doubleMarkingCalculateButton)).click();
	}
	
	public String GetDoubleMarkingAvailableExaminerText() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.id(getDoubleMarkingAvailableExaminerText)).getText();
	}
	
	public void InputDoubleMarkingtxtSelectExaminerNum() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputDoubleMarkingSelectExaminerNumText)).clear();
		WaitElementVisible(driver, By.id(inputDoubleMarkingSelectExaminerNumText)).sendKeys(GetDoubleMarkingAvailableExaminerText());
	}
	
	public void SearchDoubleMarking() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchDoubleMarking)).click();
	}
		
	public void GetDoubleMarkingGreenTestCenter() {
		String allTcLocation = null;
		OUT:
		for(int i = 0; i<GetDoubleMarkingMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingTestDateMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetDoubleMarkingTestDateList().length; j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingTestDate)));
				dropTestDateList.selectByValue(GetDoubleMarkingTestDateList()[j]);
				Wait(normalTime);
				int tcLength =  driver.findElements(By.xpath(getSearchAllDoubleMarkingTestCenter)).size();
				for(int k = 0; k<tcLength; k++) {
					String tcStyle = driver.findElement(By.xpath(".//*[@id='SearchSpanTestCenterDoubleMarking']/label["+(k+1)+"]")).getAttribute("style");
					if(tcStyle.equals("color: green;")) {
						allTcLocation = "SearchSpanTestCenterDoubleMarkingSelectAll";
						driver.findElement(By.id(allTcLocation)).click();
						break OUT;
					}else {
						continue;
					}
				}
			}
		}
	}
	public String getDoubleMarkingTestDateRedOptionList = "function getOptionList() {\r\n" + 
			"  var string = '';\r\n" + 
			"  $('#ddlTestDate-db option').each(function () {\r\n" + 
			"    var value = $(this).val(); \r\n" + 
			"    if ($(this).attr('style') == 'color:red')\r\n" + 
			"    string += value + ';';\r\n" + 
			"  });\r\n" + 
			"  return string.substring(0, string.length);\r\n" + 
			"}\r\n" + 
			"return getOptionList();";
	
	public String getDoubleMarkingMonthLength = "function getMonthLength() {\r\n" + 
			"  var monthLength = document.getElementById('ddlMonth-db').children.length\r\n" + 
			"  return monthLength\r\n" + 
			"}\r\n" + 
			"return getMonthLength()\r\n" + 
			"";
	
	public String[] GetDoubleMarkingTestDateList() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getTestDateList = (String)js.executeScript(getDoubleMarkingTestDateRedOptionList);
		String[] testDateOptionList = getTestDateList.split(";");
		return testDateOptionList;
	}
	
	public void SearchDoubleMarkingYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingTestDateYear)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentYear()) - 1));//dv.getCurrentYear()
	}
	
	public int GetDoubleMarkingMonthLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getFMNMonthLength = (Long)js.executeScript(getDoubleMarkingMonthLength);
		Integer monthLength= new Integer(String.valueOf(getFMNMonthLength));
		return monthLength;
	}
	
	public void initDoubleMarkingTestSession() {
		OUT:
		for(int i = 0; i<GetDoubleMarkingMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingTestDateMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetDoubleMarkingTestDateList().length; j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchDoubleMarkingTestDate)));
				dropTestDateList.selectByValue(GetDoubleMarkingTestDateList()[j]);
				Wait(normalTime);
				int tcLength =  driver.findElements(By.xpath(getSearchAllDoubleMarkingTestCenter)).size();
				for(int k = 0; k<tcLength; k++) {
					String tcStyle = driver.findElement(By.xpath(".//*[@id='SearchSpanTestCenterDoubleMarking']/label["+(k+1)+"]")).getAttribute("style");
					if(tcStyle.equals("color: red;")) {
						WaitElementVisible(driver, By.id(doubleMarkingClearAllocation)).click();
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
