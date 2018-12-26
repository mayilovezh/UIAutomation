package com.selenium.test.clericalmarker;


import com.selenium.test.brower.Mis2Brower;
import com.selenium.test.utils.DynamicVariables;
import com.selenium.test.utils.FirstClick;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class ClericalMarkerElements extends Mis2Brower{
	
	FirstClick fc = new FirstClick();
	
	DynamicVariables dv = new DynamicVariables();
	
	ClericalMarkerInputData cmi = new ClericalMarkerInputData();
	
	public void OpenBrower(String MenueName,int MenueLocation) {
		driver = Login(MenueName,MenueLocation);
	}

	//Clerical Marker Profile
	public String createClericalMarkerButton = "addclericalmarker";
	
	public String createCMGivenNameEn = "addclericalmarkergivennameen";
	
	public String createCMFamilyNameEn = "addclericalmarkerfamilynameen";
	
	public String createCMGivenNameCn = "addclericalmarkergivennamecn";
	
	public String createCMFamilyNameCn = "addclericalmarkerfamilynamecn";
	
	public String createCMIDTypeRadio = "addclericalmarkerpassport";
	
	public String createCMPassportNumber = "addclericalmarkerIdNumber";
	
	public String createCMBirthday = "addclericalmarkerbirthday";
	
	public String createCMGenderRadio= "addclericalmarkermale";
	
	public String createCMMobileNo = "addclericalmarkerMobile";
	
	public String createCMTelephone = "addclericalmarkerTelephone";
	
	public String createCMEmail = "addclericalmarkerEmail";
	
	public String createCMBackUpPhone = "addclericalmarkerBackUpPhone";
	
	public String createCMNationality = "addclericalmarkercountry";
	
	public String createCMBaseCity = "addclericalmarkerProvince";
	
	public String createCMBaseCityDistrict = "addclericalmarkerBaseCity";
	
	public String createCMStatus = "addclericalmarkerStatus";
	
	public String createCMRolesButton = ".//*[@id='ClericalMarkerForm']/table[3]/tbody/tr[3]/td/div/div/input";

	public String createCMSelect1stRoles = ".//ul[@id='addclericalmarkerRoles_listbox']/li[1]";

	public String createCMSelect2ndRoles = ".//ul[@id='addclericalmarkerRoles_listbox']/li[2]";

	public String searchCMGivenNameEn = "CMtxtGivenNameEn";
	
	public String searchCMButton = "btnCMSearch";
	
	public String listOfCMGivenNameEnText = ".//*[@id='ClericalMarkerGrid']/div[2]/table/tbody/tr[1]/td[4]";
	
	public String listOfCMModifyButton = ".//*[@id='ClericalMarkerGrid']/div[2]/table/tbody/tr[1]/td[10]/a[2]";

	public String cmModifyPasswordButton = ".//*[@id='viewmodifyClericalmarkerDialog']/table/tbody/tr[2]/td/input[1]";
	
	public String cmModifyPinCodeButton = ".//*[@id='viewmodifyClericalmarkerDialog']/table/tbody/tr[2]/td/input[2]";
	
	public String cmModifyPasswordText = "clericalmarkernewpwd";
	
	public String cmModifyPinCodeText = "clericalmarkerewPincode";
	
	public String listOfCMTransferButton = ".//*[@id='ClericalMarkerGrid']/div[2]/table/tbody/tr[1]/td[10]/a[1]";

	public String cmTransferOfSelectToTransfer = "RegionforClericalMarkerTransfer";

	public String cmTransferOfSelectProvice = "ClericalMarkerTransferProvince";

	public String cmTransferOfSelectCity = "ClericalMarkerTransferCityList";

	//Clerical Marker Profile
	public void CmTransferOfSelectCity() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(cmTransferOfSelectCity)));
		dropList.selectByValue(dv.GetCityOfDistrict());
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void CmTransferOfSelectProvice() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(cmTransferOfSelectProvice)));
		dropList.selectByValue(dv.GetCity());
	}
	
	public void CmTransferOfSelectToTransfer() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(cmTransferOfSelectToTransfer)));
		dropList.selectByValue("2");
	
	}
	
	public void ListOfCMTransfer() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(listOfCMTransferButton)).click();
		Wait(6000);
	}
	
	public void inputCmModifyPassword() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(cmModifyPasswordText)).clear();
		WaitElementVisible(driver, By.id(cmModifyPasswordText)).sendKeys(cmi.ModifyPassword);
	}
	
	public void inputCmModifyPinCode() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(cmModifyPinCodeText)).clear();
		WaitElementVisible(driver, By.id(cmModifyPinCodeText)).sendKeys(cmi.ModifyPinCode);
	}
	public void CmModifyPinCode() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(cmModifyPinCodeButton)).click();
	}
	
	public void CmModifyPassword() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(cmModifyPasswordButton)).click();
	}
	
	public void ListOfCMModify() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(listOfCMModifyButton)).click();
	}
	
	public String ListOfCMGivenNameEnWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfCMGivenNameEnText)).getText();
	}
	
	public void ClericalMarkerSearch() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchCMButton)).click();
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void ShortWaitTime(){
		Wait(6000);
	}
	
	public void WaitTime(){
		Wait(25000);
	}
	
	public void SearchClericalMarkerGivenNameEn() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchCMGivenNameEn)).clear();
		WaitElementVisible(driver, By.id(searchCMGivenNameEn)).sendKeys(cmi.givenNameEn);
	}
	
	public void ClericalMarkerCreateButton() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createClericalMarkerButton)).click();
		Wait(6000);
	}
	
	public void ClericalMarkerCreateGivenNameEn() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMGivenNameEn )).clear();
		WaitElementVisible(driver, By.id(createCMGivenNameEn )).sendKeys(cmi.givenNameEn);
	}
	
	public void ClericalMarkerCreateFamilyNameEn() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMFamilyNameEn)).clear();
		WaitElementVisible(driver, By.id(createCMFamilyNameEn)).sendKeys(cmi.familyNameEn);
	}
	
	public void ClericalMarkerCreateGivenNameCn() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMGivenNameCn)).clear();
		WaitElementVisible(driver, By.id(createCMGivenNameCn)).sendKeys(cmi.givenNameCn);
	}
	
	public void ClericalMarkerCreateFamilyNameCn() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMFamilyNameCn)).clear();
		WaitElementVisible(driver, By.id(createCMFamilyNameCn)).sendKeys(cmi.familyNameCn);
	}
	
	public void ClericalMarkerCreateIDTypeRadio() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMIDTypeRadio)).click();
	}
	
	public void ClericalMarkerCreatePassportNumber() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMPassportNumber)).clear();
		WaitElementVisible(driver, By.id(createCMPassportNumber)).sendKeys(cmi.passportNumber);
	}
	
	public void ClericalMarkerCreateBirthday() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMBirthday)).clear();
		WaitElementVisible(driver, By.id(createCMBirthday)).sendKeys(cmi.dateBirth);
	}
	
	public void ClericalMarkerCreateGenderRadio() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMGenderRadio)).click();
	}
	
	public void ClericalMarkerCreateMobileNo() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMMobileNo)).clear();
		WaitElementVisible(driver, By.id(createCMMobileNo)).sendKeys(cmi.mobile);
	}
	
	public void ClericalMarkerCreateTelephone() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMTelephone)).clear();
		WaitElementVisible(driver, By.id(createCMTelephone)).sendKeys(cmi.mobile);
	}
	
	public void ClericalMarkerCreateMail() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMEmail)).clear();
		WaitElementVisible(driver, By.id(createCMEmail)).sendKeys(cmi.email);
	}
	
	
	public void ClericalMarkerCreateBackUpPhone() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMBackUpPhone)).clear();
		WaitElementVisible(driver, By.id(createCMBackUpPhone)).sendKeys(cmi.mobile);
	}
	
	public void ClericalMarkerCreateNationality() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMNationality)));
		dropList.selectByValue(dv.GetCountryOfChina());
	}
	
	public void ClericalMarkerCreateBaseCity() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMBaseCity)));
		dropList.selectByValue(dv.GetCity());
		Wait(normalTime);
		Wait(normalTime);
		Wait(normalTime);
	}
	
	public void ClericalMarkerCreateBaseCityDistrict() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMBaseCityDistrict)));
		dropList.selectByValue(dv.GetCityOfDistrict());
	}
	
	public void ClericalMarkerCreateStatus() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMStatus)));
		dropList.selectByValue(dv.GetClericalMarkerStatus());
	}
	
	public void ClericalMarkerCreateSelectRoles() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMRolesButton)).click();
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMSelect1stRoles)).click();
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMRolesButton)).click();
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMSelect2ndRoles)).click();
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
