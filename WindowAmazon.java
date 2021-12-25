package org.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAmazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("IPhone",Keys.ENTER);
		
		driver.findElement(By.xpath("(//span[text()='Apple iPhone XR (64GB) - White'])[1]")).click();
		
		String frstWindow = driver.getWindowHandle();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        Set<String> AllWindow = driver.getWindowHandles();
        System.out.println(AllWindow);
        
        List<String> li=new ArrayList<>();
        li.addAll(AllWindow);
        
        driver.switchTo().window(li.get(1));
        String currentUrl2 = driver.getCurrentUrl();
        System.out.println(currentUrl2);
        
        WebElement IphoneX = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
        String Print = IphoneX.getText();
        System.out.println(Print);       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
