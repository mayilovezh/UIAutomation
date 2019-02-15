package com.selenium.test.marking;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstMarkingNew{
	MarkingElements me = new MarkingElements();
	MarkingInputData mi = new MarkingInputData();
	
	@BeforeClass
	public void setUp(){
		me.OpenBrower("Marking", 1);
	}

	@AfterClass
	public void Close() {
		me.Close();
	}
	
	@Test
	public void step01_Init(){
		me.SearchFirstMarkingNewYear();
		me.initTestSession();
	}

	@Test
	public void step02_Search(){
		me.SearchFirstMarkingNewYear();
		me.GetGreenTestCenter();
		me.SearchFirstMarkingNew();
		me.WaitTime();
		me.SearchFirstMarkingNewExaminerAll();
		me.SearchFirstMarkingNewExaminer();
		me.WaitTime();
		me.WaitTime();
		me.WaitTime();
		me.WaitTime();
		Assert.assertEquals(me.ListOfFirstMarkingNewWarning(), me.ListOfFirstMarkingNewWarning());
	}

	@Test
	public void step03_SetCapacity(){
		me.FirstMarkingNewSetCapacityClick();
		me.inputFirstMarkingNewNewCapacityNumber();
		me.ModifyFirstClick();
		me.ShortWaitTime();
	}

	@Test
	public void step04_ClearAllocation(){
		me.ClearAllocationFirstMarkingNew();
		me.ModifyFirstClick();
		me.ShortWaitTime();
	}

	@Test
	public void step05_AutoAllocation(){
		if(me.IsSelectFirstMarkingNewTestCenter()==false) {
			me.FirstMarkingNewTestCenter();
		}
		if(me.IsSelectFirstMarkingNewTestCenter()==false) {
			me.SearchFirstMarkingNewExaminerAll();
		}
		me.SearchFirstMarkingNewExaminer();
		me.WaitTime();
		me.WaitTime();
		me.WaitTime();
		me.WaitTime();
		me.AutoAllocationFirstMarkingNew();
		me.ModifyFirstClick();
		me.WaitTime();
	}

}
