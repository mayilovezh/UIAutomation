package com.selenium.test.marking;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleMarkingOSM{
	MarkingElements me = new MarkingElements();
	MarkingInputData mi = new MarkingInputData();
	
	@BeforeClass
	public void setUp(){
		me.OpenBrower("Marking", 10);
	}

	@AfterClass
	public void Close() {
		me.Close();
	}

	@Test
	public void step01_Search(){
		me.SearchDoubleMarkingOSMYear();
		me.GetDoubleMarkingOSMGreenTestCenter();
		me.SearchDoubleMarkingOSM();
		me.WaitTime();
		me.InputDoubleMarkingOSMSelectExaminerNum();
		me.DoubleMarkingOSMCalculate();
		me.WaitTime();
		Assert.assertEquals(me.ListOfDoubleMarkingOSMWarning(), me.ListOfDoubleMarkingOSMWarning());
	}

	@Test
	public void step02_SetCapacity(){
		me.DoubleMarkingOSMSetCapacityClick();
		me.inputDoubleMarkingOSMNewCapacityNumber();
		me.ModifyFirstClick();
		me.ShortWaitTime();
	}

	@Test
	public void step03_ClearAllocation(){
		me.ClearAllocationDoubleMarkingOSM();
		me.ModifyFirstClick();
		me.ShortWaitTime();
		me.ModifyFirstClick();
		me.ShortWaitTime();
	}

	@Test
	public void step04_AutoAllocation(){
		if(me.IsSelectDoubleMarkingOSMTestCenter()==false) {
			me.DoubleMarkingOSMTestCenter();
		}
		me.WaitTime();
		me.InputDoubleMarkingOSMSelectExaminerNum();
		me.DoubleMarkingOSMCalculate();
		me.WaitTime();
		me.AutoAllocationDoubleMarkingOSM();
		me.ModifyFirstClick();
		me.WaitTime();
	}

}
