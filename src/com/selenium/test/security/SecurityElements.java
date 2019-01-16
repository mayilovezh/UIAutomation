package com.selenium.test.security;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import com.selenium.test.brower.Mis2Brower;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SecurityElements extends Mis2Brower{
	
	DynamicVariables dv = new DynamicVariables();
	
	FirstClick fc = new FirstClick();
	
	SecurityInputData si = new SecurityInputData();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}
	
	//Check Suspicious
	public String searchCheckSuspiciousRegion = "ddlRegion-addsuspicious";
	
	public String searchCheckSuspiciousProductType = "ExamProductTypeSearch-addsuspicious";
	
	public String searchCheckSuspiciousExamFormat = "ExamFormatSearch-addsuspicious";
	
	public String searchCheckSuspiciousTestCenter = "ddlTestCenter-addsuspicious";
	
	public String searchCheckSuspicious = "btnQuery-addsuspicious";
	
	public String listOfCheckSuspiciousText = ".//*[@id='GridSuspiciousCandidateManuallyCheck']/div[2]/table/tbody/tr[1]/td[5]";
	
	public String checkSuspiciousAddButton = "function addClick() {\r\n" + 
			"  var addLength = document.getElementsByName('buttonAdd').length;\r\n" + 
			"  for (var i = 0; i < addLength; i++) {\r\n" + 
			"    document.getElementsByName('buttonAdd').item(i).click();\r\n" + 
			"    break;\r\n" + 
			"  }\r\n" + 
			"}\r\n" + 
			"return addClick()\r\n" + 
			"";
	
	public String resetCheckSuspicious = "btnreset-addsuspicious";
	
	public String viewCheckSuspiciousButton = ".//*[@id='GridSuspiciousCandidateManuallyCheck']/div[2]/table/tbody/tr[1]/td[8]";
	
	public String viewCheckSuspiciousText = ".//*[@id='chinaAppList']/tbody/tr[3]/td";
	
	public String selectCheckSuspiciousAddSecurityLevel = "ddlSecurityStatus-addsuspicious";
	
	public String selectCheckSuspiciousAddSuspiciousReason = "ddlSecurityReason-addsuspicious";
	
	public String inputCheckSuspiciousAddRemark = "txtRemark-addsuspicious";
	
	//Check Suspicious
	public void InputCheckSuspiciousAddRemark() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputCheckSuspiciousAddRemark)).clear();
		WaitElementVisible(driver, By.id(inputCheckSuspiciousAddRemark)).sendKeys(si.ModifySuspiciousCandidateRemarkText);
    }
	
	public void SelectCheckSuspiciousAddSuspiciousReason() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectCheckSuspiciousAddSuspiciousReason)));
		dropList.selectByIndex(1);
    }
	
	public void SelectCheckSuspiciousAddSecurityLevel() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(selectCheckSuspiciousAddSecurityLevel)));
		dropList.selectByIndex(1);;
    }
	
	public void ModifySaveClick() {
		Wait(normalTime);
		fc.MessageSaveClick(driver);
	}
	
	public String ViewCheckSuspiciousWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(viewCheckSuspiciousText)).getText();
    }
	
	public void ViewCheckSuspicious() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(viewCheckSuspiciousButton)).click();
    }
	
	public void ResetCheckSuspicious() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(resetCheckSuspicious)).click();
    }
	
	public void AddCheckSuspicious() {
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(checkSuspiciousAddButton);
	}
	
	public String ListOfCheckSuspiciousWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfCheckSuspiciousText)).getText();
    }
	
	public void SearchCheckSuspicious() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchCheckSuspicious)).click();
    }
	
	public void SearchCheckSuspiciousTestCenter() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCheckSuspiciousTestCenter)));
		dropList.selectByValue(dv.GetCZCZUValueOfCenterId());
    }
	
	public void SearchCheckSuspiciousExamFormat() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCheckSuspiciousExamFormat)));
		dropList.selectByValue("1");
    }
	
	public void SearchCheckSuspiciousProductType() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCheckSuspiciousProductType)));
		dropList.selectByValue("1");
    }
	
	public void SearchCheckSuspiciousRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCheckSuspiciousRegion)));
		dropList.selectByValue("2");
    }
	
	public void ModifyFirstClick() {
		Wait(normalTime);
		fc.ModifyFirstClick(driver);
	}	
	
	public void ModifySecondClick() {
		Wait(normalTime);
		fc.ModifySecondClick(driver);
	}	
	
	public void WaitTime(){
		Wait(25000);
	}
	
	public void WaitShotTime() {
		Wait(12000);
	}
}
