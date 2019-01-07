package com.selenium.test.marking;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleMarking{
	MarkingElements me = new MarkingElements();
	MarkingInputData mi = new MarkingInputData();
	
	@BeforeClass
	public void setUp(){
		me.OpenBrower("Marking", 2);
	}

	@AfterClass
	public void Close() {
		me.Close();
	}

	@Test
	public void step01_Init(){
		me.SearchDoubleMarkingYear();
		me.initDoubleMarkingTestSession();
	}

	@Test
	public void step02_Search(){
		me.SearchDoubleMarkingYear();
		me.GetDoubleMarkingGreenTestCenter();
		me.SearchDoubleMarking();
		me.WaitTime();
		me.InputDoubleMarkingtxtSelectExaminerNum();
		me.DoubleMarkingCalculate();
		me.WaitTime();
		Assert.assertEquals(me.ListOfDoubleMarkingWarning(), me.ListOfDoubleMarkingWarning());
	}

	@Test
	public void step03_SetCapacity(){
		me.DoubleMarkingSetCapacityClick();
		me.inputDoubleMarkingNewCapacityNumber();
		me.ModifyFirstClick();
		me.ShortWaitTime();
	}

	@Test
	public void step04_ClearAllocation(){
		me.ClearAllocationDoubleMarking();
		me.ModifyFirstClick();
		me.ShortWaitTime();
		me.ModifyFirstClick();
		me.ShortWaitTime();
	}

	@Test
	public void step05_AutoAllocation(){
		if(me.IsSelectDoubleMarkingTestCenter()==false) {
			me.DoubleMarkingTestCenter();
		}
		me.WaitTime();
		me.InputDoubleMarkingtxtSelectExaminerNum();
		me.DoubleMarkingCalculate();
		me.WaitTime();
		me.AutoAllocationDoubleMarking();
		me.ModifyFirstClick();
		me.WaitTime();
	}

}
