package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		WebElement Icon=driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		Icon.click();
		
		WebElement SignIn=driver.findElement(By.xpath("//li[@id='signInLink']"));
		SignIn.click();
		
		WebElement MobNo=driver.findElement(By.xpath("//input[@class='IP'][7]"));
		MobNo.sendKeys("8056780073");
		
		WebElement Robot=driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border'][2]"));
		Robot.click();
		
		WebElement OTP=driver.findElement(By.xpath("//div[@id='otp-container']"));
		OTP.click();
		
		
		
		
	}

	
	

}
