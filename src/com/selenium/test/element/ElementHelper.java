package com.selenium.test.element;

public class ElementHelper {

	public String DEV_URL = "http://cnbjs1bms001:9003";
	public int LONG_TIME = 10000;
	public int WAIT_TIME = 6000;
	public int SHORT_TIME = 3000;

	public String USER_NAME = "userName";
	public String PASSWORD = "password";
	public String LOGIN_BTN = "loginButt";
	
	public String GENERALQUERY = "GeneralQuery";
	//Registration Number List
	public String REGISTRATION = "//*[@id='GeneralQuery']/ul/li[1]/a";
	public String REGISTRATION_REGION = "generalQuerySelectRegion";
	public String REGISTRATION_TC = "generalQuerySelectCenter";
	
	//Test Center
	public String TEST_CENTER = "TestCenter";
	public String TEST_CENTER_LIST ="//*[@id='TestCenter']/ul/li[1]/a";
	public String TC_CREATE = "//input[@value='Create']";
	public String TC_REGION = "selectofficeTCSearch";
	public String TC_ADD_REGION = "selectofficeTCAdd";
	public String TC_ADD_PROVINCE = "selectProvinceTc";
	public String TC_ADD_CITY = "selectCityTc";

}
