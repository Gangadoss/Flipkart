package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/automation-practice-form/");
		
		WebElement FrstName = driver.findElement(By.id("firstName"));
		FrstName.sendKeys("Ganga");
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		LastName.sendKeys("Dass");
		
		WebElement EmailID = driver.findElement(By.id("userEmail"));
		EmailID.sendKeys("pgdass11@gmail.com");
		
		Actions a=new Actions(driver);
		
		WebElement Male = driver.findElement(By.id("gender-radio-1"));
		a.moveToElement(Male).click(Male).perform();
		
		WebElement MobNo = driver.findElement(By.id("userNumber"));
		MobNo.sendKeys("8056780073");
		
		WebElement DOB = driver.findElement(By.id("dateOfBirthInput"));
	    DOB.click();
	    
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select s1=new Select(year);
		s1.selectByVisibleText("1996");
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select s=new Select(month);
		s.selectByVisibleText("July");
		
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, July 11th, 1996']"));
		date.click();
		
		WebElement Sub = driver.findElement(By.id("subjectsInput"));
        Sub.sendKeys("Selenium");
        
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement Hobby = driver.findElement(By.id("hobbies-checkbox-3"));
        js.executeScript("arguments[0].scrollIntoView(true)", Hobby);
        a.moveToElement(Hobby).click(Hobby).perform();
        
        WebElement Address = driver.findElement(By.id("currentAddress"));
        Address.sendKeys("365/2, New colony, Lingampatti,Kovilpatti-628502");

		WebElement State = driver.findElement(By.xpath("//div[text()='Select State']"));
		State.click();
		
		WebElement  Haryana= driver.findElement(By.xpath("//div[text()='Haryana']"));
		Haryana.click();
		
		WebElement City = driver.findElement(By.xpath("//div[text()='Select City']"));
		City.click();
		
		WebElement  Panipat= driver.findElement(By.xpath("//div[text()='Panipat']"));
		Panipat.click();
		
		WebElement Submit = driver.findElement(By.id("submit"));
		Submit.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		WebElement Close = driver.findElement(By.id("closeLargeModal"));
		Close.click();
		
		
		
		
		
	}

}
