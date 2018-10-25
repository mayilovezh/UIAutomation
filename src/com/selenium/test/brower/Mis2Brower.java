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
	
	
	public int accessTime = 2000;
	
	public int normalTime = 1000;
	
	public int warningTime = 2000;
	
	public void close() {
		driver.quit();
	}
	
	public WebDriver login(String menueName,int menueLocation) {
		try {
	        System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");  
	        driver = new ChromeDriver();  
	        driver.manage().window().maximize();
	        driver.get(mis2url);
	        waitElementVisible(this.driver,By.id("userName")).clear();
	        waitElementVisible(this.driver,By.id("userName")).sendKeys(mis2Name);
	        waitElementVisible(this.driver,By.id("password")).clear();
	        waitElementVisible(this.driver,By.id("password")).sendKeys(mis2Pwd);
	        waitElementVisible(this.driver,By.id("loginButt")).click();
	        waitElementVisible(this.driver,By.xpath(".//*[@id="+ menueName +"]/a")).click();
	        wait(normalTime);
	        waitElementVisible(this.driver,By.xpath(".//*[@id="+ menueName +"]/ul/li["+ menueLocation +"]/a")).click();
	        wait(normalTime);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return driver;
	}
	
	public void wait(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("over time!!!!!" + e.getMessage());
		}
	}
	
	public WebElement waitElementVisible(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
}
