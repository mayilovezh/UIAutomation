package com.selenium.test.security;

import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import com.selenium.test.brower.Mis2Brower;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
	
	//Suspicious List
	public String getSuspiciousListLength = "function getSuspiciousLevelLength() {\r\n" + 
			"  var levelLength = document.getElementsByName('checkSuspiciousLevel').length;\r\n" + 
			"  return levelLength\r\n" + 
			"}\r\n" + 
			"return getSuspiciousLevelLength()\r\n" + 
			"";
	
	public String suspiciousListUpdateButton = ".//*[@id='girdSuspicious_candidateList']/div[2]/table/tbody/tr[1]/td[20]/input[1]";
	
	public String suspiciousListViewLogButton = ".//*[@id='girdSuspicious_candidateList']/div[2]/table/tbody/tr[1]/td[20]/input[2]";
	
	public String suspiciousListSearchButton = "btnSuspiciousQuery";
	
	public String inputSuspiciousListRemark = "areaSuspiciousRemark";

	public String suspiciousListViewLogText = ".//*[@id='suspicious-modifylog-table']/tbody/tr/td[2]";
	
	public String listOfSuspiciousListText = ".//*[@id='girdSuspicious_candidateList']/div[2]/table/tbody/tr[1]/td[2]";
	
	public String suspiciousListResetButton = "btnSuspiousReset";
	
	public String resetListOfSuspiciousListWarning = ".//*[@id='girdSuspicious_candidateList']/div[2]/table/tbody/tr/td";
	
	public String suspiciousListViewButton = ".//*[@id='girdSuspicious_candidateList']/div[2]/table/tbody/tr[1]/td[10]/a";
	
	public String suspiciousListViewText = ".//*[@id='chinaAppList']/tbody/tr[2]/td";
	
	//Suspicious List
	public String SuspiciousListViewWarning() {
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(suspiciousListViewText)).getText();
	}
	
	public void ViewSuspiciousList() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(suspiciousListViewButton)).click();
	}
	
	public String ResetListOfSuspiciousListWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(resetListOfSuspiciousListWarning)).getText();
	}
	
	public void ResetSuspiciousList() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(suspiciousListResetButton)).click();
	}
	
	public String ListOfSuspiciousListWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfSuspiciousListText)).getText();
	}
	
	public String SuspiciousListViewLogWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(suspiciousListViewLogText)).getText();
	}
	
	public void ViewLogSuspiciousList() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(suspiciousListViewLogButton)).click();
	}
	
	public void InputSuspiciousListRemark() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(inputSuspiciousListRemark)).clear();
		WaitElementVisible(driver, By.id(inputSuspiciousListRemark)).sendKeys(si.ModifySuspiciousCandidateRemarkText);
	}
	
	public void WindowsAlertConfirm() {
		Wait(normalTime);
		driver.switchTo().alert().accept();
	}
	
	public void UpdateSuspiciousList() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(suspiciousListUpdateButton)).click();
	}
	
	public void SearchSuspiciousList() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(suspiciousListSearchButton)).click();
	}
	
	public int GetSuspiciousLevelLength() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Long i = (Long)js.executeScript(getSuspiciousListLength);
		Integer suspiciousLevelLength = new Integer(String.valueOf(i));
		return suspiciousLevelLength;
	}
	
	public void ClickSuspiciousListUpdateView(int i) {
		SearchSuspiciousList();
		Wait(6000);
		UpdateSuspiciousList();
		WindowsAlertConfirm();
		InputSuspiciousListRemark();
		Wait(normalTime);
		ModifySaveClick();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		ViewLogSuspiciousList();
		Wait(normalTime);
		Assert.assertEquals(SuspiciousListViewLogWarning(), SuspiciousListViewLogWarning());
		ModifySaveClick();
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByName('checkSuspiciousLevel').item("+i+").click()");
		
	}
	
	
	public void InitSuspiciousListSelect() {
		for(int i =0; i<GetSuspiciousLevelLength(); i++) {
			boolean isSeleted = WaitElementVisible(driver, By.xpath(".//*[@id='span-suspiciousLevel']/label["+(i+1)+"]/input")).isSelected();
			if(isSeleted) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByName('checkSuspiciousLevel').item("+i+").click()");
			}
		}
	}
	
	public void SelectSuspiciousListUpdateView() {
		for(int i =0; i<GetSuspiciousLevelLength(); i++) {
			boolean isSeleted = WaitElementVisible(driver, By.xpath(".//*[@id='span-suspiciousLevel']/label["+(i+1)+"]/input")).isSelected();
			if(isSeleted==false) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementsByName('checkSuspiciousLevel').item("+i+").click()");
				ClickSuspiciousListUpdateView(i);
				continue;
			}
		}
	}
	
	
	
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
