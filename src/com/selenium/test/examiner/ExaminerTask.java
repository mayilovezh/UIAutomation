package com.selenium.test.examiner;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExaminerTask{
	ExaminerElements ee = new ExaminerElements();
	ExaminerInputData ei = new ExaminerInputData();
	
	@BeforeClass
	public void setUp(){
		ee.OpenBrower("Examiner", 3);
	}

	@AfterClass
	public void Close() {
		ee.Close();
	}

//	@Test
//	public void step01_CreateSpeakingTask(){
//		ee.ExaminerTaskSpeakingTaskClick();
//		ee.ExaminerTaskCreateSpeakingTaskRegion();
//		ee.ExaminerTaskCreateSpeakingTaskYear();
//		ee.ExaminerTaskCreateSpeakingTaskMonth();
//		ee.ExaminerTaskCreateSpeakingTaskTestDate();
//		ee.ExaminerTaskCreateSpeakingTaskTestDayChoose();
//		ee.ExaminerTaskCreateSpeakingTaskExaminerDescription(ei.ExaminerDescriptionText);
//		ee.ExaminerTaskCreateSpeakingTaskStaffRemark(ei.StaffRemarkText);
//		ee.ExaminerTaskSpeakingTaskSaveClick();
//		ee.WaitShotTime();
//		ee.WaitShotTime();
//		ee.WaitShotTime();
//		ee.WaitShotTime();
//		ee.WaitShotTime();
//		ee.WaitShotTime();
//	}

	@Test
	public void step02_SearchSpeakingTask(){
		ee.ExaminerTaskSearchRegion();
		ee.ExaminerTaskSearchYear();
		ee.ExaminerTaskSearchMonth();
//		ee.ExaminerTaskSearchTestDate();
		ee.ExaminerTaskSearchTaskType();
		ee.ExaminerTaskSearchClick();
		Assert.assertEquals(ee.ListOfExaminerTaskSearchWarning(), ee.ListOfExaminerTaskSearchWarning());
		ee.WaitShotTime();
	}

	@Test
	public void step03_ModifySpeakingTask(){
		ee.ExaminerTaskModifyClick();
		ee.ModifyFirstClick();
		ee.WaitShotTime();
		ee.ExaminerTaskCreateSpeakingTaskExaminerDescription(ei.ModifyExaminerDescriptionText);
		ee.ExaminerTaskSpeakingTaskSaveClick();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
		ee.WaitShotTime();
	}

	@Test
	public void step04_ViewSpeakingTask(){
		ee.ExaminerTaskViewClick();
		//ee.ModifyOnceFirstClick();
		ee.WaitShotTime();
		Assert.assertEquals(ee.ExaminerTaskViewDescriptionExaminerWarning(), ei.ModifyExaminerDescriptionText);;
		ee.ModifyFirstClick();
		ee.WaitShotTime();
	}

}
