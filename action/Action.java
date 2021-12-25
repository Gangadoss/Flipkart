package org.test.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	
	public Action(WebDriver driver) {
		
	}

	public static void main(String[] args) throws AWTException {
		
		//browser lauch
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//Maximize
				driver.manage().window().maximize();
				
				//url lauch
				driver.get("https://www.amazon.in/");
				
				//time to waiting
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				Action a=new Action(driver);
						
				//move to element
				
			WebElement mvecrse =driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[4]"));
				 mvecrse.click();
				
				
			
	}

	
		
	


	

	
		
	


		
	}


