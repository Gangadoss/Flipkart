package org.test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement btnSearch = driver.findElement(By.id("twotabsearchtextbox"));
		btnSearch.sendKeys("Iphone X",Keys.ENTER);
		
		Actions a=new Actions(driver);
		WebElement btnIphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone XR (64GB) - White'])[1]"));
		a.contextClick(btnIphone).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		//switch to window
		//get window id--current id 
		String ParentId = driver.getWindowHandle();
		System.out.println(ParentId);
		
		//get window id--All id 
        Set<String> AllId = driver.getWindowHandles();
		System.out.println(AllId);
		
		//set to list
	   List<String> li=new ArrayList<String>();
       li.addAll(AllId);
       driver.switchTo().window(li.get(1));
       String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
		

		
		
		
		
	}

}
