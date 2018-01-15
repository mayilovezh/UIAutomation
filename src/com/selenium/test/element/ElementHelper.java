package com.selenium.test.element;

public class ElementHelper {

	public String DEV_URL = "http://cnbjs1bms001:9003";
	public static int LONG_TIME = 10000;
	public static int WAIT_TIME = 6000;
	public static int SHORT_TIME = 3000;

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
	public static String TC_MODIFY = "//a[contains(text(),'Modify')]";
	public static String TC_VIEW = "//a[contains(text(),'View')]";
	public static String TC_MODIFYLOG = "//a[contains(text(),'ModifyLog')]";

}
