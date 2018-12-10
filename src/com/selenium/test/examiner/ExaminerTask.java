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

	@Test
	public void step01_CreateSpeakingTask() throws InterruptedException{
		ee.ExaminerTaskSpeakingTaskClick();
		ee.ExaminerTaskCreateSpeakingTaskRegion();
		ee.ExaminerTaskCreateSpeakingTaskYear();
		ee.ExaminerTaskCreateSpeakingTaskMonth();
		ee.ExaminerTaskCreateSpeakingTaskTestDate();
		ee.ExaminerTaskCreateSpeakingTaskTestDayChoose();
		ee.ExaminerTaskCreateSpeakingTaskExaminerDescription();
		ee.ExaminerTaskCreateSpeakingTaskStaffRemark();
		ee.ExaminerTaskSpeakingTaskSaveClick();
	}
	
}
