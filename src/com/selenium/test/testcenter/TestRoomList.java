package com.selenium.test.testcenter;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRoomList {

	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeClass
	public void setUp(){
		ce.OpenBrower("TestCenter", 3);
	}

	@AfterClass
	public void Close() {
		ce.Close();
	}

	@Test(description = "Create building room is RM01")
	public void step01_CreateFirstBuildingRoom() throws InterruptedException {
		ce.SelectSearchRoomOfRegion();
		ce.SelectSearchRoomOfCenter();
		ce.SearchRoomOfBuilding();
		ce.RoomOfSearchClick();
		ce.RoomOfCreateClick();
		ce.InputRoomName(ci.roomNameOne);
		ce.InputCreateOfRoomQuota("50");
		ce.InputCreateOfRoomOptimalQuota("60");
		ce.GetRoomType();
		ce.GetRoomProductType();
		ce.InputCreateOfFloor("1");
		ce.SelectCreateOfPriority();
		ce.SelectCreateOfTableChairStatus();
		ce.InputCreateOfRoomToward("rw");
		ce.CreateRoomRemark("RemarkRemarkRemarkRemarkRemarkRemarkRemark");
		ce.CreateOfRoomSaveButton();
	}

	@Test(description = "Search room")
	public void step02_SearchRoom(){
		ce.WaitTime();
		Assert.assertEquals(ce.RoomNameWarning(), ci.roomNameOne);
	}

	@Test(description = "Modify Room")
	public void step03_Modify(){
		ce.ModifyOfRoomModifyClick();
		ce.WaitTime();
		ce.CheckRoomNameClick();
		ce.InputRoomName(ci.roomNameTwo);
		ce.CreateOfRoomSaveButton();
		ce.WaitTime();
		Assert.assertEquals(ce.RoomNameWarning(), ci.roomNameTwo);
	}

	@Test(description = "View Room")
	public void step04_View(){
		ce.ModifyOfRoomViewClick();
		Assert.assertEquals(ce.ViewOfRoomDetailsWarning(), ci.roomNameTwo);
		ce.RoomeOfViewSaveClick();
	}

	@Test(description = "Create building room is RM02")
	public void step05_CreateSecondBuildingRoom(){
		ce.WaitTime();
		ce.RoomOfCreateClick();
		ce.InputRoomName(ci.roomNameOne);
		ce.InputCreateOfRoomQuota("50");
		ce.InputCreateOfRoomOptimalQuota("60");
		ce.GetRoomType();
		ce.GetRoomProductType();
		ce.InputCreateOfFloor("1");
		ce.SelectCreateOfPriority();
		ce.SelectCreateOfTableChairStatus();
		ce.InputCreateOfRoomToward("rw");
		ce.CreateRoomRemark("RemarkRemarkRemarkRemarkRemarkRemarkRemark");
		ce.CreateOfRoomSaveButton();
	}

	@Test(description = "Create Share room")
	public void step06_CreateShareRoom(){
		ce.WaitTime();
		ce.RoomOfCreateShareRoomClick();
		ce.SelectShareRoomClick();
		ce.InputShareRoomOfDateFrom();
		ce.InputShareRoomOfDateTo();
		ce.CreateShareRoomOfSearchClick();
		ce.SelectShareRoomTestDayClick();
		ce.CreateSechondRoomSaveClick();
	}

	@Test(description = "Modify Share Day")
	public void step07_ModifyShareDay(){
		ce.WaitTime();
		ce.RoomOfModifyShareDayButton();
		ce.InputModifyShareRoomOfDateFrom();
		ce.InputModifyShareRoomOfDateTo();
		ce.InputModifyShareRoomOfSearchClick();
		ce.CreateThirdRoomSaveClick();
	}

}
