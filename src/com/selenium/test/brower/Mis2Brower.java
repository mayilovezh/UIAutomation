package com.selenium.test.brower;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.test.utils.XmlReader;

public class Mis2Brower  {
	
	public WebDriver driver;

	private String mis2url = new XmlReader(".\\config\\config.xml", "mis2url").getUrl(); //"http://cnbjs1bl1236:29000/"; 
	
	private String mis2Name = new XmlReader(".\\config\\config.xml", "mis2Name").getUrl(); //"http://cnbjs1bl1236:29000/"; 
	
	private String mis2Pwd = new XmlReader(".\\config\\config.xml", "mis2Pwd").getUrl(); //"http://cnbjs1bl1236:29000/"; 
	
	
	public int accessTime = 3000;
	
	public int normalTime = 1000;
	
	public int warningTime = 2000;
	
	public void Close() {
		driver.quit();
	}
	
	public WebDriver Login(String menueName,int menueLocation) {
		try {
	        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");  
	        driver = new ChromeDriver();  
	        driver.manage().window().maximize();
	        driver.get(mis2url);
	        WaitElementVisible(this.driver,By.id("userName")).clear();
	        WaitElementVisible(this.driver,By.id("userName")).sendKeys(mis2Name);
	        WaitElementVisible(this.driver,By.id("password")).clear();
	        WaitElementVisible(this.driver,By.id("password")).sendKeys(mis2Pwd);
	        WaitElementVisible(this.driver,By.id("loginButt")).click();
	        Wait(normalTime);
	        WaitElementVisible(this.driver,By.xpath(".//*[@id='"+ menueName +"']/a")).click();
	        Wait(normalTime);
	        WaitElementVisible(this.driver,By.xpath(".//*[@id='"+ menueName +"']/ul/li['"+ menueLocation +"']/a")).click();
	        Wait(accessTime);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return driver;
	}
	
	public void Wait(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("over time!!!!!" + e.getMessage());
		}
	}
	
	public WebElement WaitElementVisible(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
}
