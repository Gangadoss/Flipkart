package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserLaunch {
	public static void main(String[] args) {
		//1.Browser Launch
		//configure Browser
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//2.URL Launch
		driver.get("https://www.facebook.com/");
		
		//get URL
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//get title
		String title=driver.getTitle();
		System.out.println(title);
		
		//close
		driver.quit();
	}

}
