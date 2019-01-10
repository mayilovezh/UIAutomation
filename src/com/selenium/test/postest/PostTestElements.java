package com.selenium.test.postest;


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

public class PostTestElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}

	//Candidate Status Block
	public String getMonthLength = "function getMonthLength() {\r\n" + 
			"  var monthLength = document.getElementById('ddlMonth-CandidateStatus').children.length\r\n" + 
			"  return monthLength\r\n" + 
			"}\r\n" + 
			"return getMonthLength()\r\n" + 
			"";
	
	public String getTestDateLength = "function getTestDateLength() {\r\n" + 
			"  var testDateLength = document.getElementById('CandidateStatus_List_Datetime').children.length\r\n" + 
			"  return testDateLength\r\n" + 
			"}\r\n" + 
			"return getTestDateLength()\r\n" + 
			"";
	
	public String searchCandidateStatusBlockTestDateYear = "ddlYear-CandidateStatus";
	
	public String searchCandidateStatusBlockTestDateMonth = "ddlMonth-CandidateStatus";
	
	public String searchCandidateStatusBlockTestDate = "CandidateStatus_List_Datetime";
	
	public String searchCandidateStatusBlockButton = "CandidateStatus_List_BtnQuery";
	
	public String ListOfNotDataText = ".//*[@id='CandidateStatus_List_tabsGrid']/div[2]/table/tbody/tr/td";
	
	public String ListOfDataText = ".//*[@id='CandidateStatus_List_tabsGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String resetCandidateStatusBlockButton = "CandidateStatus_List_BtnReset";
	
	public String selectCandidateStatusBlockTestStatus = "Candidate_Status_Test_List_13475010";
	
	public String selectCandidateStatusBlockScoreStatus = "Candidate_Status_Score_List_13475010";
	
	public String selectCandidateStatusBlockReason = "Candidate_Status_Reject_List_13475010";
	
	public String candidateStatusBlockModify = ".//*[@id='CandidateStatus_List_tabsGrid']/div[2]/table/tbody/tr[1]/td[12]/input";
	
	public String candidateStatusBlockSaveAll = "Candidate_Status_Save_All";
	
	public String candidateStatusBlockIDType = ".//select[@id='candidate_status_Reg_idtype']/option[@value=0]";
		
	public String candidateStatusBlockSaveSelectedbutton = "Candidate_Status_Save_Selected";
	
	public String candidateStatusBlockSelectedRecord = "document.getElementsByName('Candidate_Status_Chk').item(0).click()";
	
	//EMS Management
	public String ListOfEMSNotDataText = ".//*[@id='EMSCandidateListGrid']/div[2]/table/tbody/tr/td";
	
	public String ListOfEMSDataText = ".//*[@id='EMSCandidateListGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	
	public String searchEMSManagementButton = "btnEmsCdtQuery";
	
	public String emsManagementTestDateYear = "EmsCdt-Select-Year-Search";
	
	public String getEMSMonthLength = "function getMonthLength() {\r\n" + 
			"  var monthLength = document.getElementById('EmsCdt-Select-Month-Search').children.length\r\n" + 
			"  return monthLength\r\n" + 
			"}\r\n" + 
			"return getMonthLength()\r\n" + 
			"";
	
	public String getEMSTestDateLength = "function getTestDateLength() {\r\n" + 
			"  var testDateLength = document.getElementById('selectEmsCdtTestDate').children.length\r\n" + 
			"  return testDateLength\r\n" + 
			"}\r\n" + 
			"return getTestDateLength()\r\n" + 
			"";
	
	public String searchEMSManagementTestDateMonth = "EmsCdt-Select-Month-Search";
	
	public String searchEMSManagementTestDate = "selectEmsCdtTestDate";
	
	public String selectTRFReturnCompleted = "EmsCdt_Select_TRFReturnCompleted";
	
	public String resetEMSManagementButton = "btn-reset-EmsCdt";
	
	public String listOfEMSManagementDetails = ".//*[@id='EMSCandidateListGrid']/div[2]/table/tbody/tr[1]/td[1]";
	
	public String viewOfFamilyNameText = ".//*[@id='chinaAppList']/tbody/tr[4]/td";
	
	public String listOfEMSManagementModify = ".//*[@id='EMSCandidateListGrid']/div[2]/table/tbody/tr[1]/td[14]/a";
	
	public String inputEMSManagementEMSNOText = "txtEmsCdtEmsNo";
	
	public String getEMSManagementEmsNo = "function getEmsNo(){\r\n" + 
			"var emsNo = document.getElementById('txtEmsCdtEmsNo').value\r\n" + 
			"return emsNo\r\n" + 
			"}\r\n" + 
			"return getEmsNo()";
	
	//EMS Management
	public void inputEMSManagementEMSNO() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String emsNo = (String)js.executeScript(getEMSManagementEmsNo);
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputEMSManagementEMSNOText)).clear();
		WaitElementVisible(driver, By.id(inputEMSManagementEMSNOText)).sendKeys(emsNo);
	}
	
	public void ListOfEMSManagementModify() {
		WaitElementVisible(driver, By.xpath(listOfEMSManagementModify)).click();
	}
	
	
	public void ListOfEMSManagementDetails() {
		WaitElementVisible(driver, By.xpath(listOfEMSManagementDetails)).click();
	}
	
	public String ViewOfFamilyNameWarning() {
		return WaitElementVisible(driver, By.xpath(viewOfFamilyNameText)).getText();
	}
	
	public String ListOfEMSDataWarning() {
		return WaitElementVisible(driver, By.xpath(ListOfEMSDataText)).getText();
	}
	
	public String ListOfEMSNotDataWarning() {
		return WaitElementVisible(driver, By.xpath(ListOfEMSNotDataText)).getText();
	}
	
	public void ResetEMSManagement() {
		WaitElementVisible(driver, By.id(resetEMSManagementButton)).click();
	}
	
	public boolean IsSelectTRFReturnCompleted() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.id(selectTRFReturnCompleted)).isSelected();
	}
	
	public void InitSelectTRFReturnCompleted() {
		Wait(normalTime);
		if(IsSelectTRFReturnCompleted()) {
			WaitElementVisible(driver, By.id(selectTRFReturnCompleted)).click();
		}
	}
	
	public void EMSManagementTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(emsManagementTestDateYear)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentYear()) - 1));
	}
	
	public int GetEMSMonthLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getCSBMonthLength = (Long)js.executeScript(getEMSMonthLength);
		Integer monthLength= new Integer(String.valueOf(getCSBMonthLength));
		return monthLength;
	}
	
	public int GetEMSTestDateLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getCSBTestDateLength = (Long)js.executeScript(getEMSTestDateLength);
		Integer testDateLength= new Integer(String.valueOf(getCSBTestDateLength));
		return testDateLength;
	}
	
	public void GetEMSListOfContent() {
		OUT:
		for(int i = 0; i<GetEMSMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchEMSManagementTestDateMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetEMSTestDateLength(); j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchEMSManagementTestDate)));
				dropTestDateList.selectByIndex(j+1);
				Wait(normalTime);
				WaitElementVisible(driver, By.id(searchEMSManagementButton)).click();
				Wait(normalTime);
				try {
					String isListOfData = WaitElementVisible(driver, By.xpath(ListOfEMSNotDataText)).getText();
					if(isListOfData.equals("No available data....") == false) {
						break OUT;
					}else {
						continue;
					}
				}catch(NoSuchElementException e) {
					System.out.println("The test data is not data!!!!!");
				}

			}
		}
	}
	//Candidate Status Block
	public void CandidateStatusBlockSelectedRecord() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(candidateStatusBlockSelectedRecord);
	}
	
	public void CandidateStatusBlockSaveSelected() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(candidateStatusBlockSaveSelectedbutton)).click();
	}
	
	public void ModifySaveClick() {
		Wait(normalTime);
		fc.MessageSaveClick(driver);
	}
	
	public void ShortWaitTime(){
		Wait(10000);
	}
	
	public void inputCandidateStatusBlock() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(candidateStatusBlockIDType)).click();
		ShortWaitTime();
	}
	
	public void CandidateStatusBlockModify() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(candidateStatusBlockModify)).click();
		ShortWaitTime();
	}
	
	public void CandidateStatusBlockSaveAll() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(candidateStatusBlockSaveAll)).click();
	}
	
	public void SelectCandidateStatusBlockTestStatus() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectCandidateStatusBlockTestStatus)));
		dropList.selectByIndex(1);
	}
	
	public void SelectCandidateStatusBlockScoreStatus() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectCandidateStatusBlockScoreStatus)));
		dropList.selectByIndex(0);
	}
	
	public void SelectCandidateStatusBlockReason() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectCandidateStatusBlockReason)));
		dropList.selectByIndex(0);
	}
	
	public String ListOfNotDataWarning() {
		return WaitElementVisible(driver, By.xpath(ListOfNotDataText)).getText();
	}
	
	public void ResetCandidateStatusBlock() {
		WaitElementVisible(driver, By.id(resetCandidateStatusBlockButton)).click();
	}
	
	public String ListOfDataWarning() {
		return WaitElementVisible(driver, By.xpath(ListOfDataText)).getText();
	}
	
	public void SearchCandidateStatusBlockTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCandidateStatusBlockTestDateYear)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentYear()) - 1));
	}
	
	public int GetMonthLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getCSBMonthLength = (Long)js.executeScript(getMonthLength);
		Integer monthLength= new Integer(String.valueOf(getCSBMonthLength));
		return monthLength;
	}
	
	public int GetTestDateLength() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long getCSBTestDateLength = (Long)js.executeScript(getTestDateLength);
		Integer testDateLength= new Integer(String.valueOf(getCSBTestDateLength));
		return testDateLength;
	}
	
	public void GetListOfContent() {
		OUT:
		for(int i = 0; i<GetMonthLength(); i++) {
			Wait(normalTime);
			Select dropList = new Select(WaitElementVisible(driver, By.id(searchCandidateStatusBlockTestDateMonth)));
			dropList.selectByIndex(i);
			for(int j = 0; j<GetTestDateLength(); j++) {
				Select dropTestDateList = new Select(WaitElementVisible(driver, By.id(searchCandidateStatusBlockTestDate)));
				dropTestDateList.selectByIndex(j+1);
				Wait(normalTime);
				WaitElementVisible(driver, By.id(searchCandidateStatusBlockButton)).click();
				Wait(normalTime);
				try {
					String isListOfData = WaitElementVisible(driver, By.xpath(ListOfNotDataText)).getText();
					if(isListOfData.equals("No available data....") == false) {
						break OUT;
					}else {
						continue;
					}
				}catch(NoSuchElementException e) {
					System.out.println("The test data is not data!!!!!");
				}

			}
		}
	}
	
	public void WaitTime(){
		Wait(25000);
	}
	
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
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
