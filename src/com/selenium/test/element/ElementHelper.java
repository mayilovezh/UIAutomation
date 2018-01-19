package com.selenium.test.element;

public class ElementHelper {

	public String DEV_URL = "http://cnbjs1bms001:9003";
	public String UAT_URL = "http://cnbjs1bms001:9001";
	public static int LONG_TIME = 10000;
	public static int WAIT_TIME = 6000;
	public static int SHORT_TIME = 3000;
	public static int SHORT_TIME_A = 1000;

	public  String USER_NAME = "userName";
	public  String PASSWORD = "password";
	public  String LOGIN_BTN = "loginButt";
	
	public static String GENERALQUERY = "GeneralQuery";
	//Registration Number List
	public static String REGISTRATION = "//*[@id='GeneralQuery']/ul/li[1]/a";
	public static String REGISTRATION_REGION = "generalQuerySelectRegion";
	public static String REGISTRATION_TC = "generalQuerySelectCenter";
	
	//Test Center
	public static String TEST_CENTER = "TestCenter";
	public static String TEST_CENTER_LIST ="//*[@id='TestCenter']/ul/li[1]/a";
	public static String TC_CREATE = "//input[@value='Create']";
	public static String TC_REGION = "selectofficeTCSearch";
	public static String TC_ADD_REGION = "selectofficeTCAdd";
	public static String TC_ADD_PROVINCE = "selectProvinceTc";
	public static String TC_ADD_CITY = "selectCityTc";
	public static String TC_ADD_CENTERNAME_CN = "centerNameAdd";
	public static String TC_ADD_CENTERNAME_EN = "centerNameEnAdd";
	public static String TC_ADD_QUOTA = "TcQuota";
	public static String TC_ADD_OPTIMALQUOTA = "TcOptimalQuota";
	public static String TC_ADD_ABBREVIATION = "abbreviationAdd";
	public static String TC_ADD_ADDRESS_CN = "CenterAddress";
	public static String TC_ADD_ADDRESS_EN = "CenterAddressEn";
	public static String CANCEL = "//span[text(),'Cancel']";
	public static String SAVE = "//button[@type='button']";
	public static String TC_NAME = "txtCenterName";
	public static String TC_SEARCH = "BtnCenterSearch";
	public static String TC_SEARCH_NAME = "//a[contains(text(),'对外经济贸易大学')]";
	public static String TC_MODIFY = "a.k-button";
	public static String TC_MODIFY_DESCRIPTION = "CenterDesc";
	public static String TC_VIEW = "View";
	public static String TC_VIEW_NAME = "//*[@id='testCenterDetailsWindow']/table/tbody/tr[5]/td";
	public static String TC_MODIFYLOG = "ModifyLog";
	
	//Test Building
	public static String TEST_BUILDING_LIST = "//*[@id='TestCenter']/ul/li[2]/a";
	public static String TB_CREATE = "//input[@value='Create']";
	public static String TB_REGION = "selectofficeSearchBuilding";
	public static String TB_CENTER = "selectTCSearchBuilding";
	public static String TB_SEARCH = "//*[@id='page-heading']/div/table/tbody/tr/td[7]/input[1]";
	public static String TB_NAME = "LblCenterName";
	public static String TB_SAVE = "button.k-button";
	public static String TB_CANCEL = "//button[2]";
	public static String TB_ADD_NAME_CN = "buildingNameAdd";
	public static String TB_ADD_NAME_EN = "buildingNameEnAdd";
	public static String TB_TYPE_SPEAKING = "//*[@id='checkBuildingType']/input[1]";
	public static String TB_TYPE_WRITING = "//*[@id='checkBuildingType']/input[2]";
	public static String TB_TYPE_CB = "//*[@id='checkBuildingType']/input[3]";
	public static String TB_FLOOR = "FloorDesc";
	public static String TB_ADDRESS_CN = "BuildingAddress";
	public static String TB_ADDRESS_EN = "BuildingAddressEn";
	public static String TB_MODIFY = "Modify";
	public static String TB_MODIFY_REMARK = "RemarkBuilding";
	public static String TB_MODIFYLOG = "ModifyLog";
	public static String TB_VIEW = "View";
	public static String TB_VIEW_NAME = "//*[@id='testBuildingDetailsWindow']/table/tbody/tr[2]/td";
	public static String TB_LENDBUILDING = "LendBuilding";
	public static String TB_LENDBUILDING_ONE = "//*[@id='ModifyExtraBuildingDialog']/ul/li[2]/input";
	
	//Test Room
	public static String TEST_ROOM_LIST = "//*[@id='TestCenter']/ul/li[3]/a";
	public static String TR_CREATE = "//input[@value='Create']";
	public static String TR_REGION = "selectofficeRoomSearch";
	public static String TR_CENTER = "selectCenterRoomSearch";
	public static String TR_BUILDING = "selectbuildingRoomSearch";
	public static String TR_AVAILABLE = "selectRoomAvailable";
	public static String TR_ROOM_TYPE = "selectRoomType";
	public static String TR_SEARCH = "//*[@id='page-heading']/div/table/tbody/tr[2]/td[6]/input[1]";
	public static String TR_TBNAME = "//*[@id='page-heading']/table/tbody/tr[1]/td[2]";
	public static String TR_ADD_NAME = "roomName";
	public static String TR_ADD_ROOMQUOTA = "RoomQuota";
	public static String TR_ADD_OPTIMALQUOTA = "OptimalQuota";
	public static String TR_ADD_ROOMTYPE_SPEAKING = "//*[@id='CheckRoomType']/input[1]";
	public static String TR_ADD_ROOMTYPE_WRITING = "//*[@id='CheckRoomType']/input[2]";
	public static String TR_ADD_PRODUCTTYPE_IELTS = "//*[@id='CheckRoomProductType']/input[1]";
	public static String TR_ADD_PRODUCTTYPE_IELTS_UKVI = "//*[@id='CheckRoomProductType']/input[2]";
	public static String TR_ADD_PRODUCTTYPE_IELTS_LIFE_SKILLS = "//*[@id='CheckRoomProductType']/input[3]";
	public static String TR_ADD_FLOOR = "Floor";
	
	
	
	
}
