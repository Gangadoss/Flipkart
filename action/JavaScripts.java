package org.test.action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripts {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//url
		driver.get("https://www.adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		//javascripe
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement username = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','Dinesh')", username);
		
		WebElement password = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','12345')", password);
		
		WebElement loginbtn = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", loginbtn);
		
		
		
		
		
	}

}
