package org.test.action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		//url lauch
		
		driver.get(" http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement txtname = driver.findElement(By.id("firstName"));
		txtname.sendKeys("Dinesh");
		
		WebElement txtlast = driver.findElement(By.id("lastName"));
		txtlast.sendKeys("karthick");
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("dkarthicksdk555@gmail");
		
		WebElement clickgndr = driver.findElement(By.className("custom-control-label"));
		clickgndr.click();
		
		Actions s=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement subbx = driver.findElement(By.id("subjectsInput"));
		js.executeScript("arguments[0].scrollIntoView(true)",subbx );
		s.moveToElement(subbx).sendKeys("selenium course").perform();
	
		WebElement sports = driver.findElement(By.id("hobbies-checkbox-1"));
        s.moveToElement(sports).click(sports).perform();
        
        WebElement current = driver.findElement(By.id("currentAddress"));
        current.sendKeys("tambaram sanatorium");
        
        WebElement se1 = driver.findElement(By.xpath("//div[text()='Select State']"));
        se1.click();
       
 
		
		
		
		
		
		
		
		
		
		
		

}

	
	
	
	
}