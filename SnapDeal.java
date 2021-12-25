package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.test.action.Action;

public class SnapDeal {
	public static void main(String[] args) throws AWTException {
		
		
		//browser lauch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//url lauch
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions e=new Actions(driver);
		WebElement btnsimple=driver.findElement(By.xpath("//input[@type='text']"));
		//btnsimple.click();
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		
		
		WebElement buttnclick=driver.findElement(By.xpath("https://netbanking.hdfcbank.com/netbanking/"));
		buttnclick.click();
		Alert sa=driver.switchTo().alert();
		sa.dismiss();
		
		
		
		
		
		
	}
		
		
		
		
		
	}


