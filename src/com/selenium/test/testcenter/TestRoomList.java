package com.selenium.test.testcenter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.test.utils.DriverInstance;
import com.selenium.test.utils.ElementHelper;
import com.selenium.test.utils.WebDriverAction;

public class TestRoomList {

	CenterElements ce = new CenterElements();
	CentertInputData ci = new CentertInputData();
	
	@BeforeMethod
	public void setUp(){
		ce.OpenBrower("TestCenter", 3);
	}

	@AfterMethod
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
		ce.SelectSearchRoomOfRegion();
		ce.SelectSearchRoomOfCenter();
		ce.SearchRoomOfBuilding();
		ce.RoomOfSearchClick();
		Assert.assertEquals(ce.RoomNameWarning(), ci.roomNameOne);
	}

	@Test(description = "Modify Room")
	public void step03_Modify(){
		ce.SelectSearchRoomOfRegion();
		ce.SelectSearchRoomOfCenter();
		ce.SearchRoomOfBuilding();
		ce.RoomOfSearchClick();
		ce.ModifyOfRoomModifyClick();
		ce.CheckRoomNameClick();
		ce.InputRoomName(ci.roomNameTwo);
		ce.CreateOfRoomSaveButton();
		ce.WaitTime();
		Assert.assertEquals(ce.RoomNameWarning(), ci.roomNameTwo);
	}

	@Test(description = "View Room")
	public void step04_View(){
		ce.SelectSearchRoomOfRegion();
		ce.SelectSearchRoomOfCenter();
		ce.SearchRoomOfBuilding();
		ce.RoomOfSearchClick();
		ce.ModifyOfRoomViewClick();
		Assert.assertEquals(ce.ViewOfRoomDetailsWarning(), ci.roomNameTwo);
		ce.CreateOfRoomSaveButton();
	}

	@Test(description = "Create building room is RM02")
	public void step05_CreateSecondBuildingRoom(){
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

	@Test(description = "Create Share room")
	public void step06_CreateShareRoom(){
		ce.SelectSearchRoomOfRegion();
		ce.SelectSearchRoomOfCenter();
		ce.SearchRoomOfBuilding();
		ce.RoomOfSearchClick();
		ce.RoomOfCreateShareRoomClick();
		ce.SelectShareRoomClick();
		ce.InputShareRoomOfDateFrom();
		ce.InputShareRoomOfDateTo();
		ce.CreateShareRoomOfSearchClick();
		ce.SelectShareRoomTestDayClick();
		ce.CreateOfRoomSaveButton();
	}
	
	@Test(description = "Modify Share Day")
	public void step07_ModifyShareDay(){
		ce.SelectSearchRoomOfRegion();
		ce.SelectSearchRoomOfCenter();
		ce.SearchRoomOfBuilding();
		ce.RoomOfSearchClick();
		ce.RoomOfModifyShareDayButton();
		ce.InputModifyShareRoomOfDateFrom();
		ce.InputModifyShareRoomOfDateTo();
		ce.InputModifyShareRoomOfSearchClick();
		ce.CreateOfRoomSaveButton();
	}
	
}
