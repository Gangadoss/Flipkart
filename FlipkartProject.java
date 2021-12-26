package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProject {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Public\\Dass\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		WebElement cancel=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("Dairy Milk");
		
		WebElement Search1= driver.findElement(By.className("L0Z3Pu"));
		Search1.click();
		
//		WebElement No1= driver.findElement(By.className("s1Q9rs"));
//		String No1Prt = No1.getText();
//		System.out.println(No1Prt);
		
	   List<WebElement> Dairy = driver.findElements(By.className("s1Q9rs"));
	  
	   List<WebElement> Price1 = driver.findElements(By.className("_30jeq3"));
		
		for (int i = 0; i < Dairy.size(); i++) {
				WebElement Print = Dairy.get(i);   
				String text2 = Print.getText();
				System.out.println(text2);
		}
		for (int j = 0; j < Price1.size(); j++) {
			WebElement Price2 = Price1.get(j);
			String text4 = Price2.getText();
			System.out.println(text4);
		
		}
	
	}
}
		
		
		
		
	   
	
		
		
	
		
		
		
		
		
	  
		
		
		
		
		
		
		
		
	
	
	
	


