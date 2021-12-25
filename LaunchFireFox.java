package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;


public class LaunchFireFox {
	public static void main(String[] args) {
		
		//Browser Launch
		//Configure Browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//URL Launch
		driver.get("https://www.facebook.com/");
	
		//get url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//get title
		String title=driver.getTitle();
		System.out.println(title);
		
		//close
		driver.quit();
	}

}
