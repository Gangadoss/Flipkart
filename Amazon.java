package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		//browser lauch
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://www.amazon.in/");
		//Static wait--->when use this throws interrupted exception class is make
		//Thread.sleep(5000);
		//Dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//class name
		
	WebElement txtSearch=driver.findElement(By.xpath("(//input[@type='text'])"));
	txtSearch.sendKeys("Mobiles");
		
		
	WebElement btnSearch=driver.findElement(By.xpath("(//input[@value='Go'])"));
	btnSearch.click();
	}
	

}
