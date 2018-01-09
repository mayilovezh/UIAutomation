package org.ho.yaml.yaml;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import com.mypro.bean.Browser;

public class WebDriverUtils {
	private static HashMap<String, HashMap<String, String>> settings;
	public static WebDriver getDriver(WebDriver driver,String key) {
		settings = ParseYamlUtils.parseSettingFile();
		String value = settings.get(key).get("value");
		if(value.equals("Chrome")) {
			return DriverInstance.getInstance(driver,Browser.CHROME);
		}else if(value.equals("FireFox")){
			return DriverInstance.getInstance(driver,Browser.FIREFOX);
		}else if(value.equals("IE")) {
			return DriverInstance.getInstance(driver,Browser.IE);
		}
		return DriverInstance.getInstance(driver,Browser.FIREFOX);
		
		
		
	}
	
	public static String getUrl(String key) {
		settings = ParseYamlUtils.parseSettingFile();
		String value = settings.get(key).get("value");
		return value;
	}

}
