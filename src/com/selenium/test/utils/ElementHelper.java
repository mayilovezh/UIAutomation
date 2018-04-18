package com.selenium.test.utils;

public class ElementHelper {

	//MIS
	public static String DEV_URL = "http://cnbjs1bms001:9003";
	public static String UAT_URL = "http://cnbjs1bms001:9001";
	public static String USER_NAME = "userName";
	public static String PASSWORD = "password";
	public static String USER_NAME_VALUE = "Zhang Yifan"; 
	public static String PASSWORD_VALUE = "Zyf929670!";
	public static String USER_NAME_EAST = "zhangyifan"; 
	public static String PASSWORD_EAST = "Zyf929670@";
	public static String LOGIN_BTN = "loginButt";
	
	//Wait Time
	public static int LONG_TIME = 10000;
	public static int LONG_TIME_A = 20000;
	public static int LONG_TIME_B = 30000;
	public static int WAIT_TIME = 6000;
	public static int SHORT_TIME = 3000;
	public static int SHORT_TIME_B = 2000;
	public static int SHORT_TIME_A = 1000;
	
	//VALUE
	public static final String PROJECT_NAME= "MIS2_test";
	public static String VALUE = "1";
	public static String TEST_CENTER_ID = "100100";
	public static String REMARK_VALUE = "Automation Testing";
	public static String USER = "Zhang Yifan";
	public static String CONFIRMATION = " Operation is successful";
	
	//TDOL IEP
	public static String DEV_IEP = "http://iep-dev.chinacloudsites.cn/";
	public static String IEP_UESRNAME = "101089";
	public static String IEP_PASSWORD = "111111";
	public static String IEP_PINCODE = "1111";
	public static String USER_NAME_IEP = "examineraccount";
	public static String PASSWORD_IEP = "examinerpassword";
	public static String PINCODE_IEP = "examinerpincode";
	public static String LOGIN_IEP = "Log in";
	
	//IEP
	public static String IEP_ACCOUNT = "998866";
	public static String IEP_PWD = "123456";
	public static String IEP_E_PINCODE = "1";
	
	//ICMP
	public static String DEV_ICMP = "http://icmp-dev.chinacloudsites.cn/";
	public static String UESR_NAME_ICMP = "clericalmarkeraccount";
	public static String PWD_ICMP = "clericalmarkerpassword";
	public static String PINCODE_ICMP = "clericalmarkerpincode";
	public static String UESR_NAME_VALUE_ICMP = "100284";
	public static String PWD_VALUE_ICMP = "123456";
	public static String PINCODE_VALUE_ICMP = "1234";
	public static String LOGIN_ICMP = "btnlogin";
	
	//Element
	public static String CANCEL = "//span[text(),'Cancel']";
	public static String SAVE = "//button[@type='button']";
	public static String RESULT_WARNING = "/html/body/div[14]/div[2]";
	//(dependsOnMethods = { ""})
	
	//Test Center
	public static String TEST_CENTER = "TestCenter";
	
	//Test Center List
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
	public static String TB_MODIFY_SAVE = "button.k-button";
	public static String TB_MODIFY_REMARK = "RemarkBuilding";
	public static String TB_MODIFYLOG = "Modify Log";
	public static String TB_VIEW = "View";
	public static String TB_VIEW_NAME = "//*[@id='testBuildingDetailsWindow']/table/tbody/tr[2]/td";
	public static String TB_LENDBUILDING = "Lend Building";
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
	public static String TR_VIEW = "(//a[contains(text(),'View')])[2]";
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
    
    //EMS Management
    public static String EMS_MANAGEMENT = "//*[@id='PostTest']/ul/li[2]/a";
 
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
    public static String SET_SCORE_SAVE = "//input[@value='Set to 0']";
    public static String SET_SCORE_SELECT_ALL = "checkspeakingtravelAll";
    
    //Confirm Set Score
    public static String CONFIRM_SET_SCORE = "//*[@id='PostTest']/ul/li[9]/a";
    public static String CONFIRM_SET_SCORE_YEAR = "confirmsetscore-Select-Year-Search";
    public static String CONFIRM_SET_SCORE_MONTH = "confirmsetscore-Select-Month-Search";
    public static String CONFIRM_SET_SCORE_DATE = "ddlTestDate-confirmsetscore";
    public static String CONFIRM_SET_SCORE_TC = "ddlTestCenter-confirmsetscore";
    public static String CONFIRM_SET_SCORE_SEARCH = "btnQuery-confirmsetscore";
    public static String CONFIRM_SET_SCORE_SET = "//input[@value='Set to 0']";
    public static String CONFIRM_SET_SCORE_SELECTALL = "Confirm_checkspeakingtravelAll";
    
    //Score Upload
    public static String SCORE_UPLOAD = "//*[@id='PostTest']/ul/li[11]/a";
    public static String SCORE_UPLOAD_YEAR = "ScoreUploadAndSyncLog-Select-Year-Search";
    public static String SCORE_UPLOAD_MONTH = "ScoreUploadAndSyncLog-Select-Month-Search";
    public static String SCORE_UPLOAD_DATE = "selectScoreUploadAndSyncLogTestDate";
    public static String SCORE_UPLOAD_SEARCH = "BtnScoreUploadAndSyncLogRefresh";
    public static String SCORE_UPLOAD_FIRST_MARKING = "//*[@id='ScoreUploadAndSyncLogGrid']/div[2]/table/tbody/tr[15]/td[12]/a[1]";
    public static String SCORE_UPLOAD_FIRST_RELEASE = "//*[@id='ScoreUploadAndSyncLogGrid']/div[2]/table/tbody/tr[15]/td[12]/a[2]";
    public static String SCORE_UPLOAD_CHOOSE_FIRST_MARKING = "file-ScoreUpload_Import1stMarking";
    public static String SCORE_UPLOAD_CHOOSE_FIRST_RELEASE = "file-ScoreUpload_Import1stRelease";
    public static String SCORE_UPLOAD_UPLOAD = "button.k-button.k-upload-selected";
    
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
    public static String CANDIDATE_FROM_ITAP_REGISTRATION = "//*[@id='CandidateFromItap_guid']/div[2]/table/tbody/tr[2]/td[5]";
    public static String CANDIDATE_FROM_ITAP_SYNC= "//*[@id='CandidateFromItap_guid']/div[2]/table/tbody/tr[2]/td[6]";
    public static String CANDIDATE_FROM_ITAP_SPECIAL = "//*[@id='CandidateFromItap_guid']/div[2]/table/tbody/tr[2/td[7]";
    
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
    
    
    //CS-EOR
    public static String CS_EOR = "CS-EOR";
    
    //UnProcessing List
    public static String UNPROCESSING_LIST = "//*[@id='CS-EOR']/ul/li[1]/a";
    public static String UNPROCESSING_LIST_REGION = "RegionIdSecrch_EORTRFNumberList";
    public static String UNPROCESSING_LIST_YEAR = "EORTRFNumberList-DateIdYearSecrch";
    public static String UNPROCESSING_LIST_MONTH = "EORTRFNumberList-DateIdMonthSecrch";
    public static String UNPROCESSING_LIST_DATE = "DateIdSecrch_EORTRFNumberList";
    public static String UNPROCESSING_LIST_MATCH_STATUS = "MatchStatusSecrch_EORTRFNumberList";
    public static String UNPROCESSING_LIST_SEARCH = "//input[contains(@value,'Search')]";
    public static String UNPROCESSING_LIST_SEARCH_DATE = "//*[@id='SpreadSheetEORTRFNumberListGrid']/div[2]/table/tbody/tr[1]/td[6]";
    public static String UNPROCESSING_LIST_ADD = "//input[contains(@value,'Add Candidate No.(TRF Received)')]";
    public static String UNPROCESSING_LIST_ADD_REGION = "RegionAdd-EORTRFNumberList";
    public static String UNPROCESSING_LIST_ADD_YEAR = "EORTRFNumberList-DateIdYearAdd";
    public static String UNPROCESSING_LIST_ADD_MONTH = "EORTRFNumberList-DateIdMonthAdd";
    public static String UNPROCESSING_LIST_ADD_TEST_DATE = "TestDateAdd-EORTRFNumberList";
    public static String UNPROCESSING_LIST_ADD_CDD_NO = "TRFNoAdd-EORTRFNumberList";
    public static String UNPROCESSING_LIST_START_SERVICE = "butStartService-EORTRFNumberList";
    
    //EOR APP List
    public static String EOR_APP_LIST = "//*[@id='CS-EOR']/ul/li[2]/a";
    public static String EOR_APP_LIST_REGION = "EORDetailsEORAppList-RegionIdSecrch";
    public static String EOR_APP_LIST_STATUS = "EORDetailsEORAppList-EORStatusSecrch";
    public static String EOR_APP_LIST_SEARCH = "//input[contains(@value,'Search')]";
    public static String EOR_APP_LIST_EXPORT_REGION = "EORDetailsEORAppList-ExportDispatchList-RegionIdSelect";
    public static String EOR_APP_LIST_EXPORT_YEAR = "EORDetailsEORAppList-ExportDispatchList-DespatchDateYearSelect";
    public static String EOR_APP_LIST_EXPORT_MONTH = "EORDetailsEORAppList-ExportDispatchList-DespatchDateMonthSelect";
    public static String EOR_APP_LIST_EXPORT_DATE = "EORDetailsEORAppList-ExportDispatchList-DespatchDateSelect";
    public static String EOR_APP_LIST_EXPORT_TYPE = "EORDetailsEORAppList-ExportDispatchList-EORType";
    public static String EOR_APP_LIST_EXPORT_DISPATCH_LIST = "inp-ExportDispatchList-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_LR_SCORE = "inp-ExportEORLRscoreinput-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_EOR_WRIT_SCORE = "inp-ExportEORwritingScoreinput-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_EOR_SPK_SCORE = "inp-ExportEORspeakingscoreinput-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_DIFF_WRIT = "inp-ExportDiffwriting-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_DIFF_SPK = "inp-ExportDiffspeaking-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_EMS_LIST = "inp-ExportEMS-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_EOR_SCORE_INFORMATION = "inp-ExportEORScoreInformation-EORDetailsEORAppList";
    public static String EOR_APP_LIST_EXPORT_EMS_LIST_NEW = "inp-ExportEMS-EORDetailsEORAppList_NEW";
    public static String EOR_APP_LIST_IMPORT_EMS = "EORDetailsEORAppList-ImportEMS";
    
    //EOR Marking 
    public static String EOR_MARKING = "//*[@id='CS-EOR']/ul/li[3]/a";
    public static String EOR_MARKING_REGION = "ddlRegion-eor";
    public static String EOR_MARKING_YEAR = "ddlYear-eor";
    public static String EOR_MARKING_MONTH = "ddlMonth-eor";
    public static String EOR_MARKING_DATE = "ddlDespatchDate-eor";
    public static String EOR_MARKING_SEARCH = "btnQuery-eor";
    public static String EOR_MARKING_AVAILABLE_EXAMINER = "spanAvailableExaminer-eor";
    public static String EOR_MARKING_SELECT_EXAMINER = "txtSelectExaminerNum-eor";
    public static String EOR_MARKING_CALCULATE = "btnCalculate-eor";
    public static String EOR_MARKING_CALCULATE_MAX_COUNT = "spanMaxTotalNum-eor";
    public static String EOR_MARKING_CALCULATE_MAX_AVG_COUNT = "spanMaxAvgNum-eor";
    public static String EOR_MARKING_NEW_AUTO_ALLOCATION = "btnAutoAllocation-eor-new";
    public static String EOR_MARKING_AUTO_ALLOCATION = "btnAutoAllocation-eor";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK = "btnManualAllocation-eor";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_EXAMINER = "ddlEorMarkingExamienrInfo";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_TYPE = "ddlEorMarkingeortype";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_SEARCH = "eormarkingmanualallocationcheckSearch";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_SELECT = "checkedbox_eorMaringmanualallocationcheckCandidateListGrid";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_CHECK = "eormarkingmanualallocationcheckcheck";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_AVAILABLE_EXAMINER = "//*[@id='eormarkingmanualallocationcheckAvailableexaminerradio']/table/tbody/tr[1]/td[1]/label/input";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_CONFIRM_SAVE = "(//button[@type='button'])[3]";
    public static String EOR_MARKING_MANUAL_ALLOCATION_CHECK_CONFIRM = "displayYesConfirmation";
    public static String EOR_MARKING_ALLOCATION_RESULT_PAGE = "btnTaskResultPage-eor";
    public static String EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN = "//*[@id='EorMarkingTabStrip']/ul/li[2]/span[2]";
    public static String EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN_EXAMINERNO = "//*[@id='SpreadSheetEorMarkingTask1Grid']/div[2]/table/tbody/tr[1]/td[2]";
    public static String EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN_EXAMINERNAME = "//*[@id='SpreadSheetEorMarkingTask1Grid']/div[2]/table/tbody/tr[1]/td[3]";
    public static String EOR_MARKING_ALLOCATION_RESULT_PAGE_WRITTEN_CDDNO = "//*[@id='SpreadSheetEorMarkingTask1Grid']/div[2]/table/tbody/tr[1]/td[4]";
    public static String EOR_MARKING_CLEAR_ALLOCATION = "btnClearAllocation-eor";
    public static String EOR_MARKING_SET_CAPACITY = "btnSetCapacityAll-eor";
    public static String EOR_MARKING_SET_CAPACITY_NUMBER = "txtnewcapacity-SetCapacityAll-eor";
    public static String EOR_MARKING_NOTICE = "btnNotice-eor";
    public static String EOR_MARKING_CLEAR_NOTICE = "btnClearMarkingNotice-eor";
    
    
    //1st Import Score
    public static String FIRST_IMPORT_SCORE = "//*[@id='CS-EOR']/ul/li[4]/a";
    public static String FIRST_IMPORT_SCORE_YEAR = "ddlYear-eorscore";
    public static String FIRST_IMPORT_SCORE_MONTH = "ddlMonth-eorscore";
    public static String FIRST_IMPORT_SCORE_DATE = "selectdespatchdate";
    public static String FIRST_IMPORT_SCORE_WRITING = "writingeorscore";
    public static String FIRST_IMPORT_SCORE_LR = "lreorscore";
    public static String FIRST_IMPORT_SCORE_SELECTFILE = "EorScoreFile";
    public static String FIRST_IMPORT_SCORE_UPLOAD = "button.k-button.k-upload-selected";
     
    //2nd Import Score
    public static String SECOND_IMPORT_SCORE = "//*[@id='CS-EOR']/ul/li[5]/a";
    public static String SECOND_IMPORT_SCORE_YEAR = "ddlYear-2ndeorscore";
    public static String SECOND_IMPORT_SCORE_MONTH = "ddlMonth-2ndeorscore";
    public static String SECOND_IMPORT_SCORE_DATE = "selectdespatchdate2ndeorscore";
    public static String SECOND_IMPORT_SCORE_WRITING = "writing2ndeorscore";
    public static String SECOND_IMPORT_SCORE_LR = "lr2ndeorscore";
    public static String SECOND_IMPORT_SCORE_SELECTFILE = "secondEorScoreFile";
    public static String SECOND_IMPORT_SCORE_UPLOAD = "button.k-button.k-upload-selected";
    
    //Refund
    public static String EOR_REFUND = "//*[@id='CS-EOR']/ul/li[6]/a";
    public static String EOR_REFUND_REGION = "EORDetailsRefundList-RegionIdSecrch";
    public static String EOR_REFUND_SEARCH = "inp-Query-EORDetailsRefundList";
    public static String EOR_REFUND_CONFIRM = "inp-Confirm-EORDetailsRefundList";
    public static String EOR_REFUND_SELECT = "//*[@id='SpreadSheetEORDetailsRefundListGrid']/div[2]/table/tbody/tr[1]/td[1]/input";
    
    //Confirm Refund
    public static String EOR_CONFIRM_REFUND = "//*[@id='CS-EOR']/ul/li[7]/a";
    public static String EOR_CONFIRM_REFUND_REGION = "EORDetailsConfirmRefundList-RegionIdSecrch";
    public static String EOR_CONFIRM_REFUND_SEARCH = "inp-Query-EORDetailsConfirmRefundList";
    public static String EOR_CONFIRM_REFUND_SELECT = "//*[@id='SpreadSheetEORDetailsConfirmRefundListGrid']/div[2]/table/tbody/tr/td[1]/input";
    public static String EOR_CONFIRM_REFUND_APPROVE = "inp-Appore-EORDetailsConfirmRefundList";
    
    //EOR India
    public static String EOR_INDIA = "CS-EOR-India";
    
    //UnProcessing List India
    public static String EOR_INDIA_UNPROCESSING_LIST = "//*[@id='CS-EOR-India']/ul/li[1]/a";
    public static String EOR_INDIA_UNPROCESSING_LIST_REGION = "sel-IndiaEORImport-OfficeId-Search";
    public static String EOR_INDIA_UNPROCESSING_LIST_YEAR = "sel-IndiaEORImport-Year-Search";
    public static String EOR_INDIA_UNPROCESSING_LIST_MONTH = "sel-IndiaEORImport-Month-Search";
    public static String EOR_INDIA_UNPROCESSING_LIST_DATE = "sel-IndiaEORImport-TestDateId-Search";
    public static String EOR_INDIA_UNPROCESSING_LIST_SEARCH = "btn-IndiaEORImport-Search";
    public static String EOR_INDIA_UNPROCESSING_LIST_RECEIVE = "IndiaEOR_Question_paper";
    public static String EOR_INDIA_UNPROCESSING_LIST_SAVE = "btn-IndiaEORImport-Save";
    public static String EOR_INDIA_UNPROCESSING_LIST_IMPORT = "btn-IndiaEORImport-ImportApplication";
    public static String EOR_INDIA_UNPROCESSING_LIST_CHOOSEFILE  = "fl-IndiaEORImport-ImportApplication";
    public static String EOR_INDIA_UNPROCESSING_LIST_UPLOAD = "button.k-button.k-upload-selected";
    public static String EOR_INDIA_UNPROCESSING_LIST_START_SERVICE = "btn-IndiaEORImport-StartService";
    public static String EOR_INDIA_UNPROCESSING_LIST_CHECK_TEST_DATE = "//*[@id='SpreadSheetIndiaEORImportGrid']/div[2]/table/tbody/tr[1]/td[4]";
    public static String EOR_INDIA_UNPROCESSING_LIST_CHECK_TEST_CENTER = "//*[@id='SpreadSheetIndiaEORImportGrid']/div[2]/table/tbody/tr[1]/td[3]";
    public static String EOR_INDIA_UNPROCESSING_LIST_EXPORT = "btn-IndiaEORImport-ExportForm";
    
    //EOR APP List India
    public static String EOR_INDIA__APP_LIST = "//*[@id='CS-EOR-India']/ul/li[2]/a";
    
    //EOR Marking India
    public static String EOR_INDIA_MARKING = "//*[@id='CS-EOR-India']/ul/li[3]/a";
    
    //1st Import Score India
    public static String EOR_INDIA_FIRST_IMPORT_SCORE = "//*[@id='CS-EOR-India']/ul/li[4]/a";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_YEAR = "ddlYear-eorscore-India";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_MONTH = "ddlMonth-eorscore-India";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_DATE = "selectdespatchdate-India";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_WRITING = "writingeorscore-India";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_LR = "lreorscore-India";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_SELECTFILE = "EorScoreFile-India";
    public static String EOR_INDIA_FIRST_IMPORT_SCORE_UPLOAD = "button.k-button.k-upload-selected";
     
    //2nd Import Score India
    public static String EOR_INDIA_SECOND_IMPORT_SCORE = "//*[@id='CS-EOR-India']/ul/li[5]/a";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_YEAR = "ddlYear-2ndeorscore-India";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_MONTH = "ddlMonth-2ndeorscore-India";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_DATE = "selectdespatchdate2ndeorscore-India";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_WRITING = "writing2ndeorscore-India";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_LR = "lr2ndeorscore-India";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_SELECTFILE = "secondEorScoreFile-India";
    public static String EOR_INDIA_SECOND_IMPORT_SCORE_UPLOAD = "button.k-button.k-upload-selected";
    
    //Refund India
    public static String EOR_INDIA__REFUND = "//*[@id='CS-EOR-India']/ul/li[6]/a";
    
    //Confirm Refund India
    public static String EOR_INDIA__CONFIRM_REFUND = "//*[@id='CS-EOR-India']/ul/li[7]/a";
    
    
    //Clerical Marker
    public static String CLERICAL_MARKER = "ClericalMarker";
    
    //Clerical Marker Profile
    public static String CLERICAL_PROFILE = "//*[@id='ClericalMarker']/ul/li[1]/a";
    public static String CLERICAL_PROFILE_CREATE = "addclericalmarker";
    public static String CLERICAL_PROFILE_CREATE_GIVEN_NAME_EN = "addclericalmarkergivennameen";
    public static String CLERICAL_PROFILE_CREATE_FAMILY_NAME_EN = "addclericalmarkerfamilynameen";
    public static String CLERICAL_PROFILE_CREATE_GIVEN_NAME_CN = "addclericalmarkergivennamecn";
    public static String CLERICAL_PROFILE_CREATE_FAMILY_NAME_CN = "addclericalmarkerfamilynamecn";
    public static String CLERICAL_PROFILE_CREATE_ID_TYPE = "addclericalmarkerpassport";
    public static String CLERICAL_PROFILE_CREATE_ID_NUMBER = "addclericalmarkerIdNumber";
    public static String CLERICAL_PROFILE_CREATE_GENDER = "addclericalmarkerfemale";
    public static String CLERICAL_PROFILE_CREATE_DATEBIRTH = "addclericalmarkerbirthday";
    public static String CLERICAL_PROFILE_CREATE_MOBILE = "addclericalmarkerMobile";
    public static String CLERICAL_PROFILE_CREATE_EMAIL = "addclericalmarkerEmail";
    public static String CLERICAL_PROFILE_CREATE_NATIONALITY = "addclericalmarkercountry";
    public static String CLERICAL_PROFILE_CREATE_PROVINCE = "addclericalmarkerProvince";
    public static String CLERICAL_PROFILE_CREATE_CITY = "addclericalmarkerBaseCity";
    public static String CLERICAL_PROFILE_CREATE_STATUS = "addclericalmarkerStatus";
    public static String CLERICAL_PROFILE_CREATE_ROLES = "//*[@id='ClericalMarkerForm']/table[3]/tbody/tr[3]/td/div/div/input";
    public static String CLERICAL_PROFILE_CREATE_SAVE = "button.k-button";
    public static String CLERICAL_PROFILE_NUMBER = "CMtxtExaminerNumber";
    public static String CLERICAL_PROFILE_GIVEN_NAME = "CMtxtGivenNameEn";
    public static String CLERICAL_PROFILE_SEARCH = "btnCMSearch";
    public static String CLERICAL_PROFILE_SEARCH_NUMBER  = "//*[@id='ClericalMarkerGrid']/div[2]/table/tbody/tr/td[2]";
    public static String CLERICAL_PROFILE_SEARCH_FAMILY  = "//*[@id='ClericalMarkerGrid']/div[2]/table/tbody/tr/td[3]";
    public static String CLERICAL_PROFILE_SEARCH_GIVEN  = "//*[@id='ClericalMarkerGrid']/div[2]/table/tbody/tr/td[4]";
    public static String CLERICAL_PROFILE_MODIFY = "Modify";
    public static String CLERICAL_PROFILE_MODIFY_PWD = "//input[contains(@value,'Modify Password')]";
    public static String CLERICAL_PROFILE_MODIFY_PINCODE = "//input[contains(@value,'Modify PinCode')]";
    public static String CLERICAL_PROFILE_MODIFY_PWD_NEW = "clericalmarkernewpwd";
    public static String CLERICAL_PROFILE_MODIFY_PINCODE_NEW = "clericalmarkerewPincode";
    
    //Clerical Marker Task
    public static String CLERICAL_TASK = "//*[@id='ClericalMarker']/ul/li[2]/a";
    public static String CLERICAL_TASK_CREATE_FM = "//input[contains(@value,'Create 1st Marking Task')]";
    public static String CLERICAL_TASK_CREATE_FM_TESTDATE = "selectClericalMarkerTestDatefirst";
    public static String CLERICAL_TASK_CREATE_FM_INTERVAL_FROM = "clericalmarkertaskOpenstart";
    public static String CLERICAL_TASK_CREATE_FM_INTERVAL_TO = "clericalmarkertaskOpenend";
    public static String CLERICAL_TASK_CREATE_FM_DAY = "//*[@id='clericalmarkertaskChooseTestDay']/input[1]";
    public static String CLERICAL_TASK_CREATE_FM_VENUE = "clericalmarkertaskMarkingVenue";
    public static String CLERICAL_TASK_CREATE_SM = "//input[contains(@value,'Create 2nd Marking Task')]";
    public static String CLERICAL_TASK_CREATE_SM_TESTDATE = "selectClericalMarkerTestDatesecond";
    public static String CLERICAL_TASK_CREATE_SM_INTERVAL_FROM = "clericalmarkertaskOpenstart";
    public static String CLERICAL_TASK_CREATE_SM_INTERVAL_TO = "clericalmarkertaskOpenend";
    public static String CLERICAL_TASK_CREATE_SM_DAY = "//*[@id='clericalmarkertaskChooseTestDay']/input[1]";
    public static String CLERICAL_TASK_CREATE_SM_VENUE = "clericalmarkertaskMarkingVenue";
    public static String CLERICAL_TASK_TEST_DATE = "selectTestDateforCM";
    public static String CLERICAL_TASK_SEARCH = "btnsearchforCM";
    public static String CLERICAL_TASK_MODIFY = "Modify";
    public static String CLERICAL_TASK_MODIFY_REMARK = "clericalmarkertaskRemarkmodify";
    public static String CLERICAL_TASK_MODIFY_DAY = "//*[@id='clericalmarkertaskChooseTestDaymodify']/input[2]";
    public static String CLERICAL_TASK_VIEW = "View";
    public static String CLERICAL_TASK_EXPORT = "Export";
    public static String CLERICAL_TASK_REPORT = "//a[contains(text(),'Report')]";
    public static String CLERICAL_TASK_LOG = "Log";
    public static String CLERICAL_TASK_LOG_USER = "//*[@id='cmLogGrid_btr']/tr/td[3]";
    public static String CLERICAL_TASK_SEARCH_TEST_DATE_FIRST = "//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[1]/td[2]";
    public static String CLERICAL_TASK_SEARCH_TEST_DATE_SECOND = "//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[2]/td[2]";
    public static String CLERICAL_TASK_SEARCH_TYPE_FIRST = "//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[1]/td[3]";
    public static String CLERICAL_TASK_SEARCH_TYPE_SECOND = "//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[2]/td[3]";
    public static String CLERICAL_TASK_SEARCH_CREATE_BY_FIRST = "//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[1]/td[7]";
    public static String CLERICAL_TASK_SEARCH_CREATE_BY_SECOND = "//*[@id='ClericalMarkerTaskGrid']/div[2]/table/tbody/tr[2]/td[7]";
    
   //1st Marking Allocation
    public static String FIRST_ALLOCATION = "//*[@id='ClericalMarker']/ul/li[3]/a";
    public static String FIRST_ALLOCATION_YEAR = "cmFirstMarking-Select-Year-Search";
    public static String FIRST_ALLOCATION_MONTH = "cmFirstMarking-Select-Month-Search";
    public static String FIRST_ALLOCATION_DATE = "cmddlTestDate-firstMarking";
    public static String FIRST_ALLOCATION_SELECTALL = "cmfirstMarkingTestCenterSelectAll";
    public static String FIRST_ALLOCATION_SEARCH = "cmbtnQuery-firstMarking";
    public static String FIRST_ALLOCATION_SELECT_MARKER = "cmtxtSelectExaminerNum-firstMarking";
    public static String FIRST_ALLOCATION_CALCULATE = "cmbtnCalculate-firstMarking";
    public static String FIRST_ALLOCATION_AUTO_ALLOCATION = "cmbtnRandomlyAllocation-firstMarking";
    public static String FIRST_ALLOCATION_CLEAR_ALLOCATION = "cmbtnClearAllocation-firstMarking";
    public static String FIRST_ALLOCATION_RESULT_PAGE = "cmbtnTaskResultPage-firstMarking";
    public static String FIRST_ALLOCATION_EXPORT_ALLOCATION_RESULT = "btnexportcmfirstmarkingallocation";
    public static String FIRST_ALLOCATION_EXPORT_REGISTER_RESULT = "btnexportmarkingmaterialsregisterresult";
    public static String FIRST_ALLOCATION_NOTICE = "btnaddfirstmarkingnotice";
    public static String FIRST_ALLOCATION_NOTICE_DELETE = "btndelfirstmarkingnotice";
    public static String FIRST_ALLOCATION_EXPORT_FINANCE_REPORT = "btnexportcmfirstmarkingfinance";
    public static String FIRST_ALLOCATION_RESULT_PAGE_NAME = "//*[@id='SpreadSheetFirstMarkerAllocationResultGrid']/div[2]/table/tbody/tr/td[3]";
    public static String FIRST_ALLOCATION_NOTICE_ADD_PLACEHOLDER = "btncmfirstMarkingplaceholder";
    public static String FIRST_ALLOCATION_NOTICE_TEXT = "txtcmfirstMarkingNotice";
    
    //2nd Marking Allocation
    public static String SECOND_ALLOCATION = "//*[@id='ClericalMarker']/ul/li[5]/a";
    public static String SECOND_ALLOCATION_YEAR = "cmDoubleMarking-Select-Year-Search";
    public static String SECOND_ALLOCATION_MONTH = "cmDoubleMarking-Select-Month-Search";
    public static String SECOND_ALLOCATION_DATE = "cmddlTestDate-DoubleMarking";
    public static String SECOND_ALLOCATION_SEARCH = "cmbtnQuery-DoubleMarking";
    public static String SECOND_ALLOCATION_SELECT = "//*[@id='AvailableMarkers-List-clericalmarkerDoublemarkingallocation']/label[1]/input";
    public static String SECOND_ALLOCATION_CALCUATOR = "Calcuator-clericalmarkerDoublemarkingallocation";
    public static String SECOND_ALLOCATION_MANUAL_CHECK = "btn_cm_db_manualallocationcheck";
    public static String SECOND_ALLOCATION_NOTICE = "btnNotice-DoubleMarking";
    public static String SECOND_ALLOCATION_DELETE_NOTICE = "btnDeleteNotice-DoubleMarking";
    public static String SECOND_ALLOCATION_NOTICE_ADD_PLACEHOLDER = "btn-DoubleMarking-placeholder";
    public static String SECOND_ALLOCATION_NOTICE_TEXT = "txtDoubleMarkingNotice";
    public static String SECOND_ALLOCATION_RESULT_PAGE = "cmbtnTaskResultPage-DoubleMarking";
    public static String SECOND_ALLOCATION_EXPORT_RESULT = "inp-ExportSimple-DoubleMarking";
    public static String SECOND_ALLOCATION_EXPORT_REGISTER_RESULT = "inp-Export-DoubleMarking";
    public static String SECOND_ALLOCATION_EXPORT_FINANCE_REPORT = "inp-2ndLRFINANCEReportForm-DoubleMarking";
    
    
    //Examiner
    public static String EXAMINER = "Examiner";
    
    //Examiner Profile
    public static String EXAMINER_PROFILE = "//*[@id='Examiner']/ul/li[1]/a";
    public static String EXAMINER_PROFILE_CREATE = "//input[contains(@value,'Add New Examiner Profile')]";
    public static String EXAMINER_PROFILE_CREATE_FIRST_NAME = "ensaddExaminer1FirstName";
    public static String EXAMINER_PROFILE_CREATE_LAST_NAME = "ensaddExaminer1LastName";
    public static String EXAMINER_PROFILE_CREATE_PASSPORT_NAME = "ensaddExaminer1NameOnPassport";
    public static String EXAMINER_PROFILE_CREATE_GENDER = "ensaddExaminer1Gender0";
    public static String EXAMINER_PROFILE_CREATE_DATEBIRTH = "ensaddExaminer1BirthDay";
    public static String EXAMINER_PROFILE_CREATE_EXAMINERNO = "ensaddExaminer1ExaminerNumber";
    public static String EXAMINER_PROFILE_CREATE_MOBILE = "ensaddExaminer1MobileNumber";
    public static String EXAMINER_PROFILE_CREATE_EMIAL = "ensaddExaminer1EmailAddress";
    public static String EXAMINER_PROFILE_CREATE_PROVINCE = "ensaddExaminer1Province";
    public static String EXAMINER_PROFILE_CREATE_CITY = "ensaddExaminer1CityList";
    public static String EXAMINER_PROFILE_CREATE_PASSPORT_NUMBER = "ensaddExaminer1PassportNumber";
    public static String EXAMINER_PROFILE_CREATE_NATIONALITY = "ensaddExaminer1Nationaly";
    public static String EXAMINER_PROFILE_CREATE_WORK_STATUS = "ensaddvisacategory";
    public static String EXAMINER_PROFILE_EXAMINERNO = "ExaminerNumberExaminer";
    public static String EXAMINER_PROFILE_SEARCH = "BtnSearch";
    public static String EXAMINER_PROFILE_SEARCH_NAME = "//*[@id='div_examiners_Grid']/div[2]/table/tbody/tr/td[3]";
    public static String EXAMINER_PROFILE_SEARCH_EMAIL = "//*[@id='div_examiners_Grid']/div[2]/table/tbody/tr/td[16]";
    public static String EXAMINER_PROFILE_PWD_PINCODE = "Pwd&Pin";
    public static String EXAMINER_PROFILE_PWD_NEW = "examinernewpwd";
    public static String EXAMINER_PROFILE_PINCODE_NEW = "examinernewPincode";
    public static String EXAMINER_PROFILE_STATUS = "N/A"; 
    public static String EXAMINER_PROFILE_ROLES_SPK = "//*[@id='ExaminerProfile-modifyRolesList']/input[1]";
    public static String EXAMINER_PROFILE_ROLES_WRT = "//*[@id='ExaminerProfile-modifyRolesList']/input[2]";
    public static String EXAMINER_PROFILE_ROLES_SECOND_MARKING = "//*[@id='ExaminerProfile-modifyRolesList']/input[3]";
    public static String EXAMINER_PROFILE_ROLES_PSN = "//*[@id='ExaminerProfile-modifyRolesList']/input[4]";
    public static String EXAMINER_PROFILE_ROLES_EOR = "//*[@id='ExaminerProfile-modifyRolesList']/input[5]";
    public static String EXAMINER_PROFILE_STATUS_SPK = "modifyExaminerProfileStatus_Speaking";
    public static String EXAMINER_PROFILE_STATUS_WRT = "modifyExaminerProfileStatus_Writting";
    public static String EXAMINER_PROFILE_STATUS_SPK_MONITOR = "modifyExaminerMonitorStatus_Speaking";
    public static String EXAMINER_PROFILE_STATUS_WRT_MONITOR = "modifyExaminerMonitorStatus_Writing";
    public static String EXAMINER_PROFILE_STATUS_SPK_SESSION = "modifyExaminerLastSessionStatus_Speaking";
    public static String EXAMINER_PROFILE_STATUS_WRT_SESSION = "modifyExaminerLastSessionStatus_Writing";
    public static String EXAMINER_PROFILE_STATUS_SPK_CERTIFICATION = "modifyExaminerCertificationStatus_Speaking";
    public static String EXAMINER_PROFILE_STATUS_WRT_CERTIFICATION = "modifyExaminerCertificationStatus_Writing";
    public static String EXAMINER_PROFILE_STATUS_SAVE = "(//button[@type='button'])[3]";
    public static String EXAMINER_PROFILE_STATUS_YES = "(//button[@type='button'])[5]";
    public static String EXAMINER_PROFILE_LOG = "Log";
    public static String EXAMINER_PROFILE_LOG_NAME = "//*[@id='ExaminerModifyStatusLogGrid']/div[2]/table/tbody/tr[1]/td[3]"; 
    
    //Examiner Task
    public static String EXAMINER_TASK = "//*[@id='Examiner']/ul/li[3]/a";
    public static String EXAMINER_TASK_SPEAKING = "//*[@id='page-heading']/p/input[1]";
    public static String EXAMINER_TASK_WRITING = "//*[@id='page-heading']/p/input[2]";
    public static String EXAMINER_TASK_2ND_MARKING = "//*[@id='page-heading']/p/input[3]";
    public static String EXAMINER_TASK_EOR_MARKING = "//*[@id='page-heading']/p/input[4]";
    public static String EXAMINER_TASK_SPEAKING_REGION = "examinerTaskListSpeakingTaskRegion";
    public static String EXAMINER_TASK_SPEAKING_TESTDATE = "examinerTaskList-SpeakingTask-TestDate";
    public static String EXAMINER_TASK_SPEAKING_TESTDAY_1 = "//*[@id='examinerTaskList-SpeakingTask-ChooseTestDay']/input[8]";
    public static String EXAMINER_TASK_SPEAKING_TESTDAY_2 = "//*[@id='examinerTaskList-SpeakingTask-ChooseTestDay']/input[9]";
    public static String EXAMINER_TASK_SPEAKING_TESTDAY_3 = "//*[@id='examinerTaskList-SpeakingTask-ChooseTestDay']/input[10]";
    public static String EXAMINER_TASK_SPEAKING_TAG = "examinerTaskList-SpeakingTag";
    public static String EXAMINER_TASK_SPEAKING_SAVE = "examinerTaskList-SpeakingTask-Save";
    public static String EXAMINER_TASK_WRITING_REGION = "examinerTaskListWritingTaskRegion";
    public static String EXAMINER_TASK_WRITING_TESTDATE = "examinerTaskList-WritingTask-TestDate";
    public static String EXAMINER_TASK_WRITING_TESTDAY = "//*[@id='examinerTaskList-WritingTask-ChooseTestDay']/input[1]";
    public static String EXAMINER_TASK_WRITING_MARKING_VENUE = "examinerTaskList-WritingTask-MarkingVenue";
    public static String EXAMINER_TASK_WRITING_SAVE = "examinerTaskList-WritingTask-Save";
    public static String EXAMINER_TASK_2ND_MARKING_REGION = "examinerTaskListDoubleMarkingTaskRegion";
    public static String EXAMINER_TASK_2ND_MARKING_TESTDATE = "examinerTaskList-DoubleMarkingTask-TestDate";
    public static String EXAMINER_TASK_2ND_MARKING_TESTDAY = "//*[@id='examinerTaskList-DoubleMarkingTask-ChooseTestDay']/input[1]";
    public static String EXAMINER_TASK_2ND_MARKING_VENUE = "examinerTaskList-DoubleMarkingTask-MarkingVenue";
    public static String EXAMINER_TASK_2ND_MARKING_SAVE = "examinerTaskList-DoubleMarkingTask-Save";
    public static String EXAMINER_TASK_EOR_MARKING_REGION = "examinerTaskListEORTaskRegion";
    public static String EXAMINER_TASK_EOR_MARKING_DESPATCH_DATE = "examinerTaskList-EORTask-TestDate";
    public static String EXAMINER_TASK_EOR_MARKING_REMARK = "examinerTaskList-EORTask-Remark";
    public static String EXAMINER_TASK_EOR_MARKING_ADD_TESTDAY = "AddEORTaskMarkingDayPicker";
    public static String EXAMINER_TASK_EOR_MARKING_TESTDAY = "examinerTaskList-EORTask-testday";
    public static String EXAMINER_TASK_EOR_MARKING_SAVE = "examinerTaskList-EORTask-Save";
    public static String EXAMINER_TASK_YEAR = "examinerstasklistYear-Search";
    public static String EXAMINER_TASK_MONTH = "examinerstasklistMonth-Search";
    public static String EXAMINER_TASK_DATE = "examinerstasklistDatetime";
    public static String EXAMINER_TASK_TYPE = "examinertasktypelist";
    public static String EXAMINER_TASK_SEARCH = "examinerTaskList-btnsearch";
    public static String EXAMINER_TASK_SEARCH_SPK_TESTDATE = "//*[@id='ExaminerTaskInfoGrid']/div[2]/table/tbody/tr/td[2]";
    public static String EXAMINER_TASK_TYPE_SPK = "//*[@id='ExaminerTaskInfoGrid']/div[2]/table/tbody/tr/td[3]";
    
    //IEP Availability 
    public static String IEP_AVAILABILITY = "//*[@id='home']/div[1]/div[2]/div/span[2]/a";
    public static String IEP_AVAILABILITY_DAY25 = "availableCheck_25";
    public static String IEP_AVAILABILITY_DAY26 = "availableCheck_26";
    public static String IEP_AVAILABILITY_DAY31 = "availableCheck_31";
    public static String IEP_AVAILABILITY_SAVE = "New_Save";
    
    //SPK Deployment
    public static String SPK_DEPLOYMENT = "//*[@id='Examiner']/ul/li[4]/a";
    public static String SPK_DEPLOYMENT_REGION = "examinerSpeakingArrangeoffice";
    public static String SPK_DEPLOYMENT_YEAR = "examinerSpeakingArrangelistYear-Search";
    public static String SPK_DEPLOYMENT_MONTH = "examinerSpeakingArrangelistMonth-Search";
    public static String SPK_DEPLOYMENT_DATE = "examinerSpeakingArrangeTestDate";
    public static String SPK_DEPLOYMENT_SEARCH = "//input[contains(@value,'Search')]";
    public static String SPK_DEPLOYMENT_SEARCH_CITY = "//*[@id='ExaminerAvailableSummaryList']/table/tbody/tr[2]/td[1]";
    public static String SPK_DEPLOYMENT_SEARCH_DATE115 = "//*[@id='ExaminerAvailableSummaryList']/table/tbody/tr[2]/td[2]";
    public static String SPK_DEPLOYMENT_SEARCH_DATE116 = "//*[@id='ExaminerAvailableSummaryList']/table/tbody/tr[2]/td[3]";
    public static String SPK_DEPLOYMENT_SEARCH_DATE117 = "//*[@id='ExaminerAvailableSummaryList']/table/tbody/tr[2]/td[4]";
    public static String SPK_DEPLOYMENT_SEARCH_DATE118 = "//*[@id='ExaminerAvailableSummaryList']/table/tbody/tr[2]/td[5]";
    public static String SPK_DEPLOYMENT_SEARCH_DATE119 = "//*[@id='ExaminerAvailableSummaryList']/table/tbody/tr[2]/td[6]";
    public static String SPK_DEPLOYMENT_ASSIGN = "Assign";
    public static String SPK_DEPLOYMENT_SHOW_EXAMINER_LIST = "Show Examiner List";
    public static String SPK_DEPLOYMENT_DELETE = "Delete";
    public static String SPK_DEPLOYMENT_UPLOAD_TO_PRETEST = "//table[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr/td[10]/a[4]/span";
    public static String SPK_DEPLOYMENT_RELEASE = "//table[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr/td[10]/a[5]/span";
    public static String SPK_DEPLOYMENT_SEND_EMAIL = "//table[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr/td[10]/a[6]/span";
    public static String SPK_DEPLOYMENT_SYNC_ITAP = "//table[@id='spreadsheet-examinerSpeakingArrange-table']/tbody/tr/td[10]/a[7]/span";
    public static String SHOW_EXAMINER_DETAILS_ON_TESTDATE = "//input[contains(@value,'ShowExaminerDetails on test date')]";
    
    //Work Records
    public static String WORK_RECORDS = "//*[@id='Examiner']/ul/li[9]/a";
    public static String WORK_RECORDS_EXAMINER_NO = "search_text_ExaminerArrangement_ExaminerArrangementSearchEngineResultsPage";
    public static String WORK_RECORDS_SEARCH = "Search_btnQuery_ExaminerArrangement_ExaminerArrangementSearchEngineResultsPage";
    public static String WORK_RECORDS_SEARCH_NAME = "//*[@id='div_ExaminerArrangement_ExaminerArrangementSearchEngineResultsPage_Grid']/div[2]/table/tbody/tr[1]/td[3]";
    public static String WORK_RECORDS_SEARCH_TC = "//*[@id='div_ExaminerArrangement_ExaminerArrangementSearchEngineResultsPage_Grid']/div[2]/table/tbody/tr[1]/td[5]";
    public static String WORK_RECORDS_SEARCH_CDDNO = "//*[@id='div_ExaminerArrangement_ExaminerArrangementSearchEngineResultsPage_Grid']/div[2]/table/tbody/tr[1]/td[7]";
    
    //Core Day Management
    public static String CORE_DAY_MANAGEMENT = "//*[@id='Examiner']/ul/li[10]/a";
    public static String CORE_DAY_YEAR = "select-ExaminerCoreday-Year-Search";
    public static String CORE_DAY_MONTH = "select-ExaminerCoreday-Month-Search";
    public static String CORE_DAY_DATE = "selectExaminerCoreday";
    public static String CORE_DAY_EXAMINER_NO = "ExaminerNumberExaminerCoreday";
    public static String CORE_DAY_SEARCH = "BtnSearchCoreday";
    public static String CORE_DAY_SELECT = "chk_examinercoreday";
    public static String CORE_DAY_ADD = "BtnAddCoreday";
    public static String CORE_DAY_ADD_DATE = "(//input[@id='chk_addexaminercoreday'])[30]";
    public static String CORE_DAY_RELEASE = "BtenCoredayReleasetoIEP";
    
    //Availability Summary
    public static String AVAILABILITY_SUMMARY = "//*[@id='Examiner']/ul/li[11]/a";
    
    
    //PreTest Planning
    public static String PRE_TEST_PLANNING = "PreTestPlanning";
    
    //Written Templates List
    public static String WRITTEN_TEMPLATES_LIST = "//*[@id='PreTestPlanning']/ul/li[1]/a";
    public static String WRITTEN_TEMPLATES_LIST_TC = "WrittenTemplatelistTestCenterid";
    public static String WRITTEN_TEMPLATES_LIST_SEARCH = "btnQu";
    public static String WRITTEN_TEMPLATES_LIST_ADD = "btnPreTestLinkToWrittenTemplateAdd";
    public static String WRITTEN_TEMPLATES_LIST_ADD_BUILDING = "TestBuilding";
    public static String WRITTEN_TEMPLATES_LIST_ADD_TEMPLATE_NAME = "TemplateName";
    public static String WRITTEN_TEMPLATES_LIST_ADD_ALL = "selectAll";
    public static String WRITTEN_TEMPLATES_LIST_SAVE = "submitTemplate";
    public static String WRITTEN_TEMPLATES_LIST_SEARCH_NAME = "//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr[2]/td[4]";
    public static String WRITTEN_TEMPLATES_LIST_SEARCH_QUOTA = "//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr[2]/td[5]";
    public static String WRITTEN_TEMPLATES_LIST_ADD_ROOM = "btnAddRoomModify";
    public static String WRITTEN_TEMPLATES_LIST_MODIFY = "//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr/td[6]/a[1]";
    public static String WRITTEN_TEMPLATES_LIST_MODIFY_QUOTA = "QuotaOfTemplateModify5786";
    public static String WRITTEN_TEMPLATES_LIST_MODIFY_SAVE = "btnDoModify";
    public static String WRITTEN_TEMPLATES_LIST_DELETE = "//*[@id='SpreadSheetWrittenTemplateListGrid']/div[2]/table/tbody/tr/td[6]/a[2]";
    
    //Written Room Arrange 
    public static String WRITTEN_ROOM_ARRANGE = "//*[@id='PreTestPlanning']/ul/li[2]/a";
    public static String WRITTEN_ROOM_ARRANGE_MONTH = "ddlMonth-Search";
    public static String WRITTEN_ROOM_ARRANGE_DATE = "ddlTestDate-Search";
    public static String WRITTEN_ROOM_ARRANGE_SEARCH = "btnQuery";
    public static String WRITTEN_ROOM_ARRANGE_CHANGE = "//*[@id='spreadsheet-WrittenArrangement-table']/tbody/tr[1]/td[7]/a";
    public static String WRITTEN_ROOM_ARRANGE_ADD_ROOM = "btnAddRoom";
    public static String WRA_ADD_ROOM_BUILDING = "TestBuilding-add";
    public static String WRA_ADD_ROOM_SAVE = "//button[@type='button']";
    public static String WRA_SELECT_ALL = "aggangeCheckAll";
    public static String WRA_SAVE = "btnSave-Upload-WArr";
    public static String WRA_SAVE_CONFIRM = "(//button[@type='button'])[3]";
    public static String WRA_SAVE_TEXT = "displayYesConfirmation";
    public static String WRA_DELETE = "BatchDeleteRoom";
    public static String WRA_DELETE_SELECT = "//*[@id='tr144']/td[1]/input";
    
    //Resource Planning
    public static String RESOURCE_PLANNING = "//*[@id='PreTestPlanning']/ul/li[3]/a";
    public static String RESOURCE_PLANNING_MONTH = "prebookingSpkplanninglistMonth-Search";
    public static String RESOURCE_PLANNING_DATE = "prebookingSpkplanninglistDatetime";
    public static String RESOURCE_PLANNING_SEARCH = "prebookingbtnSpkplanninglist";
    
    
    //General Query
    public static String GENERAL_QUERY = "GeneralQuery";
    
    //Registration Number List
    public static String REGISTRATION_NUMBER_LIST = "//*[@id='GeneralQuery']/ul/li[1]/a";
    public static String RUL_REGION = "generalQuerySelectRegion";
    public static String RUL_TC = "generalQuerySelectCenter";
    public static String RUL_DATE_FROM = "txtRegStartDate-RegNum";
    public static String RUL_DATE_TO = "txtRegEndDate-RegNum";
    public static String RUL_SEARCH = "btnRegistrationsNumberSearch";
    public static String RUL_TOTAL_REGISTERED = "//*[@id='RegistrationNumTotal']/table/tbody/tr[2]/td[1]";
    public static String RUL_TOTAL_QUOTA = "//*[@id='RegistrationNumTotal']/table/tbody/tr[1]/td[2]";
    public static String RUL_MIS_QUOTA106 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[1]/td[6]";
    public static String RUL_MIS_QUOTA113 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[2]/td[6]";
    public static String RUL_MIS_QUOTA118 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[3]/td[6]";
    public static String RUL_MIS_QUOTA120 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[4]/td[6]";
    public static String RUL_NEEA_QUOTA106 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[1]/td[7]";
    public static String RUL_NEEA_QUOTA113 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[2]/td[7]";
    public static String RUL_NEEA_QUOTA118 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[3]/td[7]";
    public static String RUL_NEEA_QUOTA120 = "//*[@id='spreadsheet-registrations-numberlist']/div[2]/table/tbody/tr[4]/td[7]";
    public static String RUL_EXPORT_REGISTRATION_NUMBER = "btnExportRegistrationNum";
    
    //Holiday Management
    public static String HOLIDAY_MANAGEMENT = "//*[@id='GeneralQuery']/ul/li[4]/a";
    public static String HM_CREATE = "btnHolidayCreate";
    public static String HM_CREATE_DATE = "HolidayDate";
    public static String HM_CREATE_NAME = "Save_HolidayName";
    public static String HM_NAME = "HolidayName";
    public static String HM_SEARCH = "btnHolidaySearch";
    public static String HM_SEARCH_DATE = "//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[1]";
    public static String HM_SEARCH_NAME = "//*[@id='div_Holiday_Grid']/div[2]/table/tbody/tr[1]/td[2]";
    public static String HM_MODIFY = "Modify";
    public static String HM_MODIFY_NAME = "Save_HolidayName";
    public static String HM_LOG = "Log";
    public static String HM_LOG_NAME = "//*[@id='HolidayLog']/table/tbody/tr[2]/td[3]";
    public static String HM_DELETE = "Delete";
    
    //Key Dates
    public static String KEY_DATES = "//*[@id='GeneralQuery']/ul/li[5]/a";
    public static String KEY_DATES_YEAR = "KeyDates_Year";
    public static String KEY_DATES_MONTH_FROM = "KeyDates_StartDate";
    public static String KEY_DATES_MONTH_TO = "KeyDates_EndDate";
    public static String KEY_DATES_GENERATE = "KeyDates_Generate";
    public static String KEY_DATES_SHOW = "//input[contains(@value,'Shown On View Page')]";
    public static String KEY_DATES_HIDDEN = "//input[contains(@value,'Hidden On View Page')]";
    public static String KEY_DATES_SEARCH = "KeyDates_Search";
    public static String KEY_DATES_EXPORT = "KeyDates_Export";
    
    //Key Dates View
    public static String KEY_DATES_VIEW = "//*[@id='GeneralQuery']/ul/li[6]/a";
    public static String KEY_DATES_VIEW_YEAR = "KeyDates_Year_view";
    public static String KEY_DATES_VIEW_MONTH_FROM = "KeyDates_StartDate_view";
    public static String KEY_DATES_VIEW_MONTH_TO = "KeyDates_EndDate_view";
    public static String KEY_DATES_VIEW_SEARCH = "KeyDates_Search_view";
    public static String KEY_DATES_VIEW_EXPORT = "KeyDates_Export_view";
    public static String KEY_DATES_VIEW_SEARCH_DATE = "//*[@id='SpreadSheetRoGetKeyDatesGrid_view']/div[2]/table/tbody/tr[1]/td[1]";
    
    //Predict Number National
    public static String PREDICT_NUMBER_NATIONAL = "//*[@id='GeneralQuery']/ul/li[8]/a";
    public static String PREDICT_NUMBER_NATIONAL_DATE_FROM = "predictNumberList_search_testdatefrom";
    public static String PREDICT_NUMBER_NATIONAL_DATE_TO = "predictNumberList_search_testdateto";
    public static String PREDICT_NUMBER_NATIONAL_SEARCH = "predictNumberList_search_btn";
    public static String PREDICT_NUMBER_NATIONAL_SEARCH_QUOTA1 = "//*[@id='predictNumberList_grid']/div[2]/table/tbody/tr[1]/td[6]";
    public static String PREDICT_NUMBER_NATIONAL_SEARCH_QUOTA2 = "//*[@id='predictNumberList_grid']/div[2]/table/tbody/tr[2]/td[6]";
    public static String PREDICT_NUMBER_NATIONAL_SEARCH_QUOTA3 = "//*[@id='predictNumberList_grid']/div[2]/table/tbody/tr[3]/td[6]";
    
    //Predict Number Session
    public static String PREDICT_NUMBER_SESSION = "//*[@id='GeneralQuery']/ul/li[9]/a";
    public static String PREDICT_NUMBER_SESSION_CITY = "SearchPredictNumberOfTestCenter_City";
    public static String PREDICT_NUMBER_SESSION_DATE_FROM = "PredictNumberOfTestCentert_search_testdatefrom";
    public static String PREDICT_NUMBER_SESSION_DATE_TO = "SearchPredictNumberOfTestCenter_search_testdateto";
    public static String PREDICT_NUMBER_SESSION_SEARCH = "SearchPredictNumberOfTestCenter_search_btn";
    public static String PREDICT_NUMBER_SESSION_SEARCH_QUOTA1 = "//*[@id='predictNumberOfTestCenterList_grid']/div[2]/table/tbody/tr[1]/td[7]";
    public static String PREDICT_NUMBER_SESSION_SEARCH_QUOTA2 = "//*[@id='predictNumberOfTestCenterList_grid']/div[2]/table/tbody/tr[2]/td[7]";
    public static String PREDICT_NUMBER_SESSION_SEARCH_QUOTA3 = "//*[@id='predictNumberOfTestCenterList_grid']/div[2]/table/tbody/tr[3]/td[7]";
    public static String PREDICT_NUMBER_SESSION_SEARCH_QUOTA4 = "//*[@id='predictNumberOfTestCenterList_grid']/div[2]/table/tbody/tr[4]/td[7]";
    public static String PREDICT_NUMBER_SESSION_SEARCH_QUOTA5 = "//*[@id='predictNumberOfTestCenterList_grid']/div[2]/table/tbody/tr[5]/td[7]";
    public static String PREDICT_NUMBER_SESSION_SEARCH_TOTAL_QUOTA = "//*[@id='totalPredictNumberOfTestCenter']/tbody/tr/td[3]";
}
