package org.ho.yaml.yaml;

import java.util.Arrays;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import com.mypro.bean.Browser;

public class DriverInstances {
	private DriverInstances() {}
	//private static WebDriver driver = null;
	public static WebDriver getInstance(WebDriver driver,Browser browser) {
		if(driver == null) {
			driver = getDriver(browser);
		}
		return driver;

	}

	public static WebDriver getDriver(Browser browser) {
		switch (browser.ordinal()) {
		case 1:
			return getFireoFoxDriver();
		case 2:
			return getIEDriver();
		case 3:
			return getChromeDriver();
		case 4:
			return getSafariWebDriver();
		case 5:
			return getHtmlWebDriver();
		}
		return getFireoFoxDriver();
	}

	public static WebDriver getFireoFoxDriver() {

		System.setProperty("webdriver.firefox.bin", 
				"F:\\firfox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", 
				"E:\\geckodriver-v0.17.0-win64\\geckodriver.exe");  
		return new FirefoxDriver(); 

	}
	
	public static WebDriver getIEDriver() {

		if (!System.getProperties().containsKey("webdriver.ie.driver")) {  
            System.setProperty("webdriver.ie.driver",  
                    System.getProperty("user.dir")  
                            + "\\src\\test\\resources\\IEDriverServer.exe");  
        }  
        DesiredCapabilities ieCapabilities = DesiredCapabilities  
                .internetExplorer();  
        ieCapabilities.setCapability("ignoreProtectedModeSettings", true);  
        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);  
        return new InternetExplorerDriver(ieCapabilities); 

	}
	
	public static WebDriver getChromeDriver() {

		try {  
            if (!System.getProperties().containsKey("webdriver.chrome.driver")) {  
                System.setProperty("webdriver.chrome.driver",  
                        "src/test/resources/chromedriver.exe");  
            }  
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();  
            capabilities.setCapability("chrome.switches",Arrays.asList("--incognito"));           
            ChromeOptions options = new ChromeOptions();  
            options.addArguments("--test-type");  
            capabilities.setCapability("chrom.binary","src/ucBrowserDrivers/chromedriver.exe");  
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);  
            if (System.getProperties().containsKey("webdriver.chrome.profile")) {  
                options.addArguments(new String[] { "user-data-dir="  
                        + System.getProperty("webdriver.chrome.profile") });  
            }  
            options.addArguments(new String[] { "start-maximized" });  
            return new ChromeDriver(capabilities);  
        } catch (Exception e) {  
            e.getStackTrace();  
        }  
   
		return null; 

	}
	
	public static WebDriver getSafariWebDriver() {  
        Platform current = Platform.getCurrent();  
        if ((Platform.MAC.is(current)) || (Platform.VISTA.is(current))  
                || (Platform.WIN8.is(current))) {  
            return new SafariDriver();  
        }  
  
        return null;  
    }  
  
    public static WebDriver getHtmlWebDriver() {  
        DesiredCapabilities Capabilities = DesiredCapabilities.htmlUnit();  
        Capabilities.setCapability("ignoreProtectedModeSettings", true);  
        HtmlUnitDriver html = new HtmlUnitDriver(Capabilities);  
        html.setJavascriptEnabled(true);  
        return html;  
    }  
}
