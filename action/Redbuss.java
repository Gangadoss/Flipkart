package org.test.action;

import java.awt.List;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Redbuss {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		WebElement clickbtn = driver.findElement(By.xpath("//a[@rel='async']"));
		clickbtn.click();
		
		
		WebElement daybtn = driver.findElement(By.id("day"));
		daybtn.click();
		
		//Select must be in user code then we can easy to be used
		Select s=new Select(daybtn);
		
		//select option
		//base on index
		s.selectByIndex(17);
		
		
		WebElement clickmounth = driver.findElement(By.name("birthday_month"));
		clickmounth.click();
		
		Select ss=new Select(clickmounth);
		
		//base on value
		ss.selectByValue("5");

		
		
	}

	
		
	}
	
	
	

	


