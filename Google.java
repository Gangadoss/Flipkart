package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		//Browser configure and Launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Launch URL
		driver.get("https://www.google.co.in/");
		//Find Element
		WebElement txtSearch=driver.findElement(By.name("q"));
		//Send keys
		txtSearch.sendKeys("Greens Technology");
		//click
		//WebElement btnSearch=driver.findElement(By.name("btnK"));
		//btnSearch.click();
		
		List<WebElement> btnSearch=driver.findElements(By.xpath("//input[@name='btnK']"));
        WebElement Search=btnSearch.get(2);
        Search.click();
        
        
		
	}

}
