package com.selenium.test.utils;

public class ElementHelper {

	public static String DEV_URL = "http://cnbjs1bms001:9003";
	public static String UAT_URL = "http://cnbjs1bms001:9001";
	public static String DEV_IEP = "http://iep-dev.chinacloudsites.cn/";
	public static int LONG_TIME = 10000;
	public static int WAIT_TIME = 6000;
	public static int SHORT_TIME = 3000;
	public static int SHORT_TIME_B = 2000;
	public static int SHORT_TIME_A = 1000;
	
	public static final String PROJECT_NAME= "MIS2_test";
	public static String VALUE = "1";
	public static String TEST_CENTER_ID = "100100";
	public static String REMARK_VALUE = "Automation Testing";
	public static String IEP_UESRNAME = "101089";
	public static String IEP_PASSWORD = "111111";
	public static String IEP_PINCODE = "1111";

	public static String USER_NAME = "userName";
	public static String PASSWORD = "password";
	public static String USER_NAME_VALUE = "Zhang Yifan"; 
	public static String PASSWORD_VALUE = "Zyf929670!";
	public static String LOGIN_BTN = "loginButt";
	public static String CANCEL = "//span[text(),'Cancel']";
	public static String SAVE = "//button[@type='button']";
	public static String USER_NAME_IEP = "examineraccount";
	public static String PASSWORD_IEP = "examinerpassword";
	public static String PINCODE_IEP = "examinerpincode";
	public static String LOGIN_IEP = "Log in";
	public static String RESULT_WARNING = "/html/body/div[14]/div[2]";
	
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
	public static String TDP_PROFILE_CREATE_PROVINCE = "addGeneralTDPInfo-Province";
	public static String TDP_PROFILE_CREATE_BASECITY = "addGeneralTDPInfo-BaseCity";
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
//	public static String TDP_PROFILE_CREATE_ROLES = "input[type='checkbox']";
	public static String TDP_PROFILE_CREATE_ROLES = "//td/table/tbody/tr/td/input";
	public static String TDP_PROFILE_ROLES = "selTDPProfileRole";
	public static String TDP_PROFILE_EMAIL = "tdpProfileSearchEmail";
	public static String TDP_PROFILE_SEARCH = "BtnTDPProFileSearch";
	public static String TDP_PROFILE_SEARCH_NAME = "//*[@id='TDPProfileInfoGrid']/div[2]/table/tbody/tr/td[4]";
	public static String TDP_PROFILE_SEARCH_ROLES = "//*[@id='TDPProfileInfoGrid']/div[2]/table/tbody/tr/td[13]";
	public static String TDP_PROFILE_VIEWLOG = "View Log";
	
	
	//TDP Task
	public static String TDP_TASK = "//*[@id='TDOL']/ul/li[2]/a";
	public static String TDP_TASK_CREATE = "TaskListBtnAdd";
	public static String TDP_TASK_CREATE_REGION = "CreateTdpTask-Region";
	public static String TDP_TASK_CREATE_TESTDATE = "CreateTdpTask-TestDate";
	public static String TDP_TASK_CREATE_OPEN_START = "CreateTdpTask-OpenIntervalStart";
	public static String TDP_TASK_CREATE_OPEN_END = "CreateTdpTask-OpenIntervalEnd";
	public static String TDP_TASK_CREATE_TESTDAY_1= "//*[@id='CreateTdpTask-TestDayChoose']/input[1]";
	public static String TDP_TASK_CREATE_TESTDAY_2= "//*[@id='CreateTdpTask-TestDayChoose']/input[2]";
	public static String TDP_TASK_SEARCH = "TaskListBtnSearch";
	public static String TDP_TASK_TESTDATE_FROM = "testdate";
	public static String TDP_TASK_TESTDATE_TO = "testdate1";
	public static String TDP_TASK_SEARCH_TESTDATE = "//*[@id='TaskListTable']/tbody/tr[1]/td[3]";
	public static String TDP_TASK_SEARCH_OPENINTERVAL_START = "//*[@id='TaskListTable']/tbody/tr[1]/td[4]";
	public static String TDP_TASK_SEARCH_OPENINTERVAL_END = "//*[@id='TaskListTable']/tbody/tr[1]/td[4]";
	public static String TDP_TASK_VIEW = "View";
	public static String TDP_TASK_REPORT = "SearchTdpCheckedReoprt";
	public static String TDP_TASK_MODIFY = "modifydoc";
	public static String TDP_TASK_EXPORT = "exportCheckUnit";
	public static String TDP_TASK_LOG = "Log";
	public static String TDP_TASK_MODIFY_DESCRIPTION = "CreateTdpTask-Description";
	
	//Arrange Supervisor
	public static String ARRANGE_SUPERVISOR = "//*[@id='TDOL']/ul/li[6]/a";
	public static String ARRANGE_SUPERVISOR_MONTH = "arranging_supervisor_Month";
	public static String ARRANGE_SUPERVISOR_DATE = "arranging_supervisor_Datetime";
	public static String ARRANGE_SUPERVISOR_TEST_DAY1 = "//input[@value='04/Feb/2018']";
	public static String ARRANGE_SUPERVISOR_TEST_DAY2 = "//input[@value='05/Feb/2018']";
	public static String ARRANGE_SUPERVISOR_TEST_DAY3 = "//input[@value='06/Feb/2018']";
	public static String ARRANGE_SUPERVISOR_SEARCH = "btnArranging_supervisor";
	public static String ARRANGE_SUPERVISOR_SAVE = "ArrangingSupervisorSave";
	public static String ARRANGE_SUPERVISOR_DRAG = "//*[@id='SpreadSheet-Supervisor-tdp']/div[2]/table/tbody/tr[2]/td[1]/div";
	public static String ARRANGE_SUPERVISOR_DROP = "session33432AM";
	
	//Arrange SAS
	public static String ARRANGE_SAS = "//*[@id='TDOL']/ul/li[7]/a";
	public static String ARRANGE_SAS_MONTH = "arranging_SecurityAS_Month";
	public static String ARRANGE_SAS_DATE = "arranging_SecurityAS_Datetime";
	public static String ARRANGE_SAS_DUTY = "arrange_SecurityAs_Duty";
	public static String ARRANGE_SAS_SEARCH= "btnArranging_SecurityAS";
	public static String ARRANGE_SAS_SAVE = "ArrangingSecurityASSave";
	public static String ARRANGE_SAS_DRAG = "//*[@id='SpreadSheet-SecurityAS-tdp']/div[2]/table/tbody/tr[5]/td[1]/div";
	public static String ARRANGE_SAS_DROP = "testSessionId33707AM";
	
	//Arrange Spk AS
	public static String SPK_AS_TEST_DAY1 = "//input[@value='04/Feb/2018']";
	public static String SPK_AS_TEST_DAY2 = "//input[@value='05/Feb/2018']";
	public static String SPK_AS_TEST_DAY3 = "//input[@value='06/Feb/2018']";
	public static String SPK_AS_DRAG = "//*[@id='SpreadSheet-SecurityAS-tdp']/div[2]/table/tbody/tr[2]/td[1]/div";
	public static String SPK_AS_DROP = "testSessionId33707AM";
	
	//Arrange WAS
	public static String ARRANGE_WAS = "//*[@id='TDOL']/ul/li[8]/a";
	public static String ARRANGE_WAS_MONTH = "arranging_wAssistantSupervisor_Month";
	public static String ARRANGE_WAS_DATE = "ddlTestDate-wAssistantSupervisor";
	public static String ARRANGE_WAS_TC = "ddlTestCenter-wAssistantSupervisor";
	public static String ARRANGE_WAS_SEARCH = "BtnwAssistantSupervisorSearch";
	public static String ARRANGE_WAS_SELECT_ALL = "checkwAssistantSupervisor-wRoomAll";
	public static String ARRANGE_WAS_CLEAR = "btnClear-wAssistantSupervisor";
	public static String ARRANGE_WAS_SAVE = "btnSave-wAssistantSupervisor";	
	public static String ARRANGE_WAS_DRAG = "//*[@id='SpreadSheet-wAssistantSupervisor-tdp']/div[2]/table/tbody/tr[3]/td[2]/div";
	public static String ARRANGE_WAS_DROP = "//*[@id='SpreadSheet-wAssistantSupervisor-wRoom']/div[2]/table/tbody/tr[1]/td[7]/div";
	
	//Arrange Data AS
	public static String ARRANGE_DATA_AS = "//*[@id='TDOL']/ul/li[9]/a";
	public static String ARRANGE_DATA_AS_MONTH = "arranging_dataas_Month";
	public static String ARRANGE_DATA_AS_DATE = "arranging_dataas_Datetime";
	public static String ARRANGE_DATA_AS_TEST_DAY1 = "//input[@value='04/Feb/2018']";
	public static String ARRANGE_DATA_AS_TEST_DAY2 = "//input[@value='05/Feb/2018']";
	public static String ARRANGE_DATA_AS_TEST_DAY3 = "//input[@value='06/Feb/2018']";
	public static String ARRANGE_DATA_AS_SEARCH = "btnSearch_DataAsAndCenter";
	public static String ARRANGE_DATA_AS_DRAG = "//*[@id='SpreadSheet-dataas-tdp']/div[2]/table/tbody/tr[2]/td[1]/div";
	public static String ARRANGE_DATA_AS_DROP = "session33762AM";
	public static String ARRANGE_DATA_AS_SAVE = "ArrangingdataasSave";
	
	//Arrange WAS to TC
	public static String ARRANGE_WAS_TO_TC = "//*[@id='TDOL']/ul/li[10]/a";
	public static String ARRANGE_WAS_TO_TC_MONTH = "arranging_SpecialAs_Month";
	public static String ARRANGE_WAS_TO_TC_DATE = "arranging_SpecialAs_Datetime";
	public static String ARRANGE_WAS_TO_TC_DUTY = "arrange_SpecialAs_Duty";
	public static String ARRANGE_WAS_TO_TC_SEARCH = "btnArranging_SpecialAs";
	public static String ARRANGE_WAS_TO_TC_DRAG = "//*[@id='SpreadSheet-SpecialAs-tdp']/div[2]/table/tbody/tr[1]/td[1]/div";
	public static String ARRANGE_WAS_TO_TC_DROP = "session33707AM";
	public static String ARRANGE_WAS_TO_TC_SAVE = "ArrangingSpecialAsSave";
	
	//Arrange Invigilator
	public static String ARRANGE_INVIGILATOR = "//*[@id='TDOL']/ul/li[11]/a";
	public static String ARRANGE_INVIGILATOR_MONTH = "arranging_Invigilator_Month";
	public static String ARRANGE_INVIGILATOR_DATE = "ArrangeInvigilatorDatetime";
	public static String ARRANGE_INVIGILATOR_TC = "ArrangeInvigilatorCenterId";
	public static String ARRANGE_INVIGILATOR_SEARCH = "btnArranging_invigilator";
	public static String ARRANGE_INVIGILATOR_DRAG = "//*[@id='SpreadSheet-Invigilator-tdp']/div[2]/table/tbody/tr[1]/td[2]/div";
	public static String ARRANGE_INVIGILATOR_DROP = "//*[@id='SpreadSheet-Invigilator-wRoom']/div[2]/table/tbody/tr[1]/td[7]/div";
	public static String ARRANGE_INVIGILATOR_SAVE = "ArranginginvigilatorSave";
	
	//Arrange BagDuty
	public static String ARRANGE_BAGDUTY = "//*[@id='TDOL']/ul/li[12]/a";
	public static String ARRANGE_BAGDUTY_MONTH = "arranging_Others_Month";
	public static String ARRANGE_BAGDUTY_DATE = "arranging_Others_Datetime";
	public static String ARRANGE_BAGDUTY_TEST_DAY1 = "//input[@value='04/Feb/2018']";
	public static String ARRANGE_BAGDUTY_TEST_DAY2 = "//input[@value='05/Feb/2018']";
	public static String ARRANGE_BAGDUTY_TEST_DAY3 = "//input[@value='06/Feb/2018']";
	public static String ARRANGE_BAGDUTY_SEARCH = "btnArranging_Others";
	public static String ARRANGE_BAGDUTY_DRAG = "//*[@id='SpreadSheet-Others-tdp']/div[2]/table/tbody/tr[1]/td[1]/div";
	public static String ARRANGE_BAGDUTY_DROP = "center33707AM";
	public static String ARRANGE_BAGDUTY_SAVE = "ArrangingOthersSave";
	
	//Arrange Reports
	public static String ARRANGE_REPORTS = "//*[@id='TDOL']/ul/li[13]/a";
	public static String ARRANGE_REPORTS_MONTH = "selArrangeReportMonth";
	public static String ARRANGE_REPORTS_DATE = "selArrangentReportTestDate";
	public static String ARRANGE_REPORTS_SEARCH = "//input[@value='Search']";
	public static String ARRANGE_REPORTS_DETAIL = "//td[@id='ArrangementReportsGrid_active_cell']/a/span";
	public static String ARRANGE_REPORTS_SENDREMINDER = "//td[@id='ArrangementReportsGrid_active_cell']/a[3]/span";
	public static String ARRANGE_REPORTS_RELEASE = "//td[@id='ArrangementReportsGrid_active_cell']/a[4]/span";
	public static String ARRANGE_REPORTS_NOTICE = "//td[@id='ArrangementReportsGrid_active_cell']/a[5]/span";

	
	//Post Test
	public static String POST_TEST = "PostTest";
	
	//Candidate Status Block
	public static String CAN_STATUS_BLOCK = "//*[@id='PostTest']/ul/li[1]/a";
	public static String CAN_STATUS_BLOCK_REGION = "CandidateStatus_List_Region";
	public static String CAN_STATUS_BLOCK_MONTH = "ddlMonth-CandidateStatus";
	public static String CAN_STATUS_BLOCK_DATE = "CandidateStatus_List_Datetime";
	public static String CAN_STATUS_BLOCK_SEARCH = "CandidateStatus_List_BtnQuery";
	public static String CAN_STATUS_BLOCK_MODIFY = "//input[@value='Modify']";
	public static String CAN_STATUS_BLOCK_MODIFY_GIVENNAME_EN = "candidate_status_Reg_name";
	public static String CAN_STATUS_BLOCK_MODIFY_GIVENNAME_CN = "candidate_status_Reg_ch_name";
	public static String CAN_STATUS_BLOCK_CANDIDATE_NO = "CandidateStatus_List_Search_CandidateNo";
	public static String CAN_STATUS_BLOCK_SEARCH_INFO = "//*[@id='CandidateStatus_List_tabsGrid']/div[2]/table/tbody/tr/td[2]";
	public static String CAN_STATUS_BLOCK_SEARCH_CHINESE_NAME = "//*[@id='CandidateStatus_List_tabsGrid']/div[2]/table/tbody/tr/td[9]";
	public static String CAN_STATUS_BLOCK_STATUS_SELECT = "Candidate_Status_Chk_13479094";
	public static String CAN_STATUS_BLOCK_TEST_STATUS = "Candidate_Status_Test_List_13479094";
    public static String CAN_STATUS_BLOCK_SCORE_STATUS = "Candidate_Status_Score_List_13479094";
    public static String CAN_STATUS_BLOCK_STATUS_SAVE = "Candidate_Status_Save_Selected";
 
    //Test Material Check
    public static String TEST_MATERIAL_CHECK = "//*[@id='PostTest']/ul/li[3]/a";
    public static String TEST_MATERIAL_MONTH = "ddlMonth-testmaterial";
    public static String TEST_MATERIAL_DATE = "ddlTestDate-testmaterial";
    public static String TEST_MATERIAL_TC = "ddlTestCenter-testmaterial";
    public static String TEST_MATERIAL_CANDIDATENO = "CandidateNo-testmaterial";
    public static String TEST_MATERIAL_SEARCH = "btnQuery-testmaterial";
    public static String TEST_MATERIAL_SEARCH_NAME = "//*[@id='spreadsheet-TestMaterial-Grid']/div[2]/table/tbody/tr/td[6]";
    public static String TEST_MATERIAL_SEARCH_SCORE_STATUS = "//*[@id='spreadsheet-TestMaterial-Grid']/div[2]/table/tbody/tr/td[9]";
    public static String TEST_MATERIAL_EXPORT = "ExportTestMarterialExcel";
    
    //Set Score
    public static String SET_SCORE = "//*[@id='PostTest']/ul/li[8]/a";
    public static String SET_SCORE_YEAR = "setscore-Select-Year-Search";
    public static String SET_SCORE_MONTH = "setscore-Select-Month-Search";
    public static String SET_SCORE_DATE = "ddlTestDate-setscore";
    public static String SET_SCORE_TC = "ddlTestCenter-setscore";
    public static String SET_SCORE_SEARCH = "btnQuery-setscore";
    public static String SET_SCORE_SAVE = "//input[@value,'Set to 0']";
    public static String SET_SCORE_SELECT_ALL = "checkspeakingtravelAll";
    
    //Confirm Set Score
    public static String CONFIRM_SET_SCORE = "//*[@id='PostTest']/ul/li[9]/a";
    
    //Score Upload
    public static String SCORE_UPLOAD = "//*[@id='PostTest']/ul/li[11]/a";
    
    //Import Log
    public static String IMPORT_LOG = "//*[@id='PostTest']/ul/li[5]/a";
    
    //Score Check
    public static String SCORE_CHECK = "//*[@id='PostTest']/ul/li[6]/a";
    
    //Status Score Check
    public static String STATUS_SCORE_CHECK = "//*[@id='PostTest']/ul/li[7]/a";
    
    //Jagged Profile Info
    public static String JAGGED_PROFILE_INFO = "//*[@id='PostTest']/ul/li[4]/a";
    public static String JAGGED_TEST_DATE_FROM = "SddlTestDate-ScoreExtraHandlingJP-start";
    public static String JAGGED_TEST_DATE_TO = "SddlTestDate-ScoreExtraHandlingJP-end";
    public static String JAGGED_TEST_DATE_FROM_YEAR = "ui-datepicker-year";
    public static String JAGGED_TEST_DATE_FROM_MONTH = "ui-datepicker-month";
    public static String JAGGED_TEST_DATE_FROM_DATE = "//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[7]/a";
    public static String JAGGED_TEST_DATE_TO_YEAR = "ui-datepicker-year";
    public static String JAGGED_TEST_DATE_TO_MONTH = "ui-datepicker-month";
    public static String JAGGED_TEST_DATE_TO_DATE = "//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[7]/a";
    public static String JAGGED_EXPORT = "btn-ScoreExtraHandlingJP-ExportJPRate";
    
    //PE SE Comparison
    public static String PE_SE_COMPARISON = "//*[@id='PostTest']/ul/li[10]/a";
    public static String PE_SE_YEAR = "select-ComparisonFEorSe-TestDat-Year";
    public static String PE_SE_MONTH = "select-ComparisonFEorSe-Month";
    public static String PE_SE_DATE = "select-ComparisonFEorSe-TestDat";
    public static String PE_SE_TC = "select-ComparisonFEorSe-TestCenter";
    public static String PE_SE_1STMARKING = "1stMarking";
    public static String PE_SE_2NDMARKING = "2ndMarking";
    public static String PE_SE_SEARCH_R = "//*[@id='div_ComparisonFEorSe_Grid']/div[2]/table/tbody/tr[1]/td[8]";
    public static String PE_SE_SEARCH_S_LR = "//*[@id='div_ComparisonFEorSe_Grid1']/div[2]/table/tbody/tr[1]/td[16]";
    
    //Candidate From Itap
    public static String CANDIDATE_FROM_ITAP = "//*[@id='PostTest']/ul/li[12]/a";
    public static String CANDIDATE_FROM_ITAP_YEAR = "CandidateFromItap_Year";
    public static String CANDIDATE_FROM_ITAP_MONTH = "CandidateFromItap_Month";
    public static String CANDIDATE_FROM_ITAP_DATE = "ddlTestDate-CandidateFromItap";
    public static String CANDIDATE_FROM_ITAP_SEARCH = "SearchCandidateFromItap_Search";
    public static String CANDIDATE_FROM_ITAP_REGISTRATION = "//*[@id='CandidateFromItap_guid']/div[2]/table/tbody/tr[1]/td[5]";
    public static String CANDIDATE_FROM_ITAP_SYNC= "//*[@id='CandidateFromItap_guid']/div[2]/table/tbody/tr[1]/td[6]";
    public static String CANDIDATE_FROM_ITAP_SPECIAL = "//*[@id='CandidateFromItap_guid']/div[2]/table/tbody/tr[1]/td[7]";

    
    //CS-CS
    public static String CS_CS = "CS-CS";
    //Free Candidate Add
    public static String FREE_CANDIDATE_ADD = "//*[@id='CS-CS']/ul/li[1]/a";
    public static String FREE_CANDIDATE_REGION = "selectFreeCandidateAddRegion";
    public static String FREE_CANDIDATE_MONTH = "FreeCandidateAdd-Select-Month-Search";
    public static String FREE_CANDIDATE_DATE = "selectFreeCandidateAddTestDate";
    public static String FREE_CANDIDATE_TC = "selectFreeCandidateAddTestCenter";
    public static String FREE_CANDIDATE_SEARCH = "btnFreeCandidateAddQuery";
    public static String FREE_CANDIDATE_ADD_LR = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[1]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_LW = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[2]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_LS = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[3]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_LRS = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[4]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_RW = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[5]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_WS = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[6]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_RWS = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[7]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_LWS = "//*[@id='spreadsheet-freecandidateadd-table']/tbody/tr[8]/td[1]/input";
    public static String FREE_CANDIDATE_ADD_LISTENING = "FreeTestModuleAdd_50";
    public static String FREE_CANDIDATE_ADD_READING = "FreeTestModuleAdd_51";
    public static String FREE_CANDIDATE_ADD_WRITTING = "FreeTestModuleAdd_52";
    public static String FREE_CANDIDATE_ADD_SPEAKING = "FreeTestModuleAdd_53";
    public static String FREE_CANDIDATE_ADD_MONTH = "AddFreeTestCandidateWindow-Select-Month-Search";
    public static String FREE_CANDIDATE_ADD_TESTDATE = "selectFreeCandidateAddTestDateAdd";
    public static String FREE_CANDIDATE_ADD_TC = "selectFreeCandidateAddTestCenterAdd";
    public static String FREE_CANDIDATE_ADD_REASON = "selectFreeTestCandidateTestReasonAdd";
    
    //Free Candidate List
    public static String FREE_CANDIDATE_LIST = "//*[@id='CS-CS']/ul/li[2]/a";
    public static String FREE_CANDIDATE_LIST_REGION = "selectFreeTestCandidateRegion";
    public static String FREE_CANDIDATE_LIST_LAST_MONTH = "FreeTestCandidate-TestDate-Select-LastMonth-Search";
    public static String FREE_CANDIDATE_LIST_LAST_DATE = "selectFreeTestCandidateLastTestDate";
    public static String FREE_CANDIDATE_LIST_FREE_MONTH = "FreeTestCandidate-TestDate-Select-FreeMonth-Search";
    public static String FREE_CANDIDATE_LIST_FREE_DATE = "selectFreeTestCandidateFreeTestDate";
    public static String FREE_CANDIDATE_LIST_SEARCH = "btnFreeTestCandidateQuery";
    public static String FREE_CANDIDATE_LIST_TYPE_LR = "//table[@id='spreadsheet-freetestcandidate-table']/tbody/tr[1]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_LW = "//div[2]/table/tbody/tr[2]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_LS = "//div[2]/table/tbody/tr[3]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_LRS = "//div[2]/table/tbody/tr[4]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_RW = "//div[2]/table/tbody/tr[5]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_WS = "//div[2]/table/tbody/tr[6]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_RWS = "//div[2]/table/tbody/tr[7]/td[2]";
    public static String FREE_CANDIDATE_LIST_TYPE_LWS = "//div[2]/table/tbody/tr[8]/td[2]";
    public static String FREE_CANDIDATE_LIST_REASON_LR = "//table[@id='spreadsheet-freetestcandidate-table']/tbody/tr[1]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_LW = "//div[2]/table/tbody/tr[2]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_LS = "//div[2]/table/tbody/tr[3]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_LRS = "//div[2]/table/tbody/tr[4]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_RW = "//div[2]/table/tbody/tr[5]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_WS = "//div[2]/table/tbody/tr[6]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_RWS = "//div[2]/table/tbody/tr[7]/td[3]";
    public static String FREE_CANDIDATE_LIST_REASON_LWS = "//div[2]/table/tbody/tr[8]/td[3]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_LR = "//table[@id='spreadsheet-freetestcandidate-table']/tbody/tr[1]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_LW = "//div[2]/table/tbody/tr[2]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_LS = "//div[2]/table/tbody/tr[3]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_LRS = "//div[2]/table/tbody/tr[4]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_RW = "//div[2]/table/tbody/tr[5]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_WS = "//div[2]/table/tbody/tr[6]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_RWS = "//div[2]/table/tbody/tr[7]/td[4]";
    public static String FREE_CANDIDATE_LIST_CANDDNO_LWS = "//div[2]/table/tbody/tr[8]/td[4]";
    public static String FREE_CANDIDATE_LIST_UPDATE = "//input[@value='Update']"; 
    public static String FREE_CANDIDATE_LIST_UPDATE_REMARK = "areaFreeTestCandidateRemark";
    public static String FREE_CANDIDATE_LIST_VIEW = "//input[@value='View']";
    public static String FREE_CANDIDATE_LIST_VIEW_LISTENING = "//*[@id='div-candidate-free-listening']/table/tbody/tr[1]/td";
    public static String FREE_CANDIDATE_LIST_VIEW_LISTENING_DATE = "//*[@id='div-candidate-free-listening']/table/tbody/tr[4]/td";
    public static String FREE_CANDIDATE_LIST_VIEW_READING_UI = "ui-id-12";
    public static String FREE_CANDIDATE_LIST_VIEW_READING = "//*[@id='div-candidate-free-reading']/table/tbody/tr[1]/td";
    public static String FREE_CANDIDATE_LIST_VIEW_READING_DATE = "//*[@id='div-candidate-free-reading']/table/tbody/tr[4]/td";
    
    //Complaint Candidate Add
    public static String COMPLAINT_CANDIDATE_ADD = "//*[@id='CS-CS']/ul/li[3]/a";
    public static String COMPLAINT_CANDIDATE_REGION = "selectComplaintAddRegion";
    public static String COMPLAINT_CANDIDATE_YEAR = "ComplaintAdd-Select-Year-Search";
    public static String COMPLAINT_CANDIDATE_MONTH = "ComplaintAdd-Select-Month-Search";
    public static String COMPLAINT_CANDIDATE_DATE = "selectComplaintAddTestDate";
    public static String COMPLAINT_CANDIDATE_SEARCH = "btnComplaintAddQuery";
    
    //General Enquiry
    public static String GENERAL_ENQUIRY = "//*[@id='CS-CS']/ul/li[6]/a";
    public static String GENERAL_ENQUIRY_YEAR = "LetterCandidateYear";
    public static String GENERAL_ENQUIRY_MONTH = "LetterCandidateMonth";
    public static String GENERAL_ENQUIRY_DATE = "selectLetterCandidateTestDate";
    public static String GENERAL_ENQUIRY_SEARCH = "btn-LetterCandidate-Search";
    public static String GENERAL_ENQUIRY_EXPORT = "btn-LetterCandidate-Export";
    
    
    //Marketing
    public static String MARKETING = "Marketing";
    
    //Query
    public static String MARKETING_QUERY = "//*[@id='Marketing']/ul/li[1]/a";
    public static String MARKETING_QUERY_REGION = "selectofficeMarketingSearch";
    public static String MARKETING_QUERY_DATE_FROM = "txtMarketingTestDateB";
    public static String MARKETING_QUERY_DATE_TO = "txtMarketingTestDateE";
    public static String MARKETING_QUERY_SEARCH = "BtnMarketingSearch";
    public static String MARKETING_QUERY_TYPE_B = "radio2";
    public static String MARKETING_QUERY_EXPORT = "btnMarketingCanExport";
    public static String MARKETING_QUERY_NEW_EXPORT = "btnNewMarketingCanExport";
    
    //Report By Region
    public static String REPORT_BY_REGION = "//*[@id='Marketing']/ul/li[2]/a";
    public static String REPORT_BY_REGION_REGION = "selectofficeMarketingSearch_report";
    public static String REPORT_BY_REGION_DATE_FROM = "txtMarketingTestDateB_report";
    public static String REPORT_BY_REGION_DATE_TO = "txtMarketingTestDateE_report";
    public static String REPORT_BY_REGION_SEARCH = "BtnMarketingSearch_report";
    public static String REPORT_BY_REGION_EXPORT = "btnMarketingCanExport_report";
    
    //Report By Region Origin
    public static String REPORT_BY_REGION_ORIGIN = "//*[@id='Marketing']/ul/li[3]/a";
    public static String REPORT_BY_REGION_ORIGIN_DATE_FROM = "txtMarketingTestDateB_city";
    public static String REPORT_BY_REGION_ORIGIN_DATE_TO = "txtMarketingTestDateE_city";
    public static String REPORT_BY_REGION_ORIGIN_SEARCH = "BtnMarketingSearch_city";
    public static String REPORT_BY_REGION_ORIGIN_EXPORT = "btnMarketingCanExport_city";
    
    //Report By Center
    public static String REPORT_BY_CENTER = "//*[@id='Marketing']/ul/li[4]/a";
    public static String REPORT_BY_CENTER_REGION = "selectofficeMarketingSearch_center";
    public static String REPORT_BY_CENTER_DATE_FROM = "txtMarketingTestDateB_center";
    public static String REPORT_BY_CENTER_DATE_TO = "txtMarketingTestDateE_center";
    public static String REPORT_BY_CENTER_SEARCH = "BtnMarketingSearch_center";
    public static String REPORT_BY_CENTER_EXPORT = "btnMarketingCanExport_center";
    
    //Report By Center Origin
    public static String REPORT_BY_CENTER_ORIGIN = "//*[@id='Marketing']/ul/li[5]/a";
    public static String REPORT_BY_CENTER_ORIGIN_DATE_FROM = "txtMarketingTestDateB_centercity";
    public static String REPORT_BY_CENTER_ORIGIN_DATE_TO = "txtMarketingTestDateE_centercity";
    public static String REPORT_BY_CENTER_ORIGIN_CITY = "selectofficeMarketingCity_centercity";
    public static String REPORT_BY_CENTER_ORIGIN_CENTER = "selectofficeMarketingCenter_centercity";
    public static String REPORT_BY_CENTER_ORIGIN_SEARCH = "BtnMarketingSearch_centercity";
    public static String REPORT_BY_CENTER_ORIGIN_EXPORT = "btnMarketingCanExport_centercity";
    
    
    //CS-Extra
    public static String CS_EXTRA = "CS-Extra";
    
    //Filter Words List
    public static String FILTER_WORDS = "//*[@id='CS-Extra']/ul/li[1]/a";
    public static String FILTER_WORDS_ADD = "inp-Create-ExtraFilterWord";
    public static String FILTER_WORDS_ADD_NAME = "WordName-ExtraFilterWord";
    public static String FILTER_WORDS_ADD_TYPE = "SelectWordTypeTc-ExtraFilterWord";
    public static String FILTER_WORDS_MODIFY = "Modify";
    public static String FILTER_WORDS_DELETE = "Delete";
    public static String FILTER_WORDS_MODIFY_WORDS = "//*[@id='SpreadSheetExtraFilterWordGrid']/div[2]/table/tbody/tr[1]/td[1]";
    public static String FILTER_WORDS_MODIFY_NAME = "//*[@id='SpreadSheetExtraFilterWordGrid']/div[2]/table/tbody/tr[1]/td[3]";
    
    //Pending List
    public static String PENDING_LIST = "//*[@id='CS-Extra']/ul/li[2]/a";
    public static String PENDING_LIST_REGION = "RegionIdSecrch-ExtraAppList";
    public static String PENDING_LIST_YEAR = "sel_searchTestDate_Year_ExtraAppList";
    public static String PENDING_LIST_MONTH = "sel_searchTestDate_Month_ExtraAppList";
    public static String PENDING_LIST_DATE = "sel_searchTestDate_ExtraAppList";
    public static String PENDING_LIST_SEARCH = "//input[contains(@value,'Search')]";
    public static String PENDING_LIST_PROCESSING = "//*[@id='SpreadSheetExtraAppListGrid']/div[2]/table/tbody/tr/td[8]/a[2]";
    public static String PENDING_LIST_VIEWLOG = "//*[@id='SpreadSheetExtraAppListGrid']/div[2]/table/tbody/tr/td[8]/a[3]";
    public static String PENDING_LIST_VIEWLOG_UPDATEBY = "//*[@id='ExtraAppList_Pendding-divHistory-ViewLogGrid']/div[2]/table/tbody/tr[1]/td[3]";

    //Extra List
    public static String EXTRA_LIST = "//*[@id='CS-Extra']/ul/li[3]/a";
    public static String EXTRA_LIST_REGION = "ExtraAppListTwo-RegionIdSecrch";
    public static String EXTRA_LIST_YEAR = "ExtraAppListTwo-YearSecrch";
    public static String EXTRA_LIST_MONTH = "ExtraAppListTwo-MonthSecrch";
    public static String EXTRA_LIST_DATE = "ExtraAppListTwo-DateIdSecrch";
    public static String EXTRA_LIST_STATUS = "ExtraAppListTwo-ExtraStatusSecrch";
    public static String EXTRA_LIST_CANDIDATE_NO = "ExtraAppListTwo-CandidateIDSecrch";
    public static String EXTRA_LIST_SEARCH = "//input[contains(@value,'Search')]";
    public static String EXTRA_LIST_SELECT = "//*[@id='SpreadSheetExtraAppListTwoGrid']/div[2]/table/tbody/tr/td[1]/input";
    public static String EXTRA_LIST_UPDATE_APP = "Update App";
    public static String EXTRA_LIST_UPDATE_APP_PHONE = "ExtraAppListTwo-PhoneUpdateApp";
    public static String EXTRA_LIST_DONE = "ExtraAppListTwo-Done";
    public static String EXTRA_LIST_EXPORT_EXCEL = "ExtraAppListTwo-ExportExcel";
    public static String EXTRA_LIST_PRINT_PROCESSING_LIST = "ExtraAppListTwo-Print";
    public static String EXTRA_LIST_PRINT_POSTAL_LABEL = "ExtraAppListTwo-PrintPostallabel";
    public static String EXTRA_LIST_EXPORT_EMS_DHL = "ExtraAppListTwo-EMS";
    public static String EXTRA_LIST_IMPORT_EMS_DHL = "ExtraAppListTwo-ImportEMS";
    
    //Refund
    public static String REFUND = "//*[@id='CS-Extra']/ul/li[4]/a";
    public static String REFUND_SEARCH = "inp-Query-ExtraAppListRefundList";
    public static String REFUND_CONFIRM = "inp-Confirm-ExtraAppListRefundList";
    public static String REFUND_SELECT = "//*[@id='SpreadSheetExtraAppListRefundListGrid']/div[2]/table/tbody/tr/td[1]/input";

    //Confirm Refund
    public static String CONFIRM_REFUND = "//*[@id='CS-Extra']/ul/li[5]/a";
    public static String CONFIRM_REFUND_SEARCH = "inp-Query-ExtraAppListConfirmRefundList";
    public static String CONFIRM_REFUND_SELECT = "//*[@id='SpreadSheetExtraAppListConfirmRefundListGrid']/div[2]/table/tbody/tr/td[1]/input";
    public static String CONFIRM_REFUND_APPROVE = "inp-Appore-ExtraAppListConfirmRefundList";

}
