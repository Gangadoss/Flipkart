package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IciciBank {
	public static void main(String[] args) throws InterruptedException {
		
		//Browser Launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		//Create Object for Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//Dynamic Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Get URL
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		//Find Web Element
        WebElement UserID=driver.findElement(By.id("DUMMY1"));
        UserID.sendKeys("GangaDass");
        Thread.sleep(3000);
        
        WebElement Go=driver.findElement(By.id("user-id-goahead"));
        Go.click();
        
        WebElement Password=driver.findElement(By.xpath("//input[@type='password'][2]"));
        Password.sendKeys("Dass@123");
        
        WebElement DashBoard=driver.findElement(By.className("selectedTxt"));
        DashBoard.click();
        
        WebElement BankAcc = driver.findElement(By.xpath("//a[text()='Bank Account']"));
        BankAcc.click();
        
        WebElement CheckBox=driver.findElement(By.id("AuthenticationFG.REMEMBER_USERID_CHECKBOX"));
        CheckBox.click();
        
        WebElement Login=driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
        Login.click();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
