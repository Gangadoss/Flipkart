package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) {
		//Browser launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		//Launch URL
		driver.get("https://www.flipkart.com/");
		
		//Dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Actions object is used for move to the element method
		Actions a=new Actions(driver);
		
		WebElement cancel=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.click(cancel).perform();
		
		//move to element
		
		WebElement movfashion=driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
        a.moveToElement(movfashion).perform();
				
	
	   WebElement linkmens=driver.findElement(By.xpath("//a[@class='_6WOcW9']"));
	   a.moveToElement(linkmens).perform();
	
		WebElement movJeans=driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe'][2]"));
	    a.click(movJeans).perform();
	}

}
