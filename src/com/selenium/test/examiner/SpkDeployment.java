package com.selenium.test.examiner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpkDeployment{
	ExaminerElements ee = new ExaminerElements();
	ExaminerInputData ei = new ExaminerInputData();
	
	@BeforeClass
	public void setUp(){
		ee.OpenBrower("Examiner", 4);
	}

	@AfterClass
	public void Close() {
		ee.Close();
	}

	@Test
	public void step01_Search(){
		ee.SpkDeploymentSearchYear();
		ee.SelectTestDate();
		ee.SpkDeploymentSearchClick();
		ee.WaitShotTime();
		Assert.assertEquals(ee.SpkDeploymentListOfCnWarning(), ee.SpkDeploymentListOfCnWarning());
	}

	@Test
	public void step02_Assign(){
		ee.SpkDeploymentAssignClick();
		ee.SelectSPKTestDay();
		ee.SpkDeploymentAssignSearchClick();
		ee.WaitTime();
		ee.SpkDeploymentAssignSession();
		ee.ModifyInputFirstClick();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.ModifyFirstClick();
		ee.WaitShotTime();
		ee.ModifyInputSecondClick();
		
	}

	@Test
	public void step03_UploadToPretest(){
		ee.SpkDeploymentUploadToPretest();
		ee.WaitShotTime();
		ee.ModifyFirstClick();
		ee.WaitTime();
	}	
	
}
