package com.selenium.test.clericalmarker;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClericalMarkerProfile{
	ClericalMarkerElements cme = new ClericalMarkerElements();
	
	@BeforeClass
	public void setUp(){
		cme.OpenBrower("ClericalMarker", 1);
	}

	@AfterClass
	public void Close() {
		cme.Close();
	}

	@Test
	public void step01_Create(){
		cme.ClericalMarkerCreateButton();
		cme.ClericalMarkerCreateGivenNameEn();
		cme.ClericalMarkerCreateFamilyNameEn();
		cme.ClericalMarkerCreateGivenNameCn();
		cme.ClericalMarkerCreateFamilyNameCn();
		cme.ClericalMarkerCreateIDTypeRadio();
		cme.ClericalMarkerCreatePassportNumber();
		cme.ClericalMarkerCreateBirthday();
		cme.ClericalMarkerCreateGenderRadio();
		cme.ClericalMarkerCreateMobileNo();
		cme.ClericalMarkerCreateTelephone();
		cme.ClericalMarkerCreateMail();
		cme.ClericalMarkerCreateBackUpPhone();
		cme.ClericalMarkerCreateNationality();
		cme.ClericalMarkerCreateBaseCity();
		cme.ClericalMarkerCreateBaseCityDistrict();
		cme.ClericalMarkerCreateStatus();
		cme.ClericalMarkerCreateSelectRoles();
		cme.ModifyFirstClick();
		cme.WaitTime();
	}
	
	@Test
	public void step02_Search(){
		cme.SearchClericalMarkerGivenNameEn();
		cme.ClericalMarkerSearch();
		Assert.assertEquals(cme.ListOfCMGivenNameEnWarning(), cme.ListOfCMGivenNameEnWarning());
	}
	
	@Test
	public void step03_Transfer(){
		cme.ListOfCMTransfer();
		cme.CmTransferOfSelectToTransfer();
		cme.CmTransferOfSelectProvice();
		cme.CmTransferOfSelectCity();
		cme.ModifyFirstClick();
		cme.ShortWaitTime();
		cme.ShortWaitTime();
		cme.ModifySecondClick();
	}

	@Test
	public void step04_ModifyPassword(){
		cme.ListOfCMModify();
		cme.CmModifyPassword();
		cme.inputCmModifyPassword();
		cme.ModifyFirstClick();
		cme.WaitTime();
	}
	
	@Test
	public void step05_ModifyPinCode(){
		cme.CmModifyPinCode();
		cme.inputCmModifyPinCode();
		cme.ModifyFirstClick();
		cme.WaitTime();
	}

}
