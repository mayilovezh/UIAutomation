package com.selenium.test.utils;

public class ElementHelper {

	public String DEV_URL = "http://cnbjs1bms001:9003";
	public String UAT_URL = "http://cnbjs1bms001:9001";
	public static int LONG_TIME = 10000;
	public static int WAIT_TIME = 6000;
	public static int SHORT_TIME = 3000;
	public static int SHORT_TIME_A = 1000;
	
	public static final String PROJECT_NAME= "MIS2_test";
	public static String VALUE = "1";
	public static String TEST_CENTER_ID = "100100";
	public static String REMARK_VALUE = "Automation Testing";

	public  String USER_NAME = "userName";
	public  String PASSWORD = "password";
	public  String LOGIN_BTN = "loginButt";
	public static String CANCEL = "//span[text(),'Cancel']";
	public static String SAVE = "//button[@type='button']";
	
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
	public static String TR_MODIFY = "Modify";
	public static String TR_MODIFY_REMARK = "Remark";
	public static String TR_VIEW = "View";
	public static String TR_MODIFYLOG = "Modify Log";
	public static String TR_CREATE_SHARE_ROOM = "//input[@value='Create Share Room']";
	public static String TR_SHARE_ROOM_1 = "//div[2]/table/tbody/tr/td/input";
	public static String TR_SHARE_ROOM_1_YES  = "//td[3]/input";
	public static String TR_SHARE_START_DATE = "set_DateTime_RoomShareDateFrom";
	public static String TR_SHARE_END_DATE = "set_DateTime_RoomShareDateTo";
	public static String TR_SHARE_SEARCH = "btntestshareroomdatelistSearch";
	public static String TR_SHARE_TEST_DAY = "//td[2]/div/div/div/div[2]/table/tbody/tr/td/input";
	public static String TR_MODIFY_SHARE_DAY = "Modify Share Day";
	public static String TR_SHARE_LOG = "Share Log";
	
	//Test Session
	public static String TEST_SESSION_LIST = "//*[@id='TestCenter']/ul/li[4]/a";
	public static String TS_CREATE = "testSessionListCreate";
	public static String TS_CREATE_CENTER = "//tr[12]/td[2]";
	public static String TS_CREATE_YEAR_START= "ddlYear-testsessionAdd";
	public static String TS_CREATE_MONTH_START= "ddlMonth-testsessionAdd";
	public static String TS_CREATE_YEAR_END= "ddlYear-endYear1";
	public static String TS_CREATE_MONTH_END= "ddlMonth-endMonth1";
	public static String TS_CREATE_SEARCH = "btntestcenterlistSearch";
	public static String TS_CREATE_TESTDATE = "//td[2]/div/div/div/div[2]/table/tbody/tr/td/input"; 
	public static String TS_REGION = "selectRegionSearch-testsession";
	public static String TS_YEAR = "ddlYear-testsession";
	public static String TS_MONTH = "ddlMonth-testsession";
	public static String TS_DATE = "selectTestDateSearch";
	public static String TS_CENTER = "ddltestcenter-testsession";
	public static String TS_SEARCH =  "btntestsessionlistSearch";
	public static String TS_TEST_DATE = "//*[@id='spreadsheet_testsession_Grid']/div[2]/table/tbody/tr/td[1]";
	public static String TS_TEST_CENTER = "//*[@id='spreadsheet_testsession_Grid']/div[2]/table/tbody/tr/td[6]";
	public static String TS_MODIFY = "Modify";
	public static String TS_LOG = "Log";
	public static String TS_MODIFY_SESSION_QUOTA = "quotaForUpdate";
	
	//Test Date
	public static String TEST_DATE_LIST = "//*[@id='TestCenter']/ul/li[5]/a";
	public static String TD_IMPORT = "btnImportFileForTestDate";
	public static String TD_YEAR = "selectTestYear";
	public static String TD_EXAM_PRODUCT_TYPE = "testdate_search_examproducttype";
	public static String TD_EXAM_FORMAT = "testdate_search_examformat";
	public static String TD_SEARCH = "testdate_search";
	
	//Spk Room Template
	public static String SPK_ROOM_TEMPLATE = "//*[@id='TestCenter']/ul/li[6]/a";
	public static String SPK_TEMPLATE_REGION = "selectSPKRoomTemplateRegionSearch";
	public static String SPK_TEMPLATE_TEST_CENTER = "SPKRoomTemplateListTestCenterid";
	public static String SPK_TEMPLATE_SEARCH = "btnSPKRoomTemplateSearch";
	public static String SPK_TEMPLATE_ADD = "btnSPKRoomTemplateAddInSearch";
	public static String SPK_TEMPLATE_ADD_SEARCH = "btnSPKRoomTemplate-AddSearch";
	public static String SPK_TEMPLATE_ADD_BUILDING1 = "//*[@id='SpeakingTemplateBuilding-AddSearch']/input[1]";
	public static String SPK_TEMPLATE_ADD_BUILDING2 = "//*[@id='SpeakingTemplateBuilding-AddSearch']/input[2]";
	public static String SPK_TEMPLATE_ADD_SATURDAY = "//div[@id='spk-TemplateType']/input[2]";
	public static String SPK_TEMPLATE_ADD_ROOM = "//*[@id='SPKRoomTemplateTableTest']/table/tbody/tr[1]/td[2]"; 
	public static String SPK_TEMPLATE_ADD_SAVE = "submitSpeakingRoomTemplate";
	public static String SPK_TEMPLATE_NAME_SATURDAY = "//*[@id='SPKRoomTemplateListGrid']/div[2]/table/tbody/tr[1]/td[4]";
	public static String SPK_TEMPLATE_NAME_THURSDAY = "//*[@id='SPKRoomTemplateListGrid']/div[2]/table/tbody/tr[2]/td[4]";
	public static String SPK_TEMPLATE_MODIFY = "Modify";
	public static String SPK_TEMPLATE_VIEW = "View";
	public static String SPK_TEMPLATE_DELETE = "Delete";
	public static String SPK_TEMPLATE_MODIFY_ROOM = "//div[@id='ModifySPkTemplateTable']/table/tbody/tr/td[6]/input";
	public static String SPK_TEMPLATE_MODIFY_SAVE = "btnDoSPkTemplateModify";
	
	//Spk Room Availability
	public static String SPK_ROOM_AVAILABILITY = "//*[@id='TestCenter']/ul/li[7]/a";
	public static String SPK_ROOM_REGION = "SPKAvailabilityRegion-Search";
	public static String SPK_ROOM_PRODUCT = "SPKAvailabilityProduct-Search";
	public static String SPK_ROOM_FORMAT = "SPKAvailabilityFormat-Search";
	public static String SPK_ROOM_TEST_CENTER = "SPKAvailabilityTestCenter-Search";
	public static String SPK_ROOM_DATE_FROM = "SPKAvailabilityStartDate-Search";
	public static String SPK_ROOM_DATE_TO = "SPKAvailabilityEndDate-Search";
	public static String SPK_ROOM_SEARCH = "SPKAvailability-Search";
	public static String SPK_ROOM_CREATE = "SPKAvailability-AddSearch";
	public static String SPK_ROOM_CREATE_TEST_CENTER = "ddlTemplateTestCenter-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_TEMPLATE_TYPE = "ddlTemplateType-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_TEMPLATE_NAME = "ddlTemplateName-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_REGION = "ddlRegion-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_FORMAT = "ddlProduct-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_TC = "ddlTestCenter-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_YEAR_FROM = "ddlYear1-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_MONTH_FROM = "ddlMonth1-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_YEAR_TO = "ddlYear2-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_MONTH_TO = "ddlMonth2-SPKAvailablityAdd";
	public static String SPK_ROOM_CREATE_SEARCH = "btnSPKAvailablityCreateSearch";
	public static String SPK_ROOM_CREATE_TEST_DATE = "selecspktestdatereal-10344";
	public static String SPK_ROOM_SEARCH_TESTDATE = "//*[@id='SPKAvailabilityListGrid']/div[2]/table/tbody/tr[1]/td[1]";  
	public static String SPK_ROOM_MODIFY = "Modify";
	public static String SPK_ROOM_VIEW = "View";
	public static String SPK_ROOM_LOG = "Log";
	public static String SPK_ROOM_DELETE = "Delete";
	public static String SPK_ROOM_MODIFY_REMARK = "ddlRemark-SPKAvailablityModify";
	public static String SPK_ROOM_VIEW_REMARK = "ddlRemark-SPKAvailablityView";
	public static String SPK_ROOM_LOG_CONTENT = "//*[@id='SPKAvailabilityLogGrid']/div[2]/table/tbody/tr[1]/td[1]";

	
	//TDOL 
	public static String TDOL = "TDOL";
	
	//TDP Profile
	public static String TDP_PROFILE = "//*[@id='TDOL']/ul/li[1]/a";
	public static String TDP_PROFILE_CREATE = "btnTDPProFileCreate";
	public static String TDP_PROFILE_CREATE_REGION = "addGeneralTDPInfo-Regions";
	public static String TDP_PROFILE_CREATE_GIVEN_NAME_EN = "addGeneralTDPInfo-FirstName";
	public static String TDP_PROFILE_CREATE_MIDDLE_NAME_EN = "addGeneralTDPInfo-MiddleName";
	public static String TDP_PROFILE_CREATE_FAMILY_NAME_EN = "addGeneralTDPInfo-LastName";
	public static String TDP_PROFILE_CREATE_FAMILY_NAME_CN = "addGeneralTDPInfo-SurName";
	public static String TDP_PROFILE_CREATE_GIVEN_NAME_CN = "addGeneralTDPInfo-Curname";
	public static String TDP_PROFILE_CREATE_ID_TYPE = "addGeneralTDPInfo-IDType2";
	public static String TDP_PROFILE_CREATE_PASSORT_NUMBER = "addGeneralTDPInfo-IDNumber";
	public static String TDP_PROFILE_CREATE_GENDER_MALE = "addGeneralTDPInfo-Gender1";
	public static String TDP_PROFILE_CREATE_GENDER_FEMALE = "addGeneralTDPInfo-Gender2";
	public static String TDP_PROFILE_CREATE_DATEOFBIRTH = "addGeneralTDPInfo-DateOfBrith";
	public static String TDP_PROFILE_CREATE_MOBILE = "addGeneralTDPInfo-Mobile";
	public static String TDP_PROFILE_CREATE_EMAIL = "addGeneralTDPInfo-Email";
	public static String TDP_PROFILE_CREATE_NATIONALITY = "addGeneralTDPInfo-country";
	public static String TDP_PROFILE_CREATE_BASECITY = "addGeneralTDPInfo-Province";
	public static String TDP_PROFILE_CREATE_ROLES_WSUPERVISOR = "//*[@id='addGeneralTDPInfo-Roles']/tr[1]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_SSUPERVISOR = "//*[@id='addGeneralTDPInfo-Roles']/tr[2]/td[1]/input";		
	public static String TDP_PROFILE_CREATE_ROLES_SAS = "//*[@id='addGeneralTDPInfo-Roles']/tr[3]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_SPK_AS = "//*[@id='addGeneralTDPInfo-Roles']/tr[4]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_DATA_AS = "//*[@id='addGeneralTDPInfo-Roles']/tr[5]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_WAS = "//*[@id='addGeneralTDPInfo-Roles']/tr[6]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_INVIGILATOR_A = "//*[@id='addGeneralTDPInfo-Roles']/tr[7]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_INVIGILATOR_B = "//*[@id='addGeneralTDPInfo-Roles']/tr[8]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_BAG_PERSON = "//*[@id='addGeneralTDPInfo-Roles']/tr[9]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_BACK_UP = "//*[@id='addGeneralTDPInfo-Roles']/tr[10]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_TRAINEE = "//*[@id='addGeneralTDPInfo-Roles']/tr[11]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_AUDITOR = "//*[@id='addGeneralTDPInfo-Roles']/tr[12]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_CARMERAMAN = "//*[@id='addGeneralTDPInfo-Roles']/tr[13]/td[1]/input";
	public static String TDP_PROFILE_CREATE_ROLES_STATUS = "//input[contains(text(),'Active')]";
	
	
	
}
