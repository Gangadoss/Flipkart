package org.test.action;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.instagram.com/");
		
		//takescreenshot 
		TakesScreenshot tk=(TakesScreenshot)driver;
		//File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File src1=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src1);
		File des=new File("C:\\Users\\Public\\Dass\\Selenium\\screenshot\\screenshot2175242251487471735.png");
		FileUtils.copyFile(src1, des);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
