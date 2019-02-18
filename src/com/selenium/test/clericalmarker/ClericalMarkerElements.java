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

	//Clerical Marker Task
	public String createCMTask1Button = ".//*[@id='div-datatable-clericalmarkerTask']/input[1]";

	public String createCMTask1TestDateYear = "selectClericalMarkerTestDatefirstYear";

	public String createCMTask1TestDateMonth = "selectClericalMarkerTestDatefirstMonth";

	public String createCMTask1TestDate = "selectClericalMarkerTestDatefirst";

	public String createCMTask1OpenIntervalStart = "clericalmarkertaskOpenstart";

	public String createCMTask1OpenIntervalEnd = "clericalmarkertaskOpenend";

	public String createCMTask1ChooseDay = "//input[@value='"+dv.GetLastFormatSpritString()+"']";

	public String createCMTask1ChooseVenue = "clericalmarkertaskMarkingVenue";

	public String createCMTask1DescriptionForCM = "clericalmarkertaskDescription";

	public String createCMTask1RemarkForStaff = "clericalmarkertaskRemark";
	
	public String searchCMTask = "btnsearchforCM";
	
	public String searchCMTaskRegion = "selectRegionforCM";
	
	public String searchCMTaskTestDateYear = "selectTestDateforCMYear";
	
	public String searchCMTaskTestDateMonth = "selectTestDateforCMMonth";
	
	public String searchCMTaskTestDate = "selectTestDateforCM";
	
	public String searchCMTask1TaskType = "selectTaskTypeforCM";
	
	public String listOfCMTaskText = ".//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String modifyCMTask = ".//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[1]/td[8]/a[1]";
	
	public String modifyCMTask1ChooseVenue = "clericalmarkertaskMarkingVenuemodify";
	
	public String viewCMTask = ".//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[1]/td[8]/a[2]";
	
	public String resultOfViewCMTaskText = "viewclericalmarkerTaskStatus";
	
	public String createCMTask2Button = ".//*[@id='div-datatable-clericalmarkerTask']/input[2]";

	public String createCMTask2TestDateYear = "selectClericalMarkerTestDatesecondYear";

	public String createCMTask2TestDateMonth = "selectClericalMarkerTestDatesecondMonth";

	public String createCMTask2TestDate = "selectClericalMarkerTestDatesecond";
	
	//1st Marking Allocation
	public String searchMarkingAllocation1Region = "cmddlRegion-firstMarking";
	
	public String searchMarkingAllocation1TestDateYear = "cmFirstMarking-Select-Year-Search";
	
	public String searchMarkingAllocation1TestDateMonth = "cmFirstMarking-Select-Month-Search";
	
	public String searchMarkingAllocation1TestDate = "cmddlTestDate-firstMarking";
	
	public String get1stMAOptionList = "function getOptionList() {\r\n" + 
			"  var string = '';\r\n" + 
			"  $('#cmddlTestDate-firstMarking option').each(function () {\r\n" + 
			"    var text = $(this).text(); \r\n" + 
			"    var value = $(this).val(); \r\n" + 
			"    if ($(this).attr('style') == 'color:red')\r\n" + 
			"    string += value + ';';\r\n" + 
			"  });\r\n" + 
			"  return string.substring(0, string.length);\r\n" + 
			"}\r\n" + 
			"return getOptionList();";
	
	public String selectall1stMATC = "cmfirstMarkingTestCenterSelectAll";
	
	public String searchMarkingAllocation1Button = "cmbtnQuery-firstMarking";
	
	public String searchMarkingAllocation1AvailableMarkerText = "cmspanAvailableExaminer-firstMarking";
	
	public String markingAllocation1SelectMarkerText = "cmtxtSelectExaminerNum-firstMarking";
	
	public String markingAllocation1Calculate = "cmbtnCalculate-firstMarking";
	
	public String listOfMarkerNoText = ".//*[@id='cmfirstMaringExaminerListGrid']/div[2]/table/tbody/tr[1]/td[3]";
	
	public String markingAllocation1SetCapacity = ".//*[@id='cmfirstMaringExaminerListGrid']/div[2]/table/tbody/tr[1]/td[14]/a[1]";
	
	public String markingAllocation1NewSetCapacityText = "newCapacitynumber";
	
	//2nd Marking Allocation
	public String searchMarkingAllocation2Region = "cmddlRegion-DoubleMarking";
	
	public String searchMarkingAllocation2TestDateYear = "cmDoubleMarking-Select-Year-Search";
	
	public String searchMarkingAllocation2TestDateMonth = "cmDoubleMarking-Select-Month-Search";
	
	public String searchMarkingAllocation2TestDate = "cmddlTestDate-DoubleMarking";
	
	public String get2ndMAOptionList = "function getOptionList() {\r\n" + 
			"  var string = '';\r\n" + 
			"  $('#cmddlTestDate-DoubleMarking option').each(function () {\r\n" + 
			"    var text = $(this).text(); \r\n" + 
			"    var value = $(this).val(); \r\n" + 
			"    if ($(this).attr('style') == 'color:red')\r\n" + 
			"    string += value + ';';\r\n" + 
			"  });\r\n" + 
			"  return string.substring(0, string.length);\r\n" + 
			"}\r\n" + 
			"return getOptionList();";
	
	public String selectall2ndMATC = "ckb-SelectAll-AvailableMarkers-List-clericalmarkerDoublemarkingallocation";
	
	public String searchMarkingAllocation2Button = "cmbtnQuery-DoubleMarking";

	public String markingAllocation2Calculate = "Calcuator-clericalmarkerDoublemarkingallocation";

	public String markingAllocation2SetCapacity = ".//*[@id='AvailableMarkersListCalcuatorclericalmarkerDoublemarkingallocationGrid']/div[2]/table/tbody/tr[1]/td[8]/input";
	
	public String markingAllocation2SelectMarkerText = "txt-Set-Capacity-AvailableMarkersListCalcuatorclericalmarkerDoublemarkingallocationGrid";
	
	public String listOf2ndMarkerNoText = ".//*[@id='AvailableMarkersListCalcuatorclericalmarkerDoublemarkingallocationGrid']/div[2]/table/tbody/tr[1]/td[2]";
	
	//2nd Marking Allocation
	public String ListOf2ndMarkerNoWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOf2ndMarkerNoText)).getText();
	}
	
	public void inputMarkingAllocation2SelectMarker() {
		WaitElementVisible(driver, By.id(markingAllocation2SelectMarkerText)).clear();
		WaitElementVisible(driver, By.id(markingAllocation2SelectMarkerText)).sendKeys("100");
	}
	
	public void MarkingAllocation2SetCapacity() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(markingAllocation2SetCapacity)).click();
	}
	
	public void MarkingAllocation2Calculate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(markingAllocation2Calculate)).click();
	}
	
	public void Selectall2ndMATC() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectall2ndMATC)).click();
	}
	
	public void SearchMarkingAllocation2() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchMarkingAllocation2Button)).click();
	}
	
	public String Get2ndMAOptionList() {
		Wait(normalTime);
		String redTestDate = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getMAOptionList = (String)js.executeScript(get2ndMAOptionList);
		String[] maOptionList = getMAOptionList.split(";");
		redTestDate = maOptionList[0];
		return redTestDate;
	}
	
	public void SearchMarkingAllocation2Region() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation2Region)));
		dropList.selectByValue("2");
	} 
	
	public void SearchMarkingAllocation2TestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation2TestDateYear)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentYear()) - 1));
	} 
	
	public void SearchMarkingAllocation2TestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation2TestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	} 
	
	public void SearchMarkingAllocation2TestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation2TestDate)));
		dropList.selectByValue(Get2ndMAOptionList());
	} 
		
	//1st Marking Allocation
	public void InputMarkingAllocation1NewSetCapacity() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(markingAllocation1NewSetCapacityText)).clear();
		WaitElementVisible(driver, By.id(markingAllocation1NewSetCapacityText)).sendKeys("100");
	}
	
	public void MarkingAllocation1SetCapacity() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(markingAllocation1SetCapacity)).click();
	}
	
	public String ListOfMarkerNoWarning() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfMarkerNoText)).getText();
	}
	
	public void MarkingAllocation1Calculate() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(markingAllocation1Calculate)).click();
	}
	
	public String MarkingAllocation1AvailableMarker() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.id(searchMarkingAllocation1AvailableMarkerText)).getText();
	}
	
	public void inputMarkingAllocation1SelectMarker() {
		WaitElementVisible(driver, By.id(markingAllocation1SelectMarkerText)).clear();
		WaitElementVisible(driver, By.id(markingAllocation1SelectMarkerText)).sendKeys(MarkingAllocation1AvailableMarker());
	}
	
	public void SearchMarkingAllocation1() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchMarkingAllocation1Button)).click();
	}
	
	public void Selectall1stMATC() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(selectall1stMATC)).click();
	}
	
	public String Get1stMAOptionList() {
		Wait(normalTime);
		String redTestDate = null;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String getMAOptionList = (String)js.executeScript(get1stMAOptionList);
		String[] maOptionList = getMAOptionList.split(";");
		redTestDate = maOptionList[0];
		return redTestDate;
	}
	
	
	public void SearchMarkingAllocation1Region() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation1Region)));
		dropList.selectByValue("2");
	} 
	
	public void SearchMarkingAllocation1TestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation1TestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	} 
	
	public void SearchMarkingAllocation1TestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation1TestDateMonth)));
		dropList.selectByIndex(Integer.parseInt(dv.getCurrentMonth()) - 1);
	} 
	
	public void SearchMarkingAllocation1TestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchMarkingAllocation1TestDate)));
		dropList.selectByValue(Get1stMAOptionList());
	} 
	
	
	//Clerical Marker Task
	public void CreateCMTask2SelectTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMTask2TestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	} 
	
	public void CreateCMTask2SelectTestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMTask2TestDateMonth)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentMonth())));
	} 
	
	public void CreateCMTask2SelectTestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMTask2TestDate)));
		dropList.selectByValue(dv.GetLastTestDateID());
	} 
	
	public void CreateCMTask2() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMTask2Button)).click();
		Wait(6000);
	} 
	
	public String ResultOfViewCMTaskText() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.id(resultOfViewCMTaskText)).getText();
	}
	
	public void ViewCMTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(viewCMTask)).click();
		Wait(4000);
	}
	
	public void ModifyCMTask1ChooseVenue() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(modifyCMTask1ChooseVenue)).clear();
		WaitElementVisible(driver, By.id(modifyCMTask1ChooseVenue)).sendKeys(cmi.ModifyChooseVenueForTask);
	} 
	
	public void ModifyCMTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(modifyCMTask)).click();
		Wait(4000);
	}
	
	public String ListOfCMTask() {
		Wait(normalTime);
		return WaitElementVisible(driver, By.xpath(listOfCMTaskText)).getText();
	}
	
	public void SearchCMTaskSelectRegion() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCMTaskRegion)));
		dropList.selectByValue("2");
	} 
	
	public void SearchCMTaskSelectTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCMTaskTestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	} 
	
	public void SearchCMTaskSelectTestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCMTaskTestDateMonth)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentMonth())));
	} 
	
	public void SearchCMTaskSelectTestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCMTaskTestDate)));
		dropList.selectByValue(dv.GetLastTestDateID());
	} 
	
	public void SearchCMTask2SelectTaskType() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCMTask1TaskType)));
		dropList.selectByValue(dv.Get2ndMarker());
	} 
	
	public void SearchCMTask1SelectTaskType() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(searchCMTask1TaskType)));
		dropList.selectByValue(dv.Get1stMarker());
	} 
	
	public void SearchCMTask() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(searchCMTask)).click();
	} 
	
	public void CreateCMTask1() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMTask1Button)).click();
		Wait(6000);
	} 
	
	public void CreateCMTask1SelectTestDateYear() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMTask1TestDateYear)));
		dropList.selectByValue(dv.getCurrentYear());
	} 
	
	public void CreateCMTask1SelectTestDateMonth() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMTask1TestDateMonth)));
		dropList.selectByValue(String.valueOf(Integer.parseInt(dv.getCurrentMonth())));
	} 
	
	public void CreateCMTask1SelectTestDate() {
		Wait(normalTime);
		Select dropList = new Select(WaitElementVisible(driver, By.id(createCMTask1TestDate)));
		dropList.selectByValue(dv.GetLastTestDateID());
	} 
	
	public void CreateCMTask1OpenIntervalStart() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMTask1OpenIntervalStart)).clear();
		WaitElementVisible(driver, By.id(createCMTask1OpenIntervalStart)).sendKeys(dv.GetFormatSpritString());
	} 
	
	public void CreateCMTask1OpenIntervalEnd() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMTask1OpenIntervalEnd)).clear();
		WaitElementVisible(driver, By.id(createCMTask1OpenIntervalEnd)).sendKeys(dv.GetLastFormatSpritString());
	} 
	
	public void CreateCMTask1ChooseDay() {
		Wait(normalTime);
		WaitElementVisible(driver, By.xpath(createCMTask1ChooseDay)).click();
	} 
	
	public void CreateCMTask1ChooseVenue() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMTask1ChooseVenue)).clear();
		WaitElementVisible(driver, By.id(createCMTask1ChooseVenue)).sendKeys(cmi.ChooseVenueForTask);
	} 
	
	public void CreateCMTask1DescriptionForCM() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMTask1DescriptionForCM)).clear();
		WaitElementVisible(driver, By.id(createCMTask1DescriptionForCM)).sendKeys(cmi.DescriptionForTask);
	} 
	
	public void CreateCMTask1RemarkForStaff() {
		Wait(normalTime);
		WaitElementVisible(driver, By.id(createCMTask1RemarkForStaff)).clear();
		WaitElementVisible(driver, By.id(createCMTask1RemarkForStaff)).sendKeys(cmi.RemarkForStaffTask);
	} 
	
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

}
