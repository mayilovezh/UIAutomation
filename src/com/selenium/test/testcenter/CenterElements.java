package com.selenium.test.testcenter;

import org.testng.annotations.Test;

import com.selenium.test.brower.Mis2Brower;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CenterElements extends Mis2Brower{

	public void openBrower(String menueName,int menueLocation) {
		driver = login(menueName,menueLocation);
	}
	
	public String dataProtectionText = "dataProtection";
	
	public String inComeBusinessPartnerGlobalText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[2]/div/div[1]/div/input";

	public String inComeCustomerNameText = "customerName";

	public String CompanyCodeText = "companyCodeId";
	
	public String inComeMiscellaneousOriginalOfficeText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[1]/div/div[6]/div/select/option[@label='Beijing']";

	public String paymentOriginalOfficeButton = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[1]/div/div[5]/div/select";

	public String StartDateText = "startDate";

	public String EndDateText = "endDate";

	public String BCTemplate = "isBcContractTemplate";
	
	public String ENCNVersion = "languageId";
	
	public String Currency = "currencyId";
	
	public String TotalValueContractText = "totalContractAmountInRmb";
	
	public String ResponsibleDeptHeadText = "reviewer";
		
	public String DelegatedAuthorityButton = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[5]/div[3]/div/div[1]/div/div/div[1]/span";
	
	public String DelegatedAuthorityText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[5]/div[3]/div/div[1]/div/div/input[1]";
	
	public String contractDescriptionText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[6]/div/div/div[1]/div/textarea";

	public String commentsText = "comments";
	
	public String UploadContractButton = ".//*[@id='ContractCentre-Iniation']/div/table/tbody/tr[2]/td[3]/upload-file/button";
	
	public String saveButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[1]/form/div[1]/div/div[3]/div/div[1]/button";

	public String SubmitButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[1]/form/div[1]/div/div[3]/div/div[2]/button";
	
	public String ContractLocationText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[1]/div/div[5]/div[1]/div/select";
	
	public String CategoryLevel1Text = "categoryLevel1Id";

	public String CategoryLevel2Text = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[2]/div[3]/div/div[1]/div/tooltip/tip-cont/div/select/option[@label='Advertising']";

	public String SapVendorNoButton = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[2]/div/div[2]/div[1]/div/div[1]/span";
	
	public String SapVendorNoText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[2]/div/div[2]/div[1]/div/input[1]";
	
	public String goodsServiceText = "goodsOrService";
	
	public String foreignExchangeTransactionButton = "isForeignExchangeTransaction";
	
	public String resultEditeText = ".//*[@id='toast-container']/div/div/div/div";
	
	public String ContractTypeLevel2Button = "contractTypeLevel2";
	
	public String ICOButton = "intercompany";
	
	public String supportingDocumentsUploadFileButton = ".//*[@id='SupportingDocuments-Iniation']/div/div[1]/div/upload-file/button";
	
	public String paymentSaveButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[1]/form/div[1]/div/div[4]/div/div[1]/button";

	public String paymentSubmitButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[1]/form/div[1]/div/div[4]/div/div[2]/button";
	
	public String contractCentreUploadFileButton = ".//*[@id='ContractCentre-Iniation']/div/table/tbody/tr[2]/td[3]/upload-file/button";
	
	public String contractManagementAddContractButton = "html/body/div[1]/div[2]/contract-list/section/form/div/div[3]/div/div[3]/a"; 
	
	public String informationCompanyCodeButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[1]/div[1]/div/select";
	
	public String informationVendorNoButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[2]/div/div[1]/div[1]/div/div/div[1]/span";
	
	public String informationVendorNoText = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[2]/div/div[1]/div[1]/div/div/input[1]";
	
	public String informationDepartmentButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[3]/div[2]/button";
	
	public String informationContractCreatorButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[4]/div[1]/div/div/div[1]/span";
	
	public String informationContractCreatorText = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[4]/div[1]/div/div/input[1]";
	
	public String informationContractLocationButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[5]/div[1]/div/select";
	
	public String informationOriginalOfficeButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[6]/div/select"; 
	
	public String informationContractNoText = ".//*[@id='ContractBody-Information']/validation-form/div[1]/div[1]/div/div[1]/div/input";
	
	public String informationContractTypeLevel2Button = ".//*[@id='ContractBody-Information']/validation-form/div[1]/div[2]/div/div[1]/div/tooltip/tip-cont/div/select";
	
	public String informationICOButton = ".//*[@id='ContractBody-Information']/validation-form/div[2]/div[1]/div/div[1]/div/select";
	
	public String informationBritishCouncilTemplateButton = ".//*[@id='ContractBody-Information']/validation-form/div[2]/div[2]/div/div[1]/div/select";
	
	public String informationENCNVersionButton = ".//*[@id='ContractBody-Information']/validation-form/div[2]/div[3]/div/div[1]/div/select";
	
	public String informationGoodsServiceButton = ".//*[@id='ContractBody-Information']/validation-form/div[3]/div[1]/div/div[1]/div/select";
	
	public String informationCategoryLevel1Button = ".//*[@id='ContractBody-Information']/validation-form/div[3]/div[2]/div/div[1]/div/tooltip/tip-cont/div/select";
	
	public String informationCategoryLevel2Button = ".//*[@id='ContractBody-Information']/validation-form/div[3]/div[3]/div/div[1]/div/tooltip/tip-cont/div/select";
	
	public String informationCurrencyButton = ".//*[@id='ContractBody-Information']/validation-form/div[4]/div[1]/div/div[1]/div/select";
	
	public String informationTotalValueText = ".//*[@id='ContractBody-Information']/validation-form/div[4]/div[2]/div/div[1]/div/input";
	
	public String informationForeignExchangeTransactionButton = ".//*[@id='ContractBody-Information']/validation-form/div[4]/div[3]/div/div[1]/div/select";
	
	public String informationIssuedDateText = ".//*[@id='ContractBody-Information']/validation-form/div[5]/div[1]/div/div[1]/div/input";
	
	public String informationStartDateText = ".//*[@id='ContractBody-Information']/validation-form/div[5]/div[2]/div/div[1]/div/input";
	
	public String informationEndDateText = ".//*[@id='ContractBody-Information']/validation-form/div[5]/div[3]/div/div[1]/div/input";
	
	public String informationDaysofTerminationButton = ".//*[@id='ContractBody-Information']/validation-form/div[6]/div[1]/div/div[1]/div/select";
	
	public String informationPaymentDetailsText = ".//*[@id='ContractBody-Information']/validation-form/div[6]/div[3]/div/div/tooltip/tip-cont/div/input";
	
	public String resultContractLocationText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[1]/div/div[5]/div[1]/label/tooltip";
	
	public String resultOriginalOfficeText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[1]/div/div[6]/label/tooltip";
	
	public String resultTotalValueText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[3]/div[2]/div/div[1]/label/tooltip";
	
	public String resultDataProtectionText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[5]/div[1]/div/div[1]/label/tooltip";
	
	public String resultResponsibleDepartmentHeadText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[5]/div[2]/div/div[1]/label/tooltip";
	
	public String resultDelegatedAuthorityText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[5]/div[3]/div/div[1]/label/a/tooltip";
	
	public String resultDelegatedAuthorityAlinkText = ".//*[@id='ContractBodyInformation-Iniation']/div[2]/validation-form/div[5]/div[3]/div/div[1]/label/a";
	
	public String inputRequired = "//input[@aria-invalid='true']";
	
	public String selectRequired = "//select[@aria-invalid='true']";
	
	public String resultPaymentOriginalOfficeText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[1]/div/div[5]/label/tooltip";

	public String contractManagementIncomeTypeSearchText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/div[1]/select";
	
	public String contractSearchButton = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/div[4]/div[1]/button";
	
	public String inputContractSearchVendorNameText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/tooltip[5]/tip-cont/div/input";
	
	public String resultContractSearchListVendorNameText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[4]/div/table/tbody/tr[1]/td[5]/tooltip/tip-cont/div";
	
	public String resultContractSearchVendorNameText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/tooltip[5]/tip-cont/div/input";
	
	public String contractResetButton = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/div[4]/div[1]/button";
	
	public String resultContractNoText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[4]/div/table/tbody/tr[1]/td[2]/tooltip/tip-cont/div/a";
	
	public String informationFrameworkPOButton = ".//*[@id='ContractBody-Information']/validation-form/div[7]/div[1]/div/div/select";
	
	public String informationDataProtectionButton = ".//*[@id='ContractBody-Information']/validation-form/div[7]/div[2]/div/div[1]/div/select";
	
	public String informationDelegatedAuthorityButton = ".//*[@id='ContractBody-Information']/validation-form/div[7]/div[3]/div/div[1]/div/div/div[1]/span";
	
	public String informationDelegatedAuthorityText = ".//*[@id='ContractBody-Information']/validation-form/div[7]/div[3]/div/div[1]/div/div/input[1]";
	
	public String informationBiddingThresholdButton = ".//*[@id='ContractBody-Information']/validation-form/div[8]/div[1]/div/div[1]/div/tooltip/tip-cont/div/select";
	
	public String informationSourcingReferenceCodeText = ".//*[@id='ContractBody-Information']/validation-form/div[8]/div[2]/div/div/input";
	
	public String informationContractDescriptionText = ".//*[@id='ContractBody-Information']/validation-form/div[9]/div/div/div[1]/div/div/textarea"; 
	
	public String informationItemsGoodsServiceButton  = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[1]/div[2]/div[1]/select";
	
	public String informationItemsItemDescriptionText  = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[1]/div[3]/div[1]/div/input";
	
	public String informationItemsItemStartDateText = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[1]/div[4]/div[1]/input";
	
	public String informationItemsItemEndDateText= ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[1]/div[5]/div[1]/input";
	
	public String informationItemsCategoryNoText = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[2]/div[1]/input";
	
	public String informationItemsMaterialGroupText = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[2]/div[6]/div[1]/tooltip/tip-cont/div/select";
	
	public String informationItemsQuantityText = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[3]/div[1]/input";
	
	public String informationItemsUnitofMeasurementButton = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[3]/div[2]/select";
	
	public String informationItemsUnitPriceText = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[3]/div[3]/input";
	
	public String informationItemsTotalValueitemText = ".//*[@id='ContractItem-Information']/ul/li/div[1]/validation-form/div/div[3]/div[6]/input";
	
	public String informationSaveButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[2]/form/div/div[2]/div[3]/div[1]/button[2]";
	
	public String resultText = ".//*[@id='toast-container']/div/div/div/div";
	
	public String searchContractDescriptionText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/tooltip[4]/tip-cont/div/input";
	
	public String resultListStatusText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[4]/div/table/tbody/tr[1]/td[12]";
	
	public String informationChooseFileButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[2]/form/div/div[2]/div[2]/div[2]/upload-file/button";
	
	public String contractManagementListDetailsButton = "html/body/div[1]/div[2]/contract-list/section/form/div/div[4]/div/table/tbody/tr[1]/td[13]/p[1]/a";
	
	public String contractManagementLegalCommentsText = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[1]/form/div[2]/div/div[2]/div[3]/div[4]/textarea";
	
	public String contractManagementApproveButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[1]/form/div[2]/div/div[3]/div/button[1]";
	
	public String resultInitiationContractStatusText = "html/body/div[1]/div[2]/contract/section/div[1]/ul/li[4]/div/span[3]";
	
	public String uploadFinalContractButton = ".//*[@id='ContractCentre-Iniation']/div[1]/table/tbody/tr[7]/td[3]/upload-file/button";
	
	public String resultPaymentChinaContractPortalText = ".//*[@id='ContractCentre-Iniation']/div[2]/h5/a";

	public String resultPaymentVisitProcurementLinkText = ".//*[@id='SupportingDocuments-Iniation']/div/div[2]/h5/a";

	public String resultPaymentSearchVendorText = ".//*[@id='GeneralInformation-Iniation']/div/validation-form/div[2]/div/div[2]/label/a/tooltip";
	
	public String paymentConfirmButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[2]/form/div/div[2]/div[3]/div[1]/button[1]";
	
	public String informationContractTypeLevel3Button = ".//*[@id='ContractBody-Information']/validation-form/div[1]/div[3]/div/div/tooltip/tip-cont/div/select";
	
	public String isSelectSupportingDocumentsText = ".//*[@id='SupportingDocuments-Iniation']/div/div[1]/label[1]/input"; 
	
	public String contractCentreUploadFileNumberJs = "function getFileNumber(){var fileNumber = document.getElementsByTagName('tbody').item(0).getElementsByTagName('tr').length; return fileNumber };return getFileNumber()";
	
	public String listCopyButton = "html/body/div[1]/div[2]/contract-list/section/form/div/div[4]/div/table/tbody/tr[1]/td[13]/p[2]/a";
	
	public String contractCopySaveButton = "html/body/div[1]/div[2]/contract-list/section/div/div/div[3]/button[1]";
	
	public String copyContractNoText = "html/body/div[1]/div[2]/contract-list/section/div/div/div[2]/div/div/div/input";
	
	public String contractCopyCancelButton = "html/body/div[1]/div[2]/contract-list/section/div/div/div[3]/button[2]";
	
	public String contractCopyCancelConfirmButton = ".//*[@id='toast-container']/div/div/div/div/p/button";
	
	public String resultNotDataText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[4]/div/ng-table-no-results-message/div";
	
	public String searchContractNoText = "html/body/div[1]/div[2]/contract-list/section/form/div/div[2]/div/tooltip[3]/tip-cont/div/input";
	
	public String getDepartmentLengthText = "function depLength(){var depLen = document.getElementsByName('departments').item(0).getElementsByTagName('div').item(0).getElementsByClassName('ng-scope').length; return deplen}; return depLength()";
	
	public String getDepartmentListText = "function getDepItem(){var depItem = document.getElementsByName('departments').item(0).getElementsByTagName('div').item(0).getElementsByClassName('ng-scope').item(0).innerText; return depItem}; return getDepItem()";
	
	public String historyTabButton = "html/body/div[1]/div[2]/contract/section/div[1]/ul/li[3]/a";
	
	public String historyCurrentDataText = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[3]/form/div/div[1]/table/tbody/tr[1]/td[7]";
	
	public String resultInformationContractNoText = "function getContractNo(){var contractNo = document.getElementsByName('contractCode').item(0).value;return contractNo}; return getContractNo()";
	
	public String resultHistoryCompanyCodeText = "function getCompanyCode(){var getCompanyCode= document.querySelector('select[name=companyCodeId] option[selected]').getAttribute('label'); return getCompanyCode}; return getCompanyCode()";
	
	public String resultHistoryContractCreatorText = "function getCreator(){var creator = document.getElementsByName('creator').item(1).innerText; return creator};return getCreator()";
	
	public String moveHistoryDepartmentButton = ".//*[@id='ContractParties-Information']/div/div/validation-form/div[1]/div/div[3]/div[1]/div/div[1]/span/span[1]/span/span[1]";
	
	public String resultHistoryContractLocationText = "function getCompanyCode(){var getCompanyCode= document.querySelector('select[name=companyCodeId] option[selected]').getAttribute('label'); return getCompanyCode}; return getCompanyCode()";
	
	public String resultHistoryOriginalOfficeText = "function getCompanyCode(){var getCompanyCode= document.querySelector('select[name=companyCodeId] option[selected]').getAttribute('label'); return getCompanyCode}; return getCompanyCode()";
	
	public String resultInformationContractTypeLevel2Text = "function getContractTypeLevel2(){var getContractTypeLevel2= document.querySelector('select[name=companyCodeId] option[selected]').getAttribute('label'); return getContractTypeLevel2}; return getContractTypeLevel2()";
	
	public String resultInformationIntercompanyText = "function getIntercompany(){var getIntercompany= document.querySelector('select[name=intercompany] option[selected]').text; return getIntercompany}; return getIntercompany()";
	
	public String resultInformationBritishCouncilTemplateText = "function getTemplate(){var getTemplate= document.querySelector('select[name=isBcContractTemplate] option[selected]').text; return getTemplate}; return getTemplate()";
	
	public String resultInformationENCNVersionText = "function getENCNVersion(){var getENCNVersion= document.querySelector('select[name=languageId] option[selected]').text; return getENCNVersion}; return getENCNVersion()";
	
	public String resultInformationGoodsServiceText = "function getGoodsService(){var getGoodsService= document.querySelector('select[name=goodsOrService] option[selected]').text; return getGoodsService}; return getGoodsService()";
	
	public String resultInformationCurrencyText = "function getCurrency(){var getCurrency = document.querySelector('select[name=currencyId] option[selected]').text; return getCurrency}; return getCurrency()";
	
	public String resultInformationForeignExchangeTransactionText = "function getForeignExchangeTransaction(){var getForeignExchangeTransaction = document.querySelector('select[name=isForeignExchangeTransaction] option[selected]').text; return getForeignExchangeTransaction}; return getForeignExchangeTransaction()";
	
	public String resultInformationTotalValueText = "function getTotalValue(){var TotalValue = document.getElementsByName('totalContractAmountInRmb').item(1).value;return TotalValue}; return getTotalValue()";
	
	public String resultInformationIssuedDateText = "function getIssuedDate(){var IssuedDate = document.getElementsByName('issuedDate').item(0).value;return IssuedDate}; return getIssuedDate()";
	
	public String resultInformationStartDateText = "function getStartDate(){var StartDate = document.getElementsByName('startDate').item(0).value;return StartDate}; return getStartDate()";
	
	public String resultInformationDaysofTerminationText = "function getStartDate(){var StartDate = document.getElementsByName('startDate').item(0).value;return StartDate}; return getStartDate()";
	
	public String resultInformationPaymentDetailsText = ".//*[@id='ContractBody-Information']/validation-form/div[6]/div[3]/div/div/tooltip/tip-cont/div";
	
	public String resultInformationDataProtectionText = "function getDataProtection(){var DataProtection = document.querySelector('select[name=dataProtection] option[selected]').text;return DataProtection}; return getDataProtection()";
	
	public String resultHistoryDelegatedAuthorityText = "function getDelegatedAuthority(){var delegatedauthority = document.getElementsByName('da').item(1).innerText; return delegatedauthority};return getDelegatedAuthority()";
	
	public String resultInformationSourcingReferenceCodeText = "function getSourcingReferenceCode(){var SourcingReferenceCode = document.getElementsByName('sourcingReferenceCode').item(0).value;return SourcingReferenceCode}; return getSourcingReferenceCode()";
	
	public String resultInformationContractDescriptionText = "function getContractDescription(){var ContractDescription = document.getElementsByName('description').item(2).value;return ContractDescription}; return getContractDescription()";
	
	public String resultInformationChooseFileText = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[2]/form/div/div[2]/div[2]/div[3]";
	
	public String selectClarificationCheckBoxButton = ".//*[@id='SupportingDocuments-Iniation']/div/div[1]/label[2]/input";
	
	public String informationBackButton = "html/body/div[1]/div[2]/contract/section/div[1]/div/div[2]/form/div/div[2]/div[2]/div[1]/a";
	
	public String contractHeaderButton = "html/body/div[1]/div[2]/contract/admin-breadcrumbs/section/ol/li[2]/a";
	
	public String informationTabButton = "html/body/div[1]/div[2]/contract/section/div[1]/ul/li[2]/a";
	
	public void clearSearchContractDescription() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(searchContractDescriptionText)).clear();
	}
	
	public void informationTabClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationTabButton)).click();
	}
	
	public void contractHeaderClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(contractHeaderButton)).click();
	}
	
	public void informationBackClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationBackButton)).click();
	}
	
	public void selectClarificationCheckBoxClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(selectClarificationCheckBoxButton)).click();
	}
	
	public List<String> resultInformationChooseFileWarning() {
		wait(normalTime);
		String chooseFile =  waitElementVisible(driver, By.xpath(resultInformationChooseFileText)).getText();
		List<String> iList = java.util.Arrays.asList(chooseFile.split("/"));
		return iList;
	}
	
	public String resultInformationContractDescriptionWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationContractDescriptionText);
	}
	
	public String resultInformationSourcingReferenceCodeWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationSourcingReferenceCodeText);
	}
	
	public void informationModifySelectBiddingThreshold() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationBiddingThresholdButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationBiddingThresholdWarning() {
		wait(normalTime);
		String selectedBiddingThreshold = new Select(driver.findElement(By.xpath(informationBiddingThresholdButton))).getFirstSelectedOption().getText();
		return selectedBiddingThreshold;
	}
	
	public String resultInformationDelegatedAuthorityWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultHistoryDelegatedAuthorityText);
	}
	
	public void informationModifySelectDataProtection() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationDataProtectionButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationDataProtectionWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationDataProtectionText);
	}
	
	public void informationModifySelectFrameworkPO() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationFrameworkPOButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationFrameworkPOWarning() {
		wait(normalTime);
		String selectedDaysofTermination=new Select(driver.findElement(By.xpath(informationFrameworkPOButton))).getFirstSelectedOption().getText();
		return selectedDaysofTermination;
	}
	
	public String resultInformationPaymentDetailsWarning() {
		wait(normalTime);
		String PaymentDetails= waitElementVisible(driver, By.xpath(resultInformationPaymentDetailsText)).getAttribute("tooltip-template");
		return PaymentDetails;
	}
	
	public void informationModifySelectDaysofTermination() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationDaysofTerminationButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationDaysofTerminationWarning() {
		wait(normalTime);
		String selectedDaysofTermination=new Select(driver.findElement(By.xpath(informationDaysofTerminationButton))).getFirstSelectedOption().getText();
		return selectedDaysofTermination;
	}
	
	public String resultInformationStartDateWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationStartDateText);
	}
	
	public void inputModifyInformationStartDate() {
		waitElementVisible(driver, By.xpath(informationStartDateText)).clear();
		waitElementVisible(driver, By.xpath(informationStartDateText)).sendKeys(getGoOver());
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationStartDateText)).sendKeys(Keys.TAB);
	}
	
	public String resultInformationIssuedDateWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationIssuedDateText);
	}
	
	public void inputModifyInformationIssuedDate() {
		waitElementVisible(driver, By.xpath(informationIssuedDateText)).clear();
		waitElementVisible(driver, By.xpath(informationIssuedDateText)).sendKeys(getFuture());
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationIssuedDateText)).sendKeys(Keys.TAB);
	}
	
	public String resultInformationTotalValueWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationTotalValueText);
	}
	
	public void informationModifySelectForeignExchangeTransaction() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationForeignExchangeTransactionButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationForeignExchangeTransactionWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationForeignExchangeTransactionText);
	}
	
	public void informationModifySelectCurrency() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationCurrencyButton)));
		dropList.selectByIndex(3);
	}
	
	public String resultInformationCurrencyWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationCurrencyText);
	}
	
	public void informationModifySelectGoodsService() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationGoodsServiceButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationGoodsServiceWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationGoodsServiceText);
	}
	
	public void informationModifySelectENCNVersion() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationENCNVersionButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationENCNVersionWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationENCNVersionText);
	}
	
	public void informationModifySelectBritishCouncilTemplate() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationBritishCouncilTemplateButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationBritishCouncilTemplateWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationBritishCouncilTemplateText);
	}
	
	public String resultInformationIntercompanyWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationIntercompanyText);
	}
	
	public void informationModifySelectIntercompany() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationICOButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationContractTypeLevel2Warning() {
		wait(normalTime);
		String selectedContractTypeLevel2=new Select(driver.findElement(By.xpath(informationContractTypeLevel2Button))).getFirstSelectedOption().getText();
		return selectedContractTypeLevel2;
	}
	
	public void informationModifySelectContractTypeLevel2() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationContractTypeLevel2Button)));
		dropList.selectByIndex(2);
	}
	
	public void informationModifySelectOriginalOffice() {
		wait(normalTime);
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationOriginalOfficeButton)));
		dropList.selectByIndex(2);
	} 	
	
	public String resultHistoryOriginalOfficeWarning() {
		wait(normalTime);
		String selectedOriginalOffice=new Select(driver.findElement(By.xpath(informationOriginalOfficeButton))).getFirstSelectedOption().getText();
		return selectedOriginalOffice;
	}
	
	public String resultHistoryContractLocationWarning() {
		wait(normalTime);
		String selectedContractLocation=new Select(driver.findElement(By.xpath(informationContractLocationButton))).getFirstSelectedOption().getText();
		return selectedContractLocation;
	}
	
	public void informationModifySelectContractLocation() {
		wait(normalTime);
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationContractLocationButton)));
		dropList.selectByIndex(2);
	} 	
	
	public void moveHistoryDepartmentClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(moveHistoryDepartmentButton)).click();
	}
	
	public String resultHistoryContractCreatorWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultHistoryContractCreatorText);
	}
	
	public String resultHistoryCompanyCodeWarning() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultHistoryCompanyCodeText);
	}
	
	public void informationModifySelectCompanyCode() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationCompanyCodeButton)));
		dropList.selectByIndex(2);
	}
	
	public String resultInformationContractNoText() {
		wait(normalTime);
		return (String)((JavascriptExecutor)driver).executeScript(resultInformationContractNoText);
	}
	
	public String historyCurrentData() {
		wait(normalTime);
		return waitElementVisible(driver, By.xpath(historyCurrentDataText)).getText();
	}
	
	public void historyTabClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(historyTabButton)).click();
	}
	
	public List<String> getDepartmentLIst() {
		wait(normalTime);
		String department = String.valueOf((((JavascriptExecutor)driver).executeScript(getDepartmentListText)));
		List<String> iList = java.util.Arrays.asList(department.split(" ×"));
		return iList;
	}
	
	public int getDepartmentLength() {
		wait(normalTime);
		String departmentLength = String.valueOf((((JavascriptExecutor)driver).executeScript(getDepartmentLengthText)));
		return Integer.parseInt(departmentLength) - 2;
	}
	
	public void searchContractNo(String elements) {
		waitElementVisible(driver, By.xpath(searchContractNoText)).clear();
		waitElementVisible(driver, By.xpath(searchContractNoText)).sendKeys(elements);
	}
	
	
	public String resultNotDataWarning() {
		return waitElementVisible(driver, By.xpath(resultNotDataText)).getText();
		
	}
	
	public void contractCopyCancelConfirmClick() {
		waitElementVisible(driver, By.xpath(contractCopyCancelConfirmButton)).click();
	}
	
	public void contractCopyCancelClick() {
		waitElementVisible(driver, By.xpath(contractCopyCancelButton)).click();
	}
	
	public void inputCopyContractNo(String elements) {
		waitElementVisible(driver, By.xpath(copyContractNoText)).clear();
		waitElementVisible(driver, By.xpath(copyContractNoText)).sendKeys(elements);
	}
	
	public void contractCopySaveClick() {
		waitElementVisible(driver, By.xpath(contractCopySaveButton)).click();
	}
	
	public void listCopyClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(listCopyButton)).click();
	}
	
	public int getcontractCentreUploadFileNumber() {
		wait(normalTime);
		String fileNo = String.valueOf((((JavascriptExecutor)driver).executeScript(contractCentreUploadFileNumberJs)));
		return Integer.parseInt(fileNo) - 2;
	}
	
	public void initiationContractCentreUploadFileClick(int trNum) {
		waitElementVisible(driver, By.xpath(".//*[@id='ContractCentre-Iniation']/div[1]/table/tbody/tr["+trNum+"]/td[3]/upload-file/button")).click();
	}
	
	public List<String> uploadDifferenceTypeFile() {
		List<String> differencefile = new ArrayList<>();
		differencefile.add(new CentertInputData().uploadFileLaction);
		differencefile.add(new CentertInputData().uploadFileOfDocLaction);
		differencefile.add(new CentertInputData().uploadFileOfDocxLaction);
		differencefile.add(new CentertInputData().uploadFileOfXlsLaction);
		differencefile.add(new CentertInputData().uploadFileOfXlsxLaction);
		differencefile.add(new CentertInputData().uploadFileOfZipLaction);
		return differencefile;
	}
	
	public Boolean isSelectSupportingDocumentsWarning() {
		return waitElementVisible(driver, By.xpath(isSelectSupportingDocumentsText)).isSelected();
	}
	
	public void informationContractTypeLevel3Click() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationContractTypeLevel3Button)));
		dropList.selectByIndex(1);
	}
	
	public void paymentConfirmClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(paymentConfirmButton)).click();
		wait(normalTime);
		wait(normalTime);
		wait(normalTime);
	}
	
	public void browserBackClick() {
		driver.navigate().back();
	}
	
	public String resultPaymentSearchVendorWarning() {
		return waitElementVisible(driver, By.xpath(resultPaymentSearchVendorText)).getAttribute("tooltip-template");
	}
	
	public String resultPaymentVisitProcurementLinkWarning() {
		return waitElementVisible(driver, By.xpath(resultPaymentVisitProcurementLinkText)).getAttribute("href");
	}
	
	public String resultPaymentChinaContractPortalWarning() {
		return waitElementVisible(driver, By.xpath(resultPaymentChinaContractPortalText)).getAttribute("href");
	}
	
	public void uploadFinalContractClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(uploadFinalContractButton)).click();
	}
	
	public String resultInitiationContractStatusWarning() {
		wait(normalTime);
		wait(normalTime);
		return waitElementVisible(driver, By.xpath(resultInitiationContractStatusText)).getText();
	}
	
	public void contractManagementApproveClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(contractManagementApproveButton)).click();
		wait(normalTime);
		wait(normalTime);
	}
	
	public void inputContractManagementLegalComments(String elements) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(contractManagementLegalCommentsText)).clear();
		waitElementVisible(driver, By.xpath(contractManagementLegalCommentsText)).sendKeys(elements);
		
	}
	
	public void contractManagementListDetailsClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(contractManagementListDetailsButton)).click();
		wait(normalTime);
		wait(normalTime);
	}
	
	public String windowsAlerText() {
		return driver.switchTo().alert().getText();
	}
	
	public void windowsAlertConfirmClick() {
		driver.switchTo().alert().accept();
	}
	
	public void windowsAlertCancelClick() {
		driver.switchTo().alert().dismiss();
	}
	
	public void informationChooseFileClick() {
		waitElementVisible(driver, By.xpath(informationChooseFileButton)).click();
	}
	
	public String resultListStatusWarning() {
		return waitElementVisible(driver, By.xpath(resultListStatusText)).getText();
	}
	
	public void searchContractDescriptionWarning(String elements) {
		wait(normalTime);
		wait(normalTime);
		waitElementVisible(driver, By.xpath(searchContractDescriptionText)).clear();
		waitElementVisible(driver, By.xpath(searchContractDescriptionText)).sendKeys(elements);
	}
	
	public String resultWarning() {
		return waitElementVisible(driver, By.xpath(resultText)).getText();
	}
	
	public void informationSaveClick() {
		waitElementVisible(driver, By.xpath(informationSaveButton)).click();
		wait(normalTime);
		wait(normalTime);
	}
	
	public void informationItemsTotalValueitem(String elements) {
		waitElementVisible(driver, By.xpath(informationItemsTotalValueitemText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsTotalValueitemText)).sendKeys(elements);
	}
	
	public void inputInformationItemsUnitPrice(String elements) {
		waitElementVisible(driver, By.xpath(informationItemsUnitPriceText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsUnitPriceText)).sendKeys(elements);
	}
	
	public void informationItemsUnitofMeasurementClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationItemsUnitofMeasurementButton)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationItemsQuantity(String elements) {
		waitElementVisible(driver, By.xpath(informationItemsQuantityText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsQuantityText)).sendKeys(elements);
		wait(normalTime);
	}
	
	public void informationItemsMaterialGroup() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationItemsMaterialGroupText)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationItemsCategoryNo(String elements) {
		waitElementVisible(driver, By.xpath(informationItemsCategoryNoText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsCategoryNoText)).sendKeys(elements);
		wait(normalTime);
	}
	
	public void informationItemsItemStartDate() {
		waitElementVisible(driver, By.xpath(informationItemsItemStartDateText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsItemStartDateText)).sendKeys(getToday());
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationItemsItemStartDateText)).sendKeys(Keys.TAB);
	}
	
	public void informationItemsItemEndDate() {
		waitElementVisible(driver, By.xpath(informationItemsItemEndDateText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsItemEndDateText)).sendKeys(getFuture());
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationItemsItemEndDateText)).sendKeys(Keys.TAB);
	}
	
	public void informationItemsItemDescription(String elements) {
		waitElementVisible(driver, By.xpath(informationItemsItemDescriptionText)).clear();
		waitElementVisible(driver, By.xpath(informationItemsItemDescriptionText)).sendKeys(elements);
	}
	
	public void informationItemsGoodsService() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationItemsGoodsServiceButton)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationContractDescription(String elements) {
		waitElementVisible(driver, By.xpath(informationContractDescriptionText)).clear();
		waitElementVisible(driver, By.xpath(informationContractDescriptionText)).sendKeys(elements);
	}
	
	public void informationSourcingReferenceCodeClick(String elements) {
		waitElementVisible(driver, By.xpath(informationSourcingReferenceCodeText)).clear();
		waitElementVisible(driver, By.xpath(informationSourcingReferenceCodeText)).sendKeys(elements);
	}
	
	public void informationBiddingThresholdClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationBiddingThresholdButton)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationDelegatedAuthority(String elements) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationDelegatedAuthorityButton)).click();
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationDelegatedAuthorityText)).clear();
		waitElementVisible(driver, By.xpath(informationDelegatedAuthorityText)).sendKeys(elements);
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationDelegatedAuthorityText)).sendKeys(Keys.ENTER);
	}
	
	public void informationDataProtectionClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationDataProtectionButton)));
		dropList.selectByIndex(1);
	}
	
	public void informationFrameworkPOClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationFrameworkPOButton)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationPaymentDetails(String elements) {
		waitElementVisible(driver, By.xpath(informationPaymentDetailsText)).sendKeys(Keys.ENTER);
		waitElementVisible(driver, By.xpath(informationPaymentDetailsText)).clear();
		waitElementVisible(driver, By.xpath(informationPaymentDetailsText)).sendKeys(elements);
	}
	
	public void informationDaysofTerminationClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationDaysofTerminationButton)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationIssuedDate() {
		waitElementVisible(driver, By.xpath(informationIssuedDateText)).clear();
		waitElementVisible(driver, By.xpath(informationIssuedDateText)).sendKeys(getToday());
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationIssuedDateText)).sendKeys(Keys.TAB);
	}
	
	public void inputInformationStartDate() {
		waitElementVisible(driver, By.xpath(informationStartDateText)).clear();
		waitElementVisible(driver, By.xpath(informationStartDateText)).sendKeys(getToday());
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationStartDateText)).sendKeys(Keys.TAB);
	}
	
	public void inputInformationEndDate() {
		waitElementVisible(driver, By.xpath(informationEndDateText)).clear();
		waitElementVisible(driver, By.xpath(informationEndDateText)).sendKeys(getFuture());	
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationEndDateText)).sendKeys(Keys.TAB);
	}
	
	public void informationForeignExchangeTransactionClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationForeignExchangeTransactionButton)));
		dropList.selectByIndex(1);
	}
	
	public void inputInformationTotalValue(String elements) {
		waitElementVisible(driver, By.xpath(informationTotalValueText)).clear();
		waitElementVisible(driver, By.xpath(informationTotalValueText)).sendKeys(elements);	
	}
	
	public void informationCurrencyClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationCurrencyButton)));
		dropList.selectByIndex(2);
	}
	
	public void informationCategoryLevel2Click() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationCategoryLevel2Button)));
		dropList.selectByIndex(2);
	}
	
	public void informationCategoryLevel1Click() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationCategoryLevel1Button)));
		dropList.selectByIndex(2);
	}
	
	public void informationGoodsServiceClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationGoodsServiceButton)));
		dropList.selectByIndex(1);
	}
	
	public void informationENCNVersionClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationENCNVersionButton)));
		dropList.selectByIndex(1);
	}
	
	public void informationBritishCouncilTemplateClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationBritishCouncilTemplateButton)));
		dropList.selectByIndex(1);
	}
	
	public void informationICOClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationICOButton)));
		dropList.selectByIndex(1);
	}
	
	public void informationContractTypeLevel2Click() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationContractTypeLevel2Button)));
		dropList.selectByIndex(1);
	}
	
	public void informationContractNo(String elements) {
		waitElementVisible(driver, By.xpath(informationContractNoText)).clear();
		waitElementVisible(driver, By.xpath(informationContractNoText)).sendKeys(elements);
	}
	
	public void informationOriginalOfficeClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationOriginalOfficeButton)));
		dropList.selectByIndex(1);
		wait(normalTime);
	}
	
	public void informationContractLocationClick() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationContractLocationButton)));
		dropList.selectByIndex(1);
		wait(normalTime);
	}
	
	public void informationContractCreatorClick(String element) {
		waitElementVisible(driver, By.xpath(informationContractCreatorButton)).click();
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationContractCreatorText)).clear();
		waitElementVisible(driver, By.xpath(informationContractCreatorText)).sendKeys(element);
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationContractCreatorText)).sendKeys(Keys.ENTER);
	}
	
	public void informationDepartmentClick() {
		waitElementVisible(driver, By.xpath(informationDepartmentButton)).click();
	}
	
	public void informationSelectCompanyCode() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(informationCompanyCodeButton)));
		dropList.selectByIndex(1);
	}
	
	public void informationSelectVendorNo(String elements) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationVendorNoButton)).click();
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationVendorNoText)).clear();
		waitElementVisible(driver, By.xpath(informationVendorNoText)).sendKeys(elements);
		wait(normalTime);
		wait(normalTime);
		waitElementVisible(driver, By.xpath(informationVendorNoText)).sendKeys(Keys.ENTER);
	}
	
	public String resultContractNoWarning() {
		return waitElementVisible(driver, By.xpath(resultContractNoText)).getText();
	}
	
	public String resultContractNoCompanyCode() {
		return "P-CHN1-" + 	getDaysCompanyCodeDays();
	}
	
	public void contractResetClick() {
		waitElementVisible(driver, By.xpath(contractResetButton)).click();
		wait(normalTime);
	}
	
	public String resultContractSearchVendorNameWarning() {
		return waitElementVisible(driver, By.xpath(resultContractSearchVendorNameText)).getText();
	}
	
	public String resultContractSearchListVendorNameWarning() {
		wait(normalTime);
		return waitElementVisible(driver, By.xpath(resultContractSearchListVendorNameText)).getAttribute("tooltip-template");
	}
	
	public void inputContractSearchVendorName(String element) {
		waitElementVisible(driver, By.xpath(inputContractSearchVendorNameText)).clear();
		waitElementVisible(driver, By.xpath(inputContractSearchVendorNameText)).sendKeys(element);
	}
	
	public void contractSearchClick() {
		waitElementVisible(driver, By.xpath(contractSearchButton)).click();
		wait(normalTime);
		wait(normalTime);
	}
	
	public String getContractManagementDefaultSearchType() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(contractManagementIncomeTypeSearchText)));
		String isPaymentType = dropList.getOptions().get(0).getText();
		return isPaymentType;
	}
	
	public void selectContractManagementIncomeTypeSearch() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(contractManagementIncomeTypeSearchText)));
		dropList.selectByIndex(2);
	}
	
	public String resultPaymentOriginalOfficeWarning() {
		return waitElementVisible(driver, By.xpath(resultPaymentOriginalOfficeText)).getAttribute("tooltip-template");
	}
	
	public List<WebElement> selectRequiredList(){
		List<WebElement> irList = driver.findElements(By.xpath(selectRequired));
		return irList;
	}
	
	public List<WebElement> inputRequiredList(){
		List<WebElement> irList = driver.findElements(By.xpath(inputRequired));
		return irList;
	}
	
	public String resultDelegatedAuthorityAlinkWarning() {
		return waitElementVisible(driver, By.xpath(resultDelegatedAuthorityAlinkText)).getAttribute("href");
	}
	
	public String resultDelegatedAuthorityWarning() {
		return waitElementVisible(driver, By.xpath(resultDelegatedAuthorityText)).getAttribute("tooltip-template");
	}
	
	public String resultResponsibleDepartmentHeadWarning() {
		return waitElementVisible(driver, By.xpath(resultResponsibleDepartmentHeadText)).getAttribute("tooltip-template");
	}
	
	public String resultDataProtectionWarning() {
		return waitElementVisible(driver, By.xpath(resultDataProtectionText)).getAttribute("tooltip-template");
	}
	
	public String resultTotalValueWarning() {
		return waitElementVisible(driver, By.xpath(resultTotalValueText)).getAttribute("tooltip-template");
	}
	
	public String resultOriginalOfficeWarning() {
		return waitElementVisible(driver, By.xpath(resultOriginalOfficeText)).getAttribute("tooltip-template");
	}
	
	public String resultContractLocationWarning() {
		return waitElementVisible(driver, By.xpath(resultContractLocationText)).getAttribute("tooltip-template");
	}
	
	public void contractManagementAddContractClick() {
		waitElementVisible(driver, By.xpath(contractManagementAddContractButton)).click();
		wait(normalTime);
	}
	
	public void contractCentreUploadFileClick() {
		waitElementVisible(driver, By.xpath(contractCentreUploadFileButton)).click();
	}
	
	public void paymentSubmitClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(paymentSubmitButton)).click();
		wait(normalTime);
		wait(normalTime);
	}
	
	public void paymentSaveClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(paymentSaveButton)).click();
		wait(normalTime);
	}
	
	public void supportingDocumentsUploadFileClick() {
		waitElementVisible(driver, By.xpath(supportingDocumentsUploadFileButton)).click();
	}
	
	public void selectPaymentICO() {
		Select dropList = new Select(waitElementVisible(driver, By.name(ICOButton)));
		dropList.selectByIndex(1);
	}
	
	public void selectPaymentContractTypeLevel2() {
		Select dropList = new Select(waitElementVisible(driver, By.name(ContractTypeLevel2Button)));
		dropList.selectByIndex(1);
	}
	
	public void selectPaymentOriginalOffice() {
		Select dropList = new Select(waitElementVisible(driver, By.xpath(paymentOriginalOfficeButton)));
		dropList.selectByIndex(1);
	}
	
	public String resultEditeWarning() {
		return waitElementVisible(driver, By.xpath(resultEditeText)).getText();
	}
	
	public void selectForeignExchangeTransactionClick() {
		Select dropList = new Select(waitElementVisible(driver, By.name(foreignExchangeTransactionButton)));
		dropList.selectByIndex(1);
	} 
	public void selectGoodsServiceText() {
		Select dropList = new Select(waitElementVisible(driver, By.name(goodsServiceText)));
		dropList.selectByIndex(1);
	} 
	
	public void selectDataProtection() {
		Select dropList = new Select(waitElementVisible(driver, By.name(dataProtectionText)));
		dropList.selectByIndex(1);
	} 
	
	public void inputSapVendorNo(String elements) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(SapVendorNoText)).clear();
		waitElementVisible(driver, By.xpath(SapVendorNoText)).sendKeys(elements);
		wait(normalTime);
		wait(normalTime);
		waitElementVisible(driver, By.xpath(SapVendorNoText)).sendKeys(Keys.ENTER);
	} 
	
	public void SapVendorNoClick() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(SapVendorNoButton)).click();
	} 
	
	public void selectCategoryLevel2() {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(CategoryLevel2Text)).click();
	} 	
	
	public void selectCategoryLevel1() {
		wait(normalTime);
		Select dropList = new Select(waitElementVisible(driver, By.name(CategoryLevel1Text)));
		dropList.selectByIndex(1);
	} 	
	
	public void selectContractLocation() {
		wait(normalTime);
		Select dropList = new Select(waitElementVisible(driver, By.xpath(ContractLocationText)));
		dropList.selectByIndex(1);
	} 	
	
	public void submitClick() {
		waitElementVisible(driver, By.xpath(SubmitButton)).click();
	} 
	
	public void saveClick() {
		waitElementVisible(driver, By.xpath(saveButton)).click();
	}
	
	public void uploadContractClick() {
		waitElementVisible(driver, By.xpath(UploadContractButton)).click();
	}
	
	public void inputContractDescription(String element) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(contractDescriptionText)).clear();
		waitElementVisible(driver, By.xpath(contractDescriptionText)).sendKeys(element);
	}
	
	public void inputComments(String element) {
		wait(normalTime);
		waitElementVisible(driver, By.name(commentsText)).clear();
		waitElementVisible(driver, By.name(commentsText)).sendKeys(element);
	}
	
	
	public void inComeResponsibleDeptHead(String element) {
		waitElementVisible(driver, By.name(ResponsibleDeptHeadText)).clear();
		waitElementVisible(driver, By.name(ResponsibleDeptHeadText)).sendKeys(element);
	}
	
	public void inputDelegatedAuthority(String element) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(DelegatedAuthorityButton)).click();
		wait(normalTime);
		waitElementVisible(driver, By.xpath(DelegatedAuthorityText)).clear();
		waitElementVisible(driver, By.xpath(DelegatedAuthorityText)).sendKeys(element);
		wait(normalTime);
		waitElementVisible(driver, By.xpath(DelegatedAuthorityText)).sendKeys(Keys.ENTER);
	}
	
	public void inputTotalValue(String element) {
		wait(normalTime);
		waitElementVisible(driver, By.name(TotalValueContractText)).click();
		wait(normalTime);
		waitElementVisible(driver, By.name(TotalValueContractText)).clear();
		waitElementVisible(driver, By.name(TotalValueContractText)).sendKeys(element);
	}
	
	public void selectCurrency() {
		Select dropList = new Select(waitElementVisible(driver, By.name(Currency)));
		dropList.selectByIndex(1);
	}
	
	public void selectENCNVersion() {
		Select dropList = new Select(waitElementVisible(driver, By.name(ENCNVersion)));
		dropList.selectByIndex(1);
	}
	
	public void selectBCTemplate() {
		Select dropList = new Select(waitElementVisible(driver, By.name(BCTemplate)));
		dropList.selectByIndex(1);
	}
	
	public void inputStartDate(String element) {
		waitElementVisible(driver, By.name(StartDateText)).clear();
		waitElementVisible(driver, By.name(StartDateText)).sendKeys(element);
	}
	
	public void inputEndDate(String element) {
		waitElementVisible(driver, By.name(EndDateText)).click();
		wait(normalTime);
		waitElementVisible(driver, By.name(EndDateText)).clear();
		waitElementVisible(driver, By.name(EndDateText)).sendKeys(element);
	}
	
	public void selectInComeMiscellaneousOriginalOffice() {
		waitElementVisible(driver, By.xpath(inComeMiscellaneousOriginalOfficeText)).click();
	} 
	
	
	public void selectCompanyCode() {
		Select dropList = new Select(waitElementVisible(driver, By.name(CompanyCodeText)));
		dropList.selectByIndex(1);
	} 
	
	public void inputInComeCustomerName(String elements) {
		waitElementVisible(driver, By.name(inComeCustomerNameText)).clear();
		waitElementVisible(driver, By.name(inComeCustomerNameText)).sendKeys(elements);
	} 
	
	public void inputInComeBusinessPartnerGlobal(String elements) {
		wait(normalTime);
		waitElementVisible(driver, By.xpath(inComeBusinessPartnerGlobalText)).clear();
		waitElementVisible(driver, By.xpath(inComeBusinessPartnerGlobalText)).sendKeys(elements);
	} 
		
	public void ChooseFile(String browser, String str) {
	    File file = new File(str);
	    String filePath= file.getAbsolutePath();
	    String executeFile= "./upload/uploadFile.exe";
	    String cmd= "\""+ executeFile+ "\""+ " "+ "\""+ browser+ "\""+ " "+ "\""+ filePath+ "\"";
	    try{
	        Process p= Runtime.getRuntime().exec(cmd);
	        p.waitFor();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public String getDaysCompanyCodeDays() {
		 Date date=new Date();//取时间
		 SimpleDateFormat formatter = new SimpleDateFormat("yyMMdd");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getDays() {
		 Date date=new Date();//取时间
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHH:mm:ss");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	
	public String getToday() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.DATE,0);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getFuture() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	public String getGoOver() {
		 Date date=new Date();//取时间
		 Calendar calendar = new GregorianCalendar();
		 calendar.setTime(date);
		 calendar.add(calendar.DATE,-1);//把日期往后增加一天.整数往后推,负数往前移动
		 date=calendar.getTime(); //这个时间就是日期往后推一天的结果 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		 String dateString = formatter.format(date);
		 return dateString;
	}
	
	
}
